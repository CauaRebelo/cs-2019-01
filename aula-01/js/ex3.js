/**
 * Informa o dia da semana, sendo 0 segunda e assim por diante
 * 
 * @param {number} dia Dia desejado
 * @param {number} mes O mes desejado
 * @param {number} ano O ano desejado
 * 
 * @returns {number} Retorna o dia da semana, sendo 0 segunda ate 6 como domingo
 * 
 * @throws {RangeError} Se o o dia for menor a 1 ou maior que 31, ou se o mes for menor que 1 ou maior que 12
 * ou se o ano for menor que 1753
 */
function diadasemana(dia, mes, ano) {
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
}
