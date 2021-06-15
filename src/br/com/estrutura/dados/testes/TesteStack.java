package br.com.estrutura.dados.testes;

import java.util.Stack;

public class TesteStack {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("teste1");
        stack.push("teste2");
        stack.push("teste3");
        stack.push("teste4");

        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack.peek());

        System.out.println(stack);

        System.out.println(stack);
    }
}
