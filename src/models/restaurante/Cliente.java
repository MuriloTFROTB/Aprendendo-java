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
        if (item != null) {
            pedidos.add(item);
            System.out.println("Pedido realizado com sucesso!");
        }
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
            System.out.println(item.getNome());
        }
    }
}
