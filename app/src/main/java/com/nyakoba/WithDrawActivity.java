package com.nyakoba;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.android.volley.*;
import com.android.volley.toolbox.StringRequest;
import com.ctk.sdk.PosApiHelper;
import com.nyakoba.util.Session;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.UUID;

public class WithDrawActivity extends AppCompatActivity {

    PosApiHelper posApiHelper = PosApiHelper.getInstance();

    int ret = -1;

    private RequestQueue mRequestQueue;
    private StringRequest mStringRequest;

    private ProgressBar loadingPB;
    private String url = "http://192.168.100.45:8080/withdrawal";

    private EditText editTextGrowerNo, editTextIdNo, editTextAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.withdraw_main);
    }

    public void submitWithdrawal(View view){

        editTextGrowerNo = findViewById(R.id.growerno);
        editTextIdNo = findViewById(R.id.idno);
        editTextAmount = findViewById(R.id.amount);

        String growerNo = editTextGrowerNo.getText().toString();
        String idNo = editTextIdNo.getText().toString();
        String amount = editTextAmount.getText().toString();

        // Example JSON data
        JSONObject jsonData = new JSONObject();
        try {

            SharedPreferences sharedpreferences = getSharedPreferences(MainActivity.MyPREFERENCES, Context.MODE_PRIVATE);
            String sessionName = sharedpreferences.getString("username", null);

            jsonData.put("requestid", UUID.randomUUID().toString());
            jsonData.put("uniqueno", growerNo);
            jsonData.put("id", idNo);
            jsonData.put("amount", amount);
            jsonData.put("agentname", sessionName);
            Toast.makeText(getApplicationContext(), "Withdraw..." + sessionName, Toast.LENGTH_LONG).show();//display the response on screen

        } catch (JSONException e) {
            e.printStackTrace();
        }

      //  JSONObject res = new VolleyRequest(this, url).sendHttpReq(jsonData, getApplicationContext() , url);

     //   Toast.makeText(getApplicationContext(), "Withdraw...>>>" + res , Toast.LENGTH_LONG).show();//display the response on screen


        sendReq(jsonData, this);

    }

    public void sendReq(JSONObject jsonData , Context context){
        // Create a VolleyRequest instance
        VolleyRequest volleyRequest = new VolleyRequest(this, url);

        // Make a JSON request
        volleyRequest.makeJsonObjectRequest(jsonData, new VolleyRequest.VolleyCallback() {


            @Override
            public void onSuccess(JSONObject response) {
                try{
                 //   new PrintActivity().print(response);
                    Toast.makeText(context, "-->>" + response, Toast.LENGTH_LONG).show();//display the response on screen


                }
                catch (Exception ex){
                    Toast.makeText(context, ex.getMessage(), Toast.LENGTH_LONG).show();//display the response on screen

                }

            }

            @Override
            public void onError(VolleyError error) {
                // Handle the error
                //new PrintActivity().print(null);
                Toast.makeText(context, "error::" + error.toString(), Toast.LENGTH_LONG).show();//display the response on screen
                print(null);

            }
        });
    }

    public void print(JSONObject response) {

        Toast.makeText(getApplicationContext(), "Starting Print", Toast.LENGTH_SHORT).show();//display the response on screen


        try{
            Message msg = Message.obtain();
            Message msg1 = new Message();
            ret = posApiHelper.PrintCheckStatus();
            Toast.makeText(getApplicationContext(), "Starting Printer Status ==" + ret, Toast.LENGTH_SHORT).show();//display the response on screen

            posApiHelper.PrintSetFont((byte) 24, (byte) 24, (byte) 0x00);
            posApiHelper.PrintStr("NYAKOBA FARMERS RURAL SACCO.\n");
            posApiHelper.PrintStr("Mobile No. +254-705-799-293.\n");
            posApiHelper.PrintStr("CASH WITHDRAWAL RECEIPT [CUSTOMER COPY]\n");
            posApiHelper.PrintStr("======== FEB 2023 TEA INCLUSIVE =======\n");
            posApiHelper.PrintStr("                                       \n");
            /*posApiHelper.PrintStr("Account Name: " + (response.has("accountname") ? response.get("accountname") : "Dummy") + "\n");
            posApiHelper.PrintStr("RE\n");
            posApiHelper.PrintStr("Grower No:      " + (response.has("growerno") ? response.get("growerno") : "Dummy GR NO") + "\n");
            posApiHelper.PrintStr("Transaction No: " + (response.has("transactionno") ? response.get("transactionno") : "Dummy transactionno") + "\n");
            posApiHelper.PrintStr("Transaction Amt: Ksh." + (response.has("amount") ? response.get("amount") : "0.0") + "\n");
            posApiHelper.PrintStr("Commission:  " + (response.has("commission") ? response.get("commission") : "Dummy commission") + "\n");
            posApiHelper.PrintStr("Excise Duty: " + (response.has("exciseduty") ? response.get("exciseduty") : "Dummy exciseduty") + "\n");
            posApiHelper.PrintStr("Balance After:: " + (response.has("balanceafter") ? response.get("balanceafter") : "Dummy balanceafter") + "\n");
            posApiHelper.PrintStr((response.has("amountinwords") ? response.get("amountinwords") : "Dummy Word amount") + "\n");
            String payeeRelation = (response.has("relationship") ? response.get("relationship").toString() : "Dummy relationship");
            String relation = "Account Holder";
            //if(payeeRelation.equalsIgnoreCase())
            posApiHelper.PrintStr("Payee Details: " + payeeRelation + "\n");
            posApiHelper.PrintStr((response.has("payeename") ? response.get("payeename") : "Dummy payeename") + "\n");*/

            //  SendMsg("Printing... ");
            ret = posApiHelper.PrintStart();
            Toast.makeText(getApplicationContext(), "End Print", Toast.LENGTH_SHORT).show();

        }
        catch (Exception ex){
            Toast.makeText(getApplicationContext(), "Error = " + ex.getMessage(), Toast.LENGTH_SHORT).show();//display the response on screen

        }



        //   printThread = new Print_Thread(PRINT_TEST);
        //  printThread.start();
       // Toast.makeText(getApplicationContext(), "Finished Print", Toast.LENGTH_SHORT).show();
    }


}