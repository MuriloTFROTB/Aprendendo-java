package models.restaurante;

public class Item {
    String nome;
    double preco;
    int quantidade;

    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        quantidade = 1;
    }

    public void setQuantidade(int value) {
        quantidade = value;
    }

    public String getNome() {
        return nome;
    }

    public double calcularTotal() {
        return preco *= quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

}
