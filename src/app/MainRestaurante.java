package app;

import models.restaurante.Cardapio;
import models.restaurante.Cliente;
import models.restaurante.Item;

public class MainRestaurante {
    public static void main(String[] args) {

        Item item1 = new Item("Coca-cola", 5.0);
        Item item2 = new Item("Hamburguer", 15.0);
        Item item3 = new Item("Batata-frita", 10.0);

        Cardapio cardapio = new Cardapio();

        cardapio.adicionarNoCardapio(item1);
        cardapio.adicionarNoCardapio(item2);
        cardapio.adicionarNoCardapio(item3);

        cardapio.listarCardapio();

        Cliente cliente1 = new Cliente("João", "Pereiramurilo540@gmail.com");

        cliente1.adicionar(cardapio.buscarItem("Coca-cola"));
        cliente1.adicionar(cardapio.buscarItem("Coca-cola"));

        cliente1.listaDePedidos();
    }
}
