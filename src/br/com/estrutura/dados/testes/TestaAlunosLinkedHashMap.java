package br.com.estrutura.dados.testes;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


//Map ele é uma relação de chave e valor
//Não aceita keys repetidas
//Mantendo a ordem de inserção
//HashMap e LinkedHashMap possuem a mesma performace para os métodos

public class TestaAlunosLinkedHashMap {

    public static void main(String[] args) {
        Map<String, Integer> alunos = new LinkedHashMap<>();

        alunos.put("Aluno 1", 777); //setando chave e valor para o elemento
        alunos.put("Aluno 2", null);
        alunos.put("Aluno 3", 999);
        alunos.put("Aluno 4", 666);
        alunos.put(null, 777);
        alunos.put("Aluno 6", 444); //a key não aceita valores duplicados, nem com nulo ou com nome.


       // alunos.remove("Aluno 6");


        for(Map.Entry<String, Integer> entry : alunos.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }


        System.out.println(alunos);

    }
}
