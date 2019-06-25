/**
 * Descobre se o numero é um quadrado perfeito
 * 
 * @param {number} n O numero que o usuario deseja saber se faz parte dos numeros que são quadrados perfeitos
 *
 * @returns {boolean} Define se o numero e quadrado perfeito ou nao
 * 
 * @throws {Error} Se a entrada for nula ou nao definida
 * @throws {TypeError} Se a entrada não for numero
 * @throws {RangeError} Se o n não for inteiro
 * @throws {RangeError} Se n for menor que 1
 */
function quadradoPerfeito(n) {
    if (n == null || n == undefined) {
        throw new Error("Entrada invalidada, null e undefined nao sao entradas validas");
    }
    if (typeof(n) !== "number") {
        throw new TypeError("Entrada nao e um numero");
    }
    if (Math.trunc(n) != n) {
        throw new RangeError("Numero nao e inteiro");
    }
    if (n < 1) {
        throw new RangeError("Numero fora da faixa esperada");
    }
    let i = 1;
    let s = 1;
    while (n > s) {
        i = i + 2;
        s = s + i;
    }
    return s == n;
}
module.exports = quadradoPerfeito;