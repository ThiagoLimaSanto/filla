package com.mycompany.refeitorio;

import java.util.LinkedList;
import java.util.Queue;

public class Refeitorio {

    public static void main(String[] args) {
        Queue fila = new LinkedList();
        Aluno alunos = new Aluno("123456789", "thiago", "BCC");
        Professor professores = new Professor("12345", "Fernando", "doutor");
        TAE ti = new TAE("1243", "Eduardo");
        
        fila.add(alunos.getName());
        fila.add(professores.getName());
        fila.add(ti.getName());
        
        System.out.println(fila);
    }
}
