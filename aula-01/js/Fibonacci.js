/**
 * Calcula o n�mero na sequ�ncia fibonacci do indice fornecido.
 *
 * @param {number} indice do n�mero a ser calculado.
 * @throws {RangeError} Se o argumento fornecido estiver fora da faixa.
 * @throws {Error} Se o argumento fornecido for nulo ou indefinido.
 * @throws {TypeError} Se o argumento fornecido n�o for um n�mero.
 * @throws {RangeError} Se o argumento fornecido for nulo ou indefinido. 
 * @returns {number}  O valor do indice na sequencia fibonacci.
 */
function fibonacci(n) {
    if (n < 0) {
        throw new RangeError("valor fora  da faixa: " + n);
    }
    if (n == null || n == undefined) {
        throw new Error("Valor informado � nulo ou n�o definido: " + n)
    }
    if (typeof(n) !== "number") {
        throw new TypeError("Valor informado n�o � um n�mero" + n);
    }
    if (n != Math.trunc(n)) {
        throw new RangeError("Valor informado n�o � um n�mero inteiro" + n);
    }
    let a = 0;
    let c = 1;

    if (n == 0 || n == 1) {
        return n;
    } else {
        let i = 2;
        let t;
        while (i <= n) {
            t = c;
            c = c + a;
            a = t;
            i = i + 1;
        }
        return c;
    }

}
module.exports = fibonacci;
