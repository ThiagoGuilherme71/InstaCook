package com.example.instacook.util;

import java.util.Arrays;
import java.util.List;

public class DataProvider {

    public static List<String> getCategories() {

        return Arrays.asList("Italiana", "Brasileira", "Japonesa", "Alemã", "Francesa", "Mexicana", "Árabe", "Chinesa", "Mediterrânea",
                "Almoço", "Jantar", "Café da Manhã", "Sobremesa", "Vegetariana", "Massas", "Carnes", "Sanduíches", "Saladas", "Bebidas",
                "Drinks");

    }

    public static List<String> getIngredients() {

        return Arrays.asList("Feijão Preto", "Carne Seca", "Costela de Porco", "Linguiça Calabresa", "Paio", "Bacon", "Alho", "Cebola", "Folha de Louro",
                "Sal");

    }

}
