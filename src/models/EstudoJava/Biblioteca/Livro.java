package models.EstudoJava.Biblioteca;

public class Livro {
    String titulo;
    boolean disponivel;

    public Livro(String titulo) {
        this.titulo = titulo;
        this.disponivel = true;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public boolean isDisponivel() {
        return this.disponivel;
    }

    public void emprestar() {
        if (disponivel) {
            this.disponivel = false;
        }
    }

    public void devolver() {
        this.disponivel = true;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", disponivel=" + disponivel +
                '}';
    }
}
