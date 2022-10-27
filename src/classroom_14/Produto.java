package classroom_14;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Produto {

    static Scanner read = new Scanner(System.in);
    static Produto[] produto = new Produto[0];

    String nome;
    String descricao;
    String preco;

    public Produto(String nome, String descricao, String preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public static void cadastroProdutos() {
        System.out.println("\n---------------------------");
        System.out.println("\n---CADASTRO DE PRODUTOS---\n");

        String nome = JOptionPane.showInputDialog("Informe o nome do produto");

        String descricao = JOptionPane.showInputDialog("Descrição: ");

        String preco = JOptionPane.showInputDialog("Preço: ");

        produto = aumentaArray(produto);
        produto[produto.length - 1] = new Produto(nome, descricao, preco);

        System.err.println("\nCadastro efetuado com sucesso!!!\n");
    }

    public static void exibeProdutos() {

        System.out.println("\n\n==============Relatório de Produtos Cadastrados==============");

        if (produto[0] == null) {
            System.out.println("\n ## Não há Produtos Cadastrados! ##\n\n");
        } else {

            for (int i = 0; i < produto.length; i++) {

                if (produto[i] != null) {
                    System.out.println("\n------ Cadastro: " + (i + 1) + " ------");
                    System.out.println("\nNome: " + produto[i].getNome()
                            + "\nDescrição: " + produto[i].getDescricao()
                            + "\nPreço: " + produto[i].getPreco()
                    );

                } else {
                    break;
                }

            }

        }
    }

    private static Produto[] aumentaArray(Produto[] c) {
        Produto[] aux = new Produto[c.length + 1];
        if (c.length > 0) {
            for (int i = 0; i < c.length; i++) {
                aux[i] = c[i];
            }
        }
        return aux;
    }

}
