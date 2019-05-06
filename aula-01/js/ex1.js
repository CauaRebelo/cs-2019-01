function propriedade3025(numero) {
    if (numero <= 0 || numero > 9999) {
        throw new RangeError("numero fora da faixa esperada");
    }

    const b = parseInt(numero / 100);
    const c = numero % 100;
    return numero == Math.pow(b + c, 2);
}