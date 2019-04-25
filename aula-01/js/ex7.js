function Produto(a, b) {
    if (a < 0 && b < 0) {
        throw new RangeError("Numero fora da faixa esperada");
    }
    const c = a;
    const d = b;
    if (b < a) {
    	c = b;
    	d = a;
    }
    const e = 1;
    const f = 0;
    while (e <= c) {
    	f += d;
    	e++;
    }
    return f;
}
