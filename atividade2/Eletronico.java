package atividade2;

public class Eletronico extends Produto{

    public Eletronico(int id, String nome, double preco) {
        super(id, nome, preco);
    }

    @Override
    public double calcularDesconto() {
        return this.preco * 0.1;
    }
}
