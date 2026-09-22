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

    @Column(nullable = false,)
    private String ingredientes;

    @Column()
    private Integer tempoPreparoMin;

    @Column()
    private String dificuldade;

    @Column()
    private Boolean favorita;

    public Receita(String nome, String ingredientes, Integer tempoPreparoMin, String dificuldade, Boolean favorita){
        this.nome = "nome";
        this.ingredientes = "ingredientes";
        this.tempoPreparoMin = "tempoPreparoMin";
        this.dificuldade = "dificuldade";
        this.favorita = "favorita";
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public Integer getTempoPreparoMin() {
        return tempoPreparoMin;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public Boolean getFavorita() {
        return favorita;
    }
}