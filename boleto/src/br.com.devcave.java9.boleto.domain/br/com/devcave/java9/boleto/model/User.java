package br.com.devcave.java9.boleto.model;

public class User {

    private Long id;

    private String name;


    private String document;


    public Long getId () {
        return id;
    }

    public void setId (final Long id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (final String name) {
        this.name = name;
    }

    public String getDocument () {
        return document;
    }

    public void setDocument (final String document) {
        this.document = document;
    }
}
