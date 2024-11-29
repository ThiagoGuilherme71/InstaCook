package com.example.instacook.util;

import android.content.Context;

import com.example.instacook.R;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DataProvider {

    public static HashMap<String, Integer> getCategories() {

        HashMap<String, Integer> categories = new HashMap<>();

        categories.put("Italiana", R.drawable.img_carbonara02);
        categories.put("Brasileira", R.drawable.img_feijoada01);
        categories.put("Japonesa", R.drawable.img_sushi02);
        categories.put("Alemã", R.drawable.img_alema);
        categories.put("Francesa", R.drawable.img_macaron);
        categories.put("Mexicana", R.drawable.img_burrito01);
        categories.put("Árabe", R.drawable.img_arabe);
        categories.put("Chinesa", R.drawable.img_yakisoba2);
        categories.put("Mediterrânea", R.drawable.img_mediterranea);
        categories.put("Almoço", R.drawable.img_feijoada03);
        categories.put("Jantar", R.drawable.img_yakisoba);
        categories.put("Breakfast", R.drawable.img_pao_com_ovo);
        categories.put("Sobremesa", R.drawable.img_bolo01);
        categories.put("Vegetariana", R.drawable.img_salada02);
        categories.put("Massas", R.drawable.img_macarrao_bolonhesa01);
        categories.put("Carnes", R.drawable.img_picanha);
        categories.put("Sanduíches", R.drawable.img_queijo_presunto);
        categories.put("Saladas", R.drawable.img_salada01);
        categories.put("Lanches", R.drawable.img_hamburguer);
        categories.put("Doces", R.drawable.img_bolo02);

        return categories;

    }

    public static List<String> getIngredients() {

        return Arrays.asList("Feijão", "Macarrão", "Molho de Tomate", "Costela de Porco","Ovo", "Linguiça Calabresa",
                "Bacon", "Arroz", "Limão", "Açucar", "Farinha de Trigo", "Carne Moída", "Salsicha de Vitela", "Pão",
                "Tempero Verde", "Tomate", "Canela", "Manteiga", "Queijo", "Massa de Lasanha", "Camarão", "Presunto",
                "Picanha", "Alface", "Salmão", "Frango");

    }

    public static List<DataRecipe> getRecipes() {

        return Arrays.asList(
                new DataRecipe(new String[]{"Italiana", "Almoço", "Jantar", "Massas"}, new String[]{"Macarrão", "Bacon", "Ovo"}, R.drawable.img_carbonara01, 51356),
                new DataRecipe(new String[]{"Italiana", "Almoço", "Jantar", "Massas"}, new String[]{"Macarrão", "Bacon", "Ovo"}, R.drawable.img_carbonara02, 2361),
                new DataRecipe(new String[]{"Italiana", "Almoço", "Jantar", "Massas"}, new String[]{"Macarrão", "Molho de Tomate", "Carne Moída"}, R.drawable.img_macarrao_bolonhesa01, 394),
                new DataRecipe(new String[]{"Italiana", "Almoço", "Jantar", "Massas"}, new String[]{"Macarrão", "Molho de Tomate", "Carne Moída"}, R.drawable.img_macarrao_bolonhesa02, 841664),
                new DataRecipe(new String[]{"Italiana", "Almoço", "Jantar", "Massas"}, new String[]{"Macarrão", "Molho de Tomate", "Carne Moída"}, R.drawable.img_macarrao_bolonhesa03, 95426),
                new DataRecipe(new String[]{"Brasileira", "Almoço", "Jantar"}, new String[]{"Feijão", "Linguiça Calabresa", "Costela de Porco"}, R.drawable.img_feijoada01, 848),
                new DataRecipe(new String[]{"Brasileira", "Almoço", "Jantar"}, new String[]{"Feijão", "Linguiça Calabresa", "Costela de Porco"}, R.drawable.img_feijoada02, 9112),
                new DataRecipe(new String[]{"Brasileira", "Almoço", "Jantar"}, new String[]{"Feijão", "Linguiça Calabresa", "Costela de Porco"}, R.drawable.img_feijoada03, 120),
                new DataRecipe(new String[]{"Brasileira", "Almoço", "Jantar"}, new String[]{"Feijão", "Linguiça Calabresa", "Costela de Porco"}, R.drawable.img_dobradinha, 779),
                new DataRecipe(new String[]{"Brasileira", "Almoço", "Jantar"}, new String[]{"Feijão", "Linguiça Calabresa", "Arroz"}, R.drawable.img_baiao_de_dois, 601),
                new DataRecipe(new String[]{"Alemã", "Almoço", "Lanches"}, new String[]{"Salsicha de Vitela", "Pão", "Tempero Verde"}, R.drawable.img_alema, 16),
                new DataRecipe(new String[]{"Árabe", "Almoço", "Lanches"}, new String[]{"Carne Moída", "Farinha de Trigo", "Tempero Verde"}, R.drawable.img_arabe, 4175),
                new DataRecipe(new String[]{"Lanches", "Sobremesa", "Doces"}, new String[]{"Açucar", "Farinha de Trigo", "Canela"}, R.drawable.img_bolo01, 157486),
                new DataRecipe(new String[]{"Lanches", "Sobremesa", "Doces"}, new String[]{"Açucar", "Farinha de Trigo", "Canela"}, R.drawable.img_bolo02, 88487),
                new DataRecipe(new String[]{"Francesa", "Sobremesa", "Doces"}, new String[]{"Açucar", "Farinha de Trigo", "Manteiga"}, R.drawable.img_macaron, 7748),
                new DataRecipe(new String[]{"Francesa", "Breakfast", "Lanches"}, new String[]{"Manteiga", "Farinha de Trigo", "Ovo"}, R.drawable.img_croissant, 45533),
                new DataRecipe(new String[]{"Mexicana", "Almoço", "Lanches"}, new String[]{"Tomate", "Farinha de Trigo", "Carne Moída"}, R.drawable.img_burrito01, 8689),
                new DataRecipe(new String[]{"Mexicana", "Almoço", "Lanches"}, new String[]{"Tomate", "Farinha de Trigo", "Carne Moída"}, R.drawable.img_burrito02, 577),
                new DataRecipe(new String[]{"Sanduíches", "Almoço", "Lanches"}, new String[]{"Queijo", "Pão", "Carne Moída"}, R.drawable.img_hamburguer, 210789),
                new DataRecipe(new String[]{"Italiana", "Almoço", "Jantar", "Massas"}, new String[]{"Massa de Lasanha", "Carne Moída", "Molho de Tomate"}, R.drawable.img_lasanha01, 51356),
                new DataRecipe(new String[]{"Italiana", "Almoço", "Jantar", "Massas"}, new String[]{"Massa de Lasanha", "Carne Moída", "Molho de Tomate"}, R.drawable.img_lasanha02, 93478),
                new DataRecipe(new String[]{"Mediterrânea", "Almoço", "Jantar"}, new String[]{"Arroz", "Camarão", "Limão"}, R.drawable.img_mediterranea, 4175),
                new DataRecipe(new String[]{"Sanduíches", "Breakfast", "Lanches"}, new String[]{"Queijo", "Pão", "Ovo", "Tomate", "Manteiga"}, R.drawable.img_pao_com_ovo, 98789),
                new DataRecipe(new String[]{"Sanduíches", "Breakfast", "Lanches"}, new String[]{"Queijo", "Pão", "Presunto", "Tomate", "Manteiga", "Alface"}, R.drawable.img_queijo_presunto, 7199),
                new DataRecipe(new String[]{"Carnes", "Almoço", "Jantar"}, new String[]{"Picanha", "Arroz", "Manteiga"}, R.drawable.img_picanha, 244587),
                new DataRecipe(new String[]{"Saladas", "Almoço", "Vegetariana"}, new String[]{"Tomate", "Alface", "Tempero Verde"}, R.drawable.img_salada01, 1342),
                new DataRecipe(new String[]{"Saladas", "Almoço", "Vegetariana"}, new String[]{"Tomate", "Alface", "Tempero Verde"}, R.drawable.img_salada02, 227),
                new DataRecipe(new String[]{"Japonesa", "Almoço", "Jantar"}, new String[]{"Arroz", "Camarão", "Salmão"}, R.drawable.img_sushi01, 84613),
                new DataRecipe(new String[]{"Japonesa", "Almoço", "Jantar"}, new String[]{"Arroz", "Camarão", "Salmão"}, R.drawable.img_sushi02, 78841),
                new DataRecipe(new String[]{"Japonesa", "Almoço", "Jantar"}, new String[]{"Arroz", "Camarão", "Salmão"}, R.drawable.img_temaki, 100783),
                new DataRecipe(new String[]{"Chinesa", "Almoço", "Jantar", "Massas"}, new String[]{"Macarrão", "Frango", "Tempero Verde"}, R.drawable.img_yakisoba, 3287),
                new DataRecipe(new String[]{"Chinesa", "Almoço", "Jantar", "Massas"}, new String[]{"Macarrão", "Frango", "Tempero Verde"}, R.drawable.img_yakisoba2, 341)
                );

    }

}
