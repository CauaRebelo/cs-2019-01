module.exports = propriedade153;
function propriedade153(numero) {
    if (numero == null || numero == undefined) {
        throw new Error("Entrada invalidada, null e undefined nao sao entradas validas");
    }
    if (typeof(numero) !== "number") {
        throw new TypeError("Entrada nao e um numero");
    }
    if (Math.trunc(numero) != numero) {
        throw new RangeError("Numero nao e inteiro");
    }
    if (numero <= 100 || numero >= 999) {
        throw new RangeError("Numero fora da faixa esperada");
    }
    const b = Math.trunc(numero / 100);
    const c = Math.trunc(numero % 100);
    const d = Math.trunc(c / 10);
    const e = c % 10;
    return numero == (Math.pow(b, 3) + Math.pow(d, 3) + Math.pow(e, 3));
}