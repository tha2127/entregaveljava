package br.com.digitalhouse;

public class ProfessorTitular extends Professor {
    private String especialidade;
    private String nome;
    private String sobrenome;
    private int tempoDeCasa;
    private int codigoDeProfessor;

    public ProfessorTitular(String nome, String sobrenome, int tempoDeCasa, int codigoDeProfessor, String especialidade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tempoDeCasa = tempoDeCasa;
        this.codigoDeProfessor = codigoDeProfessor;
        this.especialidade = especialidade;

    }

    public ProfessorTitular() {

    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getSobrenome() {
        return sobrenome;
    }

    @Override
    public int getTempoDeCasa() {
        return tempoDeCasa;
    }

    @Override
    public int getCodigoDeProfessor() {
        return codigoDeProfessor;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;

    }

    @Override
    public void setTempoDeCasa(int tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }

    @Override
    public void setCodigoDeProfessor(int codigoDeProfessor) {
        this.codigoDeProfessor = codigoDeProfessor;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
