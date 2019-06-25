/**
 * Calcula a raiz quadrada de um numero 'n' com 'i' precisao, sendo os dois dados pelo usuario
 * 
 * @param {number} n O numero que sera aplicada a raiz quadrada
 *
 * @param {number} i Precisao da operacao
 *
 * @returns {number} Retorna a raiz quadrada de n
 * 
 * @throws {Error} Se uma das entradas for nula ou nao definida
 * @throws {TypeError} Se uma das entradas não for numero
 * @throws {RangeError} Se uma das entradas não for inteiro
 * @throws {RangeError} Se n ou i forem menor que 0
 */
function raiz(n , i) {
    if (n == null || n == undefined || i == null || i == undefined) {
        throw new Error("Entrada invalidada, null e undefined nao sao entradas validas");
    }
    if (typeof(n) !== "number" || typeof(i) !== "number") {
        throw new TypeError("Entrada nao e um numero");
    }
    if (Math.trunc(n) != n || Math.trunc(i) != i) {
        throw new RangeError("Numero nao e inteiro");
    }
    if (n < 0 || i < 0) {
        throw new RangeError("Numero fora da faixa esperada");
    }
    let r = 1;
    while (i >= 0) {
        r = (r + n/r) / 2;
        i = i - 1;
    }
    return r;
}
module.exports = raiz;