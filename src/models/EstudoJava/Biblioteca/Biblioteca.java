package models.EstudoJava.Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private static List<Livro> catalogo = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        catalogo.add(livro);
    }

    public static Livro buscarLivro(String titulo) {
        for (Livro livro : catalogo) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public void listarLivros() {
        System.out.println("📚 Catálogo da Biblioteca:");
        for (Livro livro : catalogo) {
            System.out.println(livro);
        }
    }
}
