package br.com.estrutura.alura.linkedlist;

public class TestaListaLigada {

    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        System.out.println(lista);
        lista.adicionaNoComeço("João");
        System.out.println(lista);
        lista.adicionaNoComeço("Pedro");
        lista.adiciona("Marcos");
        System.out.println(lista);
        lista.adiciona("Marcelo");
        System.out.println(lista);


        lista.adiciona("Douglas");
        System.out.println(lista);

        lista.adiciona(2,"Antonio");
        System.out.println(lista);

        Object pegaNome = lista.pega(2);
        System.out.println(pegaNome);

        System.out.println(lista.tamanhho());

        lista.removeDoComeco();
        System.out.println(lista);

        lista.removeDoFim();
        System.out.println(lista);

        lista.adiciona("José");
        lista.adiciona("Cleber");

        lista.remove(0);
        System.out.println(lista);

        System.out.println(lista.contem("Marcelo")); //conferindo quem tá na lista
        System.out.println(lista.contem("Ana"));
    }
}
