module.exports = Fatorial;
function Fatorial(numero) {
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