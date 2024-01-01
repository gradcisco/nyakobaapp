package com.nyakoba;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.android.volley.*;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.nyakoba.model.LoginRequest;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.Map;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

public class MainActivity extends AppCompatActivity {

    private RequestQueue mRequestQueue;
    private StringRequest mStringRequest;

    private ProgressBar loadingPB;
    private String url = "https://webhook.site/a05a1418-856f-45d9-b577-2cfb2f16ab1a";

    private EditText editTextUsername, editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void userLogin(View view){

        final Context context = this;

        Toast.makeText(getApplicationContext(), "Starting req", Toast.LENGTH_SHORT).show();//display the response on screen
        editTextUsername = findViewById(R.id.username);
        editTextPassword = findViewById(R.id.userpassword);

        String username = editTextUsername.getText().toString();
        String password = editTextPassword.getText().toString();

        //  getData();

        // Example JSON data
      /*  JSONObject jsonData = new JSONObject();
        try {
            jsonData.put("username", username);
            jsonData.put("password", password);
        } catch (JSONException e) {
            e.printStackTrace();
        }
*/
        Intent intent = new Intent(context, PrintActivity.class);
        startActivity(intent);

      /*  // Create a VolleyRequest instance
        VolleyRequest volleyRequest = new VolleyRequest(this, url);

        // Make a JSON request
        volleyRequest.makeJsonObjectRequest(jsonData, new VolleyRequest.VolleyCallback() {


            @Override
            public void onSuccess(JSONObject response) {
                // Handle the successful response
                Toast.makeText(getApplicationContext(), response.toString(), Toast.LENGTH_SHORT).show();//display the response on screen

                Log.d("VolleyResponse", response.toString());


                Intent intent = new Intent(context, DashBoardActivity.class);
                startActivity(intent);
            }

            @Override
            public void onError(VolleyError error) {
                // Handle the error
                Toast.makeText(getApplicationContext(), error.toString(), Toast.LENGTH_SHORT).show();//display the response on screen

                Intent intent = new Intent(context, DashBoardActivity.class);
                startActivity(intent);

            }
        });*/
    }





}