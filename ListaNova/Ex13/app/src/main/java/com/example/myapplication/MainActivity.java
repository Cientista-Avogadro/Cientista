package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SetTextI18n")
    public void submit(View view){

            Intent intent = new Intent(this, MainActivity2.class);

            intent.putExtra(EXTRA_MESSAGE, "Cientista");
            startActivity(intent);

    }

    public void toasted(View view){
        Toast.makeText(getApplicationContext(),"Botao clicacdo",Toast.LENGTH_SHORT).show();
    }
}