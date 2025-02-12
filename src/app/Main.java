package app;

import models.EstudoJava.Biblioteca.Biblioteca;
import models.EstudoJava.Biblioteca.Livro;
import models.EstudoJava.Biblioteca.Usuario;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("O Pequeno Principe");
        Livro livro2 = new Livro("O Senhor dos Anéis");
        Livro livro3 = new Livro("Harry Potter");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        biblioteca.listarLivros();

        Usuario usuario1 = new Usuario("Murilo");

        usuario1.pegarEmprestado(Biblioteca.buscarLivro("O Pequeno Principe"));
        usuario1.pegarEmprestado(Biblioteca.buscarLivro("O Pequeno Principe"));

        biblioteca.listarLivros();

        usuario1.listarLivrosEmprestados();
    }
}