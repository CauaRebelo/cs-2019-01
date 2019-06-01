import java.time.LocalDate;
import java.time.DateTimeException;

public class Matematica {
    /**
     * Verifica se numero satisfaz propriedade 3025.
     * @param numero variavel a ser verificada
     * @throws IllegalArgumentException caso entrada seja menor que 0
     * ou maior que 999
     * @return O valor verdadeiro se o argumento fornecido
     * satisfaz a propriedade 3025 e, o valor falso, caso contrário
    */
    public static boolean propriedade3025(int numero) {
        if (numero <= 0 || numero > 9999) {
            throw new IllegalArgumentException("Numero fora da faixa esperada");
        }
        
        final int b = numero / 100;
        final int c = numero % 100;
        
        return numero == (b + c) * (b + c);
    }
    /**
     * Aplica a propriedade 153 ao numero desejado, ou seja, a soma do cubo de cade um de seus digitos
     * e igual ao propio numero, um exemplo seria o propio numero 153, onde 1^3+5^3+3^3=153
     * @param  numero Numero a eser usado na operacao
     * @throws IllegalArgumentException Se a entrada for nula ou nao definida
     * @returns Se o numero se aplica a propriedade 153 ou nao (Verdadeiro ou falso)
    */
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
    /**
     * Informa o dia da semana, sendo 0 segunda e assim por diante
     * @param dia Dia desejado
     * @param mes O mes desejado
     * @param ano O ano desejado
     * @throws IllegalArgumentException Se a data nao for valida
     * @returns Retorna o dia da semana, sendo 0 segunda ate 6 como domingo
    */
    public static int diaDaSemana(final int dia, final int mes, final int ano) {
        dataInvalida(dia, mes, ano);
        
        final int diasem = dia + 2 * mes + 3 * (mes + 1) / 5 + ano + ano / 4 - ano / 100 + ano / 400;
        
        return diasem % 7;
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
	/**
     * Encontra o modulo, ou seja resto da divisao, de um tal numero com seu divisor
     * @param dividendo Numero que vai ser aplicado o modulo
     * @param divisor Numro que vai dividir o dividendo
     * @throws IllegalArgumentException Se o dividendo for menor ou igual a 0 ou se o divisor for menor que 0
     * @returns Retorna o modulo, ou seja, resto da divisao
    */
    public static void mod(final int dividendo, final int divisor) {
        if (divisor < 0 || dividendo <= 0) {
            throw new IllegalArgumentException("Numero fora da faixa esperada");
        }
        int s = dividendo;
        while (divisor <= resto) {
            resto -= divisor;
        }
        return resto;
    }
    /**
     * Calcula a soma dos primeiros naturais, N = {0, 1, 2 ...}
     * @param numero A quantidade dos primeiros numeros naturais a serem somados 
     * @throws IllegalArgumentException Se o numero for menor que 1
     * @returns Retorna o resultado da soma
    */
    public static void somaNaturais(final int numero) {
        if (numero < 1) {
            throw new IllegalArgumentException("Numero fora da faixa esperada");
        }
        int a = 2;
        int b = 1;
        while (a <= numero) {
            b += a;
            a++;
        }
        return b;
    }
    /**
     * Multiplicar a quantidade de numero naturais em ordem baseado no numero dado pelo usuário 
     * @param numero A quantidade de numeros naturais a serem somados
     * @throws IllegalArgumentException Se numero for menor que 1
     * @returns Retorna a Fatorial do numero, ou seja o resultado da multiplicacao
    */
    public static void fatorial(final int numero) {
        if (numero < 1) {
            throw new IllegalArgumentException("Numero fora da faixa esperada");
        }
        int a = 2;
        int b = 1;
        while (a <= numero) {
            b *= a;
            a++;
        }
        return b;
    }
    /**
     * Multiplica dois numero, somando o primeiro numero com ele mesmo 'b' vezes, retornando o resultado da multiplicacao
     * @param multiplicando O numero a ser somado multiplicador vezes
	 * @param multiplicador A quantidade de vezes que o multiplicando vai ser somado com ele mesmo
     * @throws IllegalArgumentException Se a for menor que zero ou b for menor que zero
     * @returns Retorna o resultado da soma, ou seja o resultado do produto
    */
    public static void produto(final int multiplicando, final int  multiplicador) {
        if (multiplicando < 0 || multiplicador < 0) {
             throw new IllegalArgumentException("Numero fora da faixa esperada");
        }
        int c = multiplicando;
        int d = multiplicador;
        if (b < a) {
            c = b;
            d = a;
        }
        int e = 1;
        int f = 0;
        while (e <= c) {
            f += d;
            e++;
        }
        return f;
    }
}
