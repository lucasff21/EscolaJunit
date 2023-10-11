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
        String resultadoRetornado = aluno.setNome("Paulo");
        assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void testDataDeNascimento() {
        aluno.setDataDeNascimento("01/01/2000");
        assertEquals("01/01/2000", aluno.getDataDeNascimento());
    }

    @Test
    public void testMatricula() {
        aluno.setMatricula(12345);
        assertEquals(12345, aluno.getMatricula());
    }

    public Boolean createAluno(){
        return true;
    }

}
