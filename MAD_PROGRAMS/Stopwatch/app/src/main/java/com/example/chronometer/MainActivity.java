package com.example.chronometer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Chronometer;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    int sec  = 0;
    int ms = 0;
    boolean running;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.cmeter);
        runTimer();
    }

    private void runTimer() {

            final Handler handler = new Handler();
            handler.post(new Runnable() {
                @Override
                public void run() {
                   int h = sec/ 3600;
                   int min = (sec % 3600)/60;
                   int secs = sec%60;
                    if(running) {
                        if (ms== 99){
                            sec++;
                            ms =0;
                        }
                        ms += 1;
                        String time = String.format(Locale.getDefault(),"%d:%02d:%02d:%02d",h,min,secs, ms);
                        textView.setText(time);
                    }
                   handler.postDelayed(this,10);
                }
            });
    }

    public void start(View view) {
        running = true;
    }

    public void stop(View view) {
        running = false;
    }

    public void reset(View view) {
        textView.setText("0:00:00:00");
        running = false;
        sec = 0;
        ms = 0;
    }
}