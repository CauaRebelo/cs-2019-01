function Produto(a, b) {
    // TODO reaplicar aqui sugestões em exercicios anteriores
    if (a < 0 && b < 0) {
        return (false)
    } else {
        var c = a;
        var d = b;
        if (b < a) {
            c = b;
            d = a;
        }
        var e = 1;
        var f = 0;
        while (e <= c) {
            f += d;
            e++;
        }
        return (f);
    }
}