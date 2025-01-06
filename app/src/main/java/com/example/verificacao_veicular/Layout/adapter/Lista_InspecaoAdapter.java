package com.example.verificacao_veicular.Layout.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.verificacao_veicular.R;


public class Lista_InspecaoAdapter extends RecyclerView.Adapter<Lista_InspecaoAdapter.ViewHolder> {



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_inspection, parent, false);
        return new ViewHolder(view);

    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.inspectionTitle.setText("Inspeção de Freios");
        holder.inspectionDescription.setText("Verifique o estado dos freios do veículo");
        holder.inspectionStatus.setText("Concluído");

    }


    @Override
    public int getItemCount() {
        return 2;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView inspectionTitle;
        TextView inspectionDescription;
        TextView inspectionStatus;
        public ViewHolder(View itemView) {
            super(itemView);
            inspectionTitle = itemView.findViewById(R.id.inspectionTitle);
            inspectionDescription = itemView.findViewById(R.id.inspectionDescription);
            inspectionStatus = itemView.findViewById(R.id.inspectionStatus);
        }
    }


}
