import java.time.LocalDate;
import java.time.DateTimeException;

public class Matematica {
	public static boolean propriedade3025(int numero) {
		if (numero <= 0 || numero > 9999) {
			throw new IllegalArgumentException("Numero fora da faixa esperada");
		}
		
		final int b = numero / 100;
		final int c = numero % 100;
		
		return numero == (b + c) * (b + c);
	}
	
	public static boolean propriedade153(int numero) {
		if (numero <= 100 || numero >= 999) {
			throw new IllegalArgumentException("Numero fora da faixa esperada");
		}
		
		final int b = numero / 100;
		final int c = numero % 100;
		final int d = c / 10;
		final int e = c % 10;
		
		return numero == ( b * b * b + d * d * d + e * e * e);
	}
	
	public static int diadasemana(final int dia, final int mes, final int ano) {
		dataInvalida(dia, mes, ano);
		
		final int b = dia + 2 * mes + 3 * (mes + 1) / 5 + ano + ano / 4 - ano / 100 + ano / 400;
		
		return b % 7;
	}
	
	public static void dataInvalida(final int dia, final int mes, final int ano) {
		if (dia < 1 || dia > 31) {
			throw new IllegalArgumentException("Dia invalido");
		}
		if (mes < 1 || mes > 12) {
			throw new IllegalArgumentException("Mes invalido");
		}
		if (ano <= 1753) {
			throw new IllegalArgumentException("Ano invalido");
		}
		try {
			LocalDate.of(ano, mes, dia);
		} catch (DateTimeException exp) {
			final String data = String.format("%d/%d/%d", dia, mes, ano);
			throw new IllegalArgumentException("Data Invalida" + data, exp);
		}
	}
}
