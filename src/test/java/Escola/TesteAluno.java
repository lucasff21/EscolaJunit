package Escola;

import model.Aluno;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteAluno {

    private Aluno aluno;

    @BeforeEach
    public void criarObjetoAluno() {
        aluno = new Aluno();
    }

    @Test
    public void testNome() {
        String resultadoEsperado = "Paulo";
        aluno.setNome("Paulo");
        assertEquals (resultadoEsperado, aluno.getNome());
    }

    @Test
    public void testDataDeNascimento() {
        String resultadoEsperado = "01/01/2000";
        aluno.setDataDeNascimento("01/01/2000");
        assertEquals(resultadoEsperado, aluno.getDataDeNascimento());
    }

    @Test
    public void testMatricula() {
        Integer resultadoEsperado = 1234;
        aluno.setMatricula(1234);
        assertEquals(resultadoEsperado, aluno.getMatricula());
    }



}
