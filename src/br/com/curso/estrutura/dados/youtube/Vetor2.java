package br.com.curso.estrutura.dados.youtube;

public class Vetor2 {

    private String[] elementos;
    private int tamanho;

    public Vetor2(int capacidade) {
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

}
