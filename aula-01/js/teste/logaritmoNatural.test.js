const funcao = require("../logaritmoNatural");

test("Logaritmo Natural de 3 e 3 (caso classico)", () => {
    expect(funcao(3, 3)).toBe(22);
});


test("argumento null/undefined", () => {
    expect(() => { funcao(); }).toThrow();
});


test("argumento nao numerico", () => {
    expect(() => { funcao("abcd", "fjask"); }).toThrow();
});


test("valor negativo fora da faixa", () => {
    expect(() => { funcao(-1, -2); }).toThrow(RangeError);
});


test("valor deve ser inteiro", () => {
    expect(() => funcao(10.3, 2.3)).toThrow(RangeError);
});
