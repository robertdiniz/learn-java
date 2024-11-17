package atividade5;

public abstract class Funcionario {

    int id;
    String nome;
    double salarioBase;

    public Funcionario(int id, String nome, double salarioBase) {
        this.id = id;
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

}
