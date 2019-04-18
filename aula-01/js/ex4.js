function mod(x, y) {
    // TODO reaplicar aqui sugestões em exercicios anteriores
    if (y < 0 && x <= 0) {
        return (false)
    } else {
        var s = x;
        while (y <= s) {
            s -= y;
        }
        return (s);
    }
}