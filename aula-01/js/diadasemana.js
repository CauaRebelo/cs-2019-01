/**
 * Informa o dia da semana, sendo 0 segunda e assim por diante
 * 
 * @param {number} dia Dia desejado
 *
 * @param {number} mes O mes desejado
 *
 * @param {number} ano O ano desejado
 * 
 * @returns {number} Retorna o dia da semana, sendo 0 segunda ate 6 como domingo
 * 
 * @throws {Error} Se uma das entradas for nula ou nao definida
 * @throws {TypeError} Se uma das entradas não for numero
 * @throws {RangeError} Se uma das entradas não for inteiro
 * @throws {RangeError} Se o o dia for menor a 1 ou maior que 31, ou se o mes for menor que 1 ou maior que 12
 * ou se o ano for menor que 1753
 */
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
module.exports = diadasemana;