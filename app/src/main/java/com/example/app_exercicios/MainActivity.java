package com.example.app_exercicios;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Exercicio1 (View v){
        Intent exercicio1 = new Intent(MainActivity.this, Activity_ex1.class);
        startActivity(exercicio1);
    }
    public void Exercicio4 (View v){
        Intent exercicio4 = new Intent(MainActivity.this, Activity_ex4.class);
        startActivity(exercicio4);
    }
}

