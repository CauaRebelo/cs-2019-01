const funcao = require("../produto");

test("Produto de 1 e 2 = 2 (caso classico)", () => {
    expect(funcao(1, 2)).toBe(2);
});

test("Produto de 2 e 1 = 2 (caso classico)", () => {
    expect(funcao(2, 1)).toBe(2);
});

test("argumento null/undefined", () => {
    expect(() => { funcao(); }).toThrow();
});


test("argumento nao numerico", () => {
    expect(() => { funcao("abcd", "ac"); }).toThrow();
});


test("valor negativo fora da faixa", () => {
    expect(() => { funcao(-1, -2); }).toThrow(RangeError);
});


test("valor deve ser inteiro", () => {
    expect(() => funcao(10.3, 2.5)).toThrow(RangeError);
});
