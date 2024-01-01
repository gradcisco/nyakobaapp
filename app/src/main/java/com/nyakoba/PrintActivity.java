package com.nyakoba;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.*;

import com.ctk.sdk.PosApiHelper;
import com.google.zxing.BarcodeFormat;
import com.nyakoba.service.MyService;

import java.util.Timer;


/**
 * Created by Administrator on 2017/8/17.
 */

public class PrintActivity extends Activity {

    public String tag = "PrintActivity-Dennis";

    final int PRINT_TEST = 0;
    final int PRINT_UNICODE = 1;
    final int PRINT_BMP = 2;
    final int PRINT_BARCODE = 4;
    final int PRINT_CYCLE = 5;
    final int PRINT_LONGER = 7;
    final int PRINT_OPEN = 8;


    final int PRINT_LAB_SINGLE = 9;
    final int PRINT_LAB_CONTINUE = 10;
    final int PRINT_LAB_BAR = 11;
    final int PRINT_LAB_BIT = 12;

    private RadioGroup rg = null;
    private RadioGroup rg_mode = null;
    private RadioButton rb_mode1 = null;
    private Timer timer;
    private Timer timer2;
    private BroadcastReceiver receiver;
    private IntentFilter filter;
    private int voltage_level;
    private int BatteryV;
    SharedPreferences preferences;
    SharedPreferences sp;
    SharedPreferences.Editor editor;
    private RadioButton rb_high;
    private RadioButton rb_middle;
    private RadioButton rb_low;
    private RadioButton radioButton_4;
    private RadioButton radioButton_5;
    private Button gb_test;
    private Button gb_unicode;
    private Button gb_barcode;
    private Button btnBmp;

    private Button gb_open;
    private Button gb_long;
    private Button gb_printCycle;

    private Button gb_single;
    private Button gb_continue;
    private Button gb_bar;
    private Button gb_bitm;


    private final static int ENABLE_RG = 10;
    private final static int DISABLE_RG = 11;

    TextView textViewMsg = null;
    TextView textViewGray = null;
    int ret = -1;
    private boolean m_bThreadFinished = true;

    private boolean is_cycle = false;
    private int cycle_num = 0;

    private int RESULT_CODE = 0;
    //private Pos pos;
    int IsWorking = 0;


    PosApiHelper posApiHelper = PosApiHelper.getInstance();

    Intent mPrintServiceIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.dashboard_main_print);




      //  init_Gray();



    }

    private void setValue(int val) {
        sp = getSharedPreferences("Gray", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putInt("value", val);
        editor.commit();
    }

    private int getValue() {
        sp = getSharedPreferences("Gray", MODE_PRIVATE);
        int value = sp.getInt("value", 2);
        return value;
    }

    private void init_Gray() {
        int flag = getValue();
        posApiHelper.PrintSetGray(flag);

        String strGray = "Select Printer Density :   ";

        if (flag == 3) {
            rb_low.setChecked(true);
            textViewGray.setText(strGray+"3");
        }else if(flag == 2){
            rb_middle.setChecked(true);
            textViewGray.setText(strGray+"2");
        }else if(flag == 1){
            rb_high.setChecked(true);
            textViewGray.setText(strGray+"1");
        }else if(flag == 4){
            radioButton_4.setChecked(true);
            textViewGray.setText(strGray+"4");
        }else if(flag == 5){
            radioButton_5.setChecked(true);
            textViewGray.setText(strGray+"5");
        }
    }

    @Override
    protected void onResume() {
        // TODO Auto-generated method stub

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        super.onResume();
        filter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub

        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        super.onPause();
        QuitHandler();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Log.d("onKeyDown", "keyCode = " + keyCode);

        Log.d("ROBERT2 onKeyDown", "keyCode = " + keyCode);
        Log.d("ROBERT2 onKeyDown", "IsWorking== " + IsWorking);
        if (keyCode == event.KEYCODE_BACK) {
            if (IsWorking == 1)
                return true;
        }

        return super.onKeyDown(keyCode, event);
    }

    public void onClickTest(View v) {
        Toast.makeText(getApplicationContext(), "Starting Print", Toast.LENGTH_SHORT).show();//display the response on screen

        if (printThread != null && !printThread.isThreadFinished()) {
            Log.e(tag, "Thread is still running...");
            return;
        }

     //   printThread = new Print_Thread(PRINT_TEST);
      //  printThread.start();
        Toast.makeText(getApplicationContext(), "Finished Print", Toast.LENGTH_SHORT).show();
    }

    public void onClickUnicodeTest(View v) {
        if (printThread != null && !printThread.isThreadFinished()) {
            Log.e(tag, "Thread is still running...");
            return;
        }

        printThread = new Print_Thread(PRINT_UNICODE);
        printThread.start();

        Toast.makeText(getApplicationContext(), "Finished Print", Toast.LENGTH_SHORT).show();//display the response on screen


    }

    public void OnClickBarcode(View view) {
        if (printThread != null && !printThread.isThreadFinished()) {
            Log.e(tag, "Thread is still running...");
            return;
        }

        printThread = new Print_Thread(PRINT_BARCODE);
        printThread.start();
    }

    public void onClickBmp(View view) {
        if (printThread != null && !printThread.isThreadFinished()) {
            Log.e(tag, "Thread is still running...");
            return;
        }

        printThread = new Print_Thread(PRINT_BMP);
        printThread.start();

    }

    public void onClickCycle(View v) {
        if (printThread != null && !printThread.isThreadFinished()) {
            Log.e(tag, "Thread is still running...");
            return;
        }

        if (is_cycle == false) {
            is_cycle = true;
            preferences = getSharedPreferences("count", MODE_PRIVATE);

            cycle_num = preferences.getInt("count", 0);
            SendMsg("total cycle num =" + cycle_num);
            Log.e(tag, "Thread is still 3000ms...");
            handlers.postDelayed(runnable, 3000);

            gb_printCycle.setText("Stop");

        }else{
            handlers.removeCallbacks(runnable);
            gb_printCycle.setText("Cycle");
            is_cycle = false;
        }


    }

    public void onClickClean(View v) {
        textViewMsg.setText("");
        preferences = getSharedPreferences("count", MODE_PRIVATE);
        cycle_num = preferences.getInt("count", 0);
        editor = preferences.edit();
        cycle_num = 0;
        editor.putInt("count", cycle_num);
        editor.commit();
        QuitHandler();
    }

    public void onClickPrnOpen(View v) {
        if (printThread != null && !printThread.isThreadFinished()) {
            Log.e(tag, "Thread is still running...");
            return;
        }

        printThread = new Print_Thread(PRINT_OPEN);
        printThread.start();
    }









    public void QuitHandler() {
        is_cycle = false;
        gb_test.setEnabled(true);
        gb_barcode.setEnabled(true);
        btnBmp.setEnabled(true);
        gb_unicode.setEnabled(true);
        handlers.removeCallbacks(runnable);
    }

    Handler handlers = new Handler();
    Runnable runnable = new Runnable() {

        @Override
        public void run() {
            // TODO Auto-generated method stub

            Log.e(tag, "TIMER log...");
            printThread = new Print_Thread(PRINT_CYCLE);
            printThread.start();

            Log.e(tag, "TIMER log2...");
            if (RESULT_CODE == 0) {
                editor = preferences.edit();
                editor.putInt("count", ++cycle_num);
                editor.commit();
                Log.e(tag, "cycle num=" + cycle_num);
                SendMsg("cycle num =" + cycle_num);
            }
            handlers.postDelayed(this, 15000);

        }
    };

    Print_Thread printThread = null;

    public class Print_Thread extends Thread {

        String content = "1234567890";
        int type;

        public boolean isThreadFinished() {
            return m_bThreadFinished;
        }

        public Print_Thread(int type) {
            this.type = type;
        }

        public void run() {

            Log.d("Robert2", "Print_Thread[ run ] run() begin");
            Message msg = Message.obtain();
            Message msg1 = new Message();

            synchronized (this) {

                m_bThreadFinished = false;
                try {
                    ret = posApiHelper.PrintInit();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                Log.e(tag, "init code:" + ret);

                ret = getValue();
                Log.e(tag, "getValue():" + ret);

                posApiHelper.PrintSetGray(ret);
                Log.e(tag, "PrintSetGray():" );

                ret = posApiHelper.PrintCheckStatus();
                Log.e(tag, "PrintCheckStatus():" );
                if (ret == -1) {
                    RESULT_CODE = -1;
                    Log.e(tag, "Lib_PrnCheckStatus fail, ret = " + ret);
                    SendMsg("Error, No Paper ");
                    m_bThreadFinished = true;
                    return;
                } else if (ret == -2) {
                    RESULT_CODE = -1;
                    Log.e(tag, "Lib_PrnCheckStatus fail, ret = " + ret);
                    SendMsg("Error, Printer Too Hot ");
                    m_bThreadFinished = true;
                    return;
                } else if (ret == -3) {
                    RESULT_CODE = -1;
                    Log.e(tag, "voltage = " + (BatteryV * 2));
                    SendMsg("Battery less :" + (BatteryV * 2));
                    m_bThreadFinished = true;
                    return;
                }
                else
                {
                    RESULT_CODE = 0;
                }


                Log.d("Robert2", "Lib_PrnStart type= "+type );
                switch (type) {



                    case PRINT_TEST:
                        Log.d("Robert2", "Lib_PrnStart ret START0 " );
                        SendMsg("PRINT_TEST");
                        msg.what = DISABLE_RG;
                        handler.sendMessage(msg);

                        posApiHelper.PrintSetFont((byte) 24, (byte) 24, (byte) 0x00);

                        posApiHelper.PrintStr("中文:你好，好久不见。\n");
                        posApiHelper.PrintStr("英语:Hello, Long time no see   ￡ ：2089.22\n");
                        posApiHelper.PrintStr("意大利语Italian :Ciao, non CI vediamo da Molto Tempo.\n");
                        posApiHelper.PrintStr("西班牙语:España, ¡Hola! Cuánto tiempo sin verte!\n");
                        posApiHelper.PrintStr("法语:Bonjour! Ça fait longtemps!\n");
                        posApiHelper.PrintStr("ABCDEFGHIJKLMNHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNHIJKLMNOPQRSTUVWXYZ\n");
                        posApiHelper.PrintStr("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz\n");
                        posApiHelper.PrintStr("12345678901234567890123456789012345678901234567890+_)(*&^%$#@!~\n");
                        posApiHelper.PrintStr("                                         \n");
                        posApiHelper.PrintStr("                                         \n");

                        SendMsg("Printing... ");
                        ret = posApiHelper.PrintStart();

                        msg1.what = ENABLE_RG;
                        handler.sendMessage(msg1);

                        Log.d("Robert2", "Lib_PrnStart ret = " + ret);

                        if (ret != 0) {
                            RESULT_CODE = -1;
                            Log.e("liuhao", "Lib_PrnStart fail, ret = " + ret);
                            if (ret == -1) {
                                SendMsg("No Print Paper ");
                            } else if(ret == -2) {
                                SendMsg("too hot ");
                            }else if(ret == -3) {
                                SendMsg("low voltage ");
                            }else{
                                SendMsg("Print fail ");
                            }
                        } else {
                            RESULT_CODE = 0;
                            SendMsg("Print Finish ");
                        }
                        Log.d("Robert2", "Lib_PrnStart ret9 " );
                        break;





                    case PRINT_OPEN:
                        SendMsg("PRINT_OPEN");
                        msg.what = DISABLE_RG;
                        handler.sendMessage(msg);

                        SendMsg("Print Open... ");

                        posApiHelper.PrintStr("                                         \n");
                        ret = posApiHelper.PrintStart();
                        msg1.what = ENABLE_RG;
                        handler.sendMessage(msg1);

                        Log.d("", "Lib_PrnStart ret = " + ret);
                        if (ret != 0) {
                            RESULT_CODE = -1;
                            Log.e("liuhao", "Lib_PrnStart fail, ret = " + ret);
                            if (ret == -1) {
                                SendMsg("No Print Paper ");
                            } else if (ret == -2) {
                                SendMsg("too hot ");
                            } else if (ret == -3) {
                                SendMsg("low voltage ");
                            } else {
                                SendMsg("Print fail ");
                            }
                        } else {
                            RESULT_CODE = 0;
                            SendMsg("Print Finish ");
                        }
                        break;






                    default:
                        break;
                }
                m_bThreadFinished = true;
            }
        }
    }


    public class BatteryReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            voltage_level = intent.getExtras().getInt("level");// ��õ�ǰ����
            Log.e("wbw", "current  = " + voltage_level);
            BatteryV = intent.getIntExtra("voltage", 0);  //电池电压
            Log.e("wbw", "BatteryV  = " + BatteryV);
            Log.e("wbw", "V  = " + BatteryV * 2 / 100);
            //	m_voltage = (int) (65+19*voltage_level/100); //放大十倍
            //   Log.e("wbw","m_voltage  = " + m_voltage );
        }
    }

    // 在Activity中，我们通过ServiceConnection接口来取得建立连接与连接意外丢失的回调

    ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
//            MyService.MyBinder binder = (MyService.MyBinder)service;
//            binder.getService();// 获取到的Service即MyService
            MyService.MyBinder binder = (MyService.MyBinder) service;
            MyService myService = binder.getService();

            myService.setCallback(new MyService.CallBackPrintStatus() {
                @Override
                public void printStatusChange(String strStatus) {
                    SendMsg(strStatus);
                }
            });

        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    };

    public void SendMsg(String strInfo) {
        Message msg = new Message();
        Bundle b = new Bundle();
        b.putString("MSG", strInfo);
        msg.setData(b);
        handler.sendMessage(msg);
    }

    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {

            switch (msg.what) {
                case DISABLE_RG:
                    IsWorking = 1;
                    rb_high.setEnabled(false);
                    rb_middle.setEnabled(false);
                    rb_low.setEnabled(false);
                    radioButton_4.setEnabled(false);
                    radioButton_5.setEnabled(false);
                    break;

                case ENABLE_RG:
                    IsWorking = 0;
                    rb_high.setEnabled(true);
                    rb_middle.setEnabled(true);
                    rb_low.setEnabled(true);
                    radioButton_4.setEnabled(true);
                    radioButton_5.setEnabled(true);
                    break;

                case 0x34:
                    gb_single.setEnabled(false);
                    gb_continue.setEnabled(false);
                    gb_bar.setEnabled(false);
                    gb_bitm.setEnabled(false);

                    gb_single.setBackgroundColor(Color.GRAY);
                    gb_continue.setBackgroundColor(Color.GRAY);
                    gb_bar.setBackgroundColor(Color.GRAY);
                    gb_bitm.setBackgroundColor(Color.GRAY);

                    gb_test.setEnabled(true);
                    gb_unicode.setEnabled(true);
                    gb_barcode.setEnabled(true);
                    btnBmp.setEnabled(true);
                    gb_open.setEnabled(true);
                    gb_long.setEnabled(true);
                    gb_printCycle.setEnabled(true);

                  /*  gb_test.setBackgroundColor(getResources().getColor(R.color.item_image_select));
                    gb_unicode.setBackgroundColor(getResources().getColor(R.color.item_image_select));
                    gb_barcode.setBackgroundColor(getResources().getColor(R.color.item_image_select));
                    btnBmp.setBackgroundColor(getResources().getColor(R.color.item_image_select));
                    gb_open.setBackgroundColor(getResources().getColor(R.color.item_image_select));
                    gb_long.setBackgroundColor(getResources().getColor(R.color.item_image_select));
                    gb_printCycle.setBackgroundColor(getResources().getColor(R.color.item_image_select));*/

                    break;

                case 0x56:
                    //gb_unicode.setVisibility(View.INVISIBLE);
                    gb_test.setBackgroundColor(Color.GRAY);
                    gb_unicode.setBackgroundColor(Color.GRAY);
                    gb_barcode.setBackgroundColor(Color.GRAY);
                    btnBmp.setBackgroundColor(Color.GRAY);
                    gb_open.setBackgroundColor(Color.GRAY);
                    gb_long.setBackgroundColor(Color.GRAY);
                    gb_printCycle.setBackgroundColor(Color.GRAY);

                    gb_test.setEnabled(false);
                    gb_unicode.setEnabled(false);
                    gb_barcode.setEnabled(false);
                    btnBmp.setEnabled(false);
                    gb_open.setEnabled(false);
                    gb_long.setEnabled(false);
                    gb_printCycle.setEnabled(false);

                    gb_single.setEnabled(true);
                    gb_continue.setEnabled(true);
                    gb_bar.setEnabled(true);
                    gb_bitm.setEnabled(true);

                /*    gb_single.setBackgroundColor(getResources().getColor(R.color.item_image_select));
                    gb_continue.setBackgroundColor(getResources().getColor(R.color.item_image_select));
                    gb_bar.setBackgroundColor(getResources().getColor(R.color.item_image_select));
                    gb_bitm.setBackgroundColor(getResources().getColor(R.color.item_image_select));*/
                    break;

                default:
                    Bundle b = msg.getData();
                    String strInfo = b.getString("MSG");
                    textViewMsg.setText(strInfo);
                    break;
            }
        }
    };

}
