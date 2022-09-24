package com.example.apptheb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    ProgressBar pb;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);





        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent i = new Intent( SplashActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, 3000);

        prog();
    }

    private void prog() {
        pb = (ProgressBar)findViewById(R.id.pb);

        final Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run()
            {
                counter++;
                pb.setProgress(counter);

                if(counter == 100)
                    t.cancel();
            }
        };

        t.schedule(tt,0,1000);
    }
}