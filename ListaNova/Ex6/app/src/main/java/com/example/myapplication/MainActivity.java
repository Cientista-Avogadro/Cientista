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
    @SuppressLint("SetTextI18n")
    public void submit(View view){
        EditText editText1= (EditText)findViewById(R.id.txtpeso);
        TextView textView= (TextView)findViewById(R.id.peso15);
        TextView textView1= (TextView)findViewById(R.id.peso20);
        double peso15;
        double peso20;
        if(editText1.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(),"Por favor insira um valor",Toast.LENGTH_SHORT).show();
        }
        else{
            peso15=Double.valueOf(editText1.getText().toString()) + (Double.valueOf(editText1.getText().toString()) * 0.15);
            peso20=Double.valueOf(editText1.getText().toString()) - (Double.valueOf(editText1.getText().toString()) * 0.2);

            textView.setText("Engordar = "+String.valueOf(peso15));
            textView1.setText("Emagecer = "+String.valueOf(peso20));
        }
    }
}