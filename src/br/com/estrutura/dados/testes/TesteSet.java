package br.com.estrutura.dados.testes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//Set não permite elementos duplicados
//Primeira caracteristca do Set: Não é possível garantir a ordem dos elementos
//vantagem de usar o conjunto(set) é velocidade e performace em casos importantes de uso.
//Digamos que a gente tenha uma sacola cheia de produtos e não sabemos a ordem que eles estão


public class TesteSet {
    public static void main(String[] args) {

        Set<Integer> teste1 = new HashSet<>();
        Set<Integer> teste2 = new TreeSet<>();

        System.out.println(teste1.add(52));
        System.out.println(teste1.add(97));
        System.out.println(teste1.add(34));
        System.out.println(teste1.add(69));
        System.out.println(teste1.add(97));

        System.out.println(teste1);

        System.out.println(teste2.add(52));
        System.out.println(teste2.add(97));
        System.out.println(teste2.add(34));
        System.out.println(teste2.add(69));
        System.out.println(teste2.add(97));

        System.out.println(teste2);
    }
}
