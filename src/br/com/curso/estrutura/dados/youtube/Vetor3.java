package br.com.curso.estrutura.dados.youtube;

import java.util.Arrays;

public class Vetor3 {

    private String[] elementos;
    private int tamanho;

    public Vetor3(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(String elemento) {

        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        } return false;
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        //utilizando a classe para manipular e criar dados
        StringBuilder string = new StringBuilder();
        string.append("[");

        for(int i = 0; i < this.tamanho-1; i++) {
            string.append(this.elementos[i]);
            string.append(", ");
        }

        if(this.tamanho > 0) {
            string.append(this.elementos[this.tamanho-1]);
        }

        string.append("]");
        return string.toString();
    }
}
