package com.example.javacoban;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int a = 1;

        while (a < 10){
            Log.d("KHOAPHAM", "" + a);
            a++;
        }

    }
}
