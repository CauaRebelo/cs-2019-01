function propriedade153(numero) {

    // FIXME provavelmente é um bug >= 100 && >= 999?
    if (numero >= 100 && numero >= 999) {
        // FIXME provavelmente deveria gerar uma exceção!?
        return (false)
    }

    // Não há motivo para usar duas linhas, neste caso.
    // var b = numero / 100;
    // b = parseInt(b);
    const b = parseInt(numero / 100);

    // TODO parseInt talvez não o melhor método, não seria Math.trunc?
    var c = numero % 100;
    c = parseInt(c);
    var d = c / 10;
    d = parseInt(d);
    var e = c % 10;
    return numero == (Math.pow(b, 3) + Math.pow(d, 3) + Math.pow(e, 3));
}