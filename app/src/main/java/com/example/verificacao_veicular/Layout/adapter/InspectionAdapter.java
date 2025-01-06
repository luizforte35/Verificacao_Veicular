package com.example.verificacao_veicular.Layout.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.verificacao_veicular.Layout.Inspecao.Inspection;
import com.example.verificacao_veicular.R;

import java.util.List;

public class InspectionAdapter extends RecyclerView.Adapter<InspectionAdapter.ViewHolder> {

    private List<Inspection> inspectionList;

    public InspectionAdapter(List<Inspection> inspectionList) {
        this.inspectionList = inspectionList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_inspection, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Inspection inspection = inspectionList.get(position);
        holder.inspectionTitle.setText(inspection.getTitle());
        holder.inspectionDescription.setText(inspection.getDescription());
        holder.inspectionIcon.setImageResource(inspection.getIcon()); // Ícone específico para cada inspeção
    }

    @Override
    public int getItemCount() {
        return inspectionList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView inspectionTitle;
        TextView inspectionDescription;
        ImageView inspectionIcon;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            inspectionTitle = itemView.findViewById(R.id.inspectionTitle);
            inspectionDescription = itemView.findViewById(R.id.inspectionDescription);
            inspectionIcon = itemView.findViewById(R.id.inspectionIcon);
        }
    }
}

