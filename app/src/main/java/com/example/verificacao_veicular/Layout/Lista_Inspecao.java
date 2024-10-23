package com.example.verificacao_veicular.Layout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.SearchView;

import com.example.verificacao_veicular.R;

import java.util.ArrayList;
import java.util.List;

public class Lista_Inspecao extends AppCompatActivity {

    private RecyclerView recyclerView;
    private SearchView SearchView;
    private Lista_InspecaoAdapter adapter;
    private List<String> inspectionList;
    private List<String> filteredList;
    private Button btnVoltar, btnAvancar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_inspecao);

        // Inicializar Views
        recyclerView = findViewById(R.id.recyclerView);
        SearchView  = findViewById(R.id.searchView);
        btnVoltar = findViewById(R.id.btnVoltar);
        btnAvancar = findViewById(R.id.btnAvancar);

        // Inicializar a lista de inspeções (exemplo)
        inspectionList = new ArrayList<>();
        inspectionList.add("Inspeção de Freios");
        inspectionList.add("Inspeção de Suspensão");
        inspectionList.add("Inspeção de Direção");
        inspectionList.add("Inspeção de Luzes");
        inspectionList.add("Inspeção de Pneus");




        //inicia searchView


        // Ações dos botões Voltar e Avançar
        btnVoltar.setOnClickListener(v -> {
            // Lógica para o botão "Voltar"
            Toast.makeText(Lista_Inspecao.this, "Voltar", Toast.LENGTH_SHORT).show();
        });

        btnAvancar.setOnClickListener(v -> {
            // Lógica para o botão "Avançar"
            Toast.makeText(Lista_Inspecao.this, "Avançar", Toast.LENGTH_SHORT).show();
        });
    }






}