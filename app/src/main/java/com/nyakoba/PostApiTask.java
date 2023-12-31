package com.nyakoba;

import android.os.AsyncTask;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class PostApiTask extends AsyncTask<String, Void, String> {

    @Override
    protected String doInBackground(String... params) {
        String apiUrl = params[0];
        String postData = params[1];

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

            return response.toString();

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Usage
    // new PostApiTask().execute("https://your-api-endpoint.com", "{'key':'value'}");
}

