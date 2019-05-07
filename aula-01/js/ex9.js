module.exports = Pi;
function Pi(n) {
    if (n == null || n == undefined) {
        throw new Error("Entrada invalidada, null e undefined nao sao entradas validas");
    }
    if (typeof(n) !== "number") {
        throw new TypeError("Entrada nao e um numero");
    }
    if (Math.trunc(n) != n) {
        throw new RangeError("Numero nao e inteiro");
    }
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