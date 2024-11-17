package atividade3;

public class Main {

    public static void main(String[] args){
        Biblioteca biblioteca = new Biblioteca();
        Autor autor1 = new Autor("George R. R.");
        Autor autor2 = new Autor("Gege Akutami");
        Livro livro1 = new Livro("Game of Thrones", autor1, "6 de agosto de 1996");
        Livro livro2 = new Livro("Jujutsu Kaisen", autor2, "5 de março de 2018");
        Revista livro3 = new Revista("Revista Aleatoria", autor2, "5 de março de 2024");
        biblioteca.adicionarPublicacao(livro1);
        biblioteca.adicionarPublicacao(livro2);
        biblioteca.adicionarPublicacao(livro3);
        biblioteca.listarPublicacoes();

    }

}
