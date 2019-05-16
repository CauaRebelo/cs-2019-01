import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class MatematicaTest {
	
	@Test
	public void numeroForadaFaixaGeraExcecao() {
		assertThrows(IllegalArgumentException.class, () -> Matematica.propriedade3025(-1));
	}
}
