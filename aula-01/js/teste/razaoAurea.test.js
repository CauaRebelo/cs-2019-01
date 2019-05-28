const funcao = require("../ex11");

test("Razao Aurea de 2 e 2 e 2 = 1.5 (caso classico)", () => {
    expect(funcao(2, 2, 2)).toBe(1.5);
});


test("argumento null/undefined", () => {
    expect(() => { funcao(); }).toThrow();
});


test("argumento nao numerico", () => {
    expect(() => { funcao("abcd", "fjask", "fjh"); }).toThrow();
});


test("valor negativo fora da faixa", () => {
    expect(() => { funcao(-1, -2, -4); }).toThrow(RangeError);
});


test("valor deve ser inteiro", () => {
    expect(() => funcao(10.3, 2.3, 3.5)).toThrow(RangeError);
});
