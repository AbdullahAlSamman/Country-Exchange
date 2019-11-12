package com.aals.countriesexchange;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.net.HttpURLConnection;

public class MainActivity extends AppCompatActivity {
    private TextView tv1;
    private TextView tv2;
    private HttpURLConnection urlConnection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv2.setMovementMethod(new ScrollingMovementMethod());

        Controller controller = new Controller();
        controller.start();
//        tv2.setText("         hjghjjhghjg     ");

/*// Instantiate the RequestQueue.
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "http://10.0.2.2:9000/storage/1?order=id.desc&limit=1";

// Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.
                        tv2.setText("Response is: " + response.toString());
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("Volley Error", error.getMessage());
                tv2.setText("That didn't work!");
            }
        });

// Add the request to the RequestQueue.
        queue.add(stringRequest);
*/

    }

}
