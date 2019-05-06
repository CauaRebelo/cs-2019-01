/**
 * Calcula a soma dos primeiros naturais, N = {0, 1, 2 ...}
 * 
 * @param {number} numero A quantidade dos primeiros numeros naturais a serem somados 
 * 
 * @returns {number} Retorna o resultado da soma
 * 
 * @throws {RangeError} Se numero for menor que 1
 */
function SomaNaturais(numero) {
    if (numero < 1) {
        throw new RangeError("Numero fora da faixa esperada");
    }
    let a = 2;
    let b = 1;
    while (a <= numero) {
    	b += a;
    	a++;
    }
    return b;
}