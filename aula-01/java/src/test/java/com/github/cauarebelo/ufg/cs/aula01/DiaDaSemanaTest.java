package com.github.cauarebelo.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class DiaDaSemanaTest {
    
    @Test
    public void numeroForadaFaixaGeraExcecao() {
        assertThrows(IllegalArgumentException.class, () -> MatematicaUtils.diaDaSemana(22, 16 , 1999));
        assertThrows(IllegalArgumentException.class, () -> MatematicaUtils.diaDaSemana(32, 05 , 2025));
        assertThrows(IllegalArgumentException.class, () -> MatematicaUtils.diaDaSemana(15, 03 , 1658));
        assertThrows(IllegalArgumentException.class, () -> MatematicaUtils.diaDaSemana(29, 02 , 2019));
    }
    
    @Test
    public void dataTeste() {
        assertEquals(3, MatematicaUtils.diaDaSemana(16, 05, 2019));
    }
    
}
