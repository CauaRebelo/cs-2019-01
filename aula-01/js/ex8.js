function Produto(a, b) {
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

function Potencia(a, b) {
    if (a < 0 && b < 0) {
        return (false)
    } else {
        var c = 1;
        var d = 1;
        while (d <= b) {
            c = Produto(c, a);
            d++;
        }
        return (c);
    }
}