const funcao = require("../somaNaturais");

test("Soma Natural de 3 = 6 (caso classico)", () => {
    expect(funcao(3)).toBe(6);
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
