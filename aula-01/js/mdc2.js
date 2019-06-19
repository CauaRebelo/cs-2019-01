/**
 * Retorna o mdc entre dois números fornecidos.
 *
 * @param {number} a primeiro número.
 * @param {number} b segundo número.
 * @throws {RangeError} Se o argumento fornecido estiver fora da faixa. 
 * @throws {Error} Se o argumento fornecido for nulo ou indefinido.
 * @throws {TypeError} Se o argumento fornecido não for um número.
 * @throws {RangeError} Se o argumento fornecido for nulo ou indefinido.
 * @returns {number}  O valor do mdc entre os dois números.
 */
function mdc2(a, b) {
    if (a == null || a == undefined || b == null || b == undefined) {
        throw new Error("Valor informado é nulo ou não definido")
    }
    if (typeof(a) !== "number" || typeof(b) !== "number") {
        throw new TypeError("Valor informado não é um número");
    }
    if (a != Math.trunc(a) || b != Math.trunc(b)) {
        throw new RangeError("Valor informado não é um número inteiro");
    }
    if (b > a || b <= 0) {
        throw new RangeError("valor fora  da faixa: " + b);
    }
    
 
    while (a != b) {
        if (a > b) {
            a = a - b;
        } else {
            b = b - a;
        }
    }
    return a;

}
module.exports = mdc2;
