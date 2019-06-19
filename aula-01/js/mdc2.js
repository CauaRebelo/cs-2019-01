/**
 * Retorna o mdc entre dois n�meros fornecidos.
 *
 * @param {number} a primeiro n�mero.
 * @param {number} b segundo n�mero.
 * @throws {RangeError} Se o argumento fornecido estiver fora da faixa. 
 * @throws {Error} Se o argumento fornecido for nulo ou indefinido.
 * @throws {TypeError} Se o argumento fornecido n�o for um n�mero.
 * @throws {RangeError} Se o argumento fornecido for nulo ou indefinido.
 * @returns {number}  O valor do mdc entre os dois n�meros.
 */
function mdc2(a, b) {
    if (a == null || a == undefined || b == null || b == undefined) {
        throw new Error("Valor informado � nulo ou n�o definido")
    }
    if (typeof(a) !== "number" || typeof(b) !== "number") {
        throw new TypeError("Valor informado n�o � um n�mero");
    }
    if (a != Math.trunc(a) || b != Math.trunc(b)) {
        throw new RangeError("Valor informado n�o � um n�mero inteiro");
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
