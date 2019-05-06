module.exports = LogaritmoNatural;
function LogaritmoNatural(n, k) {
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