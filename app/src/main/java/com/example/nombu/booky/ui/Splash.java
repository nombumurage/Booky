package com.example.nombu.booky.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.nombu.booky.R;
import com.example.nombu.booky.ui.MainActivity;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread timer = new Thread() {
            public void run() {

                try
                {
                    sleep(2500);
                    Intent myActivity = new Intent(getApplicationContext(), LoginActivity.class);
                    startActivity(myActivity);
                    finish();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }
        };
        timer.start();
    }
}

