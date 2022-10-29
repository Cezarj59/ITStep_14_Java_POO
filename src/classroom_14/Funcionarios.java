package classroom_14;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Funcionarios extends Produto {

    static Scanner read = new Scanner(System.in);
    static Funcionarios[] funcionario = new Funcionarios[0];
    static int qtdA = 0;

    String cpf, dataNascimento;

    public Funcionarios(String cpf, String dataNascimento, String nome, String descricao, String preco) {
        super(nome, descricao, preco);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public static void cadastroFuncionarios() {
        System.out.println("\n---------------------------");
        System.out.println("\n---CADASTRO DE FUNCIONARIOS---\n");

        String nome = JOptionPane.showInputDialog("Informe o nome do funcionario");

        String cpf = JOptionPane.showInputDialog("Informe o CPF: ");

        String dataN = JOptionPane.showInputDialog("Informe a Data de Nascimento: ");

        String descricao = JOptionPane.showInputDialog("Cargo: ");

        String preco = JOptionPane.showInputDialog("Salário: ");

        funcionario = aumentaArray(funcionario);
        funcionario[funcionario.length - 1] = new Funcionarios(cpf, dataN, nome, descricao, preco);

        System.err.println("\nCadastro efetuado com sucesso!!!\n");
    }

    public static void exibeFuncionarios() {

        System.out.println("\n\n==============Relatório de Funcionarios Cadastrados==============");

        if (funcionario[0] == null) {
            System.out.println("\n ## Não há Funcionarios Cadastrados! ##\n\n");
        } else {

            for (int i = 0; i < funcionario.length; i++) {

                if (funcionario[i] != null) {
                    System.out.println("\n------ Cadastro: " + (i + 1) + " ------");
                    System.out.println("\nNome: " + funcionario[i].getNome()
                            + "\nData de Nascimento: " + funcionario[i].getDataNascimento()
                            + "\nCPF: " + funcionario[i].getCpf()
                            + "\nCargo: " + funcionario[i].getDescricao()
                            + "\nSalário: " + funcionario[i].getPreco()
                    );

                } else {
                    break;
                }

            }

        }
    }

    private static Funcionarios[] aumentaArray(Funcionarios[] c) {
        Funcionarios[] aux = new Funcionarios[c.length + 1];
        if (c.length > 0) {
            for (int i = 0; i < c.length; i++) {
                aux[i] = c[i];
            }
        }
        return aux;
    }

}
