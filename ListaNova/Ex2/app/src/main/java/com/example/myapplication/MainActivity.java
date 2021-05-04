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
        EditText editText2= (EditText)findViewById(R.id.txtsecond);
        TextView textView= (TextView)findViewById(R.id.txtnomes);
        String mensagem="Ola";

        if(editText1.getText().toString().isEmpty() || editText2.getText().toString().isEmpty() ){
            Toast.makeText(getApplicationContext(),"Por favor insira um valor",Toast.LENGTH_SHORT).show();
        }
        else{
            mensagem+=" " + editText1.getText() +" "+ editText2.getText();
            textView.setText(mensagem);
        }
    }
}