const funcao = require("../pi");

test("Pi (caso classico)", () => {
    expect(funcao(1000)).toBe(3.140592653839794);
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
