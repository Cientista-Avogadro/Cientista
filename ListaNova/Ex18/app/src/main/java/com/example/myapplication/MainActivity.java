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
        EditText editText1= (EditText)findViewById(R.id.txtfirst);
        TextView TextView1= (TextView)findViewById(R.id.txtnomes);
        int number=Integer.parseInt(editText1.getText().toString());

        if(editText1.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(),"Por favor insira um valor",Toast.LENGTH_SHORT).show();
        }
        else{
           if(ehPrimo(number)==true){
               TextView1.setText("O numero e primo");
           }
           else{
               TextView1.setText("O numero nao e primo");
           }
        }
    }
    public  boolean ehPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;
        }
        return true;
    }
}