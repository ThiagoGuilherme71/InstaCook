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
import com.example.instacook.util.DataProvider;

import java.util.HashMap;
import java.util.Map;

public class HomeFragment extends Fragment {

    public HomeFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        TextView tvVerTodos = view.findViewById(R.id.tv_ver_todos);
        tvVerTodos.setText(Html.fromHtml("<u>ver todos</u>"));

        HashMap<String, Integer> categories = DataProvider.getCategories();

        LinearLayout linlayCategorias = view.findViewById(R.id.linlay_categorias1);

        for (Map.Entry<String, Integer> entry : categories.entrySet()) {

            View itemView = inflater.inflate(R.layout.categorias_home, linlayCategorias, false);

            ImageView imgCategoria = itemView.findViewById(R.id.img_categoria1);
            TextView tvCategoria = itemView.findViewById(R.id.tv_categoria1);

            imgCategoria.setImageResource(entry.getValue());
            tvCategoria.setText(entry.getKey());

            linlayCategorias.addView(itemView);

        }

        return view;

    }

}
