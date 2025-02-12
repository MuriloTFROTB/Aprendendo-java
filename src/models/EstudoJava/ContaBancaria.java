package models.EstudoJava;

public class ContaBancaria {
    String titular;
    double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public void depositar(double value) {
        saldo += value;
    }

    public void sacar(double value) {
        if (saldo > 0 && saldo >= value) {
            saldo -= value;
            System.out.println("Saque realizado com sucesso!" + value);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}
