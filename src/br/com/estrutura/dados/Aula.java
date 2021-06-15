package br.com.estrutura.dados;

import java.lang.reflect.Constructor;

public class Aula implements Comparable<Aula> {

    private String titulo;
    private int tempo;

    public Aula(String titulo, int tempo) {

        this.titulo = titulo;
        this.tempo = tempo;

    }

    public String getTitulo() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }

    @Override //reescrevendo método da classe mãe
    public String toString() {
        return "[Aula : " + this.titulo + ", " + this.tempo + " minutos]";
    }


    @Override
    public int compareTo(Aula outraAula) {
        return this.titulo.compareTo(outraAula.titulo);//comparando de acordo com o título de cada aula(em ordem alfabética)

    }
}
