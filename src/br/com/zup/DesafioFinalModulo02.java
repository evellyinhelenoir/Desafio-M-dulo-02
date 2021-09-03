package br.com.zup;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class DesafioFinalModulo02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap <String, String> listaAlunos = new HashMap<String, String>();
        boolean loop = true;
        System.out.println("~~~~ Bem vindo(a) ao programa de gestão da Evellyin. ~~~~");
        String opcao ="";

        while (loop = true) {
            System.out.println("Digite 'ADICIONAR' para adicionar um novo funcionário à lista.);");
            System.out.println("Digite 'VER' para mostrar a lista completa de funcionários.");
            System.out.println("Digite 'SAIR' para encerrar o programa.);");
            opcao = scan.nextLine();
            scan.nextLine();

            if (opcao.equals("adicionar") | opcao.contains("adicionar")) {
                System.out.println("Informe o nome completo do funcionário.");
                String nome = scan.nextLine();
                System.out.println("Informe o email corporativo do funcionário.");
                String email = scan.nextLine();
                System.out.println("Informe o telefone de contato do funcionário.");
                String telefone = scan.nextLine();
                System.out.println("Informe o CPF do funcionário.");
                String cpf = scan.nextLine();

                listaAlunos.put(cpf, "Nome: " + nome + " Email: " + email + " Telefone: " + telefone);
                System.out.println("Funcionário cadastrado com sucesso!");
            }
        }
    }
}
