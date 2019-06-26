package com.github.cauarebelo.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class Propriedade153Test {
    
    @Test
    public void numeroForadaFaixaGeraExcecao() {
        assertThrows(IllegalArgumentException.class, () -> MatematicaUtils.propriedade153(99));
        assertThrows(IllegalArgumentException.class, () -> MatematicaUtils.propriedade153(1000000));
    }
    
    @Test
    public void valorQueSatisfazPropriedade() {
        assertTrue(MatematicaUtils.propriedade153(153));
    }
    
    @Test
    public void valorQueNaoSatisfazPropriedade() {
        assertFalse(MatematicaUtils.propriedade153(155));
    }
}
