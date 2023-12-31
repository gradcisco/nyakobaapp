package com.nyakoba;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.nyakoba.model.LoginRequest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

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

        try{
            RestTemplate restTemplate = new RestTemplate();
            String url = "https://webhook.site/a05a1418-856f-45d9-b577-2cfb2f16ab1a";
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            HttpEntity<LoginRequest> entity = new HttpEntity<LoginRequest>(loginRequest1 , headers);
            String result = restTemplate.exchange(url, HttpMethod.POST , entity, String.class).getBody();

            Toast.makeText(MainActivity.this, "result",Toast.LENGTH_SHORT).show();
        }
        catch(Exception ex){
            Toast.makeText(MainActivity.this, ex.getMessage(),Toast.LENGTH_SHORT).show();
        }

    }



}