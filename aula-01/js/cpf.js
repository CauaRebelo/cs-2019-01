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
function cpf(d) {

    for (var i = 0; i < 11; i++) {

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

    const j = d[0] + 2 * d[1] + 3 * d[2] + 4 * d[3] + 5 * d[4] + 6 * d[5] + 7 * d[6] + 8 * d[7] + 9 * d[8];
    const k = d[1] + 2 * d[2] + 3 * d[3] + 4 * d[4] + 5 * d[5] + 6 * d[6] + 7 * d[7] + 8 * d[8] + 9 * d[9];
    const dj = (j % 11) % 10;
    const dk = (k % 11) % 10;
    return (dj == d[9] && dk == d[10]);
}
module.exports = cpf;
