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

    @SuppressLint("SetTextI18n")
    public void submit(View view){
        EditText Txtuser= (EditText)findViewById(R.id.txtuser);
        EditText Txtpass= (EditText)findViewById(R.id.txtpass);



        if(Txtuser.getText().toString().isEmpty() || Txtpass.getText().toString().isEmpty() ){
            Toast.makeText(getApplicationContext(),"Por favor Preencha os Campo",Toast.LENGTH_SHORT).show();
        }
        else{
           if(Txtuser.getText().toString().equals("user") || Txtuser.getText().toString().equals("User") || Txtuser.getText().toString().equals("USER") && Txtpass.getText().toString().equals("pass")){
               Toast.makeText(getApplicationContext(),"Login Valido",Toast.LENGTH_SHORT).show();
           }
           else{
               Toast.makeText(getApplicationContext(),"Login invalido",Toast.LENGTH_SHORT).show();
               Txtuser.setText("");
               Txtpass.setText("");
           }

        }
    }
}