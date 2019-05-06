/**
 * Descobre se o numero é um quadrado perfeito
 * 
 * @param {number} n O numero que o usuario deseja saber se faz parte dos numeros que são quadrados perfeitos
 *
 * @returns {boolean} Define se o numero e quadrado perfeito ou nao
 * 
 * @throws {RangeError} Se n for menor que 1
 */
function QuadradoPerfeito(n) {
    if (n < 1) {
        throw new RangeError("Numero fora da faixa esperada");
    }
    let i = 1;
    let s = 1;
    while (s < n) {
    	i += 2;
    	s += i;
    }
    return s == n;
}
