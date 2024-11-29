package com.example.instacook.util;

public class DataRecipe {

    String[] category;
    public String[] ingredients;
    public Integer image;
    public Integer likes;

    public DataRecipe(String[] category, String[] ingredients, Integer image, Integer likes) {

        this.category = category;
        this.ingredients = ingredients;
        this.image = image;
        this.likes = likes;

    }

}
