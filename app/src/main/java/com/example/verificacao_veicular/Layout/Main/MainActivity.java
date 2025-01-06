package com.example.verificacao_veicular.Layout.Main;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;


import com.example.verificacao_veicular.Layout.Inspecao.Lista_Inspecao;
import com.example.verificacao_veicular.R;

public class MainActivity extends AppCompatActivity {

    private Button iniciarVerificacaoButton;
    private Button historicoButton;
    private Button configuracoesButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

            iniciarVerificacaoButton = findViewById(R.id.iniciarVerificacaoButton);
            historicoButton = findViewById(R.id.historicoButton);
            configuracoesButton = findViewById(R.id.configuracoesButton);


            iniciarVerificacaoButton.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity.this, Lista_Inspecao.class);
                startActivity(intent);
            });




    }//fim do onCreate
}//class