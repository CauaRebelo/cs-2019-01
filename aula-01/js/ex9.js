function QuadradoPerfeito(n) {
    if (n < 1) {
        throw new RangeError("Numero fora da faixa esperada");
    }
    let i = 1;
    let s = 1;
    while (s < n) {
    	i += 2;
    	s += i;
    }
    return s == n;
}
