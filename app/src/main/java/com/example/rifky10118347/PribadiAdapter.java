package com.example.rifky10118347;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

//07-04-2021, 10118347, Rifky Arya Nur Salman, IF-8

public class PribadiAdapter extends RecyclerView.Adapter<PribadiAdapter.PribadiViewHolder> {

    private ArrayList<Pribadi> listPribadi;

    public PribadiAdapter(ArrayList<Pribadi> listPribadi) {
        this.listPribadi = listPribadi;
    }

    @NonNull
    @Override
    public PribadiAdapter.PribadiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.profil_pribadi, parent, false);
        return new PribadiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PribadiAdapter.PribadiViewHolder holder, int position) {
        holder.tvNim.setText(listPribadi.get(position).getNim());
        holder.tvNama.setText(listPribadi.get(position).getNama());
        holder.tvKelas.setText(listPribadi.get(position).getKelas());
        holder.tvDeskripsi.setText(listPribadi.get(position).getDeskripsi());
    }

    @Override
    public int getItemCount() {
        return (listPribadi!= null) ? listPribadi.size() : 0;
    }

    public class PribadiViewHolder extends RecyclerView.ViewHolder{
        private TextView tvNama, tvNim, tvKelas, tvDeskripsi;

        public PribadiViewHolder(View view){
            super(view);
            tvNim = view.findViewById(R.id.tv_nim);
            tvNama = view.findViewById(R.id.tv_nama);
            tvKelas = view.findViewById(R.id.tv_kelas);
            tvDeskripsi = view.findViewById(R.id.tv_deskripsi);
        }
    }
}
