function propriedade3025(numero) {
    if (numero <= 0 && numero > 9999) {
        return (false);
    } else {
        var b = numero / 100;
        b = parseInt(b);
        var c = numero % 100;
        return (numero == Math.pow(b + c, 2))
    }
}
