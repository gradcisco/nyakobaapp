package com.nyakoba;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.provider.Settings;
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

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

public class MainActivity extends AppCompatActivity {

    PosApiHelper posApiHelper = new PosApiHelper();
    int ret = -1;

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
    private String url = "http://192.168.50.160:8080/login";
    //private String url = "https://4661-41-90-68-214.ngrok-free.app/login";


    private EditText editTextUsername, editTextPassword;

    public static final String MyPREFERENCES = "MyPrefs" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onResume() {
        super.onResume();

        editTextUsername = findViewById(R.id.username);
        editTextPassword = findViewById(R.id.userpassword);

        editTextUsername.getText().clear();
        editTextPassword.getText().clear();

        // Your onResume code here
    }


    public void userLogin(View view){

        HttpsTrustManager.allowAllSSL();

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
            jsonData.put("deviceid", getDeviceId(this));
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
        return Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
    }

    public void printTest(View view){

        try{
        ret = posApiHelper.PrintCheckStatus();

        Toast.makeText(getApplicationContext(), "Print state==" + ret, Toast.LENGTH_LONG).show();//display the response on screen


            posApiHelper.PrintStr("Appolinalis Ogaro testing             \n");
            posApiHelper.PrintStr("Appolinalis Ogaro testing             \n");
            posApiHelper.PrintStr("Appolinalis Ogaro testing             \n");
            posApiHelper.PrintStr("Appolinalis Ogaro testing             \n");
            posApiHelper.PrintStr("Appolinalis Ogaro testing             \n");
            posApiHelper.PrintStr("Appolinalis Ogaro testing             \n");
            ret = posApiHelper.PrintStart();

        Toast.makeText(getApplicationContext(), "4" + ret, Toast.LENGTH_LONG).show();//display the response on screen
    //    ret = posApiHelper.PrintStart();


    } catch (Exception ex) {
        Toast.makeText(getApplicationContext(), "Error = " + ex.getMessage(), Toast.LENGTH_SHORT).show();//display the response on screen


    }
    }

}