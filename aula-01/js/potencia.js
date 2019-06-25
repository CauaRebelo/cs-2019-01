/**
 * Multiplica dois numero, somando o primeiro numero com ele mesmo 'b' vezes, retornando o resultado da multiplicacao, ou seja, a * b
 * 
 * @param {number} a O numero a ser somado b vezes
 *
 * @param {number} b A quantidade de vezes que a vai ser somado com ele mesmo
 *
 * @returns {number} Retorna o resultado da soma, ou seja o resultado do produto
 * 
 * @throws {Error} Se uma das entradas for nula ou nao definida
 * @throws {TypeError} Se uma das entradas não for numero
 * @throws {RangeError} Se uma das entradas não for inteiro
 * @throws {RangeError} Se a for menor que zero ou b for menor que zero
 */
function produto(a, b) {
    if (a == null || a == undefined || b == null || b == undefined) {
        throw new Error("Entrada invalidada, null e undefined nao sao entradas validas");
    }
    if (typeof(a) !== "number" || typeof(b) !== "number") {
        throw new TypeError("Entrada nao e um numero");
    }
    if (Math.trunc(a) != a || Math.trunc(b) != b) {
        throw new RangeError("Numero nao e inteiro");
    }
    if (a < 0 || b < 0) {
        throw new RangeError("Numero fora da faixa esperada");
    }
    let c = a;
    let d = b;
    if (b < a) {
        c = b;
        d = a;
    }
    let e = 1;
    let f = 0;
    while (c >= e) {
        f = f + d;
        e++;
    }
    return f;
}
/**
 * Multiplica o primeiro numero com ele mesmo 'b' vezes, conhecido como potencia, ou efetivamente a ^ b
 * 
 * @param {number} a O numero a ser multiplicado b vezes
 *
 * @param {number} b A quantidade de vezes que a vai ser multiplicado com ele mesmo
 *
 * @returns {number} Retorna o resultado da multiplicacao, ou seja, sua potencia
 * 
 * @throws {Error} Se uma das entradas for nula ou nao definida
 * @throws {TypeError} Se uma das entradas não for numero
 * @throws {RangeError} Se uma das entradas não for inteiro
 * @throws {RangeError} Se a for menor que zero ou b for menor que zero
 */
function potencia(a, b) {
    if (a == null || a == undefined || b == null || b == undefined) {
        throw new Error("Entrada invalidada, null e undefined nao sao entradas validas");
    }
    if (typeof(a) !== "number" || typeof(b) !== "number") {
        throw new TypeError("Entrada nao e um numero");
    }
    if (Math.trunc(a) != a || Math.trunc(b) != b) {
        throw new RangeError("Numero nao e inteiro");
    }
    if (a < 0 || b < 0) {
        throw new RangeError("Numero fora da faixa esperada");
    }
    let c = 1;
    let d = 1;
    while (b >= d) {
        c = produto(c, a);
        d++;
    }
    return c;
}
module.exports = {
    produto : produto,
    potencia : potencia
};
