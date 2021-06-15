package br.com.estrutura.alura.fila;

import java.util.LinkedList;
import java.util.List;

//o primeiro que entra é o primeiro que sai
//remove sempre o primeiro elemento
//

public class Fila {

    private List<String> alunos = new LinkedList<>();

    public void adiciona(String aluno) {
        alunos.add(aluno);

    }

    public String remove() {
        return alunos.remove(0);
    }

    public boolean vazia() {
        return alunos.isEmpty();
    }

    @Override
    public String toString() {
        return alunos.toString();
    }
}
