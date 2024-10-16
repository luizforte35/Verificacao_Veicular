package com.example.verificacao_veicular.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class Lista_InspecaoAdapter extends RecyclerView.Adapter<Lista_InspecaoAdapter.ViewHolder> {

    private List<String> inspectionList;

    public Lista_InspecaoAdapter(List<String> inspectionList) {
        this.inspectionList = inspectionList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.inspectionText.setText(inspectionList.get(position));
    }

    @Override
    public int getItemCount() {
        return inspectionList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView inspectionText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            inspectionText = itemView.findViewById(android.R.id.text1);
        }
    }


}
