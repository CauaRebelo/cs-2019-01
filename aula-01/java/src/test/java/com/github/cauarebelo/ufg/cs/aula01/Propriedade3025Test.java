package com.github.cauarebelo.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class Propriedade3025Test {
	
	@Test
	public void numeroForadaFaixaGeraExcecao() {
		assertThrows(IllegalArgumentException.class, () -> MatematicaUtils.propriedade3025(-1));
		assertThrows(IllegalArgumentException.class, () -> MatematicaUtils.propriedade3025(1000000));
	}
	
	@Test
	public void valorQueSatisfazPropriedade() {
		assertTrue(MatematicaUtils.propriedade3025(3025));
	}
	
	@Test
	public void valorQueNaoSatisfazPropriedade() {
		assertFalse(MatematicaUtils.propriedade3025(3026));
	}
}
