package br.com.digitalhouse;

public class ProfessorAdjunto extends Professor {
    private String nome;
    private String sobrenome;
    private int tempoDeCasa;
    private int codigoDeProfessor;
    private int quantHorasMonitoria;

    public ProfessorAdjunto(String nome, String sobrenome, int tempoDeCasa, int codigoDeProfessor, int quantHorasMonitoria) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tempoDeCasa = tempoDeCasa;
        this.codigoDeProfessor = codigoDeProfessor;
        this.quantHorasMonitoria = quantHorasMonitoria;

    }

    public ProfessorAdjunto() {

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

    public int getQuantHorasMonitoria() {
        return quantHorasMonitoria;
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

    public void setQuantHorasMonitoria(int quantHorasMonitoria) {
        this.quantHorasMonitoria = quantHorasMonitoria;
    }
}
