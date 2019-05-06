/**
 * Multiplica dois numero, somando o primeiro numero com ele mesmo 'b' vezes, retornando o resultado da multiplicacao, ou seja, a * b
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
/**
 * Multiplica o primeiro numero com ele mesmo 'b' vezes, conhecido como potencia, ou efetivamente a ^ b
 * 
 * @param {number} a O numero a ser multiplicado b vezes
 *
 * @param {number} b A quantidade de vezes que a vai ser multiplicado com ele mesmo
 *
 * @returns {number} Retorna o resultado da multiplicacao, ou seja, sua potencia
 * 
 * @throws {RangeError} Se a for menor que zero ou b for menor que zero
 */
function Potencia(a, b) {
    if (a < 0 || b < 0) {
        throw new RangeError("Numero fora da faixa esperada");
    }
    let c = 1;
    let d = 1;
    while (d <= b) {
    	c = Produto(c, a);
    	d++;
    }
    return c;
}
