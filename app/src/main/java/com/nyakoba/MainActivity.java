package com.nyakoba;

import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.nyakoba.model.LoginRequest;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

public class MainActivity extends AppCompatActivity {

    private RequestQueue mRequestQueue;
    private StringRequest mStringRequest;
    private String url = "https://webhook.site/a05a1418-856f-45d9-b577-2cfb2f16ab1a";
    //private String url = "https://run.mocky.io/v3/85cf9aaf-aa4f-41bf-b10c-308f032f7ccc";

    private EditText editTextUsername, editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();
    }

    public void login(View view){

        getData();

        editTextUsername = findViewById(R.id.username);
        editTextPassword = findViewById(R.id.userpassword);

        String username = editTextUsername.getText().toString();
        String password = editTextPassword.getText().toString();
        Toast.makeText(MainActivity.this, "Hello there Username = " + username + " and password = " + password,Toast.LENGTH_SHORT).show();


        /*LoginRequest loginRequest = LoginRequest
                .builder()
                .username(username)
                .password(password)
                .build();*/

        LoginRequest loginRequest1 = new LoginRequest();
        loginRequest1.setUsername(username);
        loginRequest1.setPassword(password);

        Toast.makeText(MainActivity.this, "1",Toast.LENGTH_SHORT).show();


        String apiUrl = "https://webhook.site/a05a1418-856f-45d9-b577-2cfb2f16ab1a";
        String postData = "{\n" +
                "\"username\": \"Dennis\",\n" +
                "\"password\": \"twwter\"\n" +
                "}";

        Toast.makeText(MainActivity.this, "1",Toast.LENGTH_SHORT).show();

        new PostApiTask().execute(apiUrl, postData);

        Toast.makeText(MainActivity.this, "2",Toast.LENGTH_SHORT).show();


    }

    private void getData() {

        Toast.makeText(getApplicationContext(), "Starting req", Toast.LENGTH_SHORT).show();//display the response on screen
        // RequestQueue initialized
        mRequestQueue = Volley.newRequestQueue(this);

        // String Request initialized
        mStringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                Toast.makeText(getApplicationContext(), "Response :" + response.toString(), Toast.LENGTH_LONG).show();//display the response on screen
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), "Response :" + error.toString(), Toast.LENGTH_SHORT).show();//display the response on screen
                Log.i(TAG, "Error :" + error.toString());
            }
        });

        mRequestQueue.add(mStringRequest);
    }



}