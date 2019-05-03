/**
 * Aplica a propriedade 153 ao numero desejado, ou seja, a soma do cubo de cade um de seus digitos
 * e igual ao propio numero, um exemplo seria o propio numero 153, onde 1^3+5^3+3^3=153
 * 
 * @param {number} numero Numero a eser usado na operacao
 * 
 * @returns {boolean} Se o numero se aplica a propriedade 153 ou nao
 * 
 * @throws {RangeError} Se o numero for menor ou igual a 100, ou se o numero foi maior ou igual a 999
 */
function propriedade153(numero) {
    if (numero <= 100 || numero >= 999) {
        throw new RangeError("Numero fora da faixa esperada");
    }
    const b = Math.trunc(numero / 100);
    const c = Math.trunc(numero % 100);
    const d = Math.trunc(c / 10);
    const e = c % 10;
    return numero == (Math.pow(b, 3) + Math.pow(d, 3) + Math.pow(e, 3));
}
