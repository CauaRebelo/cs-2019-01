package com.github.cauarebelo.ufg.cs.aula01;

import java.time.LocalDate;
import java.time.DateTimeException;
import java.util.Objects;
import java.time.temporal.ChronoField;

/**
 * Algoritmos úteis de Matemática.
*/
@SuppressWarnings({"PMD.DataflowAnomalyAnalysis"})
public final class MatematicaUtils {

    /**
     * Para checkstyle.
     */
    private MatematicaUtils() {
    // Esse construtor está vazio de proposito
    }

    /**
     * Verifica se número satisfaz propriedade 3025.
     * @param numero variável a ser verificada
     * @throws IllegalArgumentException caso entrada seja menor que 0
     * ou maior que 999
     * @return O valor verdadeiro se o argumento fornecido
     * satisfaz a propriedade 3025 e, o valor falso, caso contrário
    */
    public static boolean propriedade3025(final int numero) {
        final int limiteMaximo = 9999;
        if (numero <= 0 || numero > limiteMaximo) {
            throw new IllegalArgumentException("Número deve ser maior que 0 e menor que 9999");
        }
        final int auxiliar1 = 100;
        final int div = numero / auxiliar1;
        final int mult = numero % auxiliar1;
        return numero == (div + mult) * (div + mult);
    }

    /**
     * Aplica a propriedade 153 ao número desejado, ou seja, a soma do cubo de
     * cade um de seus dígitos e igual ao propio número, um exemplo seria
     * o propio número 153 onde 1^3+5^3+3^3=153.
     * @param numero Número a eser usado na operação
     * @throws IllegalArgumentException Se a entrada for nula ou não definida
     * @return Se o número se aplica a propriedade 153 ou não
    */
    public static boolean propriedade153(final int numero) {
        final int limiteMinimo = 100;
        final int limiteMaximo = 999;
        if (numero <= limiteMinimo || numero >= limiteMaximo) {
            throw new IllegalArgumentException("Número deve ser maior que 100 e menor que 999");
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
     * @param mes O mês desejado
     * @param ano O ano desejado
     * @throws IllegalArgumentException Se a data não for válida
     * @return Retorna o dia da semana, sendo 0 segunda até 6 como domingo
    */
    public static int diaDaSemana(final int dia, final int mes, final int ano) {
        dataInval(dia, mes, ano);
        final int varDia = 2;
        final int varMes = 3;
        final int varAno = 5;
        final int varDivisao = 4;
        final int varDivisaoMeio = 100;
        final int varDivisaoMaior = 400;
        final int diasem = dia + varDia * mes + varMes * (mes + 1) / varAno + ano
        + ano / varDivisao - ano / varDivisaoMeio + ano / varDivisaoMaior;
        final int semana = 7;
        return diasem % semana;
    }

    /**
     * Informa se a data fornecida é inválida
     * @param dia Dia fornecido
     * @param mes Mês fornecido
     * @param ano Ano fornecido
     * @throws IllegalArgumentException Se o dia não for válido
     * @throws IllegalArgumentException Se o mês não for válido
     * @throws IllegalArgumentException Se o ano não for válido
     * @throws IllegalArgumentException Se a data fornecida não
     * for válida
    */
    public static void dataInval(final int dia, final int mes, final int ano) {
        final int diaMax = 31;
        if (dia < 1 || dia > diaMax) {
            throw new IllegalArgumentException("Dia inválido");
        }
        final int mesMax = 12;
        if (mes < 1 || mes > mesMax) {
            throw new IllegalArgumentException("Mês inválido");
        }
        final int anoMinimo = 1753;
        if (anoMinimo >= ano) {
            throw new IllegalArgumentException("Ano inválido");
        }

        try {
            LocalDate.of(ano, mes, dia);
        } catch (DateTimeException exp) {
            final String data = String.format("%d/%d/%d", dia, mes, ano);
            throw new IllegalArgumentException("Data inválida" + data, exp);
        }
    }

    /**
     * Encontra o módulo, ou seja resto da divisão, de um tal número
     * com seu divisor.
     * @param dividendo Número que vai ser aplicado o módulo
     * @param divisor Número que vai dividir o dividendo
     * @throws IllegalArgumentException Se o dividendo for menor ou igual
     * a 0 ou se o divisor for menor que 0
     * @return Retorna o módulo, ou seja, resto da divisão
    */
    public static int mod(final int dividendo, final int divisor) {
        if (dividendo < 0 || divisor <= 0) {
            throw new IllegalArgumentException("Dividendo ou divisor inválido");
        }
        int resto = dividendo;
        while (resto >= divisor) {
            resto = resto - divisor;
        }
        return resto;
    }

    /**
     * Calcula a soma dos primeiros naturais, N = {0, 1, 2 ...}.
     * @param numero A quantidade dos primeiros números naturais somados
     * @throws IllegalArgumentException Se o número for menor que 1
     * @return Retorna o resultado da soma
    */
    public static int somaNaturais(final int numero) {
        final int somaMaxima = 1;
        if (numero < somaMaxima) {
            throw new IllegalArgumentException("Número deve ser maior que 0");
        }
        int a = 2;
        int b = 1;
        while (numero >= a) {
            b = b + a;
            a++;
        }
        return b;
    }

    /**
     * Multiplicar a quantidade de número naturais em ordem baseado no
     * número dado pelo usuário.
     * @param numero A quantidade de números naturais a serem somados
     * @throws IllegalArgumentException Se número for menor que 1
     * @return Retorna o Fatorial do número
    */
    public static int fatorial(final int numero) {
        final int numeroMaximo = 1;
        if (numero < numeroMaximo) {
            throw new IllegalArgumentException("Número deve ser maior que 0");
        }
        int a = 2;
        int b = 1;
        while (numero >= a) {
            b = b * a;
            a++;
        }
        return b;
    }

    /**
     * Multiplica dois número, somando o primeiro número com ele mesmo
     * baseado no multiplicador, retornando o resultado da multiplicação.
     * @param multcando O número a ser somado multiplicador vezes
     * @param multcador A quantidade de vezes que o multiplicando
     * vai ser somado com ele mesmo
     * @throws IllegalArgumentException Se a for menor que zero ou b for
     * menor que zero
     * @return Retorna o resultado da soma, ou seja o resultado do produto
    */
    public static int produto(final int multcando, final int  multcador) {
        if (multcando < 0 || multcador < 0) {
            throw new IllegalArgumentException("Números devem ser maior que 0");
        }
        int c = multcando;
        int d = multcador;
        if (multcando > multcador) {
            c = multcador;
            d = multcando;
        }
        int e = 1;
        int f = 0;
        while (c >= e) {
            f = f + d;
            e++;
        }
        return f;
    }

    /**
     * Multiplica o primeiro número com ele mesmo baseado no expoente,
     * conhecido como potência, ou efetivamente base ^ expoente.
     * @param base O número a ser multiplicado expoente vezes
     * @param expoente A quantidade de vezes que a vai ser multiplicado
     * com ele mêsmo
     * @throws IllegalArgumentException Se a for menor que zero ou b
     * for menor que zero
     * @return Retorna o resultado da multiplicação, ou seja, sua potência
    */
    public static int potencia(final int base, final int expoente) {
        if (base < 0 || expoente < 0) {
            throw new IllegalArgumentException("A base e o expoente devem ser maiores que 0");
        }
        int c = 1;
        int d = 1;
        while (expoente >= d) {
            c = produto(c, base);
            d++;
        }
        return c;
    }

    /**
     * Retorna o pi com uma precisão baseada no número.
     * @param numero Precisão do resultado
     * @throws IllegalArgumentException Se número for menor ou igual a 1
     * @return Retorna pi com número precisão
    */
    public static int pi(final int numero) {
        if (numero <= 1) {
            throw new IllegalArgumentException("Número deve ser maior que 1");
        }
        final int auxiliar1 = 4;
        int i = 1;
        int s = -1;
        int d = -1;
        int p = 0;
        while (numero >= i) {
            d = d + 2;
            s = -1 * s;
            p = p + auxiliar1 * s / d;
            i = i + 1;
        }
        return p;
    }

    /**
     * Retorna o logaritmo natural de número com certa precisão.
     * @param numero número a ser usado no logaritmo natural
     * @param precisao Precisão do resultado
     * @throws IllegalArgumentException Se número for menor que 1 ou se
     * precisão for menor que 2
     * @return Retorna o logaritmo natural limitado a precisão
    */
    public static int logaritmoNatural(final int numero, final int precisao) {
        if (numero < 1 || precisao < 2) {
            throw new IllegalArgumentException("Número deve ser maior que 0 e precião maior que 1");
        }
        int i = 2;
        int e = 1 + numero;
        int numerador = numero;
        int denominador = 1;
        while (precisao >= i) {
            numerador = numerador * numerador;
            denominador = denominador * i;
            e = e + numerador / denominador;
            i = i + 1;
        }
        return e;
    }

    /**
     * Retorna a razão aurea de 2 números, ou seja, somar dois números,
     * e logo em seguida somar os dois últimos números dado pela razão,
     * até chegar nos últimos definidos por k, número dado pelo usuario,
     * e faz a razão dos dois últimos números.
     * @param num Primeiro número a ser somado
     * @param num2 Segundo número a ser somado
     * @param qua A quantidade de vezes que serão somados
     * @throws IllegalArgumentException Se x for menor que 0 ou se y for
     * menor que x ou se k for menor que 0
     * @return Retorna o resultado da razão áurea
    */
    public static int razaoAurea(final int num, final int num2, final int qua) {
        if (num < 0 || num2 < num || qua < 0) {
            throw new IllegalArgumentException("Números inválidos");
        }
        int c = num2;
        int a = num;
        int i = 1;
        int t = c;
        while (qua >= i) {
            t = c;
            c = c + a;
            a = t;
            i = i + 1;
        }
        return c / a;
    }

    /**
     * Descobre se o número é um quadrado perfeito.
     * @param numero O número que o usuario deseja saber se faz parte dos
     * números que são quadrados perfeitos
     * @throws IllegalArgumentException Se n for menor que 1
     * @return Define se o número e quadrado perfeito ou não
    */
    public static boolean quadradoPerfeito(final int numero) {
        if (numero <= 0) {
            throw new IllegalArgumentException("Número fora da faixa esperada");
        }
        int i = 1;
        int s = 1;
        while (numero > s) {
            i = i + 2;
            s = s + i;
        }
        return s == numero;
    }

    /**
     * Calcula a raiz quadrada de um número com uma certa precisão,
     * sendo os dois dados pelo usuario.
     * @param numero O número que sera aplicada a raiz quadrada
     * @param precisao Precisão da operação
     * @throws IllegalArgumentException Se n ou i forem menor que 0
     * @return Retorna a raiz quadrada de n
    */
    public static int raiz(final int numero, final int precisao) {
        if (numero < 0 || precisao < 0) {
            throw new IllegalArgumentException("Número ou precisão inválidos");
        }
        int r = 1;
        int k = precisao;
        while (k >= 0) {
            r = (r + numero / r) / 2;
            k = k - 1;
        }
        return r;
    }

    /**
     * Calcula se um número é primo.
     * @param numero Número a ser calculado
     * @throws IllegalArgumentException caso entrada seja menor que 1
     * @return true caso entrada seja um número primo
     */
    public static boolean primo(final int numero) {
        final int numMin = 1;
        if (numero < numMin) {
            throw new IllegalArgumentException(
                "Intervalo de número inválido");
        }

        int aux = 2;

        while (numero > aux) {
            if (numero % aux == 0) {
                return false;
            }
            aux += 1;
        }

        return true;
    }

    /**
     * Encontra números primos.
     * @param array Vetor de zeros com o tamanho do número a ser checado
     * @throws IllegalArgumentException caso o tamanho do vetor for
     * menor ou igual a 1 ou vetor não estiver zerado
     * @return Vetor com resultado calculado
     */
    public static int[] crivoEratostenes(final int[] array) {
        arrayNull(array);
        arrayTamanho(array);

        int contador = 2;
        final int limite = (int) Math.floor(Math.sqrt(array.length));

        while (contador <= limite) {

            int multiplo = contador + contador;

                while (multiplo <= array.length) {
                    array[multiplo] = 1;
                    multiplo += contador;
                }

            contador += 1;
        }

        return array;
    }

    /**
     * Verifica se um dado array é considerado nulo
     * @param array Vetor a ser verificado
     * @throws IllegalArgumentException Se o vetor for nulo
     */
    public static void arrayNull(final int[] array) {
        try {
            Objects.requireNonNull(array);
        } catch (NullPointerException exp) {
            throw new IllegalArgumentException("String nula" + exp);
        }
    }

    /**
     * Verifica se um array tem o tamanho errado, ou seja se tem um tamanho
     * menor que 1 (incluindo vazio)
     * @param array Vetor a ser verificado
     * @throws IllegalArgumentException Se o tamanho do array for menor que 1
     */
    public static void arrayTamanho(final int[] array) {
        final int arrayTamMin = 1;
        if (array.length < arrayTamMin) {
            throw new IllegalArgumentException("Tamanho do array inválido");
        }
    }

    /**
     * Calcula o maior divisor comum entre a e b.
     * @param numero1 Número inteiro que será utilizado para o mdc
     * @param numero2 Número inteiro que será utilizado para o mdc
     * @throws IllegalArgumentException Caso b seja maior que a,
     * ou b menor que 0
     * @return O valor do mdc entre a e b
     */
    public static int mdc(final int numero1, final int numero2) {

        if (numero1 < numero2) {
            throw new IllegalArgumentException("O primeiro número deve"
                              + "ser menor que o segundo");
        }

        if (numero2 < 0) {
            throw new IllegalArgumentException("Número 2 inválido");
        }

        int auxiliar1 = numero1;
        int auxiliar2 = numero2;

        while (auxiliar2 != 0) {
            final int temporario = auxiliar1 % auxiliar2;
            auxiliar1 = auxiliar2;
            auxiliar2 = temporario;
        }

        return auxiliar1;
    }

    /**
     * Calcula outra forma de achar o maior divisor comum entre a e b.
     * @param numero1 Número inteiro que será utilizado para o mdc
     * @param numero2 Número inteiro que será utilizado para o mdc
     * @throws IllegalArgumentException Caso b seja maior que a,
     * ou b menor que 0
     * @return O valor do mdc
     */
    public static int mdc2(final int numero1, final int numero2) {

        if (numero1 < numero2) {
            throw new IllegalArgumentException("O primeiro numero deve"
                              + "ser menor que o segundo");
        }

        if (numero2 < 0) {
            throw new IllegalArgumentException("Numero 2 invalido");
        }

        int auxiliar1 = numero1;
        int auxiliar2 = numero2;
        while (auxiliar1 != auxiliar2) {
            if (auxiliar1 > auxiliar2) {
                auxiliar1 = auxiliar1 - auxiliar2;
            } else {
                auxiliar2 = auxiliar2 - auxiliar1;
            }
        }

        return auxiliar1;
    }

    /**
     * Regra de Horner para avaliação polinomial.
     * @param numero Variável para obter uma aproximação
     * @param tam Tamanho do polinômio
     * @param array Coeficientes do polinômio
     * @throws IllegalArgumentException Caso g seja menor que 1
     * @return O valor calculado pelo método de horner
     */
    public static int horner(final int numero,
                             final int tam, final int[] array) {
        final int tamMinimo = 1;
        if (tam < tamMinimo) {
            throw new IllegalArgumentException("Tamanho invalido");
        }
        if (array == null) {
            throw new IllegalArgumentException("array is null");
        }

        int polinomio = array[tam];
        int contador = tam - 1;

        while (contador >= 0) {
            polinomio = polinomio * numero + array[contador];
            contador = contador - 1;
        }

        return polinomio;
    }

    /**
     * Algoritmo que calcula o n-esimo número de Fibonacci.
     * @param enesimoTermo Variável a ser calculada
     * @throws IllegalArgumentException Caso entrada seja menor que 0
     * @return O n-esimo número de Fibonacci
     */
    public static int fibonacci(final int enesimoTermo) {
        if (enesimoTermo < 0) {
            throw new IllegalArgumentException("Intervalo do número inválido");
        }

        if (enesimoTermo == 0 || enesimoTermo == 1) {
            return enesimoTermo;
        }

        int proxTermo = 0;
        int atualTermo = 1;
        int contador = 2;
        while (contador <= enesimoTermo) {
            final int t = atualTermo;
            atualTermo = atualTermo + proxTermo;
            proxTermo = t;
            contador += 1;
        }

        return atualTermo;
    }

    /**
     * Transforma cpf em string.
     * @param d cpf como string
     * @return cpf como vetor
     */
    public static int[] cpfStringToArray(final String d) {
        final int tamCpf = 11;
        int[] cpf = new int[tamCpf];
        for (int i = 0; i < d.length(); i++) {
            cpf[i] = Character.getNumericValue(d.charAt(i));
        }
        return cpf;
    }

    /**
     * Certifica se o CPF é válido.
     * @param cpf CPF a ser verificado
     * @throws IllegalArgumentException Caso entrada tenha
     * mais ou menos que 11 dígitos
     * @return Caso CPF seja verdadeiro retorna true
     */
    public static boolean cpf(final String cpf) {
        final int tamCpf = 11;
        if (cpf.length() != tamCpf) {
            throw new IllegalArgumentException("O CPF deve conter 11 dígitos");
        }

        final int[] d = cpfStringToArray(cpf);
        final int terceiroIndice = 3;
        final int quartoIndice = 4;
        final int quintoIndice = 5;
        final int sextoIndice = 6;
        final int setimoIndice = 7;
        final int oitavoIndice = 8;
        final int nonoIndice = 9;
        final int decimoIndice = 10;

        final int j = d[0] + 2 * d[1] + terceiroIndice * d[2] + quartoIndice
                            * d[terceiroIndice] + quintoIndice * d[quartoIndice] + sextoIndice * d[quintoIndice]
                            + setimoIndice * d[sextoIndice] + oitavoIndice * d[setimoIndice] + nonoIndice
                            * d[oitavoIndice];

        final int k = d[1] + 2 * d[2] + terceiroIndice * d[terceiroIndice] + quartoIndice
                    * d[quartoIndice] + quintoIndice * d[quintoIndice] + sextoIndice
                    * d[sextoIndice] + setimoIndice * d[setimoIndice] + oitavoIndice
                    * d[oitavoIndice] + nonoIndice * d[nonoIndice];

        final int dj = (j % tamCpf) % decimoIndice;
        final int dk = (k % tamCpf) % decimoIndice;

        return dj == d[nonoIndice] && dk == d[decimoIndice];
    }

    /**
     * Algoritmo que certifica se o CPF é válido.
     * @param cpf CPF a ser verificado
     * @throws IllegalArgumentException Caso entrada tenha
     * mais ou menos que 11 dígitos
     * @return Caso CPF seja verdadeiro retorna true
     */
    public static boolean cpf2(final String cpf) {
        final int tamCpf = 11;
        if (cpf.length() != tamCpf) {
            throw new IllegalArgumentException("O CPF deve conter 11 dígitos");
        }

        final int[] d = cpfStringToArray(cpf);
        final int setimoIndice = 7;
        final int oitavoIndice = 8;
        final int nonoIndice = 9;
        final int decimoIndice = 10;

        int aux7 = setimoIndice;
        int auxiliar1 = d[oitavoIndice];
        int auxiliar2 = d[oitavoIndice];

        while (aux7 >= 0) {
            auxiliar1 += d[aux7];
            auxiliar2 += auxiliar1;
            aux7 -= 1;
        }

        final int j = (auxiliar2 % tamCpf) % decimoIndice;
        final int k = ((auxiliar2 - auxiliar1 + nonoIndice
                      * d[nonoIndice]) % tamCpf) % decimoIndice;

        return j == d[nonoIndice] && k == d[decimoIndice];
    }
}

