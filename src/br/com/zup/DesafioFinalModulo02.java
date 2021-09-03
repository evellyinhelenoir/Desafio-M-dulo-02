package br.com.zup;

import java.util.HashMap;
import java.util.Scanner;

public class DesafioFinalModulo02 {

    public static void main(String[] args) {

        //Inicialização do programa e fundamentáis para o funcionamento.
        Scanner scan = new Scanner(System.in);
        HashMap <String, String> listaFuncionairos = new HashMap<String, String>();
        System.out.println("~~~~ Bem vindo(a) ao programa de gestão da Evellyin. ~~~~");
        int opcao = 0;
        boolean loop = true;

        //Iniciando loop para funcionamento das ferramentas.
        while (loop == true) {
            System.out.println("Digite '1' para adicionar um(a) novo(a) funcionário(a) à lista.");
            System.out.println("Digite '2' para mostrar a lista completa de funcionário(a)s.");
            System.out.println("Digite '3' para remover um funcionário(a) da lista préviamente adicionado.");
            System.out.println("Digite '4' para sair e encerrar o programa.");
            opcao = scan.nextInt();
            scan.nextLine();

            //Coletando informaçãos para o cadastramento de um novo funcionário. [OPÇÃO 1]
            if (opcao == 1) {
                System.out.println("Informe o nome completo do(a) funcionário(a).");
                String nome = scan.nextLine();
                System.out.println("Informe o email corporativo do(a) funcionário(a).");
                String email = scan.nextLine();
                System.out.println("Informe o telefone de contato do(a) funcionário(a).");
                String telefone = scan.nextLine();
                System.out.println("Informe o CPF do(a) funcionário(a).");
                String cpf = scan.nextLine();

                //Checando CPF(chave) para verificar se o funcionário já foi registrado préviamente.
                if (listaFuncionairos.size() != 0){

                    for (String verificarCPF : listaFuncionairos.keySet()){

                        if (verificarCPF.equals(cpf)){
                            System.out.println("ERRO: Funcionário(a) já cadastrado.");

                        }else {
                            listaFuncionairos.put(cpf, "| Nome: " +nome+ " | Email: " +email+ " | Telefone: " +telefone+" | ");
                            System.out.println("Funcionário cadastrado com sucesso!");
                        }
                    }

                //Caso a lista esteja vazia, informar para o usuário cadastrar um novo funcionário.
                }else{
                    listaFuncionairos.put(cpf, "| Nome: " +nome+ " | Email: " +email+ " | Telefone: " +telefone+" | ");
                    System.out.println("Funcionário(a) cadastrado com sucesso!");
                }

            //Informar a lista completa de funcionários ao usuário. [OPÇÃO 2]
            }else if (opcao == 2){

                for (String chaveFuncionario : listaFuncionairos.keySet()){
                    System.out.println("Informações = "+listaFuncionairos.get(chaveFuncionario)+ "CPF: "+chaveFuncionario);
                }

            //Remover um funcionário utilizando o CPF(chave) cadastrado préviamente. [OPÇÃO 3]
            }else if (opcao == 3){
                System.out.println("Digite o CPF do(a) funcionário(a).");
                String cpfASerDeletado = scan.nextLine();
                String cpfDeletado = "";

                for (String chaveFuncionario : listaFuncionairos.keySet()){

                    if (chaveFuncionario.equals(cpfASerDeletado)){
                        System.out.println("Funcionario(a) Removido da Lista Com Sucesso.");
                        cpfDeletado = cpfASerDeletado;

                    }else{
                        System.out.println("Funcionário não cadastrado ou CPF inválido.");
                    }
                }listaFuncionairos.remove(cpfDeletado);

            //Encerrando o programa tornando o loop boolean falso. [OPÇÃO 4]
            }else if (opcao == 4){
                System.out.println("Encerrando o programa. Obrigado por utilizar os nossos serviços!");
                loop = false;
            }
        }
    }
}
