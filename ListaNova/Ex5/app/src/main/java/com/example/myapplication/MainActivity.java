package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Double salario;
    @SuppressLint("SetTextI18n")
    public void submit(View view){


        EditText editText1= (EditText)findViewById(R.id.txtSalario);

        if(editText1.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(),"Por favor insira um valor",Toast.LENGTH_SHORT).show();
        }
        else{
            salario=Double.valueOf(editText1.getText().toString());
            Toast.makeText(getApplicationContext(),"Salario Receber = "+ String.valueOf(salario + Gratificacao() - Imposto()),Toast.LENGTH_LONG).show();
        }
    }

    public Double Gratificacao(){
       double gratificacao = salario * 0.05 ;
        return gratificacao;
    }

    public Double Imposto(){
        double imposto = salario * 0.07 ;
        return imposto;
    }
}