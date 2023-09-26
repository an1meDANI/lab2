package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText a, b, answer;
    TextView opr, error;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = findViewById(R.id.editTextNumber);
        b = findViewById(R.id.editTextNumber2);
        answer = findViewById(R.id.editTextNumber3);
        opr = findViewById(R.id.textView);
        error = findViewById(R.id.textView2);
    }

    public void btn_sum(View view) {
        int a_number=Integer.parseInt(a.getText().toString());
        int b_number=Integer.parseInt(b.getText().toString());
        int c = a_number + b_number;
        answer.setText(Integer.toString(c));
        opr.setText("+");
    }

    public void btn_difference(View view) {
        int a_number = Integer.parseInt(a.getText().toString());
        int b_number = Integer.parseInt(b.getText().toString());
        int c = a_number - b_number;
        answer.setText(Integer.toString(c));
        opr.setText("-");
    }

    public void btn_division(View view) {
        int a_number = Integer.parseInt(a.getText().toString());
        int b_number = Integer.parseInt(b.getText().toString());
        if (b_number != 0) {
            int c = a_number / b_number;
            answer.setText(Integer.toString(c));
            opr.setText("/");
        }
        else
        {
            answer.setText("ERROR");
            error.setVisibility(View.VISIBLE);
        }
    }

    public void btn_multiplication(View view) {
        int a_number = Integer.parseInt(a.getText().toString());
        int b_number = Integer.parseInt(b.getText().toString());
        int c = a_number * b_number;
        answer.setText(Integer.toString(c));
        opr.setText("*");
    }

    public void btn_clean(View view){
        a.setText("");
        b.setText("");
        answer.setText("");
    }
}