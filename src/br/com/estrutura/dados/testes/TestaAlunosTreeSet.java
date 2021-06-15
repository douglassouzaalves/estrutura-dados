package br.com.estrutura.dados.testes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//vantagem de usar o conjunto(set) é velocidade e performace em casos importantes de uso.
//exemplo: Podemos utilizar o TreeSet em tabelas maiores, com mais de 1000 exemplos por exemplo.
//TreeSet, quando os elementos são inseridos, eles são ordenados automaticamente
//Pelo fato de ele implementar SortedSet ele possui elementos ordenados automaticamente

public class TestaAlunosTreeSet {

    public static void main(String[] args) {
        Set<String> alunos = new TreeSet<>();

        alunos.add("Aluno 1");
        alunos.add("Aluno 2");
        alunos.add("Aluno 3");
        alunos.add("Aluno 4");
        alunos.add("Aluno 5");
        alunos.add("Aluno 6");
                                               //método que verifica se o aluno está ou não mátriculado
        boolean fulanoEstaMatriculado = alunos.contains("Fulano");
        alunos.remove("Aluno 6");
        System.out.println("Este Aluno está matriculado? " + fulanoEstaMatriculado);

        for(String aluno : alunos) { //acessando elementos
            System.out.println(aluno);

        }

        System.out.println(alunos);

    }
}
