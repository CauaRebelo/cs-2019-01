/**
 * Retorna o logaritmo natural de n com k precisao
 * 
 * @param {number} n Numero a ser usado no logaritmo natural
 *
 * @param {number} k Precisao do resultado
 *
 * @returns {number} Retorna o logaritmo natural com n precisao
 * 
 * @throws {RangeError} Se n for menor que 1 ou se k for menor que 2
 */
function LogaritmoNatural(n, k) {
    if (n < 1 || k < 2) {
        throw new RangeError("Numero fora da faixa esperada");
    }
	let i = 2;
	let e = 1 + n;
    let numerador = n;
    let denominador = 1;
    while (i <= k) {
		numerador *= numerador;
    	denominador *= i;
		e += numerador/denominador;
		i += 1;
    }
    return e;
}