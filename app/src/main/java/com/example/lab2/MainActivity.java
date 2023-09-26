package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a = findViewById(R.id.editTextNumber);
        b = findViewById(R.id.editTextNumber2);
        answer = findViewById(R.id.editTextNumber);
        opr = findViewById(R.id.textView);
    }

    public void plus_btn(View view)
}