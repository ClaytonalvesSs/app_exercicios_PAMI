package com.example.app_exercicios;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

    /*declaração das Views*/
public class Activity_ex1 extends AppCompatActivity {
    private EditText ET_valora;
    private EditText ET_valorb;
    private EditText ET_resultado;

        public Activity_ex1() {
        }


        /*"chamando" as Views pelo Id*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex1);
        ET_valora = findViewById(R.id.ET_valora);
        ET_valorb = findViewById(R.id.ET_valorb);
        ET_resultado = findViewById(R.id.ET_resultado);
        VideoView video_view = findViewById(R.id.video_view);

        // Definindo o caminho do vídeo a ser reproduzido (a partir da pasta 'res/raw')
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.multiplos;

        // Configura a URI do vídeo
        Uri uri = Uri.parse(videoPath);

        // Colocando controladores no video
        // Criando o objeto MediaController e instânciando ele
        MediaController mediaController = new MediaController(this);

        // Configurando o MediaContoller para usar no VideoView, colocando os controles abaixo do vídeo para o usuário controlá-lo
        video_view.setMediaController(mediaController);

        //Define que o VideoView é a âncora do MediaController, ou seja, o MediaController será exibido na parte de baixo do VideoView e vai seguir o comportamento do VideoView
        mediaController.setAnchorView(video_view);

        // Define a URI na VideoView
        video_view.setVideoURI(uri);

    }

    /*Criação do método para ver se é múltiplo,
     com seu nome "vmultiplo",ele foi chamado através da propriedade "OnClick" do botão,
     assim, podendo realizar o resultado que foi criado pelo método*/

    @SuppressLint("SetTextI18n")
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