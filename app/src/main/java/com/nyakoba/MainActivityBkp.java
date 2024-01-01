package com.nyakoba;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.android.volley.*;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.nyakoba.model.LoginRequest;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

public class MainActivityBkp extends AppCompatActivity {

    private RequestQueue mRequestQueue;
    private StringRequest mStringRequest;

    private ProgressBar loadingPB;
    private String url = "https://webhook.site/a05a1418-856f-45d9-b577-2cfb2f16ab1a";

    private EditText editTextUsername, editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_main);

       // getData();
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
        JSONObject jsonData = new JSONObject();
        try {
            jsonData.put("username", username);
            jsonData.put("password", password);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        // Create a VolleyRequest instance
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
        });
    }


    public void login(View view){

        getData();

        editTextUsername = findViewById(R.id.username);
        editTextPassword = findViewById(R.id.userpassword);

        String username = editTextUsername.getText().toString();
        String password = editTextPassword.getText().toString();
        Toast.makeText(MainActivityBkp.this, "Hello there Username = " + username + " and password = " + password,Toast.LENGTH_SHORT).show();


        /*LoginRequest loginRequest = LoginRequest
                .builder()
                .username(username)
                .password(password)
                .build();*/

        LoginRequest loginRequest1 = new LoginRequest();
        loginRequest1.setUsername(username);
        loginRequest1.setPassword(password);

        Toast.makeText(MainActivityBkp.this, "1",Toast.LENGTH_SHORT).show();


        String apiUrl = "https://webhook.site/a05a1418-856f-45d9-b577-2cfb2f16ab1a";
        String postData = "{\n" +
                "\"username\": \"Somi\",\n" +
                "\"password\": \"twwter\"\n" +
                "}";

        Toast.makeText(MainActivityBkp.this, "1",Toast.LENGTH_SHORT).show();

        new PostApiTask().execute(apiUrl, postData);

        Toast.makeText(MainActivityBkp.this, "2",Toast.LENGTH_SHORT).show();


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

    private void postDataUsingVolley(String username, String password) {
        Toast.makeText(getApplicationContext(), "Starting req", Toast.LENGTH_SHORT).show();//display the response on screen

        // on below line specifying the url at which we have to make a post request
       // String url = "https://reqres.in/api/users";
        // setting progress bar visibility on below line.
        //loadingPB.setVisibility(View.VISIBLE);
        // creating a new variable for our request queue
        RequestQueue queue = Volley.newRequestQueue(MainActivityBkp.this);
        // making a string request on below line.
        StringRequest request = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                // channing progress bar visibility on below line.
              //  loadingPB.setVisibility(View.GONE);
                // setting response to text view.
               // responseTV.setText("Response from the API is :" + response);
                // displaying toast message.
                Toast.makeText(MainActivityBkp.this, "Data posted succesfully..", Toast.LENGTH_SHORT).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                // handling error on below line.
              //  loadingPB.setVisibility(View.GONE);
             //   responseTV.setText(error.getMessage());
                Toast.makeText(MainActivityBkp.this, "Fail to get response.." + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }) {
            @Nullable
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<String, String>();
                // on below line we are passing our key
                // and value pair to our parameters.
                params.put("username", username);
                params.put("password", password);
                return params;
            }
        };
        // adding request to queue to post the data.
        queue.add(request);
    }



}