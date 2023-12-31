package com.nyakoba;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.nyakoba.model.LoginRequest;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private EditText editTextUsername, editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view){

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



}