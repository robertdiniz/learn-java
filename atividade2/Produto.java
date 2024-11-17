package atividade2;

public abstract class Produto {
    int id;
    double preco;
    String nome;

    public Produto (int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public abstract double calcularDesconto();

}


