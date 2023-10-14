package Escola;

import model.Aluno;
import model.Disciplinas;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteDisciplinas {

    private Disciplinas disciplinas;

    @BeforeEach
    public void criarObjetoDisciplina() {
        disciplinas = new Disciplinas();
    }

    @Test
    public void testCreateDisciplinaNome(){
        String resultadoEsperado = "Matemática";
        disciplinas.setNome("Matemática");
        assertEquals(resultadoEsperado, disciplinas.getNome());
    }
}
