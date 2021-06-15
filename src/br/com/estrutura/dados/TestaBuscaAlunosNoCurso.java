package br.com.estrutura.dados;

public class TestaBuscaAlunosNoCurso {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silvera");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 25));
        javaColecoes.adiciona(new Aula("Criando nova aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

        Aluno aluno1 = new Aluno("João", 777);
        Aluno aluno2 = new Aluno("Pedro", 888);
        Aluno aluno3 = new Aluno("Carlos", 999);

        //matriculando alunos
        javaColecoes.matricula(aluno1);
        javaColecoes.matricula(aluno2);
        javaColecoes.matricula(aluno3);

        System.out.println("Quem é o aluno com matrícula 888?");
        Aluno aluno = javaColecoes.buscaMatriculado(888);
        System.out.println("Aluno: " + aluno);


    }
}
