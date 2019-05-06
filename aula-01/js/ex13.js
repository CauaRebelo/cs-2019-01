/**
 * Calcula a raiz quadrada de um numero 'n' com 'i' precisao, sendo os dois dados pelo usuario
 * 
 * @param {number} n O numero que sera aplicada a raiz quadrada
 *
 * @param {number} i Precisao da operacao
 *
 * @returns {number} Retorna a raiz quadrada de n
 * 
 * @throws {RangeError} Se n for menor que 0
 */
function Raiz(n , i) {
    if (n < 0) {
        throw new RangeError("Numero fora da faixa esperada");
    }
    let r = 1;
    while (0 <= i) {
    	r = (r + n/r) / 2;
    	i -= 1;
    }
    return r;
}