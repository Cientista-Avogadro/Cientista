package com.example.exercicio1;

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

    public void Converter(View view){
        TextView textView =(TextView)findViewById(R.id.txtresult);
        EditText editText = (EditText)findViewById(R.id.txtvalor);
        double valor;

        if (editText.getText().toString().isEmpty()){
            Toast.makeText (getApplicationContext (), "Please Insert a Value" , Toast.LENGTH_SHORT) .show ();
        }
        else {
            valor=(Integer.parseInt(editText.getText().toString()) * 1.8) + 32;
            textView.setText(String.valueOf(valor));
        }
    }
}