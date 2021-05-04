package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

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

    public void Calcular(View view){
        TextView textView = (TextView)findViewById(R.id.txtresult);
        EditText editText = (EditText)findViewById(R.id.txtvalor);
        double valor,result;

        if(editText.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(),"Erro Valor nulo",Toast.LENGTH_SHORT).show();
        }
        else{
            valor=Integer.parseInt(editText.getText().toString());
            result= (valor * 1.8 ) + 32;
            textView.setText(String.valueOf(result));
        }

    }
}