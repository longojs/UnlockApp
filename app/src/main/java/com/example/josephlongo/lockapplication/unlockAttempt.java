package com.example.josephlongo.lockapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import java.lang.String;

public class unlockAttempt extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unlock_attempt);
    }



String passwordVariable = "";
    String passwordVariableTest = "1234";

    public void addOne(View view){
        passwordVariable += "1";
    }

    public void addTwo(View view){
        passwordVariable += "2";
    }

    public void addThree(View view){
        passwordVariable += "3";
    }

    public void addFour(View view){
        passwordVariable += "4";
    }


    public void passwordChecker(View view) {
        if (passwordVariable.length() == 4) {
            if (passwordVariable.equals("1234")) {
                startActivity(new Intent(unlockAttempt.this, unlockedScreen.class));
            } else {
                startActivity(new Intent(unlockAttempt.this, MainActivity.class));
            }

        }
        else{
            startActivity(new Intent(unlockAttempt.this, MainActivity.class));
        }
    }

}