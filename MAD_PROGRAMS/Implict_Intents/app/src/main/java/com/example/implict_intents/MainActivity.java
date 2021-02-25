package com.example.implict_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void web(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
        startActivity(intent);
    }

    public void phone(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:9703342530"));
        startActivity(intent);
    }

    public void maps(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:12.5,13.3"));
        startActivity(intent);
    }
}