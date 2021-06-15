package br.com.estrutura.dados.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

//mantem a ordem que colocamos as aulas

public class TestandoArrayList {

    public static void main(String[] args) {

        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1); //método de adicionar
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        aulas.remove(0); //removendo aula1

        System.out.println(aulas);

        for (String aula : aulas) { //posso usar este tipo de for para qualquer coleção ou arrays
            System.out.println("Aula: " + aula);
        }

        String primeiraAula = aulas.get(0); //pegando a primeira "nova" aula
        System.out.println("A primeira aula é: " + primeiraAula);


        aulas.add("Aumentando nosso conhecimento"); //adicionando nova aula

        Collections.sort(aulas); //ordenando as aulas
        System.out.println("Depois de ordenado: " + aulas );
    }
}
