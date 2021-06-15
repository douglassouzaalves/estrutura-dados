package br.com.estrutura.dados;

public class TestaCursoComAluno {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silvera");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 25));
        javaColecoes.adiciona(new Aula("Criando nova aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

        Aluno aluno1 = new Aluno("João", 777);
        Aluno aluno2 = new Aluno("Pedro", 888);
        Aluno aluno3 = new Aluno("Carlos", 999);

        javaColecoes.matricula(aluno1);
        javaColecoes.matricula(aluno2);
        javaColecoes.matricula(aluno3);

        System.out.println("Alunos matriculados");
        javaColecoes.getAlunos().forEach(a -> {
            System.out.println(a);
        });

        System.out.println(aluno1 + " está matriculado? ");
        System.out.println(javaColecoes.estaMatriculado(aluno1));

        Aluno aluno = new Aluno("João", 777);
        System.out.println("E esse aluno, está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(aluno));

        System.out.println("O aluno1 é equals ao aluno? ");
        System.out.println(aluno1.equals(aluno));

    }
}
