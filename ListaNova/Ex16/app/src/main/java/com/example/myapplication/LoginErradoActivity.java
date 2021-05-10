package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class LoginErradoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_errado);
        Toast.makeText(getApplicationContext(),"login errado",Toast.LENGTH_SHORT).show();
    }

    public void volta(View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_MESSAGE, "Cientista");
        startActivity(intent);
    }
}