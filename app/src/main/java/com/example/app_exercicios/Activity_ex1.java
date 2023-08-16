package com.example.app_exercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Activity_ex1 extends AppCompatActivity {
    private EditText ET_valora;
    private EditText ET_valorb;
    private EditText ET_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex1);
        ET_valora = findViewById(R.id.ET_valora);
        ET_valorb = findViewById(R.id.ET_valorb);
        ET_resultado = findViewById(R.id.ET_resultado);

    }

    /*Criando método para ver se é múltiplo*/

    public void vmultiplo(View view){
        int valora = Integer.parseInt(ET_valora.getText().toString());
        int valorb = Integer.parseInt(ET_valorb.getText().toString());

        int resultado = valora % valorb;

        if(resultado >0){
            ET_resultado.setText("Não são múltiplos");
        }
        else {
            ET_resultado.setText("São multiplos");
        }
    }
}