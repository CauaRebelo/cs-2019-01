function RazaoAurea(x, y, k) {
    if (x < 0 || y < x || k < 0) {
        throw new RangeError("Numero fora da faixa esperada");
    }
    let c = y;
    let a = x;
    let i = 1;
    let t = c;
    while (i <= k) {
        t = c;
        c += a;
        a = t;
        i += 1;
    }
    return c/a;
}