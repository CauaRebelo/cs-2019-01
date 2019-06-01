import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class ModTest {
    
    @Test
    public void numeroForadaFaixaGeraExcecao() {
        assertThrows(IllegalArgumentException.class, () -> Matematica.mod(0, 0));
    }
    
    @Test
    public void valorQueSatisfazPropriedade() {
        assertEquals(3, Matematica.mod(7, 4));
    }

}