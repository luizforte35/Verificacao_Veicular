package com.example.verificacao_veicular.Layout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.verificacao_veicular.R;

import java.util.List;

public class Lista_InspecaoAdapter extends RecyclerView.Adapter<Lista_InspecaoAdapter.ViewHolder> {

    private List<String> inspecaoList;
    private OnItemClickListener listener;

    public Lista_InspecaoAdapter(List<String> inspecaoList, OnItemClickListener listener) {
        this.inspecaoList = inspecaoList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_inspecao, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String inspecao = inspecaoList.get(position);
        holder.bind(inspecao, listener);
    }

    @Override
    public int getItemCount() {
        return inspecaoList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView inspecaoNome;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            inspecaoNome = itemView.findViewById(R.id.inspecaoNome);
        }

        public void bind(final String inspecao, final OnItemClickListener listener) {
            inspecaoNome.setText(inspecao);
            itemView.setOnClickListener(v -> listener.onItemClick(inspecao));
        }
    }

    public interface OnItemClickListener {
        void onItemClick(String item);
    }
}
