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

import com.example.instacook.MainActivity;
import com.example.instacook.R;
import com.example.instacook.util.DataProvider;

import java.util.ArrayList;
import java.util.List;

public class IngredientsFragment extends Fragment {

    public static List<String> selectedIngredients = new ArrayList<>();

    public IngredientsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_ingredients, container, false);

        TextView converse = view.findViewById(R.id.tv_converse);
        converse.setText(Html.fromHtml("<u>Converse</u>"));

        List<String> ingredientes = DataProvider.getIngredients();

        LinearLayout linlayIngredientes = view.findViewById(R.id.linlay_ingredientes_ingredients);

        for (String ingrediente : ingredientes) {

            View itemView = inflater.inflate(R.layout.button_ingredients, linlayIngredientes, false);

            Button btnIngredients = itemView.findViewById(R.id.btn_ingredients);
            btnIngredients.setText(ingrediente);

            linlayIngredientes.addView(itemView);

            selecaoIngredientes(btnIngredients, requireContext(), ingrediente);

        }

        Button btnBack = view.findViewById(R.id.btn_back_ingredients);
        Button btnNext = view.findViewById(R.id.btn_next_ingredients);

        btnBack.setOnClickListener(v -> {
            ((MainActivity) requireActivity()).navigateToFragment(new HomeFragment());
        });

        btnNext.setOnClickListener(v -> {
            ((MainActivity) requireActivity()).navigateToFragment(new CategoryFragment());
        });

        return view;

    }

    public static void selecaoIngredientes(Button button, Context context, String ingrediente) {

        final boolean[] isSelected = {false};

        button.setOnClickListener(v -> {

            if (isSelected[0]) {
                button.setBackgroundTintList(ColorStateList.valueOf(
                        ContextCompat.getColor(context, R.color.yellow)));
                button.setTextColor(ColorStateList.valueOf(
                        ContextCompat.getColor(context, R.color.black)));
                selectedIngredients.remove(ingrediente);
                isSelected[0] = false;
            } else {
                button.setBackgroundTintList(ColorStateList.valueOf(
                        ContextCompat.getColor(context, R.color.black)));
                button.setTextColor(ColorStateList.valueOf(
                        ContextCompat.getColor(context, R.color.yellow)));
                selectedIngredients.add(ingrediente);
                isSelected[0] = true;

            }
        });

    }

}
