package br.com.digitalhouse;

public class Aluno {

    private String nome;
    private String sobrenome;
    private int codigo;

    public Aluno(String nome, String sobrenome, int codigo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codigo = codigo;

    }

    public Aluno() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
