package Escola;

import model.Disciplinas;
import model.Professores;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteProfessores {

    private Professores professor;

    @BeforeEach
    public void criarObjetoProfessor() { professor = new Professores(); }

    @Test
    public void testCreateNome(){
        String resultadoEsperado = "Danilo";
        professor.setNome("Danilo");
        assertEquals(resultadoEsperado, professor.getNome());
    }

    @Test
    public void testCreateDisciplinaNome(){
        List<Disciplinas> disciplinas = new ArrayList<>();
        disciplinas.add(new Disciplinas("Matemática"));

        professor.setDisciplinas(disciplinas);
        List<Disciplinas> disciplinasDoProfessor = professor.getDisciplinas();
        assertEquals(disciplinas, disciplinasDoProfessor);

    }



}
