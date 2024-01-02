package com.nyakoba;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import org.json.JSONException;
import org.json.JSONObject;

public class VolleyRequest {

    private final Context context;
    private final RequestQueue requestQueue;
    private final String url;



    public VolleyRequest(Context context, String url) {
        this.context = context;
        this.url = url;
        this.requestQueue = Volley.newRequestQueue(context.getApplicationContext());
    }

    public void makeJsonObjectRequest(JSONObject jsonRequest, final VolleyCallback callback) {
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                Request.Method.POST,
                url,
                jsonRequest,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        // Handle the response
                        callback.onSuccess(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // Handle the error
                        callback.onError(error);
                    }
                });

        // Add the request to the RequestQueue
        requestQueue.add(jsonObjectRequest);
    }

    // Callback interface to handle response or error
    public interface VolleyCallback {
        void onSuccess(JSONObject response);
        void onError(VolleyError error);
    }
}

