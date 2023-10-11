package model;

public class Aluno {

    private String nome;
    private String dataDeNascimento;

    private Integer matricula;

    public Aluno() {

    }

    public Aluno(String nome, String dataDeNascimento, Integer matricula) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        this.nome = nome;
        return nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }
}
