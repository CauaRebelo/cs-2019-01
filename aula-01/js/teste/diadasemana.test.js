const funcao = require("../ex3");

test("06/05/2019 e uma segunda-feira (caso classico)", () => {
    expect(funcao(6, 5, 2019)).toBe(1);
});

test("07/05/2019 e terca-feira", () => {
    expect(funcao(7, 5, 2019)).toBe(2);
});

test("argumento null/undefined", () => {
    expect(() => { funcao(); }).toThrow();
});

test("argumento nao numerico", () => {
    expect(() => { funcao("abcd", "abc", "abc"); }).toThrow();
});


test("valor negativo fora da faixa", () => {
    expect(() => { funcao(1, 1, -1515); }).toThrow(RangeError);
});

test("Valores com mais de 4 digitos fora da faixa", () => {
    expect(() => funcao(10000, 10101, 10101)).toThrow(RangeError);
});

test("Valores deve ser inteiro", () => {
    expect(() => funcao(10.3, 1.5, 2032.2)).toThrow(RangeError);
});