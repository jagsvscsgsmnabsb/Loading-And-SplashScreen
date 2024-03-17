package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_app);
      new Handler().postDelayed(new Runnable()   {


    @Override
    public void run() {

        Intent iHome  = new Intent(SplashApp .this , MainActivity.class);
        startActivity(iHome);
        finish();

    }
} , 4000);




    }
}