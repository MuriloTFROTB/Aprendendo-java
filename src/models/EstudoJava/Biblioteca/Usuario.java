package models.EstudoJava.Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    String nome;
    List<Livro> livrosEmprestados = new ArrayList<>();;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public void pegarEmprestado(Livro livro) {
        if (livro.disponivel && livro != null) {
            livro.emprestar();
            livrosEmprestados.add(livro);
            System.out.println(nome + " pegou emprestado o livro" + livro.getTitulo());
        } else{
            System.out.println("Livro indisponível");
        }
    }

    public void devolver(Livro livro){
        if(livrosEmprestados.remove(livro)){
            livro.devolver();
            System.out.println(nome + " devolveu o livro" + livro.getTitulo());
        } else {
            System.out.println("Livro não encontrado");
        }
    }

    public void listarLivrosEmprestados(){
        System.out.println("📚 Livros emprestados para " + nome + ":");
        for (Livro livro : livrosEmprestados) {
            System.out.println(livro);
        }
    }
}
