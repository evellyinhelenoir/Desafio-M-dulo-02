package br.com.zup;

import java.util.HashMap;
import java.util.Scanner;

public class DesafioFinalModulo02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap <String, String> listaFuncionairos = new HashMap<String, String>();

        System.out.println("~~~~ Bem vindo(a) ao programa de gestão da Evellyin. ~~~~");
        int opcao = 0;
        boolean loop = true;

        while (loop == true) {
            System.out.println("Digite '1' para adicionar um novo funcionário à lista.");
            System.out.println("Digite '2' para mostrar a lista completa de funcionários.");
            System.out.println("Digite '3' para encerrar o programa.");
            opcao = scan.nextInt();
            scan.nextLine();

            if (opcao == 1) {
                System.out.println("Informe o nome completo do funcionário.");
                String nome = scan.nextLine();
                System.out.println("Informe o email corporativo do funcionário.");
                String email = scan.nextLine();
                System.out.println("Informe o telefone de contato do funcionário.");
                String telefone = scan.nextLine();
                System.out.println("Informe o CPF do funcionário.");
                String cpf = scan.nextLine();

                listaFuncionairos.put(cpf, "| Nome: " +nome+ " | Email: " +email+ " | Telefone: " +telefone+" | ");
                System.out.println("Funcionário cadastrado com sucesso!");

            }else if (opcao == 2){
                for (String chaveFuncionario : listaFuncionairos.keySet()){
                    System.out.println("Informações = "+listaFuncionairos.get(chaveFuncionario)+ "CPF: "+chaveFuncionario);
                }
            }else if (opcao == 3){
                loop = false;
            }
        }
    }
}
