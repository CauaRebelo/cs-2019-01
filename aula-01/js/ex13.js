module.exports = Raiz;
function Raiz(n , i) {
    if (n == null || n == undefined || i == null || i == undefined) {
        throw new Error("Entrada invalidada, null e undefined nao sao entradas validas");
    }
    if (typeof(n) !== "number" || typeof(i) !== "number") {
        throw new TypeError("Entrada nao e um numero");
    }
    if (Math.trunc(n) != n || Math.trunc(i) != i) {
        throw new RangeError("Numero nao e inteiro");
    }
    if (n < 0 || i < 0) {
        throw new RangeError("Numero fora da faixa esperada");
    }
    let r = 1;
    while (0 <= i) {
        r = (r + n/r) / 2;
        i -= 1;
    }
    return r;
}