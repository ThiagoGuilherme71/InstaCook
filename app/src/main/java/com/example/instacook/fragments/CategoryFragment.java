package com.example.instacook.fragments;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instacook.R;
import com.example.instacook.adapters.CategoriasAdapter;

public class CategoryFragment extends Fragment {

    public CategoryFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_category, container, false);

        String[] categorias = {"Italiana", "Brasileira", "Japonesa", "Italiana", "Brasileira", "Japonesa", "Italiana", "Brasileira", "Japonesa",
                "Italiana", "Brasileira", "Japonesa", "Italiana", "Brasileira", "Japonesa", "Italiana", "Brasileira", "Japonesa",
                "Italiana", "Brasileira", "Japonesa", "Italiana", "Brasileira", "Japonesa"};

        int[] imagens = {R.drawable.img_carbonara02, R.drawable.img_feijoada01, R.drawable.img_macarrao_bolonhesa01, R.drawable.img_feijoada02,
                R.drawable.img_carbonara02, R.drawable.img_feijoada01, R.drawable.img_macarrao_bolonhesa01, R.drawable.img_feijoada02,
                R.drawable.img_carbonara02, R.drawable.img_feijoada01, R.drawable.img_macarrao_bolonhesa01, R.drawable.img_feijoada02,
                R.drawable.img_carbonara02, R.drawable.img_feijoada01, R.drawable.img_macarrao_bolonhesa01, R.drawable.img_feijoada02,
                R.drawable.img_carbonara02, R.drawable.img_feijoada01, R.drawable.img_macarrao_bolonhesa01, R.drawable.img_feijoada02,
                R.drawable.img_carbonara02, R.drawable.img_feijoada01, R.drawable.img_macarrao_bolonhesa01, R.drawable.img_feijoada02};

        RecyclerView recyclerView = view.findViewById(R.id.recycler_categorias);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        recyclerView.setAdapter(new CategoriasAdapter(categorias, imagens));

        return view;

    }

}
