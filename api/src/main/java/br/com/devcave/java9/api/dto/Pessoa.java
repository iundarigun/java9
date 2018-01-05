package br.com.devcave.java9.api.dto;

import java.time.LocalDate;

public class Pessoa {

    private Long id;

    private String nome;

    private LocalDate dataNascimento;

    public Pessoa (final Long id, final String nome, final LocalDate dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public Long getId () {
        return id;
    }

    public void setId (final Long id) {
        this.id = id;
    }

    public String getNome () {
        return nome;
    }

    public void setNome (final String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento () {
        return dataNascimento;
    }

    public void setDataNascimento (final LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
