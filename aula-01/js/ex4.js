function mod(x, y) {
    if (y < 0 || x <= 0) {
        throw new RangeError("Numero fora da faixa esperada");
    }
    let s = x;
    while (y <= s) {
    	s -= y;
    }
    return s;
}
