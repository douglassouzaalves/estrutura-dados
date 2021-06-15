package br.com.estrutura.alura.fila;

import java.util.LinkedList;
import java.util.Queue;

public class TesteFila {
    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.adiciona("Carlos");
        fila.adiciona("João");
        fila.adiciona("Roberto");

        System.out.println(fila);
        String remoçãoAluno = fila.remove();

        System.out.println("Quem está sendo removido: " + remoçãoAluno);
        System.out.println("Alunos atuais:" + fila);

        Queue<String> filaDojava = new LinkedList<String>();
    }
}
