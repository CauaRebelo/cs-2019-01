module.exports = Fatorial;
function Fatorial(numero) {
    if (numero == null || numero == undefined) {
        throw new Error("Entrada invalidada, null e undefined nao sao entradas validas");
    }
    if (typeof(numero) !== "number") {
        throw new TypeError("Entrada nao e um numero");
    }
    if (Math.trunc(numero) != numero) {
        throw new RangeError("Numero nao e inteiro");
    }
    if (numero < 1) {
        throw new RangeError("Numero fora da faixa esperada");
    }
    let a = 2;
    let b = 1;
    while (a <= numero) {
        b *= a;
        a++;
    }
    return b;
}