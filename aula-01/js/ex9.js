/**
 * Retorna o pi com n precisao
 * 
 * @param {number} n Precisao do resultado
 *
 * @returns {number} Retorna pi com n precisao
 * 
 * @throws {RangeError} Se n for menor ou igual a 1
 */
function Pi(n) {
    if (n <= 1) {
        throw new RangeError("Numero fora da faixa esperada");
    }
    let i = 1;
    let s = -1;
	let d = -1;
	let p = 0;
    while (i <= n) {
    	d += 2;
    	s = -1 * s;
		p += 4*s/d;
		i += 1;
    }
    return p;
}