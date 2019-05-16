public class Matematica {
	public static boolean propriedade3025(int numero) {
		if (numero <= 0 || numero > 9999) {
			throw new IllegalArgumentException("Numero fora da faixa esperada");
		}
		
		final int b = numero / 100;
		final int c = numero % 100;
		
		return numero == (b + c) * (b + c);
	}
	
}
