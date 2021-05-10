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
        //Edits
        EditText prfabrica= (EditText)findViewById(R.id.prfabrica);
        EditText prlucro= (EditText)findViewById(R.id.prlucro);
        EditText primposto= (EditText)findViewById(R.id.primposto);
        //TextViews
        TextView v_impostos= (TextView)findViewById(R.id.impostos);
        TextView v_lucro= (TextView)findViewById(R.id.lucro);
        TextView p_final= (TextView)findViewById(R.id.prveiculofinal);
        //var declarated
       float preco_fabrica, percentual_lucro, percentual_imposto,
               preco_final, valor_impostos , valor_lucro, preco_imposto;
        //Convert Values
       preco_fabrica=Float.parseFloat(prfabrica.getText().toString());
        percentual_lucro=Float.parseFloat(prlucro.getText().toString());
        percentual_imposto=Float.parseFloat(primposto.getText().toString());

        //Autentication dos inputs
        if(prfabrica.getText().toString().isEmpty() || prlucro.getText().toString().isEmpty() || primposto.getText().toString().isEmpty() ){
            Toast.makeText(getApplicationContext(),"Por favor insira um valor",Toast.LENGTH_SHORT).show();
        }
        else{
            //Caçlcular os valores
            valor_impostos = preco_fabrica * percentual_lucro /100;
            valor_lucro = preco_fabrica * percentual_imposto /100;
            preco_final = preco_fabrica + valor_impostos + valor_lucro;

            //Apresentar os valores
            v_impostos.setText(String.valueOf(valor_impostos));
            v_lucro.setText(String.valueOf(valor_lucro));
            p_final.setText(String.valueOf(preco_final));
        }


    }
}