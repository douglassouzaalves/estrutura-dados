package br.com.estrutura.dados.testes;

import java.util.LinkedList;
import java.util.Queue;

//ver mais sobre queue

public class TesteQueue {

    public static void main(String[] args) {

        Queue<Integer> fila = new LinkedList();

        fila.add(1);
        fila.add(2);

        System.out.println(fila);

        System.out.println(fila.peek()); //espiar

        System.out.println(fila.remove()); //dequeue

        System.out.println(fila);
    }


}
