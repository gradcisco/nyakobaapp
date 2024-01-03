package com.nyakoba;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.android.volley.*;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.ctk.sdk.PosApiHelper;
import com.nyakoba.model.LoginRequest;
import com.nyakoba.util.Session;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

public class MainActivity extends AppCompatActivity {

    Context mContext;
    public static Session session = new Session();

    public static String[] MY_PERMISSIONS = {
            "android.permission.READ_EXTERNAL_STORAGE",
            "android.permission.WRITE_EXTERNAL_STORAGE",
            Manifest.permission.READ_PHONE_STATE
    };

    public static final int REQUEST_EXTERNAL_PERMISSION = 1;

    private RequestQueue mRequestQueue;
    private StringRequest mStringRequest;

    private ProgressBar loadingPB;
    //28461366 $ogar0609,N$
    //KB0430215
    //0944563
    private String url = "http://192.168.100.45:8080/login";

    private EditText editTextUsername, editTextPassword;

    public static final String MyPREFERENCES = "MyPrefs" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  requestPermission();
       // PosApiHelper.getInstance().SysLogSwitch(1);
        setContentView(R.layout.activity_main);

    }

    public void userLogin(View view){

        Toast.makeText(getApplicationContext(), getDeviceId(this), Toast.LENGTH_LONG).show();//display the response on screen


        final Context context = this;
        editTextUsername = findViewById(R.id.username);
        editTextPassword = findViewById(R.id.userpassword);

        String username = editTextUsername.getText().toString();
        String password = editTextPassword.getText().toString();


        // Example JSON data
       JSONObject jsonData = new JSONObject();
        try {
            jsonData.put("username", username);
            jsonData.put("password", password);
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();//display the response on screen

        }


        // Create a VolleyRequest instance
        VolleyRequest volleyRequest = new VolleyRequest(this, url);

        // Make a JSON request
        volleyRequest.makeJsonObjectRequest(jsonData, new VolleyRequest.VolleyCallback() {


            @Override
            public void onSuccess(JSONObject response) {
                try{
                    String status = response.get("status").toString();

                    Log.d("VolleyResponse", response.toString());

                    SharedPreferences sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedpreferences.edit();
                    editor.putString("username", response.get("agentName").toString());
                    editor.putString("deviceid", getDeviceId(context));
                    editor.apply();
                    editor.commit();

                    if(status.equalsIgnoreCase("000")){
                        Intent intent = new Intent(context, PrintActivity.class);
                        startActivity(intent);
                    }
                    else{
/*
                        Intent intent = new Intent(context, PrintActivity.class);
                        startActivity(intent);
*/
                        Toast.makeText(getApplicationContext(), "Please enter correct username and Password", Toast.LENGTH_LONG).show();
                    }


                }
                catch (Exception ex){
                    Toast.makeText(getApplicationContext(), ex.getMessage(), Toast.LENGTH_LONG).show();//display the response on screen

                }

            }

            @Override
            public void onError(VolleyError error) {
                // Handle the error
                Toast.makeText(getApplicationContext(), error.toString(), Toast.LENGTH_LONG).show();//display the response on screen

            }
        });
    }

    public static String getDeviceId(Context context) {
     //   Toast.makeText(context, "Start", Toast.LENGTH_LONG).show();//display the response on screen

        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);

        if (telephonyManager != null) {
            try {
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.Q) {
                    // For Android 10 and above, use getImei() with READ_PRIVILEGED_PHONE_STATE permission

                    Toast.makeText(context, telephonyManager.getSimSerialNumber(), Toast.LENGTH_LONG).show();//display the response on screen

                    return telephonyManager.getImei();
                } else {
                    // For Android versions below 10, use getDeviceId() (requires READ_PHONE_STATE permission)
                    return telephonyManager.getDeviceId();
                }
            } catch (SecurityException e) {
                Toast.makeText(context, e.getMessage(), Toast.LENGTH_LONG).show();//display the response on screen

                Log.e("DeviceIdUtil", "Permission denied. Unable to get device ID.");
            }
        }

        return null;
    }



    /**
     * @Description: Request permission
     * 申请权限
     */
    private void requestPermission() {
        //检测是否有写的权限
        //Check if there is write permission
        int checkCallPhonePermission = ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.WRITE_EXTERNAL_STORAGE);

        if (checkCallPhonePermission != PackageManager.PERMISSION_GRANTED) {
            // 没有写文件的权限，去申请读写文件的权限，系统会弹出权限许可对话框
            //Without the permission to Write, to apply for the permission to Read and Write, the system will pop up the permission dialog
            ActivityCompat.requestPermissions(MainActivity.this, MY_PERMISSIONS, REQUEST_EXTERNAL_PERMISSION);
        } else {
            initViews();
        }
    }

    /**
     * a callback for request permission
     * 注册权限申请回调
     *
     * @param requestCode  申请码
     * @param permissions  申请的权限
     * @param grantResults 结果
     */
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == REQUEST_EXTERNAL_PERMISSION) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                initViews();
            } else {
//                Toast.makeText(MainActivity.this,R.string.title_permission,Toast.LENGTH_SHORT).show();
                requestPermission();
            }
        }

    }

    private void initViews() {

        setContentView(R.layout.activity_main);

        mContext = MainActivity.this;

        final Drawable[] itemImgs = {

                getResources().getDrawable(R.mipmap.ic_launcher),

                getResources().getDrawable(R.mipmap.ic_launcher_round)

        };

        final String[] itemTitles = {
                getString(R.string.app_name)

        };

        final int sizeWidth = getResources().getDisplayMetrics().widthPixels / 25;

    }





}