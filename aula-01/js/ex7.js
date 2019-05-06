/**
 * Multiplica dois numero, somando o primeiro numero com ele mesmo 'b' vezes, retornando o resultado da multiplicacao
 * 
 * @param {number} a O numero a ser somado b vezes
 *
 * @param {number} b A quantidade de vezes que a vai ser somado com ele mesmo
 *
 * @returns {number} Retorna o resultado da soma, ou seja o resultado do produto
 * 
 * @throws {RangeError} Se a for menor que zero ou b for menor que zero
 */
function Produto(a, b) {
    if (a < 0 || b < 0) {
        throw new RangeError("Numero fora da faixa esperada");
    }
    let c = a;
    let d = b;
    if (b < a) {
    	c = b;
    	d = a;
    }
    let e = 1;
    let f = 0;
    while (e <= c) {
    	f += d;
    	e++;
    }
    return f;
}
