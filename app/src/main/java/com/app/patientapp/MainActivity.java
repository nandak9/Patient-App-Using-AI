package com.app.patientapp;

import android.content.ContentResolver;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Debug;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.app.patientapp.Activity.VideoActivity;
import com.app.patientapp.Util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*//Sinch Credentials
        private static final String APP_KEY = "11e37620-8608-4269-8ed2-88af83e9420f";
        private static final String APP_SECRET = "vZKCXfVdm0WLF8vU6ba1cw==";
        private static final String ENVIRONMENT = "clientapi.sinch.com";*/


        Intent videoIntent = new Intent(MainActivity.this, VideoActivity.class);
        startActivity(videoIntent)


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);

    }

}


   /*     try {
            RequestQueue requestQueue = Volley.newRequestQueue(this);
            String URL = "http://ec2-13-127-214-8.ap-south-1.compute.amazonaws.com/prescription";
            JSONObject jsonBody = new JSONObject();
            jsonBody.put("patient_mobile", "7418423277");
            jsonBody.put("doctor_mobile", "8130179770");
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("key","value");
            jsonBody.put("prescription", jsonObject);
            Log.d("VOLLEY",jsonBody.toString());

            StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    Log.i("VOLLEY", response);
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Log.e("VOLLEY", error.toString());
                }
            }) {
                @Override
                public String getBodyContentType() {
                    return "application/json; charset=utf-8";
                }

                @Override
                public byte[] getBody() throws AuthFailureError {
                    if (jsonBody != null) {
                        Log.d("VOLLEY",jsonBody.toString());
                        //return encodeParameters(jsonBody, getParamsEncoding());
                        return  jsonBody.toString().getBytes();
                    }
                    return null;

                }

                @Override
                protected Response<String> parseNetworkResponse(NetworkResponse response) {
                    String responseString = "";
                    if (response != null) {
                        responseString = String.valueOf(response.statusCode);
                        // can get more details such as response.headers
                    }
                    return Response.success(responseString, HttpHeaderParser.parseCacheHeaders(response));
                }
            };

            requestQueue.add(stringRequest);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/


    /**
     * This method was private in the com.Android.Volley.Request class. I had to copy it here so as to encode my paramters.
     * @param params
     * @param paramsEncoding
     * @return
     */
  /*  private byte[] encodeParameters(JSONObject params, String paramsEncoding) {
        StringBuilder encodedParams = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : params.entrySet()) {
                encodedParams.append(URLEncoder.encode(entry.getKey(), paramsEncoding));
                encodedParams.append('=');
                encodedParams.append(URLEncoder.encode(entry.getValue(), paramsEncoding));
                encodedParams.append('&');
            }
            return encodedParams.toString().getBytes(paramsEncoding);
        } catch (UnsupportedEncodingException uee) {
            throw new RuntimeException("Encoding not supported: " + paramsEncoding, uee);
        }
    }
}*/
