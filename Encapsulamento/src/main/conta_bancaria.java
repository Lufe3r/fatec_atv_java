package main;

class ContaBancaria {
    private double saldo;
    private String titular;

    ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public double getSaldo() { return saldo; }
    public String getTitular() { return titular; }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        }
    }
}

