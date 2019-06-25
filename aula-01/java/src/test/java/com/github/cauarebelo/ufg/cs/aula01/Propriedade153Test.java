package com.github.cauarebelo.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class Propriedade153Test {
    
    @Test
    public void numeroForadaFaixaGeraExcecao() {
        assertThrows(IllegalArgumentException.class, () -> MatematicaUtil.propriedade153(99));
    }
    
    @Test
    public void valorQueSatisfazPropriedade() {
        assertTrue(MatematicaUtil.propriedade153(153));
    }
    
    @Test
    public void valorQueNaoSatisfazPropriedade() {
        assertFalse(MatematicaUtil.propriedade153(155));
    }
}
