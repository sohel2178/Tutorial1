package com.ibcs.tutorial1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private String TAG = "HHHHHHHH";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_layout);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy Called");
    }
}
