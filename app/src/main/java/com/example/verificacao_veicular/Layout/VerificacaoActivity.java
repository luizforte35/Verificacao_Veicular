package com.example.verificacao_veicular.Layout;

 // Certifique-se de usar o nome do pacote correto

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.verificacao_veicular.R;

public class VerificacaoActivity extends AppCompatActivity {

    // Declarando os componentes da interface
    private EditText etPlaca, etModelo, etAno, etObservacoes;
    private Button btnIniciarInspecao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verificacao); // Verifique se este é o nome correto do layout XML

        // Inicializando as Views (componentes da tela)
        etPlaca = findViewById(R.id.etPlaca);
        etModelo = findViewById(R.id.etModelo);
        etAno = findViewById(R.id.etAno);
        etObservacoes = findViewById(R.id.etObservacoes);
        btnIniciarInspecao = findViewById(R.id.btnIniciarInspecao); // Verifique se o ID no XML corresponde

        // Ação ao clicar no botão "Iniciar Inspeção"
        btnIniciarInspecao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VerificacaoActivity.this, Lista_Inspecao.class);
                startActivity(intent);
                iniciarInspecao();
            }
        });
    }

    // Método para validar os campos e iniciar a inspeção
    private void iniciarInspecao() {
        String placa = etPlaca.getText().toString().trim();
        String modelo = etModelo.getText().toString().trim();
        String ano = etAno.getText().toString().trim();
        String observacoes = etObservacoes.getText().toString().trim();

        // Validando se os campos obrigatórios estão preenchidos
        if (placa.isEmpty() || modelo.isEmpty() || ano.isEmpty()) {
            Toast.makeText(this, "Por favor, preencha todos os campos obrigatórios.", Toast.LENGTH_SHORT).show();
            return; // Para evitar que o código continue se os campos estiverem vazios
        }

        // Exemplo de ação ao iniciar a inspeção
        Toast.makeText(this, "Inspeção iniciada para o veículo: " + placa, Toast.LENGTH_SHORT).show();

        // Aqui você pode adicionar o código para salvar os dados ou iniciar outra Activity
        // Exemplo:
        // Intent intent = new Intent(VerificacaoActivity.this, DetalhesInspecaoActivity.class);
        // intent.putExtra("PLACA", placa);
        // startActivity(intent);
    }
}
