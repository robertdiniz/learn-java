package atividade3;

public class Livro extends Publicacao{

    public Livro(String titulo, Autor autor, String anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    @Override
    public String obterResumo() {
        return "Livro: " + this.titulo + " " + this.autor.nome;
    }
}
