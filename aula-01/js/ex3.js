function diadasemana(dia, mes, ano) {
    // TODO reaplicar aqui sugestões em exercicios anteriores
    if (dia < 1 && dia > 31 && mes < 1 && mes > 12 && ano <= 1753) {
        return (false)
    } else {
        if (mes == 1 || mes == 2) {
            mes += 12;
            ano--;
        }
        var c = dia + 2 * mes + 3 * (mes + 1) / 5 + ano + ano / 4 - ano / 100 + ano / 400;
        c = parseInt(c);
        return (c % 7);
    }
}