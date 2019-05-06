/**
 * Multiplicar a quantidade de numero naturais em ordem baseado no numero dado pelo usuário 
 * 
 * @param {number} numero A quantidade de numeros naturais a serem somados
 *
 * @returns {number} Retorna a Fatorial do numero, ou seja o resultado da multiplicacao
 * 
 * @throws {RangeError} Se numero for menor que 1
 */
function Fatorial(numero) {
    if (numero < 1) {
        throw new RangeError("Numero fora da faixa esperada");
    }
    let a = 2;
    let b = 1;
    while (a <= numero) {
    	b *= a;
    	a++;
    }
    return b;
}
