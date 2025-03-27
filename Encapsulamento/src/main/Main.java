package main;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Sedan", 180, "Azul", 50);
        System.out.println("Custo para encher o tanque: " + carro.calcularCustoCombustivel(5.50));

        ContaBancaria conta = new ContaBancaria("João", 1000);
        conta.depositar(500);
        conta.sacar(300);
        System.out.println("Saldo final: " + conta.getSaldo());

        Produto produto = new Produto("Notebook", 2500, 10);
        produto.setPreco(-500);  
        produto.setQuantidadeEstoque(-5); 
        System.out.println("Produto: " + produto.getNome() + " | Preço: " + produto.getPreco() + " | Estoque: " + produto.getQuantidadeEstoque());
    }
}
