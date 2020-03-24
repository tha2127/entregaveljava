package br.com.digitalhouse;

public abstract class Professor {
    private String nome;
    private String sobrenome;
    private int tempoDeCasa;
    private int codigoDeProfessor;


    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getTempoDeCasa() {
        return tempoDeCasa;
    }

    public int getCodigoDeProfessor() {
        return codigoDeProfessor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setTempoDeCasa(int tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }

    public void setCodigoDeProfessor(int codigoDeProfessor) {
        this.codigoDeProfessor = codigoDeProfessor;
    }
}

