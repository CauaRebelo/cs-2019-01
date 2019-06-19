/**
 * Calcula o valor de um polin�mio.
 *
 * @param {number} a base inteira do polin�mio.
 * @param {number} g quantidade de indices
 * @param {number} x constante. 
 * @throws {RangeError} Se o argumento fornecido estiver fora da faixa. 
 * @throws {Error} Se o argumento fornecido for nulo ou indefinido.
 * @throws {TypeError} Se o argumento fornecido n�o for um n�mero.
 * @throws {RangeError} Se o argumento fornecido for nulo ou indefinido.
 * @returns {number}  O valor do polin�mio.
 */
function Horner(x, g, a) {

    if (g < 1) {
        throw new RangeError("valor fora  da faixa: " + g);
    }
    if (g == null || g == undefined) {
        throw new Error("Valor informado � nulo ou n�o definido: " + g)
    }
    if (typeof(g) !== "number") {
        throw new TypeError("Valor informado n�o � um n�mero" + g);
    }
    if (g != Math.trunc(g)) {
        throw new RangeError("Valor informado n�o � um n�mero inteiro" + g);
    }
    
    var p = a[0];
    var i = g - 1;

    while (i >= 0) {
        p = p * x + a[i];
        i = i - 1;
    }
    
    return p;
    
}
module.exports = Horner;
