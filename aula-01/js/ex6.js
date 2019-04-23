function Fatorial(numero) {
    // TODO reaplicar aqui sugestões em exercicios anteriores
    if (numero < 1) {
        return (false)
    } else {
        var a = 2;
        var b = 1;
        while (a <= numero) {
            b *= a;
            a++;
        }
        return (b);
    }
}