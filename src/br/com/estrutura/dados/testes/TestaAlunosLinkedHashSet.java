package br.com.estrutura.dados.testes;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


//Garante que tenha apenas um objeto igual ao outro dentro do conjunto.
//vantagem de usar o conjunto(set) é velocidade e performace em casos importantes de uso.

//O LinkedHashSet é o "intermediário", ele não é muito rápido e nem muito lento

public class TestaAlunosLinkedHashSet {

    public static void main(String[] args) {
        Set<String> alunos = new LinkedHashSet<>();

        alunos.add("Aluno 1");
        alunos.add("Aluno 2");
        alunos.add("Aluno 3");
        alunos.add("Aluno 4");
        alunos.add("Aluno 5");
        alunos.add("Aluno 6");
                                               //método que verifica se o elemento está presente
        boolean fulanoEstaMatriculado = alunos.contains("Fulano");
        alunos.remove("Aluno 6");
        System.out.println("Este Aluno está matriculado? " + fulanoEstaMatriculado);

        for(String aluno : alunos) { //acessando elementos
            System.out.println(aluno);

        }

        System.out.println(alunos);

    }
}
