import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class DiadasemanaTest {
	
	@Test
	public void numeroForadaFaixaGeraExcecao() {
		assertThrows(IllegalArgumentException.class, () -> Matematica.diadasemana(22, 16 , 1999));
		assertThrows(IllegalArgumentException.class, () -> Matematica.diadasemana(32, 05 , 2025));
		assertThrows(IllegalArgumentException.class, () -> Matematica.diadasemana(15, 03 , 1658));
		assertThrows(IllegalArgumentException.class, () -> Matematica.diadasemana(29, 02 , 2019));
	}
	
	@Test
	public void dataTeste() {
		assertEquals(3, Matematica.diadasemana(16, 05, 2019));
	}
	
}
