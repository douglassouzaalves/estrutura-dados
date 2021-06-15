package br.com.estrutura.dados.testes;

import java.util.LinkedList;
import java.util.List;

//Ela é muito rápida para adicionar e remover elementos na primeira posição


public class TesteLinky {

    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<String>();

        lista.addFirst("Bob");
        lista.addLast("John"); //adicionando no final
        lista.add("Rob");
        lista.add("Tob");

        lista.removeFirst(); //removendo primeiro nome

        System.out.println(lista);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Pegando o primeiro e último elemento");
        System.out.println(lista.get(0));
        System.out.println(lista.get(2));
        System.out.println(lista);

        System.out.println("-=-=-=-=-LIMPANDO LISTA-=-=-=-=-");
        lista.clear();
    }

}
