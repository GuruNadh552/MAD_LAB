package com.example.lgview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] CNames = {"A","B","C","D"};

    GridView gridView;
    String[] GName = {"A","B","C","D","E","F","G","H"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,CNames);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, " " +CNames[position] + " Clicked ", Toast.LENGTH_SHORT).show();
            }
        });

        gridView = findViewById(R.id.gridview);
        ArrayAdapter<String> Gadapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,GName);
        gridView.setAdapter(Gadapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, " " +GName[position] + " Clicked ", Toast.LENGTH_SHORT).show();
            }
        });
    }
}