package com.hq.verse.model;

import jakarta.persistence.*;

@Entity
public class Obras {
    @Id // Primary Key
    @GeneratedValue // Auto Increment
    private Integer id;
    private String titulo;
    private String autor;
    private double preco;
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public Obras(){

    }

    public Obras(Integer id, String titulo, String autor, double preco, Categoria categoria) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.categoria = categoria;
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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
