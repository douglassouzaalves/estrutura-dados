package br.com.estrutura.dados;

import br.com.estrutura.dados.Aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

    public static void main(String[] args) {

        Aula a1 = new Aula("Revisando as ArrayList", 25);
        Aula a2 = new Aula("Listas de Objetos", 19);
        Aula a3= new Aula("Relacionamento de Listas e Objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas);

        Collections.sort(aulas); //ordenando por ordem alfabetica

        System.out.println(aulas);

        aulas.sort(Comparator.comparing(Aula::getTempo)); //ordenar as aulas comparando o tempo que cada aula tem.

        System.out.println(aulas);


    }
}
