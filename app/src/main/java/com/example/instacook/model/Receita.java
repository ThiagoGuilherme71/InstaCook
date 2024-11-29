package com.example.instacook.model;

public class Receita {

    private Integer id;
    private String titulo;
    private Integer[] ingredientesId;
    private Integer[] categoriasId;
    private Integer imagemId;
    private String descricao;
    private Integer likes;
    private Integer comentarios;

    public Receita() {

    }

    public Receita(Integer id, String titulo, Integer[] ingredientesId, Integer[] categoriasId, Integer imagemId,String descricao, Integer likes, Integer comentarios) {

        this.id = id;
        this.titulo = titulo;
        this.ingredientesId = ingredientesId;
        this.categoriasId = categoriasId;
        this.imagemId = imagemId;
        this.descricao = descricao;
        this.likes = likes;
        this.comentarios = comentarios;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer[] getIngredientesId() {
        return ingredientesId;
    }

    public void setIngredientesId(Integer[] ingredientesId) {
        this.ingredientesId = ingredientesId;
    }

    public Integer[] getCategoriasId() {
        return categoriasId;
    }

    public void setCategoriasId(Integer[] categoriasId) {
        this.categoriasId = categoriasId;
    }

    public Integer getImagemId() {
        return imagemId;
    }

    public void setImagemId(Integer imagemId) {
        this.imagemId = imagemId;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getComentarios() {
        return comentarios;
    }

    public void setComentarios(Integer comentarios) {
        this.comentarios = comentarios;
    }

}
