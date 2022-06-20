package com.kayasanli.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edittext1;
    EditText edittext2;
    TextView resulText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext1 = findViewById(R.id.edittext1);
        edittext2 = findViewById(R.id.edittext2);
        resulText = findViewById(R.id.resultText);

    }
    public void sum(View view){
        if(edittext1.getText().toString().matches("") || edittext2.getText().toString().matches("")){
           resulText.setText("Enter Number");
        }
        else {
            int toplam = Integer.parseInt(edittext1.getText().toString()) + Integer.parseInt(edittext2.getText().toString());
            resulText.setText("Result :" + toplam);
        }
    }
    public void divide(View view){
        if(edittext1.getText().toString().matches("")){
            resulText.setText("Enter Number");
        }
        else if (edittext2.getText().toString().matches("0")){
            resulText.setText("Can not be 0");
        }
        else {
        int divide= Integer.parseInt(edittext1.getText().toString())/Integer.parseInt(edittext2.getText().toString());
        resulText.setText("Result :"+divide);}
    }
    public void deduct(View view){
        if(edittext1.getText().toString().matches("") || edittext2.getText().toString().matches("")){
            resulText.setText("Enter Number");
        }
        else {
        int deduct= Integer.parseInt(edittext1.getText().toString())-Integer.parseInt(edittext2.getText().toString());
        resulText.setText("Result :"+deduct);}
    }
    public void multiply(View view){
        if(edittext1.getText().toString().matches("") || edittext2.getText().toString().matches("")){
            resulText.setText("Enter Number");
        }
        else {
            int multiply = Integer.parseInt(edittext1.getText().toString()) * Integer.parseInt(edittext2.getText().toString());
            resulText.setText("Result :" + multiply);
        }
    }
}