package atividade5;

public class Main {
    public static void main(String[] args){
        Analista analista1 = new Analista(1, "Jon", 1000.0);
        Gerente gerente1 = new Gerente(1, "Ygritte", 1200.50);
        Empresa empresa = new Empresa();

        empresa.adicionarFuncionario(analista1);
        empresa.listarFuncionarios();
        empresa.adicionarFuncionario(gerente1);
        empresa.listarFuncionarios();
    }
}
