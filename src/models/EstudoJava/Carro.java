package models.EstudoJava;


public class Carro {
    String marca;
    String modelo;
    int ano;
    int velocidadeAtual;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0;
    }

    public void acelerar(int value) {
        velocidadeAtual += value;

    }

    public void frear(int value) {
        if (velocidadeAtual > 0) {
            velocidadeAtual = velocidadeAtual - value;
            if (velocidadeAtual < 0) {
                velocidadeAtual = 0;
            }
        }
    }

    public void exibirInformacoes() {
        System.out.printf("Marca do carro: %s \n, Modelo: %s \n, Ano: %d \n, Velocidade Atual:%d \n",
                marca, modelo, ano, velocidadeAtual);
    }
}
