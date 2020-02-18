package com.ibcs.tutorial1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ThirdActivity extends AppCompatActivity {

    EditText etName;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        String name = getIntent().getStringExtra("abul");

        etName = findViewById(R.id.name);
        btnBack = findViewById(R.id.back);

        etName.setText(name);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt = etName.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("name_back",txt);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}
