package com.receitas.backend.model

import jakarta.persistence.*;

@Entity

@Table(name = "receita")
public class Receita {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;
}