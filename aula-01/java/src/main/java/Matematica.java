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
    public static int mod(final int dividendo, final int divisor) {
        if (divisor < 0 || dividendo <= 0) {
            throw new IllegalArgumentException("Numero fora da faixa esperada");
        }
        int resto = dividendo;
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
    public static int somaNaturais(final int numero) {
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
    public static int fatorial(final int numero) {
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
    public static int produto(final int multiplicando, final int  multiplicador) {
        if (multiplicando < 0 || multiplicador < 0) {
             throw new IllegalArgumentException("Numero fora da faixa esperada");
        }
        int c = multiplicando;
        int d = multiplicador;
        if (multiplicador < multiplicando) {
            c = multiplicador;
            d = multiplicando;
        }
        int e = 1;
        int f = 0;
        while (e <= c) {
            f += d;
            e++;
        }
        return f;
    }
    /**
     * Multiplica o primeiro numero com ele mesmo 'b' vezes, conhecido como potencia, ou efetivamente a ^ b
     * @param base O numero a ser multiplicado expoente vezes
	 * @param expoente A quantidade de vezes que a vai ser multiplicado com ele mesmo
     * @throws IllegalArgumentException Se a for menor que zero ou b for menor que zero
     * @returns Retorna o resultado da multiplicacao, ou seja, sua potencia
    */
    public static int potencia(final int base, final int expoente) {
        if (base < 0 || expoente < 0) {
            throw new IllegalArgumentException("Numero fora da faixa esperada");
        }
        int c = 1;
        int d = 1;
        while (d <= expoente) {
            c = produto(c, base);
            d++;
        }
        return c;
    }
    /**
     * Retorna o pi com numero precisao
     * @param numero Precisao do resultado
     * @throws IllegalArgumentException Se numero for menor ou igual a 1
     * @returns Retorna pi com numero precisao
    */
    public static int pi(final int numero) {
        if (numero <= 1) {
            throw new IllegalArgumentException("Numero fora da faixa esperada");
        }
        int i = 1;
        int s = -1;
        int d = -1;
        int p = 0;
        while (i <= numero) {
            d += 2;
            s = -1 * s;
            p += 4*s/d;
            i += 1;
        }
        return p;
    }
    /**
     * Retorna o logaritmo natural de n com k precisao
     * @param numero Numero a ser usado no logaritmo natural
	 * @param precisao Precisao do resultado
     * @throws IllegalArgumentException Se numero for menor que 1 ou se precisao for menor que 2
     * @returns Retorna o logaritmo natural limitado a precisao
    */
    public static int logaritmoNatural(final int numero, final int precisao) {
        if (numero < 1 || precisao < 2) {
            throw new IllegalArgumentException("Numero fora da faixa esperada");
        }
        int i = 2;
        int e = 1 + numero;
        int numerador = numero;
        int denominador = 1;
        while (i <= precisao) {
            numerador *= numerador;
            denominador *= i;
            e += numerador/denominador;
            i += 1;
        }
        return e;
    }
    /**
     * Retorna a razao aurea de 2 numeros, ou seja, somar dois numeros, e logo em seguida somar os dois ultimos numeros dado pela razao, ate chegar nos ultimos
     * definidos por k, numero dado pelo usuario, e faz a razao dos dois ultimos numeros
     * @param num Primeiro numero a ser somado
	 * @param num2 Segundo numero a ser somado
     * @param quant A quantidade de vezes que serao somados
     * @throws IllegalArgumentException Se x for menor que 0 ou se y for menor que x ou se k for menor que 0
     * @returns Retorna o resultado da razao aurea, ou seja, o resultado de toda a soma
    */
    public static int razaoAurea(final int num, final int num2, final int quant) {
        if (num < 0 || num2 < num || quant < 0) {
            throw new IllegalArgumentException("Numero fora da faixa esperada");
        }
        int c = num2;
        int a = num;
        int i = 1;
        int t = c;
        while (i <= quant) {
            t = c;
            c += a;
            a = t;
            i += 1;
        }
        return c/a;
    }
    /**
     * Descobre se o numero é um quadrado perfeito
     * @param numero O numero que o usuario deseja saber se faz parte dos numeros que são quadrados perfeitos
     * @throws IllegalArgumentException Se n for menor que 1
     * @returns Define se o numero e quadrado perfeito ou nao
    */
    public static boolean quadradoPerfeito(final int numero) {
        if (numero < 1) {
            throw new IllegalArgumentException("Numero fora da faixa esperada");
        }
        int i = 1;
        int s = 1;
        while (s < numero) {
            i += 2;
            s += i;
        }
        return s == numero;
    }
    /**
     * Calcula a raiz quadrada de um numero com uma certa precisao, sendo os dois dados pelo usuario
     * @param numero O numero que sera aplicada a raiz quadrada
	 * @param precisao Precisao da operacao
     * @throws IllegalArgumentException Se n ou i forem menor que 0
     * @returns Retorna a raiz quadrada de n
    */
    public static int raiz(final int numero , final int precisao) {
        if (numero < 0 || precisao < 0) {
            throw new IllegalArgumentException("Numero fora da faixa esperada");
        }
        int r = 1;
        while (0 <= numero) {
            r = (r + numero/r) / 2;
            precisao -= 1;
        }
        return r;
}
}