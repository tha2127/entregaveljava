package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nome;
    private int codigo;
    private ProfessorTitular professorTitular;
    private ProfessorAdjunto professorAdjunto;
    private int quantidadeMaxAlunos;
    private List<Aluno> alunosMatriculados = new ArrayList<>();


    public Curso(String nome, int codigo, int quantidadeMaxAlunos) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidadeMaxAlunos = quantidadeMaxAlunos;
    }

    public Curso() {

    }

    public String getNome() {
        return nome;

    }

    public int getCodigo() {
        return codigo;
    }

    public int getQuantidadeMaxAlunos() {
        return quantidadeMaxAlunos;
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setAlunosMatriculados(List<Aluno> alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public void setQuantidadeMaxAlunos(int quantidadeMaxAlunos) {
        this.quantidadeMaxAlunos = quantidadeMaxAlunos;
    }

    public boolean adicionarUmAluno(Aluno aluno, Curso curso) {
        if (alunosMatriculados.size() < quantidadeMaxAlunos) {
            alunosMatriculados.add(aluno);
            Matricula matricula = new Matricula(aluno, curso);
            System.out.println("A matrícula foi realizada");
            return true;

        } else {
            System.out.println("A matrícula não foi realizada porque não há vagas");
            return false;
        }
    }

    public void excluirAluno(Aluno aluno) {
        alunosMatriculados.remove(aluno);

    }
}


