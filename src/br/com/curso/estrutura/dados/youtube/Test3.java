package br.com.curso.estrutura.dados.youtube;

public class Test3 {

    public static void main(String[] args) {

        Vetor3 vetor = new Vetor3(10);

        vetor.adiciona("Elemento #1");
        vetor.adiciona("Elemento #2");
        vetor.adiciona("Elemento #3");

        System.out.println(vetor.getTamanho());

        System.out.println(vetor.toString());
    }
}
