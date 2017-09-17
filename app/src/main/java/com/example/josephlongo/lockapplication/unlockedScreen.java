package com.example.josephlongo.lockapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class unlockedScreen extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unlocked_screen);
    }

    public void lockApp(View view){
        startActivity(new Intent(unlockedScreen.this, MainActivity.class));
    }
}
