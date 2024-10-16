package com.example.verificacao_veicular.Layout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.verificacao_veicular.R;

public class MainActivity extends AppCompatActivity {

    private Button iniciarVerificacaoButton;
    private Button historicoButton;
    private Button configuracoesButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

            iniciarVerificacaoButton = findViewById(R.id.iniciarVerificacaoButton);
            historicoButton = findViewById(R.id.historicoButton);
            configuracoesButton = findViewById(R.id.configuracoesButton);

            iniciarVerificacaoButton.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity.this, VerificacaoActivity.class);
                startActivity(intent);
            });





    }//fim do onCreate
}//class