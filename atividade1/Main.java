package atividade1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Aluno> alunos = new ArrayList<>();
        ArrayList<Professor> professores = new ArrayList<>();
        ArrayList<Curso> cursos = new ArrayList<>();

        Aluno aluno1 = new Aluno(1, "Maria");
        Aluno aluno2 = new Aluno(2, "Rita");
        Aluno aluno3 = new Aluno(3, "Myllena");
        Professor professor1 = new Professor(1, "Luan");
        Professor professor2 = new Professor(2, "Poliana");
        Professor professor3 = new Professor(3, "Natalia");
        Curso curso1 = new Curso(1, 20, "Matemática");
        Curso curso2 = new Curso(2, 20, "Ed. Física");
        Curso curso3 = new Curso(3, 20, "Português");

        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        professores.add(professor1);
        professores.add(professor2);
        professores.add(professor3);

        matricularAlunoEmCurso(aluno1, curso1);
        matricularAlunoEmCurso(aluno2, curso1);

        exibirAlunosMatriculadosEmCurso(alunos, curso1);

        associarProfessorEmCurso(professor1, curso1);
        associarProfessorEmCurso(professor1, curso2);
        exibirCursosPorProfessor(cursos, professor1);

    }

    public static void matricularAlunoEmCurso(Aluno aluno, Curso curso){
        aluno.adicionarCurso(curso);
        System.out.println("Aluno: " + aluno.nome + " matriculado em " + curso.nome + ".");
    }

    public static void associarProfessorEmCurso(Professor professor, Curso curso){
        professor.adicionarCurso(curso);
        System.out.println("Professor: " + professor.nome + " associado em " + curso.nome + ".");
    }

    public static void exibirAlunosMatriculadosEmCurso(ArrayList<Aluno> alunos, Curso curso){
        System.out.println("Exibindo Alunos por Cursos");
        for(Aluno aluno : alunos){
            if(aluno.cursosMinistrados.contains(curso)){
                System.out.println(aluno.nome);
            }
        }
    }

    public static void exibirCursosPorProfessor(ArrayList<Curso> cursos, Professor professor){
        System.out.println("Exibindo Cursos de um Professor -> " + professor.nome);
        for(Curso curso : cursos){
            if(professor.cursosMinistrados.contains(curso)){
                System.out.println(curso.nome);
            }
        }
    }
}
