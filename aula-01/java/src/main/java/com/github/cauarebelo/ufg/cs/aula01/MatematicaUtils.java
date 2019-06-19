package com.github.cauarebelo.ufg.cs.aula01;
import java.time.LocalDate;
import java.time.DateTimeException;
/**
 * Aula 1 de cs-2019-01.
*/
public class MatematicaUtils {
    /**
     * Para checkstyle.
     */
    protected Matematica() {
    // Esse construtor esta vazio de proposito
    }
    /**
     * Verifica se numero satisfaz propriedade 3025.
     * @param numero variavel a ser verificada
     * @throws IllegalArgumentException caso entrada seja menor que 0
     * ou maior que 999
     * @return O valor verdadeiro se o argumento fornecido
     * satisfaz a propriedade 3025 e, o valor falso, caso contrário
    */
    public static boolean propriedade3025(final int numero) {
        final int limiteMaximo = 9999;
        if (numero <= 0 || numero > limiteMaximo) {
            throw new IllegalArgumentException("Numero fora da faixa esperada");
        }
        final int auxiliar1 = 100;
        final int div = numero / auxiliar1;
        final int mult = numero % auxiliar1;
        return numero == (div + mult) * (div + mult);
    }
    /**
     * Aplica a propriedade 153 ao numero desejado, ou seja, a soma do cubo de
     * cade um de seus digitos e igual ao propio numero, um exemplo seria
     * o propio numero 153 onde 1^3+5^3+3^3=153.
     * @param numero Numero a eser usado na operacao
     * @throws IllegalArgumentException Se a entrada for nula ou nao definida
     * @return Se o numero se aplica a propriedade 153 ou nao
    */
    public static boolean propriedade153(final int numero) {
        final int limiteMinimo = 100;
        final int limiteMaximo = 999;
        if (numero <= limiteMinimo || numero >= limiteMaximo) {
            throw new IllegalArgumentException("Numero fora da faixa esperada");
        }
        final int auxiliar1 = 100;
        final int auxiliar2 = 10;
        final int div = numero / auxiliar1;
        final int ajuda = numero % auxiliar1;
        final int quo = ajuda / auxiliar2;
        final int res = ajuda % auxiliar2;
        return numero == div * div * div + quo * quo * quo + res * res * res;
    }
    /**
     * Informa o dia da semana, sendo 0 segunda e assim por diante.
     * @param dia Dia desejado
     * @param mes O mes desejado
     * @param ano O ano desejado
     * @throws IllegalArgumentException Se a data nao for valida
     * @return Retorna o dia da semana, sendo 0 segunda ate 6 como domingo
    */
    public static int diaDaSemana(final int dia, final int mes, final int ano) {
        dataInval(dia, mes, ano);
        final int diasem = dia + 2 * mes + 3 * (mes + 1) / 5 + ano
        + ano / 4 - ano / 100 + ano / 400;
        final int semana = 7;
        return diasem % semana;
    }
    /**
     * Informa se a data e invalida.
     * @param dia Dia desejado
     * @param mes O mes desejado
     * @param ano O ano desejado
     * @throws IllegalArgumentException Se o dia nao for valido
     * @throws IllegalArgumentException Se o mes nao for valido
     * @throws IllegalArgumentException Se o ano nao for valido
     * @throws IllegalArgumentException Se houver uma DataTimeException
    */
    public static void dataInval(final int dia, final int mes, final int ano) {
        final int diaMax = 31;
        final int mesMax = 12;
        final int anoMinimo = 1753;
        if (dia < 1 || dia > diaMax) {
            throw new IllegalArgumentException("Dia invalido");
        }
        if (mes < 1 || mes > mesMax) {
            throw new IllegalArgumentException("Mes invalido");
        }
        if (ano <= anoMinimo) {
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
     * Encontra o modulo, ou seja resto da divisao, de um tal numero
     * com seu divisor.
     * @param dividendo Numero que vai ser aplicado o modulo
     * @param divisor Numro que vai dividir o dividendo
     * @throws IllegalArgumentException Se o dividendo for menor ou igual
     * a 0 ou se o divisor for menor que 0
     * @return Retorna o modulo, ou seja, resto da divisao
    */
    public static int mod(final int dividendo, final int divisor) {
        if (dividendo < 0 || divisor <= 0) {
            throw new IllegalArgumentException("Numero fora da faixa esperada");
        }
        int resto = dividendo;
        while (divisor <= resto) {
            resto -= divisor;
        }
        return resto;
    }
    /**
     * Calcula a soma dos primeiros naturais, N = {0, 1, 2 ...}.
     * @param numero A quantidade dos primeiros numeros naturais somados
     * @throws IllegalArgumentException Se o numero for menor que 1
     * @return Retorna o resultado da soma
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
     * Multiplicar a quantidade de numero naturais em ordem baseado no
     * numero dado pelo usuário.
     * @param numero A quantidade de numeros naturais a serem somados
     * @throws IllegalArgumentException Se numero for menor que 1
     * @return Retorna o Fatorial do numero
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
     * Multiplica dois numero, somando o primeiro numero com ele mesmo
     * baseado no multiplicador, retornando o resultado da multiplicacao.
     * @param multcando O numero a ser somado multiplicador vezes
     * @param multcador A quantidade de vezes que o multiplicando
     * vai ser somado com ele mesmo
     * @throws IllegalArgumentException Se a for menor que zero ou b for
     * menor que zero
     * @return Retorna o resultado da soma, ou seja o resultado do produto
    */
    public static int produto(final int multcando, final int  multcador) {
        if (multcando < 0 || multcador < 0) {
            throw new IllegalArgumentException("Numero fora da faixa esperada");
        }
        int c = multcando;
        int d = multcador;
        if (multcador < multcando) {
            c = multcador;
            d = multcando;
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
     * Multiplica o primeiro numero com ele mesmo baseado no expoente,
     * conhecido como potencia, ou efetivamente base ^ expoente.
     * @param base O numero a ser multiplicado expoente vezes
     * @param expoente A quantidade de vezes que a vai ser multiplicado
     * com ele mesmo
     * @throws IllegalArgumentException Se a for menor que zero ou b
     * for menor que zero
     * @return Retorna o resultado da multiplicacao, ou seja, sua potencia
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
     * Retorna o pi com uma precisao baseada no numero.
     * @param numero Precisao do resultado
     * @throws IllegalArgumentException Se numero for menor ou igual a 1
     * @return Retorna pi com numero precisao
    */
    public static int pi(final int numero) {
        if (numero <= 1) {
            throw new IllegalArgumentException("Numero fora da faixa esperada");
        }
        final int auxiliar1 = 4;
        int i = 1;
        int s = -1;
        int d = -1;
        int p = 0;
        while (i <= numero) {
            d += 2;
            s = -1 * s;
            p += auxiliar1 * s / d;
            i += 1;
        }
        return p;
    }
    /**
     * Retorna o logaritmo natural de numero com certa precisao.
     * @param numero Numero a ser usado no logaritmo natural
     * @param precisao Precisao do resultado
     * @throws IllegalArgumentException Se numero for menor que 1 ou se
     * precisao for menor que 2
     * @return Retorna o logaritmo natural limitado a precisao
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
            e += numerador / denominador;
            i += 1;
        }
        return e;
    }
    /**
     * Retorna a razao aurea de 2 numeros, ou seja, somar dois numeros,
     * e logo em seguida somar os dois ultimos numeros dado pela razao,
     * ate chegar nos ultimos definidos por k, numero dado pelo usuario,
     * e faz a razao dos dois ultimos numeros.
     * @param num Primeiro numero a ser somado
     * @param num2 Segundo numero a ser somado
     * @param qua A quantidade de vezes que serao somados
     * @throws IllegalArgumentException Se x for menor que 0 ou se y for
     * menor que x ou se k for menor que 0
     * @return Retorna o resultado da razao aurea
    */
    public static int razaoAurea(final int num, final int num2, final int qua) {
        if (num < 0 || num2 < num || qua < 0) {
            throw new IllegalArgumentException("Numero fora da faixa esperada");
        }
        int c = num2;
        int a = num;
        int i = 1;
        int t = c;
        while (i <= qua) {
            t = c;
            c += a;
            a = t;
            i += 1;
        }
        return c / a;
    }
    /**
     * Descobre se o numero é um quadrado perfeito.
     * @param numero O numero que o usuario deseja saber se faz parte dos
     * numeros que são quadrados perfeitos
     * @throws IllegalArgumentException Se n for menor que 1
     * @return Define se o numero e quadrado perfeito ou nao
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
     * Calcula a raiz quadrada de um numero com uma certa precisao,
     * sendo os dois dados pelo usuario.
     * @param numero O numero que sera aplicada a raiz quadrada
     * @param precisao Precisao da operacao
     * @throws IllegalArgumentException Se n ou i forem menor que 0
     * @return Retorna a raiz quadrada de n
    */
    public static int raiz(final int numero, final int precisao) {
        if (numero < 0 || precisao < 0) {
            throw new IllegalArgumentException("Numero fora da faixa esperada");
        }
        int r = 1;
        int k = precisao;
        while (0 <= k) {
            r = (r + numero / r) / 2;
            k -= 1;
        }
        return r;
    }
}
