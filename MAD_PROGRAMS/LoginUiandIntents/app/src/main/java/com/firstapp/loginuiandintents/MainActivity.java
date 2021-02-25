package com.firstapp.loginuiandintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText user,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.et_user);
        pass = findViewById(R.id.et_pass);
    }
    /*Explict Intent */
    public void login(View view) {
        String username = user.getText().toString();
        String password = pass.getText().toString();
        if (username.length()>0 && password.length()>0)
        {
            Intent ab = new Intent(MainActivity.this,Loginsuccess.class);
            startActivity(ab);
        }
        else{
            Toast.makeText(MainActivity.this,"Please Enter Valid details",Toast.LENGTH_LONG).show();
        }
    }
    /*Implict intent*/
    public void impin(View view) {
        Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:9703342530"));
        startActivity(in);
    }
}