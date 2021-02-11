/**
 * TODO observe a diferença em relação à versão anterior....
 * Verifica se o número fornecido satisfaz a propriedade denominada 3025. 
 * Um número inteiro satisfaz esta propriedade se o quadrado da soma 
 * X + Y resulta no número inteiro fornecido, onde X é o
 * número definido pelos dois primeiros dígitos do número fornecido, 
 * enquanto Y é o número definido pelos dois últimos dígitos do número fornecido. 
 * 
 * FIXME acentos em português não é opcional 
 * @param {number} numero Numero a eser usado na operacao
 * 
 * @returns {boolean} Se o numero se aplica a propriedade 3025 ou nao
 * 
 * @throws {Error} Se a entrada for nula ou nao definida
 * @throws {TypeError} Se a entrada não for numero
 * @throws {RangeError} Se o numero não for inteiro
 * @throws {RangeError} Se o numero for menor ou igual a zero, ou se o numero foi maior que 9999
 */
function propriedade3025(numero) {
    if (numero == null || numero == undefined) {
        throw new Error("Entrada invalidada, null e undefined nao sao entradas validas");
    }
    if (typeof(numero) !== "number") {
        throw new TypeError("Entrada nao e um numero");
    }
    if (Math.trunc(numero) != numero) {
        throw new RangeError("Numero nao e inteiro");
    }
    if (numero <= 0 || numero > 9999) {
        throw new RangeError("numero fora da faixa esperada");
    }

    const b = parseInt(numero / 100);
    const c = numero % 100;
    return numero == Math.pow(b + c, 2);
}

module.exports = propriedade3025;
