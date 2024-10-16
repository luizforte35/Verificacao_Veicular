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
        SearchView searchView = findViewById(R.id.searchView);
        btnVoltar = findViewById(R.id.btnVoltar);
        btnAvancar = findViewById(R.id.btnAvancar);

        // Inicializar a lista de inspeções (exemplo)
        inspectionList = new ArrayList<>();
        inspectionList.add("Inspeção de Freios");
        inspectionList.add("Inspeção de Suspensão");
        inspectionList.add("Inspeção de Direção");
        inspectionList.add("Inspeção de Luzes");
        inspectionList.add("Inspeção de Pneus");
        // Copiar a lista para uma lista filtrada inicialmente
        filteredList = new ArrayList<>(inspectionList);

        // Configurar o RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Lista_InspecaoAdapter(filteredList);
        recyclerView.setAdapter(adapter);

        // Configurar o SearchView para filtrar as inspeções
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filter(newText);
                return true;
            }
        });

// Customizar o campo de texto
        int searchTextId = searchView.getContext().getResources().getIdentifier("android:id/search_src_text", null, null);
        TextView searchText = searchView.findViewById(searchTextId);
        searchText.setTextColor(getResources().getColor(R.color.colorPrimary));
        searchText.setHintTextColor(getResources().getColor(R.color.backgroundLight));

// Customizar o ícone de lupa
        int searchIconId = searchView.getContext().getResources().getIdentifier("android:id/search_mag_icon", null, null);
        ImageView searchIcon = searchView.findViewById(searchIconId);
        searchIcon.setColorFilter(getResources().getColor(R.color.textLight));

// Remover a linha inferior padrão do SearchView
        int plateId = searchView.getContext().getResources().getIdentifier("android:id/search_plate", null, null);
        View searchPlate = searchView.findViewById(plateId);
        searchPlate.setBackgroundColor(Color.TRANSPARENT);  // Remover linha de fundo


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

    // Método para filtrar a lista de inspeções
    private void filter(String text) {
        filteredList.clear();
        for (String item : inspectionList) {
            if (item.toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(item);
            }
        }
    }





}

