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

        String apiUrl = "https://webhook.site/a05a1418-856f-45d9-b577-2cfb2f16ab1a";
        String postData = "{\n" +
                "\"username\": \"Dennis\",\n" +
                "\"password\": \"twwter\"\n" +
                "}";

        try {
            URL url = new URL(apiUrl);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

            // Set up the connection properties
            urlConnection.setRequestMethod("POST");
            urlConnection.setRequestProperty("Content-Type", "application/json");
            urlConnection.setDoOutput(true);

            // Write the data to the request
            OutputStream outputStream = urlConnection.getOutputStream();
            outputStream.write(postData.getBytes());
            outputStream.flush();

            // Get the response
            BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            // Close resources
            reader.close();
            outputStream.close();

            //return response.toString();
            System.out.println(response.toString());

        } catch (IOException e) {
            e.printStackTrace();
           // return null;
        }

        /*try{
            Toast.makeText(MainActivity.this, "1",Toast.LENGTH_SHORT).show();
            RestTemplate restTemplate = new RestTemplate();
            Toast.makeText(MainActivity.this, "2",Toast.LENGTH_SHORT).show();
            restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());


            // restTemplate.getMessageConverters().add(new MappingJacksonHttpMessageConverter());
           *//* restTemplate.getMessageConverters().forEach(mc -> {
                Toast.makeText(MainActivity.this, mc.getClass().toString(),Toast.LENGTH_SHORT).show();
            });*//*
            //Toast.makeText(MainActivity.this, "No converter",Toast.LENGTH_SHORT).show();

            String url = "https://webhook.site/a05a1418-856f-45d9-b577-2cfb2f16ab1a";
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            HttpEntity<LoginRequest> entity = new HttpEntity<LoginRequest>(loginRequest1 , headers);
            Toast.makeText(MainActivity.this, "3",Toast.LENGTH_SHORT).show();
            String result = restTemplate.exchange(url, HttpMethod.POST , entity, String.class).getBody();

            Toast.makeText(MainActivity.this, "result",Toast.LENGTH_SHORT).show();
        }
        catch(Exception ex){

            Toast.makeText(MainActivity.this, "Error::" + ex.getMessage(),Toast.LENGTH_SHORT).show();
        }*/

    }



}