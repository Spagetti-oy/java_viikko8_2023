package com.example.laskin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1, number2;
    TextView resultText;
    int a, b;
    String resultString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = (EditText) findViewById(R.id.editTextNumber1);
        number2 = (EditText) findViewById(R.id.editTextNumber2);
        resultText = (TextView) findViewById(R.id.resultField);
    }

    public void addition(View v) {
        //varmaan scheisse viritys mutta menköön
        a = Integer.parseInt(String.valueOf(number1.getText()));
        b = Integer.parseInt(String.valueOf(number2.getText()));
        resultString = String.valueOf(a + b);
        resultText.setText(resultString);
    }

    public void subtraction(View v) {
        a = Integer.parseInt(String.valueOf(number1.getText()));
        b = Integer.parseInt(String.valueOf(number2.getText()));
        resultString = String.valueOf(a - b);
        resultText.setText(resultString);
    }

    public void multiplication(View v) {
        a = Integer.parseInt(String.valueOf(number1.getText()));
        b = Integer.parseInt(String.valueOf(number2.getText()));
        resultString = String.valueOf(a * b);
        resultText.setText(resultString);
    }

    public void division(View v) {
        double a = Integer.parseInt(String.valueOf(number1.getText()));
        double b = Integer.parseInt(String.valueOf(number2.getText()));
        resultString = String.valueOf(a / b);
        resultText.setText(resultString);
    }

}