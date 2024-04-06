package com.mycompany.refeitorio;

public class Aluno {

    private String matricula;
    private String name;
    private String curso;

    public Aluno(String matricula, String name, String curso) {
        this.matricula = matricula;
        this.name = name;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
