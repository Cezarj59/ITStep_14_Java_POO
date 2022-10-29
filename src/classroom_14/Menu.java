package classroom_14;

import java.util.Scanner;

public class Menu {

    static Scanner read = new Scanner(System.in);

    public static void menu() {
        while (0 == 0) {
            System.out.println("\n--Sistema de Cadastro Loja Sant'Anna--");
            System.out.println("\n---------------------------");
            System.out.println("\n[1] Cadastros");
            System.out.println("[2] Consultas");
            System.out.println("[3] Sair");
            System.out.print("\nDigite a opção: ");
            String option = read.nextLine();

            switch (option) {
                case "1" ->
                    menuCadastro();
                case "2" ->
                    menuConsulta();
                case "3" -> {
                    System.out.println("\nSistema finalizado!!!");
                    System.exit(0);
                }
                default -> {
                    System.out.println("\nOps!!! Você digitou uma opção invalida.\nTente Novamente.");
                    menu();
                }
            }
        }
    }

    public static void menuCadastro() {

        System.out.println("\n---------------------------");
        System.out.println("\n[1] Cadastros de Produtos");
        System.out.println("[2] Cadastros de Funcionarios");
        System.out.println("[3] Voltar");
        System.out.println("[4] Sair");
        System.out.print("\nDigite a opção: ");
        String option = read.nextLine();

        switch (option) {

            case "1" -> {
                Produto.cadastroProdutos();
                subMenuCadastro();

            }
            case "2" -> {
                Funcionarios.cadastroFuncionarios();
                subMenuCadastro();
            }
            case "3" ->
                menu();
            case "4" -> {
                System.out.println("\nSistema finalizado!!!");
                System.exit(0);
            }
            default -> {
                System.out.println("\nOps!!! Você digitou uma opção invalida.\nTente Novamente.");
                menuCadastro();
            }
        }

    }

    public static void menuConsulta() {
        System.out.println("\n---------------------------");
        System.out.println("\n[1] Consulta de Produtos");
        System.out.println("[2] Consulta de Funcionarios");
        System.out.println("[3] Voltar");
        System.out.println("[4] Sair");
        System.out.print("\nDigite a opção: ");
        String option = read.nextLine();

        switch (option) {
            case "1" ->
                Produto.exibeProdutos();
            case "2" ->
                Funcionarios.exibeFuncionarios();
            case "3" ->
                menu();
            case "4" -> {
                System.out.println("\nSistema finalizado!!!");
                System.exit(0);
            }
            default -> {
                System.out.println("\nOps!!! Você digitou uma opção invalida.\nTente Novamente.");
                menuConsulta();
            }
        }
    }

    public static void subMenuCadastro() {

        while (0 == 0) {
            System.out.println("\n------------------------------");
            System.out.println("\n[1] Novo Cadastro de Produtos");
            System.out.println("[2] Novo Cadastro de Funcionarios");
            System.out.println("[3] Menu Inicial");
            System.out.print("\nDigite a opção: ");
            String option = read.nextLine();

            switch (option) {
                case "1" ->
                    Produto.cadastroProdutos();
                case "2" ->
                    Funcionarios.cadastroFuncionarios();
                case "3" ->
                    menu();

                default -> {
                    System.out.println("\nOps!!! Você digitou uma opção invalida.\nTente Novamente.");
                    subMenuCadastro();
                }
            }
        }
    }
}
