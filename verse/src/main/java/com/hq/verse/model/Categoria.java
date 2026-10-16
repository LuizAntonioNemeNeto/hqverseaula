package com.hq.verse.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Categoria {

    //int = tipo primitivo
    //Integer = Classe (com métodos) // JPA
    @Id // Primary Key
    @GeneratedValue // Auto Increment
    private Integer id;
    //String não é um tipo primitivo (Classe)
    private String nome;
    private String descricao;

}
