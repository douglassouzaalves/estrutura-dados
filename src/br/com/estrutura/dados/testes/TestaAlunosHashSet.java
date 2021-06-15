package br.com.estrutura.dados.testes;

import java.util.HashSet;
import java.util.Set;

//internamente é utilizada uma tabela de espalhamento
//Primeira caracteristca do Set: Não é possível garantir a ordem dos elementos
//Um Set garante que nenhum elemento se repete. Por isso o método add devolve um booleano que indica o sucesso da inserção.
//vantagem de usar o conjunto(set) é velocidade e performace em casos importantes de uso.
//Digamos que a gente tenha uma sacola cheia de produtos e não sabemos a ordem que eles estão
//Não existe ordem explicita dentro do conjunto
//Ele utiliza uma estrutura "inteligente" que faz poucas comparações até chegar ao destino final.

public class TestaAlunosHashSet {

    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();

        alunos.add("Aluno 1");
        alunos.add("Aluno 2");
        alunos.add("Aluno 3");
        alunos.add("Aluno 4");
        alunos.add("Aluno 5");
        alunos.add("Aluno 6");
                                               //método que verifica se o aluno está ou não mátriculado
        boolean fulanoEstaMatriculado = alunos.contains("Fulano");
        alunos.remove("Aluno 2");
        System.out.println("Este Aluno está matriculado? " + fulanoEstaMatriculado);

        for(String aluno : alunos) { //acessando elementos
            System.out.println(aluno);

        }

        System.out.println(alunos);

    }
}
