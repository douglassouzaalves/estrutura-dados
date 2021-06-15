package br.com.estrutura.alura.pilha;

import java.util.LinkedList;
import java.util.List;

//é sempre retirado do topo da nossa pilha(stack)
//a primeira "coisa" que eu coloquei na pilha, é sempre a última a sair.


public class Pilha {

    private List<String> nomes = new LinkedList<String>();

    public void push(String nome) { //inserindo na pilha
        nomes.add(nome);
    }

    public String pop() { //removando da pilha
        return nomes.remove(nomes.size() -1 );
    }

    public boolean vazia() {
        return nomes.isEmpty(); //verifica se a pilha está vazia
    }

    @Override
    public String toString() {
        return nomes.toString();
    }
}

