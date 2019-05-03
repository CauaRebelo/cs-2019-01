/**
 * Encontra o modulo, ou seja resto da divisao, de um tal numero com seu divisor
 * 
 * @param {number} x Numero que vai ser aplicado o modulo
 * @param {number} y Divisor
 * 
 * @returns {number} Retorna o modulo, ou seja, resto da divisao
 * 
 * @throws {RangeError} Se x for menor ou igual a 0 ou se y for menor que 0
 */
function mod(x, y) {
    if (y < 0 || x <= 0) {
        throw new RangeError("Numero fora da faixa esperada");
    }
    let s = x;
    while (y <= s) {
    	s -= y;
    }
    return s;
}
