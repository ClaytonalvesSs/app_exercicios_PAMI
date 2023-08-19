package com.example.app_exercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Activity_ex4 extends AppCompatActivity {
        private EditText ET_hrentrada;
        private EditText ET_hrsaida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex4);
        ET_hrentrada = findViewById(R.id.ET_hrentrada);
        ET_hrsaida = findViewById(R.id.ET_hrsaida);
    }
    public void horacalculo(View View){
        int entrada = Integer.parseInt(ET_hrentrada.getText().toString());

        int saida = (entrada + 6);
        int saida2 = (entrada + 6) - 24;

        if(entrada >= 18){
            ET_hrsaida.setText(saida2);

        }
        else {
            ET_hrsaida.setText(saida);
        }


    }
}