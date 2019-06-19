/**
 * Verifica se um número é primo.
 *
 * @param {number} n número a ser verificado.
 * @throws {RangeError} Se o argumento fornecido estiver fora da faixa.
 * @throws {Error} Se o argumento fornecido for nulo ou indefinido.
 * @throws {TypeError} Se o argumento fornecido não for um número.
 * @throws {RangeError} Se o argumento fornecido for nulo ou indefinido.
 * @returns {number}  Verdadeiro se o número é primo.
 */
function primo(n) {
    if (n == null || n == undefined) {
        throw new Error("Valor informado é nulo ou não definido: " + n)
    }
    if (typeof(n) !== "number") {
        throw new TypeError("Valor informado não é um número" + n);
    }
    if (n != Math.trunc(n)) {
        throw new RangeError("Valor informado não é um número inteiro" +n);
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