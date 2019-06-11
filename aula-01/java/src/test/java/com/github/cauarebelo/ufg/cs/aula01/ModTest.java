package com.github.cauarebelo.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class ModTest {
    
    @Test
    public void numeroForadaFaixaGeraExcecao() {
        assertThrows(IllegalArgumentException.class, () -> Matematica.mod(-1, 1));
		assertThrows(IllegalArgumentException.class, () -> Matematica.mod(1, 0));
		assertThrows(IllegalArgumentException.class, () -> Matematica.mod(1, -1));
    }
	
    @Test
    public void valorQueSatisfazPropriedade() {
        assertEquals(3, Matematica.mod(7, 4));
    }

}