package atividade3;

public abstract class Publicacao {

    String titulo;
    Autor autor;
    String anoPublicacao;

    public Publicacao(String titulo, Autor autor, String anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public abstract String obterResumo();

}
