package atividade1;

import java.util.ArrayList;

public class Aluno {

    int id;
    String nome;
    ArrayList<Curso> cursosMinistrados;

    public Aluno(int id, String nome){
        this.id = id;
        this.nome = nome;
        this.cursosMinistrados = new ArrayList<>();
    }

    public void adicionarCursos(ArrayList<Curso> cursos){
        for(Curso curso : cursos){
            this.cursosMinistrados.add(curso);
        }
    }

    public void adicionarCurso(Curso novoCurso){
        for(Curso curso: this.cursosMinistrados){
            if(novoCurso.id == curso.id) {
                System.out.println("Já possui esse curso.");
                return;
            }
        }
        this.cursosMinistrados.add(novoCurso);
    }

    public void removerCurso(int id){
        if(this.cursosMinistrados.size() == 0){
            System.out.println("Não possui nenhum curso.");
            return;
        }
        for(int i = 0; i < this.cursosMinistrados.size(); i++){
            if(this.cursosMinistrados.get(i).id == id ) {
                this.cursosMinistrados.remove(i);
                System.out.println("atividade1.Curso do id " + id + " removido.");
                return;
            }
        }
    }

    public void removerCursos(){
        this.cursosMinistrados.clear();
    }

    public static void main(String[] args){

    }

}
