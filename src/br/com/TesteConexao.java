package br.com;

public class TesteConexao {

    public static void main(String[] args) {


        try(Conexao conexao = new Conexao()) {
            conexao.leDados();
        } catch (IllegalStateException exception) {
            System.out.println("Erro ne conexão");
        }


// ---------------------------
//        Conexao conexaoAntiga = new Conexao();
//
//        try {
//            conexaoAntiga = new Conexao();
//            conexaoAntiga.leDados();
//        } catch (IllegalStateException ex) {
//            System.out.println("Erro na Conexão");
//        } finally {
//            if(conexaoAntiga != null) {
//                conexaoAntiga.close();
//            }
//        }
//
  }
}

