package br.com.estrutura.alura.conjunto;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
//Conjuntos(set) com estruturas de dados que não aceitam elementos repetidos

public class TesteConjunto {

    public static void main(String[] args) {

        Conjunto conjunto = new Conjunto();
        conjunto.adiciona("Mauricio");
        System.out.println(conjunto);

        conjunto.adiciona("Guilherme");
        conjunto.adiciona("Douglas");
        System.out.println(conjunto);

        conjunto.remove("Mauricio");
        System.out.println("Após remoção:" + conjunto);

        Set<String> conjuntoDoJava = new HashSet<String>();

        System.out.println("Adicionando com o Set");
        conjuntoDoJava.add("Mauricio");
        conjuntoDoJava.add("Paulo");
        System.out.println(conjuntoDoJava);

        String s = "Paulo";
        s.hashCode();
        System.out.println("Paulo".hashCode());

    }
}
