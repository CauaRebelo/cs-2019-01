module.exports = RazaoAurea;
function RazaoAurea(x, y, k) {
    if (x == null || x == undefined || y == null || y == undefined || k == null || k == undefined) {
        throw new Error("Entrada invalidada, null e undefined nao sao entradas validas");
    }
    if (typeof(x) !== "number" || typeof(y) !== "number" || typeof(k) !== "number") {
        throw new TypeError("Entrada nao e um numero");
    }
    if (Math.trunc(x) != x || Math.trunc(y) != y || Math.trunc(k) != k) {
        throw new RangeError("Numero nao e inteiro");
    }
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