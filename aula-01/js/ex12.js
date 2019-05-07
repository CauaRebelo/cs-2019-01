module.exports = QuadradoPerfeito;
function QuadradoPerfeito(n) {
    if (n == null || n == undefined) {
        throw new Error("Entrada invalidada, null e undefined nao sao entradas validas");
    }
    if (typeof(n) !== "number") {
        throw new TypeError("Entrada nao e um numero");
    }
    if (Math.trunc(n) != n) {
        throw new RangeError("Numero nao e inteiro");
    }
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