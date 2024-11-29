package com.example.instacook.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instacook.R;

import java.util.Arrays;

public class CategoriasAdapter extends RecyclerView.Adapter<CategoriasAdapter.ViewHolder> {

    private final String[] categorias;
    private final int[] imagens;
    private final boolean[] visibilidade;

    public CategoriasAdapter(String[] categorias, int[] imagens) {

        this.categorias = categorias;
        this.imagens = imagens;
        this.visibilidade = new boolean[categorias.length];

        Arrays.fill(visibilidade, true);

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.categorias_category, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.imgCategoria.setImageResource(imagens[position]);
        holder.txtCategoria.setText(categorias[position]);

        int cor = visibilidade[position]
                ? holder.itemView.getContext().getResources().getColor(R.color.translucent)
                : holder.itemView.getContext().getResources().getColor(R.color.yellow_75);

        holder.cvCategoria.setCardBackgroundColor(cor);

        holder.cvCategoria.setOnClickListener(v -> {
            visibilidade[position] = !visibilidade[position];
            notifyItemChanged(position);
        });

    }

    @Override
    public int getItemCount() {
        return categorias.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imgCategoria;
        TextView txtCategoria;
        CardView cvCategoria;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgCategoria = itemView.findViewById(R.id.img_categoria2);
            txtCategoria = itemView.findViewById(R.id.tv_categoria2);
            cvCategoria = itemView.findViewById(R.id.cv_categoria2);
        }

    }

}
