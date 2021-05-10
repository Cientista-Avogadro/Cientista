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
        EditText Tsalario= (EditText)findViewById(R.id.tSalario);
        EditText Tqtd= (EditText)findViewById(R.id.tQtd);
        TextView valorkilo=(TextView)findViewById(R.id.vKilo);
        TextView valorPago=(TextView)findViewById(R.id.vPago);
        TextView valorDesc=(TextView)findViewById(R.id.vDesconto);
        float  salmin, qtdconsu, valorpkw, valortotal,desc;

        if(Tsalario.getText().toString().isEmpty() || Tqtd.getText().toString().isEmpty() ){
            Toast.makeText(getApplicationContext(),"Por favor insira um valor",Toast.LENGTH_SHORT).show();
        }
        else {
            salmin=Float.valueOf(Tsalario.getText().toString());
            qtdconsu=Float.valueOf(Tqtd.getText().toString());

            valorpkw = salmin/5;
            valortotal = valorpkw * qtdconsu;
            desc = valortotal - (valortotal * 15)/100;

            valorkilo.setText(String.valueOf(valorpkw));
            valorPago.setText(String.valueOf(valortotal));
            valorDesc.setText(String.valueOf(desc));
        }
    }
}