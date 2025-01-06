package com.example.verificacao_veicular.Layout.Inspecao;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.SearchView;

import com.example.verificacao_veicular.Layout.adapter.Lista_InspecaoAdapter;
import com.example.verificacao_veicular.Layout.model.Lista;
import com.example.verificacao_veicular.R;

import java.util.ArrayList;
import java.util.List;

public class Lista_Inspecao extends AppCompatActivity {

    private List<Lista> inspectionList = new ArrayList<Lista>();
    private RecyclerView recyclerView;
    private SearchView searchView;
    private Lista_InspecaoAdapter adapter;
    private Button btnVoltar, btnAvancar;


    public void CriarLista(){
        Lista lista = new Lista("Inspeção de Freios", "Verifique o estado dos freios do veículo");
        this.inspectionList.add(lista);
        lista = new Lista("Inspeção de Suspensão", "Verifique o estado da suspensão do veículo");
        this.inspectionList.add(lista);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_inspecao);

        // Inicializar Views
        searchView = findViewById(R.id.searchView);
        btnVoltar = findViewById(R.id.btnVoltar);
        btnAvancar = findViewById(R.id.btnAvancar);
        recyclerView = findViewById(R.id.Rv_insp);


        // Configurar RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Lista_InspecaoAdapter();
        recyclerView.setAdapter(adapter);

        // Configurar SearchView


        // Ações dos botões Voltar e Avançar
        btnVoltar.setOnClickListener(v -> {
            Toast.makeText(Lista_Inspecao.this, "Voltar", Toast.LENGTH_SHORT).show();
            // Adicione lógica para voltar à tela anterior
        });

        btnAvancar.setOnClickListener(v -> {
            Toast.makeText(Lista_Inspecao.this, "Avançar", Toast.LENGTH_SHORT).show();
            // Adicione lógica para avançar para a próxima tela
        });
    }

}
