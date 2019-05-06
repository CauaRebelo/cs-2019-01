function Produto(a, b) {
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