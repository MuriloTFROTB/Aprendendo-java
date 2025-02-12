package models.restaurante;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    List<Item> cardapio = new ArrayList<>();

    public void adicionarNoCardapio(Item item) {
        cardapio.add(item);
    }

    public Item buscarItem(String nome) {
        for (Item item : cardapio) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                return item;
            }
        }
        return null;
    }

    public void listarCardapio() {
        System.out.println("Cardapio do Restaurante:");
        for (Item item : cardapio) {
            System.out.println(item.getNome());
        }
    }
}
