package com.example.instacook.viewmodel;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class SharedViewModel extends ViewModel {

    private final List<String> selectedIngredients = new ArrayList<>();
    private final List<String> selectedCategories = new ArrayList<>();

    public List<String> getSelectedIngredients() {
        return selectedIngredients;
    }

    public void addIngredient(String ingredient) {
        if (!selectedIngredients.contains(ingredient)) {
            selectedIngredients.add(ingredient);
        }
    }

    public void removeIngredient(String ingredient) {
        selectedIngredients.remove(ingredient);
    }

    public List<String> getSelectedCategories() {
        return selectedCategories;
    }

    public void addCategory(String category) {
        if (!selectedCategories.contains(category)) {
            selectedCategories.add(category);
        }
    }

    public void removeCategory(String category) {
        selectedCategories.remove(category);
    }

}
