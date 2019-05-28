const funcao = require("../ex12");

test("quadradoPerfeito 4 satisfaz (caso classico)", () => {
    expect(funcao(4)).toBe(true);
});


test("quadradoPerfeito 5 nao satisfaz (caso classico)", () => {
    expect(funcao(5)).toBe(false);
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
