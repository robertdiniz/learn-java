package atividade3;

public class Revista extends Publicacao {
    public Revista(String titulo, Autor autor, String anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    @Override
    public String obterResumo() {
        return "Revista: " + this.titulo + " " + this.anoPublicacao;
    }
}
