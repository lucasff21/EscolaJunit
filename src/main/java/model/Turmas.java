package model;

import java.util.List;

public class Turmas {
    private String horario;
    private Integer sala;

    private List<Aluno> alunos;

    private List<Professores> professores;



    public Turmas(String sala, String horario, Integer ano, List<Aluno> alunos, List<Disciplinas> disciplinas, List<Professores> professores) {
        this.horario = horario;
        this.sala = ano;
        this.alunos = alunos;
        this.professores = professores;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Integer getSala() {
        return sala;
    }

    public void setSala(Integer sala) {
        this.sala = sala;
    }


    public List<Professores> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professores> professores) {
        this.professores = professores;
    }
}
