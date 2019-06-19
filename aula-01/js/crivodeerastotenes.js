/**
 * Demarca com 0 os indices do vetor que corresponde a um número primo.
 *
 * @param {number} a vetor a ser trabalhado.
 * @param {number} n número de posições do vetor
 * @throws {RangeError} Se o vetor não inicia com zero em todas suas posições. 
 * @throws {RangeError} Se n for menor e igual a 1 
 * @throws {Error} Se o argumento fornecido for nulo ou indefinido.
 * @throws {TypeError} Se o argumento fornecido não for um número.
 * @throws {RangeError} Se o argumento fornecido for nulo ou indefinido.
 * @returns {number} Vetor resultante
 */
function CrivoErastotenes(a, n) {

    if (n <= 1) {
        throw new RangeError("valor fora  da faixa.");
    }
    if (n == null || n == undefined) {
        throw new Error("Valor informado é nulo ou não definido.")
    }
    if (typeof(n) !== "number") {
        throw new TypeError("Valor informado não é um número.");
    }
    if (n != Math.trunc(n)) {
        throw new RangeError("Valor informado não é um número inteiro.");
    }
    
    for (let i = 0; i < n; i++) {
        if (a[i] != 0) {
            throw new RangeError("O vetor deve estar zerado.");
        }
    }

    
    let s = a;
    let i = 2;
    let limite = Math.floor(Math.sqrt(n));
    let multiplo;
    while (i <= limite) {
        if (s[i] == 0) {
            multiplo = i + i;
            while (multiplo <= n) {
                s[multiplo] = 1;
                multiplo = multiplo + i;
            }
        }

        i = i + 1;
    }
    return s;
}
module.exports = CrivoErastotenes;
