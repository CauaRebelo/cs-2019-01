/**
 * Encontra o modulo, ou seja resto da divisao, de um tal numero com seu divisor
 * 
 * @param {number} x Numero que vai ser aplicado o modulo
 * @param {number} y Divisor
 * 
 * @returns {number} Retorna o modulo, ou seja, resto da divisao
 * 
 * @throws {Error} Se uma das entradas for nula ou nao definida
 * @throws {TypeError} Se uma das entradas não for numero
 * @throws {RangeError} Se uma das entradas não for inteiro
 * @throws {RangeError} Se x for menor ou igual a 0 ou se y for menor que 0
 */
function mod(x, y) {
    if (x == null || x == undefined || y == null || y == undefined) {
        throw new Error("Entrada invalidada, null e undefined nao sao entradas validas");
    }
    if (typeof(x) !== "number" || typeof(y) !== "number") {
        throw new TypeError("Entrada nao e um numero");
    }
    if (Math.trunc(x) != x || Math.trunc(y) != y) {
        throw new RangeError("Numero nao e inteiro");
    }
    if (y < 0 || x <= 0) {
        throw new RangeError("Numero fora da faixa esperada");
    }
    let s = x;
    while (s >= y) {
        s = s - y;
    }
    return s;
}
module.exports = mod;