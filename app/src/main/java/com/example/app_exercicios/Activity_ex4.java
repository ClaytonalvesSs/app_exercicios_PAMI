package com.example.app_exercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_ex4 extends AppCompatActivity {
        private EditText ET_hrentrada;
        private TextView txt_saida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex4);
        ET_hrentrada = findViewById(R.id.ET_hrentrada);
        txt_saida = findViewById(R.id.txt_saida);
    }

    @SuppressLint("SetTextI18n")
    public void horacalculo(View View){
        int entrada = Integer.parseInt(ET_hrentrada.getText().toString());

        int saida = (entrada + 6);
        int saida2 = (entrada + 6) - 24;

        if(entrada >= 18){
            txt_saida.setText(saida2 + "Horas");

        }
        else {
            txt_saida.setText(saida + "Horas");
        }


    }
}