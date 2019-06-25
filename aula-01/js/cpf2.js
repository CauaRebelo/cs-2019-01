/**
 * Verifica se o argumento fornecido corresponde a um cpf válido.
 *
 * @param {number} d cpf a ser verificado.
 * @throws {RangeError} Se o argumento fornecido estiver fora da faixa.
 * @throws {Error} Se o argumento fornecido for nulo ou indefinido.
 * @throws {TypeError} Se o argumento fornecido não for um número.
 * @throws {RangeError} Se o argumento fornecido for nulo ou indefinido. 
 * @returns {boolean}  Retorna verdadeiro se o CPF for valido e falso se for invalido
 */
function cpf2(d) {

    var flag = 0;
    for (var i = 0; i < 11; i++){
        if (d[i] == null || d[i] == undefined) {
            throw new Error("Um ou mais valores fornecidos nulo ou não definido.");
        }
        if (d[i] > 9 || d[i] < 0) {
            throw new RangeError("Um ou mais valores fornecidos fora da faixa.");
        }
        if (typeof(d[i]) !== "number") {
            throw new TypeError("Um ou mais valores fornecidos não é um número.");
        }
        if (d[i] != Math.trunc(d[i])) {
            throw new RangeError("Um ou mais valores fornecidos não é um número inteiro.");
        }
    }
    let c = 7;
    let p = d[8];
    let s = d[8];

    while (c >= 0) {
        p = p + d[c];
        s = s + p;
        c = c - 1;
    }

    const j = (s % 11) % 10;
    const k = ((s - p + 9 * d[9]) % (11)) % 10;

    return (j == d[9] && k == d[10]);
}
module.exports = cpf2;
