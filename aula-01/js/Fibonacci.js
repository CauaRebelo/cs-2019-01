/**
 * Calcula o número na sequência fibonacci do indice fornecido.
 *
 * @param {number} indice do número a ser calculado.
 * @throws {RangeError} Se o argumento fornecido estiver fora da faixa.
 * @throws {Error} Se o argumento fornecido for nulo ou indefinido.
 * @throws {TypeError} Se o argumento fornecido não for um número.
 * @throws {RangeError} Se o argumento fornecido for nulo ou indefinido. 
 * @returns {number}  O valor do indice na sequencia fibonacci.
 */
function fibonacci(n) {
    if (n < 0) {
        throw new RangeError("valor fora  da faixa: " + n);
    }
    if (n == null || n == undefined) {
        throw new Error("Valor informado é nulo ou não definido: " + n)
    }
    if (typeof(n) !== "number") {
        throw new TypeError("Valor informado não é um número" + n);
    }
    
    // FIXME Number.isInteger em vez da comparação abaixo
    if (n != Math.trunc(n)) {
        throw new RangeError("Valor informado não é um número inteiro" + n);
    }
    let a = 0;
    let c = 1;

    if (n == 0 || n == 1) {
        return n;
    } else {
        let i = 2;
        let t;
        while (n >= i) {
            t = c;
            c = c + a;
            a = t;
            i = i + 1;
        }
        return c;
    }

}
module.exports = fibonacci;
