package com.example.verificacao_veicular.Layout;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.pdf.PdfDocument;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.verificacao_veicular.R;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Verificacao extends AppCompatActivity {
    static final int REQUEST_IMAGE_CAPTURE = 1;
    private ImageView imageView;  // Para mostrar a imagem capturada, caso queira exibir
    private String placa;
    private String modelo;
    private String ano;
    private String observacoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verificacao);




    }

    private void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            imageView.setImageBitmap(imageBitmap);  // Se você quiser exibir a imagem
        }
    }

    private void salvarInspecao() {
        // Lógica para salvar os dados da inspeção
        String placa = ((EditText) findViewById(R.id.etPlaca)).getText().toString();
        String modelo = ((EditText) findViewById(R.id.etModelo)).getText().toString();
        String ano = ((EditText) findViewById(R.id.etAno)).getText().toString();
        String observacoes = ((EditText) findViewById(R.id.etObservacoes)).getText().toString();

        // Salve localmente ou transforme em PDF
        // Aqui você pode implementar a lógica de geração de PDF com os dados coletados

        Toast.makeText(this, "Inspeção salva com sucesso!", Toast.LENGTH_LONG).show();
    }
    private void gerarPDF() {
        PdfDocument document = new PdfDocument();
        PdfDocument.PageInfo pageInfo = new PdfDocument.PageInfo.Builder(595, 842, 1).create();
        PdfDocument.Page page = document.startPage(pageInfo);

        Canvas canvas = page.getCanvas();
        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setTextSize(12);

        canvas.drawText("Inspeção Veicular", 80, 50, paint);
        canvas.drawText("Placa: " + placa, 80, 80, paint);
        canvas.drawText("Modelo: " + modelo, 80, 110, paint);
        canvas.drawText("Ano: " + ano, 80, 140, paint);
        canvas.drawText("Observações: " + observacoes, 80, 170, paint);

        document.finishPage(page);

        // Salve o PDF no armazenamento
        String directoryPath = Environment.getExternalStorageDirectory().getPath() + "/InspecaoVeicular/";
        File file = new File(directoryPath);
        if (!file.exists()) {
            file.mkdirs();
        }
        String filePath = directoryPath + "inspecao_" + placa + ".pdf";
        try {
            document.writeTo(new FileOutputStream(filePath));
            Toast.makeText(this, "PDF gerado com sucesso!", Toast.LENGTH_LONG).show();
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(this, "Erro ao gerar PDF", Toast.LENGTH_SHORT).show();
        }

        document.close();
    }

}


