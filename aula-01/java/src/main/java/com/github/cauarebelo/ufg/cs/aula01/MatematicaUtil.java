package com.github.cauarebelo.ufg.cs.aula01;
import java.time.LocalDate;
import java.time.DateTimeException;
/**
 * Algoritmos uteis de Matematica
*/
@SuppressWarnings({"PMD.DataflowAnomalyAnalysis", "PMD.AvoidLiteralsInIfCondition"})
public final class MatematicaUtil {

    /**
     * Para checkstyle.
     */
    private MatematicaUtil() {
    // Esse construtor esta vazio de proposito
    }
    /**
     * Verifica se numéro satisfaz propriedade 3025.
     * @param numero variavel a ser verificada
     * @throws IllegalArgumentException caso entrada seja menor que 0
     * ou maior que 999
     * @return O valor verdadeiro se o argumento fornecido
     * satisfaz a propriedade 3025 e, o valor falso, caso contrário
    */
    public static boolean propriedade3025(final int numero) {
        final int limiteMaximo = 9999;
        if (numero <= 0 || numero > limiteMaximo) {
            throw new IllegalArgumentException("numero deve ser maior que 0 e menor que 9999");
        }
        final int auxiliar1 = 100;
        final int div = numero / auxiliar1;
        final int mult = numero % auxiliar1;
        return numero == (div + mult) * (div + mult);
    }

    /**
     * Aplica a propriedade 153 ao numéro desejado, ou seja, a soma do cubo de
     * cade um de seus digitos e igual ao propio numéro, um exemplo seria
     * o propio numéro 153 onde 1^3+5^3+3^3=153.
     * @param numero Numéro a eser usado na operacao
     * @throws IllegalArgumentException Se a entrada for nula ou nao definida
     * @return Se o numéro se aplica a propriedade 153 ou nao
    */
    public static boolean propriedade153(final int numero) {
        final int limiteMinimo = 100;
        final int limiteMaximo = 999;
        if (numero <= limiteMinimo || numero >= limiteMaximo) {
            throw new IllegalArgumentException("Numero deve ser maior que 100 e menor que 999");
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
     * @throws IllegalArgumentException Se a data nao for válida
     * @return Retorna o dia da semana, sendo 0 segunda ate 6 como domingo
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
     * Informa se a data e inválida.
     * @param dia Dia desejado
     * @param mes O mês desejado
     * @param ano O ano desejado
     * @throws IllegalArgumentException Se o dia nao for valido
     * @throws IllegalArgumentException Se o mês nao for valido
     * @throws IllegalArgumentException Se o ano nao for valido
     * @throws IllegalArgumentException Se houver uma DataTimeException
    */
    public static void dataInval(final int dia, final int mes, final int ano) {
        final int diaMax = 31;
        if (dia < 1 || dia > diaMax) {
            throw new IllegalArgumentException("Dia invalido");
        }
        final int mesMax = 12;
        if (mes < 1 || mes > mesMax) {
            throw new IllegalArgumentException("mês invalido");
        }
        final int anoMinimo = 1753;
        if (anoMinimo >= ano) {
            throw new IllegalArgumentException("Ano invalido");
        }
        try {
            LocalDate.of(ano, mes, dia);
        } catch (DateTimeException exp) {
            final String data = String.format("%d/%d/%d", dia, mes, ano);
            throw new IllegalArgumentException("Data inválida" + data, exp);
        }
    }

    /**
     * Encontra o módulo, ou seja resto da divisão, de um tal numéro
     * com seu divisor.
     * @param dividendo Numéro que vai ser aplicado o módulo
     * @param divisor Numéro que vai dividir o dividendo
     * @throws IllegalArgumentException Se o dividendo for menor ou igual
     * a 0 ou se o divisor for menor que 0
     * @return Retorna o módulo, ou seja, resto da divisão
    */
    public static int mod(final int dividendo, final int divisor) {
        if (dividendo < 0 || divisor <= 0) {
            throw new IllegalArgumentException("Dividendo ou divisor invalido");
        }
        int resto = dividendo;
        while (resto >= divisor) {
            resto = resto - divisor;
        }
        return resto;
    }

    /**
     * Calcula a soma dos primeiros naturais, N = {0, 1, 2 ...}.
     * @param numero A quantidade dos primeiros numéros naturais somados
     * @throws IllegalArgumentException Se o numéro for menor que 1
     * @return Retorna o resultado da soma
    */
    public static int somaNaturais(final int numero) {
		final int somaMaxima = 1;
        if (numero < somaMaxima) {
            throw new IllegalArgumentException("Numero deve ser maior que 0");
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
     * Multiplicar a quantidade de numéro naturais em ordem baseado no
     * numéro dado pelo usuário.
     * @param numero A quantidade de numéros naturais a serem somados
     * @throws IllegalArgumentException Se numéro for menor que 1
     * @return Retorna o Fatorial do numéro
    */
    public static int fatorial(final int numero) {
		final int numeroMaximo = 1;
        if (numero < numeroMaximo) {
            throw new IllegalArgumentException("Numero deve ser maior que 0");
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
     * Multiplica dois numéro, somando o primeiro numéro com ele mêsmo
     * baseado no multiplicador, retornando o resultado da multiplicacao.
     * @param multcando O numéro a ser somado multiplicador vezes
     * @param multcador A quantidade de vezes que o multiplicando
     * vai ser somado com ele mêsmo
     * @throws IllegalArgumentException Se a for menor que zero ou b for
     * menor que zero
     * @return Retorna o resultado da soma, ou seja o resultado do produto
    */
    public static int produto(final int multcando, final int  multcador) {
        if (multcando < 0 || multcador < 0) {
            throw new IllegalArgumentException("numéros devem ser maior que 0");
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
     * Multiplica o primeiro numéro com ele mêsmo baseado no expoente,
     * conhecido como potencia, ou efetivamente base ^ expoente.
     * @param base O numéro a ser multiplicado expoente vezes
     * @param expoente A quantidade de vezes que a vai ser multiplicado
     * com ele mêsmo
     * @throws IllegalArgumentException Se a for menor que zero ou b
     * for menor que zero
     * @return Retorna o resultado da multiplicacao, ou seja, sua potencia
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
     * Retorna o pi com uma precisao baseada no numéro.
     * @param numero Precisao do resultado
     * @throws IllegalArgumentException Se numéro for menor ou igual a 1
     * @return Retorna pi com numéro precisao
    */
    public static int pi(final int numero) {
        if (numero <= 1) {
            throw new IllegalArgumentException("numéro deve ser maior que 1");
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
     * Retorna o logaritmo natural de numéro com certa precisao.
     * @param numero numéro a ser usado no logaritmo natural
     * @param precisao Precisao do resultado
     * @throws IllegalArgumentException Se numéro for menor que 1 ou se
     * precisao for menor que 2
     * @return Retorna o logaritmo natural limitado a precisao
    */
    public static int logaritmoNatural(final int numero, final int precisao) {
        if (numero < 1 || precisao < 2) {
            throw new IllegalArgumentException("numero deve ser maior que 0 e precisao maior que 1");
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
     * FIXME Apenas para reiterar: acentuar corretamente as palavras.
     *
     * Retorna a razao aurea de 2 numéros, ou seja, somar dois numéros,
     * e logo em seguida somar os dois ultimos numéros dado pela razao,
     * ate chegar nos ultimos definidos por k, numéro dado pelo usuario,
     * e faz a razao dos dois ultimos numéros.
     * @param num Primeiro numéro a ser somado
     * @param num2 Segundo numéro a ser somado
     * @param qua A quantidade de vezes que serao somados
     * @throws IllegalArgumentException Se x for menor que 0 ou se y for
     * menor que x ou se k for menor que 0
     * @return Retorna o resultado da razao aurea
    */
    public static int razaoAurea(final int num, final int num2, final int qua) {
        if (num < 0 || num2 < num || qua < 0) {
            throw new IllegalArgumentException("Numeros invalidos");
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
     * Descobre se o numéro é um quadrado perfeito.
     * @param numero O numéro que o usuario deseja saber se faz parte dos
     * numéros que são quadrados perfeitos
     * @throws IllegalArgumentException Se n for menor que 1
     * @return Define se o numero e quadrado perfeito ou nao
    */
    public static boolean quadradoPerfeito(final int numero) {
        if (numero <= 0) {
            throw new IllegalArgumentException("Numero fora da faixa esperada");
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
     * Calcula a raiz quadrada de um numéro com uma certa precisao,
     * sendo os dois dados pelo usuario.
     * @param numero O numéro que sera aplicada a raiz quadrada
     * @param precisao Precisao da operacao
     * @throws IllegalArgumentException Se n ou i forem menor que 0
     * @return Retorna a raiz quadrada de n
    */
    public static int raiz(final int numero, final int precisao) {
        if (numero < 0 || precisao < 0) {
            throw new IllegalArgumentException("numéro ou precisao invalidos");
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
     * Calcula se um numéro é primo.
     * @param numero número a ser calculado
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
     * Algoritmo que encontra números primos.
     * @param array vetor de zeros com o tamanho do número a ser checado
     * @throws IllegalArgumentException caso o tamanho do vetor for
     * menor ou igual a 1 ou vetor não estiver zerado
     * @return vetor com resultado calculado
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
     * Verificar se um Array é null
     * @param array Vetor
     */
    public static void arrayNull(final int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("array is null");
        }
    }

    /**
     * Verifica se um array tem o tamanho errado
     * @param array Vetor
     */
    public static void arrayTamanho(final int[] array) {
        final int arrayTamMin = 1;
        if (array.length < arrayTamMin) {
            throw new IllegalArgumentException("Tamanho do array inválido");
        }
    }

    /**
     * Calcula o maior divisor comum entre a e b.
     * @param numero1 número inteiro que será utilizado para o mdc
     * @param numero2 número inteiro que será utilizado para o mdc
     * @throws IllegalArgumentException caso b seja maior que a,
     * ou b menor que 0
     * @return o valor do mdc entre a e b
     */
    public static int mdc(final int numero1, final int numero2) {

        if (numero1 < numero2) {
            throw new IllegalArgumentException("O primeiro numero deve"
			+ "ser menor que o segundo");
        }

        if (numero2 < 0) {
            throw new IllegalArgumentException("Numero 2 invalido");
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
     * @param numero1 número inteiro que será utilizado para o mdc
     * @param numero2 número inteiro que será utilizado para o mdc
     * @throws IllegalArgumentException caso b seja maior que a,
     * ou b menor que 0
     * @return o valor do mdc
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
                auxiliar1 = auxilir1 - auxiliar2;
            } else {
                auxiliar2 = auxiliar2 - auxiliar1;
            }
        }

        return auxiliar1;
    }

    /**
     * Regra de Horner para avaliação polinomial.
     * @param numero variável para obter uma aproximação
     * @param tam tamanho do polinômio
     * @param array coeficientes do polinômio
     * @throws IllegalArgumentException caso g seja menor que 1
     * @return o valor calculado pelo método de horner
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
     * @param enesimoTermo variável a ser calculada
     * @throws IllegalArgumentException caso entrada seja menor que 0
     * @return o n-esimo número de Fibonacci
     */
    public static int fibonacci(final int enesimoTermo) {
        if (enesimoTermo < 0) {
            throw new IllegalArgumentException("Intervalo do numero invalido");
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
     * Transforma cpf em string
     * @param d cpf como string
     * @return cpf como vetor
     */
    public static int[] cpfStringToArray(final String d) {
        final int aux11 = 11;
        int[] cpf = new int[aux11];
        for (int i = 0; i < d.length(); i++) {
            cpf[i] = Character.getNumericValue(d.charAt(i));
        }
        return cpf;
    }

    /**
     * Algoritmo que certifica se o CPF é válido.
     * @param cpf CPF a ser verificado
     * @throws IllegalArgumentException caso entrada tenha
     * mais ou menos que 11 dígitos
     * @return caso CPF seja verdadeiro retorna true
     */
    public static boolean cpf(final String cpf) {
        final int aux11 = 11;
        if (cpf.length() > aux11 || cpf.length() < aux11) {
            throw new IllegalArgumentException("O CPF deve conter 11 dígitos");
        }

        final int[] d = cpfStringToArray(cpf);
        final int terceiroDigito = 3;
        final int quartoDigito = 4;
        final int quintoDigito = 5;
        final int sextoDigito = 6;
        final int setimoDigito = 7;
        final int oitavoDigito = 8;
        final int nonoDigito = 9;
        final int decimoDigito = 10;

        final int j =  d[0] + 2 * d[1] + terceiroDigito * d[2] + quartoDigito 
		            * d[terceiroDigito] + quintoDigito * d[quartoDigito] + sextoDigito * d[quintoDigito]
					+ setimoDigito * d[sextoDigito] + oitavoDigito * d[setimoDigito] + nonoDigito
					* d[oitavoDigito];

        final int k = d[1] + 2 * d[2] + terceiroDigito * d[terceiroDigito] + quartoDigito
                    * d[quartoDigito] + quintoDigito * d[quintoDigito] + sextoDigito
                    * d[sextoDigito] + setimoDigito * d[setimoDigito] + oitavoDigito
                    * d[oitavoDigito] + nonoDigito * d[nonoDigito];

        final int dj = (j % aux11) % decimoDigito;
        final int dk = (k % aux11) % decimoDigito;

        return dj == d[nonoDigito] && dk == d[decimoDigito];
    }

    /**
     * Algoritmo que certifica se o CPF é válido.
     * @param cpf CPF a ser verificado
     * @throws IllegalArgumentException caso entrada tenha
     * mais ou menos que 11 dígitos
     * @return caso CPF seja verdadeiro retorna true
     */
    public static boolean cpf2(final String cpf) {
        final int aux11 = 11;
        if (cpf.length() < aux11 || cpf.length() > aux11) {
            throw new IllegalArgumentException("O CPF deve conter 11 dígitos");
        }

        final int[] d = cpfStringToArray(cpf);
        final int setimoDigito = 7;
        final int oitavoDigito = 8;
        final int nonoDigito = 9;
        final int decimoDigito = 10;

        int aux7 = setimoDigito;
        int auxiliar1 = d[oitavoDigito];
        int auxiliar2 = d[oitavoDigito];

        while (aux7 >= 0) {
            auxiliar1 += d[aux7];
            auxiliar2 += auxiliar1;
            aux7 -= 1;
        }

        final int j = (auxiliar2 % aux11) % decimoDigito;
        final int k = ((auxiliar2 - auxiliar1 + nonoDigito
                      * d[nonoDigito]) % aux11) % decimoDigito;

        return j == d[nonoDigito] && k == d[decimoDigito];
    }
}
