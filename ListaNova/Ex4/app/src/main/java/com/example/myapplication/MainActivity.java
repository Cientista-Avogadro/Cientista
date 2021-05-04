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

    int anonasc , anoact, result1, result2 =0;
    @SuppressLint("SetTextI18n")
    public void submit(View view){
        EditText editText1= (EditText)findViewById(R.id.txtanonascimento);
        EditText editText2= (EditText)findViewById(R.id.txtanoatual);
        TextView TextView1= (TextView)findViewById(R.id.txtidade);
        TextView TextView2= (TextView)findViewById(R.id.txt2050);


        if(editText1.getText().toString().isEmpty() || editText2.getText().toString().isEmpty() ){
            Toast.makeText(getApplicationContext(),"Por favor insira um valor",Toast.LENGTH_SHORT).show();
        }
        else{
            anonasc= Integer.parseInt(editText1.getText().toString());
            anoact= Integer.parseInt(editText2.getText().toString());
            TextView1.setText(String.valueOf(IdadePesssoa()));
            TextView2.setText(String.valueOf(Idade2050()));
        }
    }

    public int IdadePesssoa(){
        if(anonasc>anoact){
           return result1= (anonasc - anoact);
        }
        else {
            return result1= (anoact - anonasc);
        }
    }

    public int Idade2050(){
        if(anonasc>2050){
            return result2= (anonasc - 2050);
        }
        else {
            return result2= (2050 - anonasc);
        }
    }
}