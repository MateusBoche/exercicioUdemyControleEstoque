package Programa;


import Entidades.Produto;


import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Exercicio02 app = new Exercicio02();
        app.start();
    }

    private void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome: ");
        Produto produto = new Produto();
        produto.nome = scanner.nextLine();
        System.out.println("Quantidade: ");
        produto.quantidade = scanner.nextInt();
        System.out.println("Preço: ");
        produto.preco = scanner.nextDouble();

        System.out.println();
        System.out.println("Product data: " + produto);
        System.out.println();
        System.out.println("Entre com a quantidade para adiconar no estoque: ");
        int quantidade = scanner.nextInt();
        produto.addProdutos(quantidade);
        System.out.println();
        System.out.println("dados atualizados: " + produto);
        System.out.println();
        System.out.println("Entre com a quantidade para remover do estoque: ");
        quantidade = scanner.nextInt();
        produto.removeProdutos(quantidade);
        System.out.println();
        System.out.println("dados atualizados: " + produto);

    }


}
