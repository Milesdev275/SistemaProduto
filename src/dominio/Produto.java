package dominio;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            System.out.println("Nome inválido!");
            return;
        }

        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (!Double.isFinite(preco) || preco < 0) {
            System.out.println("Preço inválido!");
            return;
        }

        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            System.out.println("Quantidade inválida!");
            return;
        }

        this.quantidade = quantidade;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public double calcularValorEstoque() {
        return this.preco * this.quantidade;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade <= 0 || quantidade > Integer.MAX_VALUE - this.quantidade) {
            System.out.println("Quantidade inválida para adicionar ao estoque!");
            return;
        }

        this.quantidade += quantidade;
    }
}
