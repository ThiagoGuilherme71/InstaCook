package com.example.instacook.fragments;

import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.instacook.R;

public class HomeFragment extends Fragment {

    public HomeFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        TextView tvVerTodos = view.findViewById(R.id.tv_ver_todos);
        tvVerTodos.setText(Html.fromHtml("<u>ver todos</u>"));

        String[] categorias = {"Italiana", "Brasileira", "Japonesa", "Coreana"};
        int[] imagens = {R.drawable.img_carbonara02, R.drawable.img_feijoada01, R.drawable.img_macarrao_bolonhesa01, R.drawable.img_feijoada02};

        LinearLayout linlayCategorias = view.findViewById(R.id.linlay_categorias1);

        for (int i = 0; i < categorias.length; i++) {

            View itemView = inflater.inflate(R.layout.categorias_home, linlayCategorias, false);

            ImageView imgCategoria = itemView.findViewById(R.id.img_categoria1);
            TextView tvCategoria = itemView.findViewById(R.id.tv_categoria1);

            imgCategoria.setImageResource(imagens[i]);
            tvCategoria.setText(categorias[i]);

            linlayCategorias.addView(itemView);

        }

        return view;

    }

}
