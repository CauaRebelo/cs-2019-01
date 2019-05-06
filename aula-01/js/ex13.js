module.exports = Raiz;
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