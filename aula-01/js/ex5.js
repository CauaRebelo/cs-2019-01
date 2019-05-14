/**
 * Calcula a soma dos primeiros naturais, N = {0, 1, 2 ...}
 * 
 * @param {number} numero A quantidade dos primeiros numeros naturais a serem somados 
 * 
 * @returns {number} Retorna o resultado da soma
 *
 * @throws {Error} Se a entrada for nula ou nao definida
 * @throws {TypeError} Se a entrada não for numero
 * @throws {RangeError} Se o numero não for inteiro
 * @throws {RangeError} Se numero for menor que 1
 */
function SomaNaturais(numero) {
    if (numero == null || numero == undefined) {
        throw new Error("Entrada invalidada, null e undefined nao sao entradas validas");
    }
    if (typeof(numero) !== "number") {
        throw new TypeError("Entrada nao e um numero");
    }
    if (Math.trunc(numero) != numero) {
        throw new RangeError("Numero nao e inteiro");
    }
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
module.exports = SomaNaturais;