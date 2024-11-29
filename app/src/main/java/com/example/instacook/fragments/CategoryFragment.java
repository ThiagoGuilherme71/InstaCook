package com.example.instacook.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instacook.MainActivity;
import com.example.instacook.R;
import com.example.instacook.adapters.CategoriasAdapter;
import com.example.instacook.util.DataProvider;
import com.example.instacook.util.DataRecipe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CategoryFragment extends Fragment {

    public CategoryFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_category, container, false);

        List<String> selectedIngredients = IngredientsFragment.selectedIngredients;

        HashMap<String, Integer> categories = DataProvider.getCategories();
        List<DataRecipe> filteredRecipes = filterRecipesByIngredients(selectedIngredients);

        String[] categorias = new String[categories.size()];
        Integer[] imagens = new Integer[categories.size()];
        int i = 0;

        for (Map.Entry<String, Integer> entry : categories.entrySet()) {

            imagens[i] = entry.getValue();
            categorias[i] = entry.getKey();
            i++;

        }

        RecyclerView recyclerView = view.findViewById(R.id.recycler_categorias);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        recyclerView.setAdapter(new CategoriasAdapter(categorias, imagens));

        Button btnBack = view.findViewById(R.id.btn_back_category);
        Button btnNext = view.findViewById(R.id.btn_next_category);

        btnBack.setOnClickListener(v -> {
            ((MainActivity) requireActivity()).navigateToFragment(new IngredientsFragment());
        });

        btnNext.setOnClickListener(v -> {
            ((MainActivity) requireActivity()).navigateToFragment(new FeedFragment());
        });

        return view;

    }

    private List<DataRecipe> filterRecipesByIngredients(List<String> selectedIngredients) {
        List<DataRecipe> recipes = DataProvider.getRecipes();
        List<DataRecipe> filteredRecipes = new ArrayList<>();

        for (DataRecipe recipe : recipes) {
            if (selectedIngredients.isEmpty() || containsAllIngredients(recipe.ingredients, selectedIngredients)) {
                filteredRecipes.add(recipe);
            }
        }
        return filteredRecipes;
    }

    private boolean containsAllIngredients(String[] recipeIngredients, List<String> selectedIngredients) {
        for (String ingredient : selectedIngredients) {
            if (!Arrays.asList(recipeIngredients).contains(ingredient)) {
                return false;
            }
        }
        return true;
    }

}
