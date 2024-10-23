package com.example.verificacao_veicular.Layout;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.verificacao_veicular.R;

public class DetalhesInspecaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_inspecao);

        // Recuperar o item selecionado da Intent
        String inspecaoSelecionada = getIntent().getStringExtra("inspecaoSelecionada");

        // Exibir o item selecionado (por exemplo, em um TextView)
        TextView textView = findViewById(R.id.textViewInspecao);
        textView.setText("Inspeção Selecionada: " + inspecaoSelecionada);
    }
}
