package com.mycompany.refeitorio;

public class Professor {

    private String siape;
    private String name;
    private String titulo;

    public Professor(String siape, String name, String titulo) {
        this.siape = siape;
        this.name = name;
        this.titulo = titulo;
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
