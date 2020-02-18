package com.ibcs.tutorial1;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etUserName,etPassword;
    private Button btnSubmit;

    private static final int REQUEST_CODE=5000;

    /*private RadioGroup radioGroup;

    private CheckBox cbOne;

    private Spinner spinner;

    private ArrayAdapter<String> spinnerAdapter;

    private String[] nameArr= {"A","B","C"};

    private ImageView imageView;

    private String url = "https://firebasestorage.googleapis.com/v0/b/xfinity-7a6eb.appspot.com/o/Users%2Ft8tcLClreAWyoxg2XUi2wMzmWEh2?alt=media&token=b477a5b4-ae64-4c9f-a959-150ec282526e";
*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_test);

//        initView();
//
        etUserName = findViewById(R.id.user_name);
        etPassword = findViewById(R.id.password);
        btnSubmit = findViewById(R.id.submit);

        btnSubmit.setOnClickListener(this);
    }

    private void initView(){
        /*etName = findViewById(R.id.et_name);
        btnOne = findViewById(R.id.btn_one);
        btnTwo = findViewById(R.id.btn_two);
        cbOne = findViewById(R.id.cb_one);
        spinner = findViewById(R.id.spinner);
        imageView = findViewById(R.id.image);

        spinnerAdapter = new ArrayAdapter<String>(this,R.layout.item,nameArr);

        spinner.setAdapter(spinnerAdapter);

        radioGroup = findViewById(R.id.rg);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                Log.d("HHHHHH",checkedId+"");
            }
        });

        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);*/
    }


    @Override
    public void onClick(View v) {

        String userName = etUserName.getText().toString().trim();
        String password = etPassword.getText().toString().trim();


        if(userName.equals("admin") && password.equals("admin123")){
            Intent intent = new Intent(this,ThirdActivity.class);
            intent.putExtra("abul","Sohel A");
            startActivityForResult(intent,REQUEST_CODE);

        }else{
            Toast.makeText(this, "You are not a Valid User", Toast.LENGTH_SHORT).show();
        }

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        if(requestCode==REQUEST_CODE && resultCode==RESULT_OK){
            String name = data.getStringExtra("name_back");

            etUserName.setText(name);
        }
    }
}
