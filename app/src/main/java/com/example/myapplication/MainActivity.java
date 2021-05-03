package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int inputuser=0;
    int inputpc=0;




    public void Papel(View view){


            inputuser=1;
        Cpuescolha();
            Verifica();
    }

    public void Pedra(View view){
            inputuser=2;
        Cpuescolha();
            Verifica();
    }

    public void Tesoura(View view){
            inputuser=3;
        Cpuescolha();
            Verifica();
    }


    public void Verifica( ){

        try {
            TextView win1= findViewById(R.id.txtpc);
            TextView win= findViewById(R.id.txtpc2);
            win1.setText(Integer.toString(inputpc));

            if(inputpc==inputuser){

                win.setText("Empate!!!!!!");
            }
            else if(inputuser - inputpc == -1 || inputuser - inputpc == 2){
                win.setText("Você Venceu!!!!!!");

            }
            else{
                win.setText("Computador Venceu!!!!!!");


            }

        } catch (Exception e) {
            System.out.println("Oops!");
        }


    }


    public void Cpuescolha(){
        Random inputcpu = new Random();


            inputpc=inputcpu.nextInt(3)+1;

    }
}