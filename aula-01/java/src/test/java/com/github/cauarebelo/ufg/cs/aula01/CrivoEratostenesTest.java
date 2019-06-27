package com.github.cauarebelo.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class CrivoEratostenesTest {
    
    @Test
    public void numeroForadaFaixaGeraExcecao() {
        int vetor[] = {};
        assertThrows(IllegalArgumentException.class, () -> MatematicaUtils.crivoEratostenes(vetor));
        int vetor2[] = null;
        assertThrows(IllegalArgumentException.class, () -> MatematicaUtils.crivoEratostenes(vetor));
    }
    
    @Test
    public void classicoTeste() {
        int vetorCorreto[] = { 0, 0, 0, 0, 1, 0, 1 };
        int vetor[] = { 0, 0, 0, 0, 0, 0, 0 };
        assertArrayEquals(vetorCorreto, MatematicaUtils.crivoEratostenes(vetor));
    }
    
}
