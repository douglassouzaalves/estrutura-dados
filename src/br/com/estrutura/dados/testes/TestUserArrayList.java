package br.com.estrutura.dados.testes;

import br.com.estrutura.dados.User;

import java.util.ArrayList;
import java.util.List;

//A ArrayList não possui um tamanho fixo, ela cresce conforme formos adicionando.

public class TestUserArrayList {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        int i = 0;
        while (i < 10) {
            User actual = new User("Nome " + i, "Sobrenome " + i);
            users.add(actual);
            i++;
        }

        System.out.println(users.get(9).getFirstName()); //pegando o índice que queremos
        System.out.println(users.get(9).getLastName());

        User user11 = new User("Nome 11 ", "Sobrenome 11");
        users.add(user11); //adicionando novo usuário

        System.out.println(users.get(10).getFirstName());
        System.out.println(users.get(10).getLastName());
    }
}
