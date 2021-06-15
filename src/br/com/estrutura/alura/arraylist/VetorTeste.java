package br.com.estrutura.alura.arraylist;

import br.com.estrutura.alura.arraylist.Vetor;
import br.com.estrutura.alura.linkedlist.Aluno;

public class VetorTeste {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Pedro");

        Vetor lista = new Vetor();

        lista.adiciona(aluno1);
        lista.adiciona(aluno2);

        System.out.println("Tamanho: " + lista.tamanho());
        System.out.println(lista);
    }
}
