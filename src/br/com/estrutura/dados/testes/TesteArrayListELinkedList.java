package br.com.estrutura.dados.testes;

import java.util.ArrayList;
import java.util.LinkedList;

public class TesteArrayListELinkedList {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        final long tempoInicioLL = System.nanoTime();
        linkedList.remove(1);
        //linkedList.get(100);
        final long tempoFimLL = System.nanoTime();

        final long tempoInicioAL = System.nanoTime();
        arrayList.remove(1);
        arrayList.get(100);
        final long tempoFimAL = System.nanoTime();

        long tempoTotalLL = tempoFimLL - tempoInicioLL;
        long tempoTotalAL = tempoFimAL - tempoInicioAL;

        System.out.println("Tempo total de execução da LinkedList: " + tempoTotalLL); //ele percorre toda a iteração até a posição indicada para remoção do elemento
        System.out.println("Tempo total de execução da ArrayList: " + tempoTotalAL);//O arrayList pode ir diretamente para o elemento que será excluído
    }
}
