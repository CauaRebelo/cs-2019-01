module.exports = diadasemana;
function diadasemana(dia, mes, ano) {
    if (dia == null || dia == undefined || mes == null || mes == undefined || ano == null || ano == undefined) {
        throw new Error("Entrada invalidada, null e undefined nao sao entradas validas");
    }
    if (typeof(dia) !== "number" || typeof(mes) !== "number" || typeof(ano) !== "number") {
        throw new TypeError("Entrada nao e um numero");
    }
    if (Math.trunc(dia) != dia || Math.trunc(mes) != mes || Math.trunc(ano) != ano) {
        throw new RangeError("Numero nao e inteiro");
    }
    if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano <= 1753) {
        throw new RangeError("Numero fora da faixa esperada");
    }
    if (mes == 1 || mes == 2) {
        mes += 12;
        ano--;
    }
    const c = Math.trunc(dia + 2 * mes + 3 * (mes + 1) / 5 + ano + ano / 4 - ano / 100 + ano / 400);
    return c % 7;
}