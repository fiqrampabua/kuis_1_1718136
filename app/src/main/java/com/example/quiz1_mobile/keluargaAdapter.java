package com.example.quiz1_mobile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class keluargaAdapter extends RecyclerView.Adapter<keluargaAdapter.keluargaViewHolder>{
    public keluargaAdapter(ArrayList<keluarga> dataList) {
        this.dataList = dataList;
    }

    private ArrayList<keluarga> dataList;
    @NonNull
    @Override
    public keluargaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.keluarga, parent, false);
        return new keluargaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull keluargaViewHolder holder, int position) {
        holder.nama.setText(dataList.get(position).getNama());
        holder.status.setText(dataList.get(position).getStatus());
        holder.gambar.setImageDrawable(dataList.get(position).getGambar());

    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class keluargaViewHolder extends RecyclerView.ViewHolder {
        private TextView nama, status;
        private ImageView gambar;
        public keluargaViewHolder(@NonNull View itemView) {
            super(itemView);
            nama = (TextView) itemView.findViewById(R.id.nama);
            status = (TextView) itemView.findViewById(R.id.status);
            gambar = (ImageView) itemView.findViewById(R.id.foto);
        }
    }
}

