function SomaNaturais(numero) {
    if (numero < 1) {
        throw new RangeError("Numero fora da faixa esperada");
    }
    const a = 2;
    const b = 1;
    while (a <= numero) {
    	b += a;
    	a++;
    }
    return b;
}
