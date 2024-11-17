package atividade5;

public class Analista extends Funcionario implements Bonus {


    public Analista(int id, String nome, double salarioBase) {
        super(id, nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        double bonus = calcularBonus(0.05);
        return salarioBase + bonus;
    }

    @Override
    public double calcularBonus(double percentual) {
        return salarioBase * percentual;
    }

}

