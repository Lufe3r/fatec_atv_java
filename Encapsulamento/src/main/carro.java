package main;

class Carro {
    private String modelo;
    private double velocidadeMaxima;
    private String cor;
    private double capacidadeTanque;

    Carro(String modelo, double velocidadeMaxima, String cor, double capacidadeTanque) {
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.cor = cor;
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public double getVelocidadeMaxima() { return velocidadeMaxima; }
    public void setVelocidadeMaxima(double velocidadeMaxima) { this.velocidadeMaxima = velocidadeMaxima; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public double getCapacidadeTanque() { return capacidadeTanque; }
    public void setCapacidadeTanque(double capacidadeTanque) { this.capacidadeTanque = capacidadeTanque; }

    public double calcularCustoCombustivel(double precoGasolina) {
        return capacidadeTanque * precoGasolina;
    }

    void acelerar() { return; }
    void frear() { return; }
    void buzinar() { return; }
}