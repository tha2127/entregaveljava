package br.com.digitalhouse;

import java.util.Date;

public class Matricula {
    private Aluno aluno;
    private Curso curso;
    private Date dataDeMatricula;

    public Matricula(Aluno aluno, Curso curso) {

        this.aluno = aluno;
        this.curso = curso;
        this.dataDeMatricula = new Date();
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public Date getDataDeMatricula() {
        return dataDeMatricula;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void setDataDeMatricula(Date dataDeMatricula) {
        this.dataDeMatricula = dataDeMatricula;
    }

}
