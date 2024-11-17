package atividade5;

public class Gerente extends Funcionario implements Bonus {


    public Gerente(int id, String nome, double salarioBase) {
        super(id, nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        double bonus = calcularBonus(0.10);
        return salarioBase + bonus;
    }

    @Override
    public double calcularBonus(double percentual) {
        return salarioBase * percentual;
    }

}

