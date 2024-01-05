package com.nyakoba;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.ctk.sdk.PosApiHelper;
import org.json.JSONException;
import org.json.JSONObject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.UUID;

public class WithDrawActivity extends AppCompatActivity {

    PosApiHelper posApiHelper = PosApiHelper.getInstance();

    int ret = -1;

    private RequestQueue mRequestQueue;
    private StringRequest mStringRequest;

    private ProgressBar loadingPB;
    private String url = "http://192.168.100.44:8080/withdrawal";
    private String member_url = "http://192.168.100.44:8080/clientdetails";

    private EditText editTextGrowerNo, editTextIdNo, editTextAmount, balance, memberName;
    private Button withdrawBtn, getMembBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.withdraw_main);
    }

    public void login(View view){
        Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show();

        // Clear session data from SharedPreferences
        SharedPreferences preferences = getSharedPreferences(MainActivity.MyPREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.clear(); // Remove all data
        editor.apply();


        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void getMemberDetails(View view) {

        HttpsTrustManager.allowAllSSL();

        editTextGrowerNo = findViewById(R.id.growerno);
        editTextIdNo = findViewById(R.id.idno);

        editTextAmount = findViewById(R.id.amount);
        withdrawBtn = findViewById(R.id.withdrawbtns);
        getMembBtn = findViewById(R.id.membs);


        String growerNo = editTextGrowerNo.getText().toString();
        String idNo = editTextIdNo.getText().toString();


        // Example JSON data
        JSONObject jsonData = new JSONObject();
        try {

            jsonData.put("uniqueno", growerNo);
            jsonData.put("id", idNo);

            getMemberDetails(jsonData, getApplicationContext());

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }


    public void submitWithdrawal(View view) {

        HttpsTrustManager.allowAllSSL();


        String growerNo = editTextGrowerNo.getText().toString();
        String idNo = editTextIdNo.getText().toString();
        String amount = editTextAmount.getText().toString();

        // Example JSON data
        JSONObject jsonData = new JSONObject();
        String sessionName = "N/A";
        try {

            SharedPreferences sharedpreferences = getSharedPreferences(MainActivity.MyPREFERENCES, Context.MODE_PRIVATE);
            sessionName = sharedpreferences.getString("username", null);

            jsonData.put("requestid", UUID.randomUUID().toString());
            jsonData.put("uniqueno", growerNo);
            jsonData.put("id", idNo);
            jsonData.put("amount", amount);
            jsonData.put("agentname", sessionName);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        sendReq(jsonData, this, sessionName);

        editTextGrowerNo.getText().clear();
        editTextIdNo.getText().clear();
        editTextAmount.getText().clear();

    }

    public void getMemberDetails(JSONObject jsonData, Context context) {
        // Create a VolleyRequest instance
        VolleyRequest volleyRequest = new VolleyRequest(this, member_url);

        // Make a JSON request
        volleyRequest.makeJsonObjectRequest(jsonData, new VolleyRequest.VolleyCallback() {


            @Override
            public void onSuccess(JSONObject response) {
                try {

                    if (response.get("status").toString().equalsIgnoreCase("000")) {
                        try {
                            balance = findViewById(R.id.balance);
                            memberName = findViewById(R.id.membname);

                            SpannableString spannableString = new SpannableString("MEMBER NAME::" + response.get("name").toString());
                            spannableString.setSpan(new StyleSpan(Typeface.BOLD), 0, spannableString.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                            memberName.setText(spannableString);

                            SpannableString spannableStringBal = new SpannableString("BALANCE::" + response.get("accbal").toString());
                            spannableStringBal.setSpan(new StyleSpan(Typeface.BOLD), 0, spannableStringBal.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

                            balance.setText(spannableStringBal);


                            memberName.setEnabled(false);
                            balance.setEnabled(false);

                            balance.setTextColor(getResources().getColor(R.color.white));
                            memberName.setTextColor(getResources().getColor(R.color.white));
                            balance.setBackgroundColor(getResources().getColor(R.color.teal_200));
                            memberName.setBackgroundColor(getResources().getColor(R.color.teal_200));


                            memberName.setVisibility(View.VISIBLE);
                            balance.setVisibility(View.VISIBLE);
                            editTextAmount.setVisibility(View.VISIBLE);
                            getMembBtn.setVisibility(View.GONE);
                            withdrawBtn.setVisibility(View.VISIBLE);
                        } catch (Exception e) {
                            Toast.makeText(getApplicationContext(), "Hello..." + e.getMessage(), Toast.LENGTH_LONG).show();//display the response on screen

                        }
                    } else {
                        Toast.makeText(getApplicationContext(), "Hello..." + response.get("status"), Toast.LENGTH_LONG).show();//display the response on screen

                    }


                } catch (Exception ex) {
                    Toast.makeText(context, ex.getMessage(), Toast.LENGTH_LONG).show();//display the response on screen

                }

            }

            @Override
            public void onError(VolleyError error) {
                Toast.makeText(context, "error::" + error.toString(), Toast.LENGTH_LONG).show();//display the response on screen

            }
        });

    }

    public void sendReq(JSONObject jsonData, Context context, String agentName) {
        // Create a VolleyRequest instance
        VolleyRequest volleyRequest = new VolleyRequest(this, url);

        // Make a JSON request
        volleyRequest.makeJsonObjectRequest(jsonData, new VolleyRequest.VolleyCallback() {


            @Override
            public void onSuccess(JSONObject response) {
                try {

                    Toast.makeText(context, "desc::" + response.get("status"), Toast.LENGTH_LONG).show();//display the response on screen


                    if (response.get("status").toString().equalsIgnoreCase("000")) {

                        print(response, agentName , "[CUSTOMER COPY]");

                        Thread.sleep(5000);

                        print(response, agentName , "[TELLER COPY]");

                    } else {
                        Toast.makeText(context, response.get("description").toString(), Toast.LENGTH_LONG).show();//display the response on screen

                    }

                } catch (Exception ex) {
                    Toast.makeText(context, ex.getMessage(), Toast.LENGTH_LONG).show();//display the response on screen

                }

            }

            @Override
            public void onError(VolleyError error) {
                Toast.makeText(context, "error::" + error.toString(), Toast.LENGTH_LONG).show();//display the response on screen
            }
        });
    }

    public void print(JSONObject response, String agentName, String copy) {

   //     Toast.makeText(getApplicationContext(), "1", Toast.LENGTH_LONG).show();//display the response on screen


        try {

            ret = posApiHelper.PrintCheckStatus();

            Toast.makeText(getApplicationContext(), "Print state==" + ret, Toast.LENGTH_LONG).show();//display the response on screen


            posApiHelper.PrintSetFont((byte) 24, (byte) 24, (byte) 0x00);
            posApiHelper.PrintStr("   NYAKOBA FARMERS RURAL SACCO.\n");
            posApiHelper.PrintStr("   Mobile No. +254-705-799-293.\n");
            posApiHelper.PrintStr("     CASH WITHDRAWAL RECEIPT \n          " + copy + "\n");
            posApiHelper.PrintStr("==== " + (response.has("lastTeaPeriod") ? response.get("lastTeaPeriod") : "FEB 2023 TEA INCLUSIVE") + " ====\n");
            posApiHelper.PrintStr("*******************************\n");
            posApiHelper.PrintStr("Account Name: " + (response.has("accname") ? response.get("accname") : "Dummy") + "\n");
            posApiHelper.PrintStr("Grower No:      " + (response.has("grNo") ? response.get("grNo") : "Dummy GR NO") + "\n");
            posApiHelper.PrintStr("Transaction No: " + (response.has("transactionNo") ? response.get("transactionNo") : "Dummy transactionno") + "\n");

            Toast.makeText(getApplicationContext(), "2", Toast.LENGTH_LONG).show();//display the response on screen

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                LocalDateTime myDateObj = LocalDateTime.now();
                System.out.println("Before formatting: " + myDateObj);
                DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");

                String formattedDate = myDateObj.format(dateFormat);
                posApiHelper.PrintStr("Date: " + formattedDate + "\n");
            } else {
                posApiHelper.PrintStr("Date: " + new Date() + "\n");
            }
            posApiHelper.PrintStr("Previous Balance: Ksh." + (response.has("previousBalance") ? response.get("previousBalance") : "Dummy previousBalance") + "\n");
            posApiHelper.PrintSetBold(1);
            posApiHelper.PrintSetFont((byte) 34, (byte) 34, (byte) 0x33);
            posApiHelper.PrintStr("Transaction Amt: Ksh." + (response.has("amt") ? response.get("amt") : "0.0") + "\n");
            posApiHelper.PrintSetBold(0);
            posApiHelper.PrintSetFont((byte) 24, (byte) 24, (byte) 0x00);
            posApiHelper.PrintStr("Commission:  " + (response.has("commission") ? response.get("commission") : "Dummy commission") + "\n");
            posApiHelper.PrintStr("Excise Duty: " + (response.has("exciseDuty") ? response.get("exciseDuty") : "Dummy exciseduty") + "          " + (response.has("codd") ? response.get("codd") : "XYZ") + "\n");
            posApiHelper.PrintStr("Balance After: " + (response.has("balanceAfter") ? response.get("balanceAfter") : "Dummy balanceafter") + "\n");
            posApiHelper.PrintSetBold(1);
            posApiHelper.PrintSetFont((byte) 34, (byte) 34, (byte) 0x33);
            posApiHelper.PrintStr((response.has("amtInWords") ? response.get("amtInWords") : "Dummy Word amount") + "\n");
            posApiHelper.PrintSetBold(0);
            posApiHelper.PrintSetFont((byte) 24, (byte) 24, (byte) 0x00);
            posApiHelper.PrintStr("*******************************\n");
            String payeeRelation = (response.has("relationship") ? response.get("relationship").toString() : "Dummy relationship");
            posApiHelper.PrintStr("Payee Details: " + payeeRelation + "\n");
            posApiHelper.PrintStr((response.has("payeeName") ? response.get("payeeName") : "Dummy payeename") + "\n");
            posApiHelper.PrintStr("*******************************\n");
            posApiHelper.PrintStr(" Signature or left thumb print\n");
            posApiHelper.PrintStr("   Payee               Teller\n");
            posApiHelper.PrintStr("                                       \n");
            posApiHelper.PrintStr("                                       \n");
            posApiHelper.PrintStr("                                       \n");
            posApiHelper.PrintStr("                                       \n");
            posApiHelper.PrintStr("*******************************\n");
            posApiHelper.PrintStr("Thank you for banking with us.\n");
            String tellerName = (response.has("teller") ? response.get("teller").toString() : "Dummy teller");
            if (agentName.equalsIgnoreCase(tellerName)) {
                posApiHelper.PrintStr("You were served by:- " + agentName + ".\n");
            } else {
                posApiHelper.PrintStr("You were served by:- " + agentName + " & "+tellerName+"\n");
            }
            posApiHelper.PrintStr("*******************************\n");
            posApiHelper.PrintStr("                                       \n");
            posApiHelper.PrintStr("                                       \n");
            posApiHelper.PrintStr("                                       \n");
            ret = posApiHelper.PrintStart();

            changeActivity(getApplicationContext());

        } catch (Exception ex) {
            Toast.makeText(getApplicationContext(), "Error = " + ex.getMessage(), Toast.LENGTH_SHORT).show();//display the response on screen
            changeActivity(getApplicationContext());

        }
    }

    public void changeActivity(Context context) {
        Intent intent = new Intent(context, WithDrawActivity.class);
        startActivity(intent);
    }


}