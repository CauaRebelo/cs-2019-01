module.exports = propriedade3025;
function propriedade3025(numero) {
    if (numero == null || numero == undefined) {
        throw new Error("Entrada invalidada, null e undefined nao sao entradas validas");
    }
    if (typeof(numero) !== "number") {
        throw new TypeError("Entrada nao e um numero");
    }
    if (Math.trunc(numero) != numero) {
        throw new RangeError("Numero nao e inteiro");
    }
    if (numero <= 0 || numero > 9999) {
        throw new RangeError("Numero fora da faixa esperada");
    }
    const b = parseInt(numero / 100);
    const c = numero % 100;
    return numero == Math.pow(b + c, 2);
}