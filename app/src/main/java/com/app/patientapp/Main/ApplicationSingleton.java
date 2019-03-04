package com.app.patientapp.Main;

import android.app.Activity;
import android.app.Application;
import android.arch.persistence.room.Room;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.app.patientapp.Common.AppConstants;
import com.app.patientapp.Common.SharedPreferenceEditor;
import com.app.patientapp.Database.AppDatabase;
import com.app.patientapp.Database.AppExecutors;
import com.google.firebase.iid.FirebaseInstanceId;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by abhisheksingh on 11/24/17.
 */

public class ApplicationSingleton extends Application implements  Application.ActivityLifecycleCallbacks{

    private static ApplicationSingleton mInstance;
    Activity currentActivity;
    private AppDatabase appDatabase;
    private AppExecutors appExecutors = new AppExecutors();

    public AppExecutors getAppExecutors() {
        return appExecutors;
    }
    public AppDatabase getAppDatabase() {
        if(appDatabase == null){
            appDatabase = Room.databaseBuilder(getApplicationContext(),
                    AppDatabase.class, "patientapp-db").fallbackToDestructiveMigration().build();
        }
        return appDatabase;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        //getStateList();
    }

    public static synchronized ApplicationSingleton getInstance() {
        return mInstance;
    }

    @Override
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {

    }

    @Override
    public void onActivityStarted(Activity activity) {

    }

    @Override
    public void onActivityResumed(Activity activity) {

    }

    @Override
    public void onActivityPaused(Activity activity) {

    }

    @Override
    public void onActivityStopped(Activity activity) {

    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

    }

    @Override
    public void onActivityDestroyed(Activity activity) {

    }
}
