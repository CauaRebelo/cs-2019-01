package com.github.cauarebelo.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class Propriedade3025Test {
	
	@Test
	public void numeroForadaFaixaGeraExcecao() {
		assertThrows(IllegalArgumentException.class, () -> MatematicaUtil.propriedade3025(-1));
	}
	
	@Test
	public void valorQueSatisfazPropriedade() {
		assertTrue(MatematicaUtil.propriedade3025(3025));
	}
	
	@Test
	public void valorQueNaoSatisfazPropriedade() {
		assertFalse(MatematicaUtil.propriedade3025(3026));
	}
}
