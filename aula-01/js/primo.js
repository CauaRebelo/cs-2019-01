/**
 * Verifica se um n�mero � primo.
 *
 * @param {number} n n�mero a ser verificado.
 * @throws {RangeError} Se o argumento fornecido estiver fora da faixa.
 * @throws {Error} Se o argumento fornecido for nulo ou indefinido.
 * @throws {TypeError} Se o argumento fornecido n�o for um n�mero.
 * @throws {RangeError} Se o argumento fornecido for nulo ou indefinido.
 * @returns {number}  Verdadeiro se o n�mero � primo.
 */
function primo(n) {
    if (n == null || n == undefined) {
        throw new Error("Valor informado � nulo ou n�o definido: " + n)
    }
    if (typeof(n) !== "number") {
        throw new TypeError("Valor informado n�o � um n�mero" + n);
    }
    if (n != Math.trunc(n)) {
        throw new RangeError("Valor informado n�o � um n�mero inteiro" +n);
    }
    if (n <= 1) {
        throw new RangeError("valor fora  da faixa: " + n);
    }
    let i = 2;
    while (i < n) {
        if ((n % i) == 0) {
            return false;
        }
        i = i + 1;
    }
    return true;
}
module.exports = primo;