package com.example.instacook.fragments;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.example.instacook.R;

public class IngredientsFragment extends Fragment {

    public IngredientsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_ingredients, container, false);

        TextView converse = view.findViewById(R.id.tv_converse);
        converse.setText(Html.fromHtml("<u>Converse</u>"));

        String[] ingredientes = {"Feijão Preto", "Carne Seca", "Costela de Porco", "Linguiça Calabresa", "Paio", "Bacon", "Alho", "Cebola", "Folha de Louro", "Sal",
                "Feijão Preto", "Carne Seca", "Costela de Porco", "Linguiça Calabresa", "Paio", "Bacon", "Alho", "Cebola", "Folha de Louro", "Sal"};

        LinearLayout linlayIngredientes = view.findViewById(R.id.linlay_ingredientes_ingredients);

        for (String ingrediente : ingredientes) {

            View itemView = inflater.inflate(R.layout.button_ingredients, linlayIngredientes, false);

            Button btnIngredients = itemView.findViewById(R.id.btn_ingredients);
            btnIngredients.setText(ingrediente);

            linlayIngredientes.addView(itemView);

            selecaoIngredientes(btnIngredients, requireContext());

        }

        return view;

    }

    public static void selecaoIngredientes(Button button, Context context) {

        final boolean[] isSelected = {false};

        button.setOnClickListener(v -> {

            if (isSelected[0]) {
                button.setBackgroundTintList(ColorStateList.valueOf(
                        ContextCompat.getColor(context, R.color.yellow)));
                button.setTextColor(ColorStateList.valueOf(
                        ContextCompat.getColor(context, R.color.black)));
                isSelected[0] = false;
            } else {
                button.setBackgroundTintList(ColorStateList.valueOf(
                        ContextCompat.getColor(context, R.color.black)));
                button.setTextColor(ColorStateList.valueOf(
                        ContextCompat.getColor(context, R.color.yellow)));
                isSelected[0] = true;

            }
        });

    }

}
