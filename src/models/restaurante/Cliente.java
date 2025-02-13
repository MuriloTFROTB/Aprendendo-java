package models.restaurante;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String nome;
    String email;
    List<Item> pedidos = new ArrayList<>();

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public void adicionar(Item item) {
        Item itemExistente = buscarItem(item.getNome());
        if (itemExistente != null) {
            itemExistente.setQuantidade(itemExistente.quantidade + 1);
        } else {
            pedidos.add(item);
        }
    }

    public Item buscarItem(String nome) {
        for (Item item : pedidos) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                return item;
            }
        }
        return null;
    }

    public void cancelarPedido(Item item) {
        if (pedidos.remove(item)) {
            System.out.println("Pedido cancelado com sucesso!");
        } else {
            System.out.println("Pedido não encontrado");
        }
    }

    public void listaDePedidos() {
        System.out.println("Lista de pedidos:");
        for (Item item : pedidos) {
            double total = item.calcularTotal();

            System.out.println(" - " + item.getNome() + " (" + item.getQuantidade() + ") - R$ " + total);

        }
    }

    public double somarPedido() {
        double total = 0;
        for (Item item : pedidos) {
            total += item.getPreco();
        }
        return total;

    }
}
