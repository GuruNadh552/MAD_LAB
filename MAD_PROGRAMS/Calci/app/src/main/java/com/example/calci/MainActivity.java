package com.example.calci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et_n1,et_n2;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_n1 = findViewById(R.id.et_num1);
        et_n2 = findViewById(R.id.et_num2);
        tv = findViewById(R.id.res);
    }

    public void sum(View view) {
        int n1 = Integer.parseInt(et_n1.getText().toString());
        int n2 = Integer.parseInt(et_n2.getText().toString());
        tv.setText(" "+(n1+n2));
    }

    public void sub(View view) {
        int n1 = Integer.parseInt(et_n1.getText().toString());
        int n2 = Integer.parseInt(et_n2.getText().toString());
        tv.setText(" "+(n1-n2));
    }

    public void mul(View view) {
        int n1 = Integer.parseInt(et_n1.getText().toString());
        int n2 = Integer.parseInt(et_n2.getText().toString());
        tv.setText(" "+(n1*n2));
    }

    public void div(View view) {
        int n1 = Integer.parseInt(et_n1.getText().toString());
        int n2 = Integer.parseInt(et_n2.getText().toString());
        tv.setText(" "+(n1/n2));
    }
}