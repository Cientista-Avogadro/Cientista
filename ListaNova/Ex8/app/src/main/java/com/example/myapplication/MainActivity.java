package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


        public void Kwanza (View view){
            EditText editText1 = (EditText) findViewById(R.id.txteuro);
            float kwanza;
            if (editText1.getText().toString().isEmpty()) {
                Toast.makeText(getApplicationContext(), "Por favor insira um valor", Toast.LENGTH_SHORT).show();
            } else {
                kwanza=Float.parseFloat(editText1.getText().toString()) * 795.43f;
                Toast.makeText(getApplicationContext(), String.valueOf(kwanza), Toast.LENGTH_SHORT).show();
            }
        }
        public void Real (View view){
            EditText editText1 = (EditText) findViewById(R.id.txteuro);
            float real;
            if (editText1.getText().toString().isEmpty()) {
                Toast.makeText(getApplicationContext(), "Por favor insira um valor", Toast.LENGTH_SHORT).show();
            } else {
                real=Float.parseFloat(editText1.getText().toString()) * 6.37f;
                Toast.makeText(getApplicationContext(), String.valueOf(real), Toast.LENGTH_SHORT).show();
            }
        }
        public void Dolar (View view){
            EditText editText1 = (EditText) findViewById(R.id.txteuro);
            float dolar;
            if (editText1.getText().toString().isEmpty()) {
                Toast.makeText(getApplicationContext(), "Por favor insira um valor", Toast.LENGTH_SHORT).show();
            } else {
                dolar=Float.parseFloat(editText1.getText().toString()) * 1.22f;
                Toast.makeText(getApplicationContext(),String.valueOf(dolar), Toast.LENGTH_SHORT).show();
            }
        }

}