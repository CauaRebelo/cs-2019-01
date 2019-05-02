/**
 * Aplica a propriedade 3025 ao numero desejado, ou seja, a soma de seus dois primeiros digitos
 * com os dois ultimos digitos é igual a um numero cujo o seu quadrado deve ser igual ao numero original,
 * um  exemplo obvio e o propio numero 3025, onde 30 + 25 = 55, 55^2 = 3025
 * 
 * @param {number} numero Numero a eser usado na operacao
 * 
 * @returns {boolean} Se o numero se aplica a propriedade 3025 ou nao
 * 
 * @throws {RangeError} Se o numero for menor ou igual a zero, ou se o numero foi maior que 9999
 */
function propriedade3025(numero) {
    if (numero <= 0 || numero > 9999) {
        throw new RangeError("numero fora da faixa esperada");
    }

    const b = parseInt(numero / 100);
    const c = numero % 100;
    return numero == Math.pow(b + c, 2);
}
