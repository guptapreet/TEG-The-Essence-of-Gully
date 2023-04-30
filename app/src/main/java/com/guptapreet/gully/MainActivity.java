package com.guptapreet.gully;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static int timeout = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final View myLayout =findViewById(R.id.imageView);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent i=new Intent(MainActivity.this, login.class);
                startActivity(i);
                finish();
            }
        },timeout);
    }

}
