package main;

class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        setPreco(preco);
        setQuantidadeEstoque(quantidadeEstoque);
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        }
    }

    public int getQuantidadeEstoque() { return quantidadeEstoque; }
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque >= 0) {
            this.quantidadeEstoque = quantidadeEstoque;
        }
    }
}