const funcao = require("../fatorial");

test("Fatorial de 5 = 120 (caso classico)", () => {
    expect(funcao(5)).toBe(120);
});


test("argumento null/undefined", () => {
    expect(() => { funcao(); }).toThrow();
});


test("argumento nao numerico", () => {
    expect(() => { funcao("abcd"); }).toThrow();
});


test("valor negativo fora da faixa", () => {
    expect(() => { funcao(-1); }).toThrow(RangeError);
});


test("valor deve ser inteiro", () => {
    expect(() => funcao(10.3)).toThrow(RangeError);
});
