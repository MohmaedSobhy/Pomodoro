package com.example.pomodoro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);


        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
               startActivity(new Intent(Screen.this,Home.class));
               finish();
            }
        },2000);
    }
}