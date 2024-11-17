package atividade1;

public class Curso {

    int id;
    int duracaoHoras;
    String nome;

    public Curso(int id, int duracaoHoras, String nome){
        this.id = id;
        this.duracaoHoras = duracaoHoras;
        this.nome = nome;
    }

    public static void main(String[] args) {
        Curso curso = new Curso(1, 20, "Informática");
        System.out.println(curso);
        System.out.println(curso.duracaoHoras);
        System.out.println(curso.id);
        System.out.println(curso.nome);
    }

}
