package com.example.instacook.model;

public class Imagem {

    private Integer id;
    private String link;

    public Imagem() {

    }

    public Imagem(Integer id, String link) {
        this.id = id;
        this.link = link;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

}
