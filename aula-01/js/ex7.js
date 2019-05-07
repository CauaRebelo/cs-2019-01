module.exports = Produto;
function Produto(a, b) {
    if (a == null || a == undefined || b == null || b == undefined) {
        throw new Error("Entrada invalidada, null e undefined nao sao entradas validas");
    }
    if (typeof(a) !== "number" || typeof(b) !== "number") {
        throw new TypeError("Entrada nao e um numero");
    }
    if (Math.trunc(a) != a || Math.trunc(b) != b) {
        throw new RangeError("Numero nao e inteiro");
    }
    if (a < 0 || b < 0) {
        throw new RangeError("Numero fora da faixa esperada");
    }
    let c = a;
    let d = b;
    if (b < a) {
        c = b;
        d = a;
    }
    let e = 1;
    let f = 0;
    while (e <= c) {
        f += d;
        e++;
    }
    return f;
}