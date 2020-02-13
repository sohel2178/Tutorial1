package com.ibcs.tutorial1;

import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String TAG = "HHHHHHHH";

    TextView ttt;
    Button tttt;

    ImageView iii;

    EditText ii;


    LinearLayout ll;
    RelativeLayout rl;
    FrameLayout fl;
    CoordinatorLayout cl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_layout);


        final Button buttonOne = findViewById(R.id.btn_one);

        TextView b1 = findViewById(R.id.tv_btn_one);

        b1.setText("This is Text");

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Button is Clicked", Toast.LENGTH_SHORT).show();

                buttonOne.setTranslationX(200);
            }
        });
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
