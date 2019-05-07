module.exports = mod;
function mod(x, y) {
    if (x == null || x == undefined || y == null || y == undefined) {
        throw new Error("Entrada invalidada, null e undefined nao sao entradas validas");
    }
    if (typeof(x) !== "number" || typeof(y) !== "number") {
        throw new TypeError("Entrada nao e um numero");
    }
    if (Math.trunc(x) != x || Math.trunc(y) != y) {
        throw new RangeError("Numero nao e inteiro");
    }
    if (y < 0 || x <= 0) {
        throw new RangeError("Numero fora da faixa esperada");
    }
    let s = x;
    while (y <= s) {
        s -= y;
    }
    return s;
}