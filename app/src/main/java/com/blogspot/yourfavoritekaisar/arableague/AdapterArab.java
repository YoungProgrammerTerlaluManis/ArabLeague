package com.blogspot.yourfavoritekaisar.arableague;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class AdapterArab extends RecyclerView.Adapter<AdapterArab.ViewHolder> {
    Context context;
    int[] foto_Negara;
    String[] nama_Negara,detail_Negara;


    public AdapterArab(Context context, int[] foto_Negara, String[] nama_Negara, String[] detail_Negara) {
        this.context = context;
        this.foto_Negara = foto_Negara;
        this.nama_Negara = nama_Negara;
        this.detail_Negara = detail_Negara;
    }

    @NonNull
    @Override
    public AdapterArab.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view  = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_negara, viewGroup, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull AdapterArab.ViewHolder viewHolder, final int i) {
        viewHolder.txtNegara.setText(nama_Negara[i]);
        Glide.with(context).load(foto_Negara[i]).into(viewHolder.logo);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(context,namanegaraActivity.class);
                pindah.putExtra("nn", nama_Negara[i]);
                pindah.putExtra("dn", detail_Negara[i]);
                pindah.putExtra("fn", foto_Negara[i]);
                context.startActivity(pindah);
            }
        });




    }

    @Override
    public int getItemCount() {
        return foto_Negara.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView logo;
        TextView txtNegara;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            logo = itemView.findViewById(R.id.bendera);
            txtNegara = itemView.findViewById(R.id.txtListTitle);
        }
    }
}
