package br.com.estrutura.dados;

import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>(); //utilizando internamente a tabela de "espalhamento"

    public Curso (String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas); //não deixa modificar a lista
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);

    }

    public int getTempoTotal() {
        int tempoTotal = 0;
        for (Aula aula: aulas) {
            tempoTotal += aula.getTempo();
        }
        return tempoTotal;
    }

    @Override
    public String toString() {
        return "[Curso: " + getNome() + " - Tempo total de duração: " + this.getTempoTotal() + " min]";
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);        //chave                  //valor
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);


    }

    public Aluno buscaMatriculado(int numero)  {
        if(!matriculaParaAluno.containsKey(numero))
            throw new NoSuchElementException("Matricula não encontrada");
        return matriculaParaAluno.get(numero);
    }
}
