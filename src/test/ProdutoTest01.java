package test;

import dominio.Produto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Produto produto01 = new Produto();
        produto01.setNome("Teclado");
        produto01.setPreco(150.0);
        produto01.setQuantidade(5);

        Produto produto02 = new Produto();
        produto02.setNome("Mouse");
        produto02.setPreco(80.0);
        produto02.setQuantidade(10);

        imprimirProduto("01", produto01);
        System.out.println();
        imprimirProduto("02", produto02);

        System.out.println("\nTeste de encapsulamento");
        produto01.setPreco(-500);
        produto02.setQuantidade(-10);
        System.out.println("Preço do Teclado após a tentativa: R$ " + produto01.getPreco());
        System.out.println("Quantidade do Mouse após a tentativa: " + produto02.getQuantidade());

        // produto01.preco = 500; // Acesso direto não compila, pois preco é private.

        System.out.println("\nDesafio extra");
        produto01.adicionarEstoque(3);
        System.out.println("Quantidade do Teclado após adicionar 3 unidades: " + produto01.getQuantidade());
    }

    private static void imprimirProduto(String numero, Produto produto) {
        System.out.println("========== PRODUTO " + numero + " ==========");
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: R$ " + produto.getPreco());
        System.out.println("Quantidade: " + produto.getQuantidade());
        System.out.println("Valor do estoque: R$ " + produto.calcularValorEstoque());
    }
}
