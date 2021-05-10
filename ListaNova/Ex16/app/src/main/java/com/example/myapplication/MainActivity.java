package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
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
    public void submit(View view) {
        EditText editText1 = (EditText) findViewById(R.id.txtfirst);
        EditText editText2 = (EditText) findViewById(R.id.editTextTextPassword);

        if (editText1.getText().toString().isEmpty() || editText2.getText().toString().isEmpty()) {
            Toast.makeText(getApplicationContext(), "Por favor Preencha os Campo", Toast.LENGTH_SHORT).show();
        } else {
            if (editText1.getText().toString().equals("user") && editText2.getText().toString().equals("pass")) {
                outra();
            } else {
                outra1();
            }
        }
    }
        public void outra() {
            Intent intent = new Intent(this, LoginOkActivity.class);
            intent.putExtra(EXTRA_MESSAGE, "Cientista");
            startActivity(intent);
        }
    public void outra1() {
        Intent intent = new Intent(this, LoginErradoActivity.class);
        intent.putExtra(EXTRA_MESSAGE, "Cientista");
        startActivity(intent);
    }

}