/**
 * Retorna a razao aurea de 2 numeros, ou seja, somar dois numeros, e logo em seguida somar os dois ultimos numeros dado pela razao, ate chegar nos ultimos
 * definidos por k, numero dado pelo usuario, e faz a razao dos dois ultimos numeros
 * 
 * @param {number} x Primeiro numero a ser somado
 *
 * @param {number} y Segundo numero a ser somado
 *
 * @param {number} k A quantidade de vezes que serao somados
 *
 * @returns {number} Retorna o resultado da razao aurea, ou seja, o resultado de toda a soma
 * 
 * @throws {RangeError} Se x for menor que 0 ou se y for menor que x ou se k for menor que 0
 */
function RazaoAurea(x, y, k) {
    if (x < 0 || y < x || k < 0) {
        throw new RangeError("Numero fora da faixa esperada");
    }
	let c = y;
	let a = x;
    let i = 1;
	let t = c;
    while (i <= k) {
		t = c;
    	c += a;
		a = t;
		i += 1;
    }
    return c/a;
}