module.exports = LogaritmoNatural;
function LogaritmoNatural(n, k) {
    if (n == null || n == undefined || k == null || k == undefined) {
        throw new Error("Entrada invalidada, null e undefined nao sao entradas validas");
    }
    if (typeof(n) !== "number" || typeof(k) !== "number") {
        throw new TypeError("Entrada nao e um numero");
    }
    if (Math.trunc(n) != n || Math.trunc(k) != k) {
        throw new RangeError("Numero nao e inteiro");
    }
    if (n < 1 || k < 2) {
        throw new RangeError("Numero fora da faixa esperada");
    }
    let i = 2;
    let e = 1 + n;
    let numerador = n;
    let denominador = 1;
    while (i <= k) {
        numerador *= numerador;
        denominador *= i;
        e += numerador/denominador;
        i += 1;
    }
    return e;
}