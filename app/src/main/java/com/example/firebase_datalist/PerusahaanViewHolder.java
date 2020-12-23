package com.example.firebase_datalist;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class PerusahaanViewHolder extends RecyclerView.ViewHolder {

    public TextView tvNama;
    public TextView tvTahun;
    public TextView tvWeb;
    public TextView btnOpen;

    public PerusahaanViewHolder(View itemView) {
        super(itemView);
        tvNama = itemView.findViewById(R.id.tv_perusahaan);
        tvTahun = itemView.findViewById(R.id.tv_tahun);
        tvWeb = itemView.findViewById(R.id.tv_website);
        btnOpen = itemView.findViewById(R.id.btn_open);
    }

    public void bindToPerusahaan(Perusahaan perusahaan, View.OnClickListener onClickListener){
        tvNama.setText(perusahaan.nama);
        tvTahun.setText(perusahaan.tahun);
        tvWeb.setText(perusahaan.website);
        btnOpen.setOnClickListener(onClickListener);
    }

}
