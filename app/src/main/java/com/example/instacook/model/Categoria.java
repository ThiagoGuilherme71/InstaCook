package com.example.instacook.model;

public class Categoria {

    private Integer id;
    private String nome;
    private Integer imagemId;

    public Categoria() {

    }

    public Categoria(Integer id, String nome, Integer imagemId) {

        this.id = id;
        this.nome = nome;
        this.imagemId = imagemId;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getImagemId() {
        return imagemId;
    }

    public void setImagemId(Integer imagemId) {
        this.imagemId = imagemId;
    }

}
