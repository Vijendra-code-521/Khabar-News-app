package com.news.project.khabar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class KhabarSplashScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();
        Thread thread = new Thread()
        {
            public void run()
            {
                try{
                    sleep(3000);
                    startActivity(new Intent(getApplicationContext() , KhabarDashboard.class));
                    finish();
                }
                catch (Exception e)
                {
                    Toast.makeText(KhabarSplashScreen.this, "Something went wrong", Toast.LENGTH_SHORT).show();
                }
            }
        };thread.start();
    }
}