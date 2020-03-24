package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

    private List<Aluno> listaDeAlunos = new ArrayList<>();
    private List<Professor> listaDeProfessores = new ArrayList<>();
    private List<Curso> listaDeCursos = new ArrayList<>();
    private List<Matricula> listaDeMatriculas = new ArrayList<>();

    public void registrarUmCurso(String nome, int codigoCurso, int quantidadeMaximaDeAlunos) {
        Curso curso = new Curso(nome, codigoCurso, quantidadeMaximaDeAlunos);
        listaDeCursos.add(curso);

    }

    public void excluirCurso(int codigoCurso) {
        for (Curso curso : listaDeCursos) {
            if (curso.getCodigo() == codigoCurso) {
                listaDeCursos.remove(curso);

            }
        }
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, int codigoProfessor, int quantidadeDeHoras) {
        ProfessorAdjunto professorAdjunto = new ProfessorAdjunto(nome, sobrenome, 0, codigoProfessor, quantidadeDeHoras);
        listaDeProfessores.add(professorAdjunto);

    }

    public void registrarProfessorTitular(String nome, String sobrenome, int codigo, String especialidade) {
        ProfessorTitular professorTitular = new ProfessorTitular(nome, sobrenome, 0, codigo, especialidade);
        listaDeProfessores.add(professorTitular);
    }

    public void excluirProfessor(int codigoProfessor) {
        for (Professor professor : listaDeProfessores) {
            if (professor.getCodigoDeProfessor() == codigoProfessor) {
                listaDeProfessores.remove(professor);
            }
        }
    }

    public void matricularAluno(String nome, String sobrenome, int codigoAluno) {
        Aluno aluno = new Aluno(nome, sobrenome, codigoAluno);
        listaDeAlunos.add(aluno);

    }

    public Aluno consultarAluno(int codigoDoAluno) {
        Aluno aluno1 = new Aluno();

        for (Aluno aluno : listaDeAlunos) {
            if (aluno.getCodigo() == codigoDoAluno) {
                aluno1 = aluno;
            }
        }
        return aluno1;
    }

    public Curso consultarCurso(int codigoCurso) {
        Curso curso1 = new Curso();

        for (Curso curso : listaDeCursos) {
            if (curso.getCodigo() == codigoCurso) {
                curso1 = curso;
            }
        }
        return curso1;

    }

    public ProfessorTitular consultarProfessorTitular(int codigoProfessor) {
        ProfessorTitular professor1 = new ProfessorTitular();

        for (Professor professor : listaDeProfessores) {
            if (professor.getCodigoDeProfessor() == codigoProfessor) {
                professor1 = (ProfessorTitular) professor;
            }
        }
        return professor1;
    }

    public ProfessorAdjunto consultarProfessorAdjunto(int codigoProfessorAdjunto) {
        ProfessorAdjunto professor1 = new ProfessorAdjunto();

        for (Professor professor : listaDeProfessores) {
            if (professor.getCodigoDeProfessor() == codigoProfessorAdjunto) {
                professor1 = (ProfessorAdjunto) professor;
            }
        }
        return professor1;
    }

    public void matricularAluno(int codigoAluno, int codigoCurso) {
        DigitalHouseManager manager = new DigitalHouseManager();
        Aluno aluno = manager.consultarAluno(codigoAluno);
        Curso curso = manager.consultarCurso(codigoCurso);

        curso.adicionarUmAluno(aluno, curso);

    }

    public void alocarProfessores(int codigoCurso, int codigoProfessorTitular, int codigoProfessorAdjunto) {
        DigitalHouseManager manager = new DigitalHouseManager();
        ProfessorTitular professorTitular = manager.consultarProfessorTitular(codigoProfessorTitular);
        ProfessorAdjunto professorAdjunto = manager.consultarProfessorAdjunto(codigoProfessorAdjunto);
        Curso curso = manager.consultarCurso(codigoCurso);

        curso.setProfessorTitular(professorTitular);
        curso.setProfessorAdjunto(professorAdjunto);
    }

    public void consultarCursoAluno(int codigoAluno) {
        for (Curso curso : listaDeCursos) {
            for (Aluno aluno : listaDeAlunos) {
                if (aluno.getCodigo() == codigoAluno) {
                    System.out.println("O aluno " + aluno.getNome() + " está matriculado no curso " + curso.getNome());
                }
            }
        }
    }

}

