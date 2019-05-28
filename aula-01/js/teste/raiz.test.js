const funcao = require("../ex13");

test("Raiz Quadrada de 2 (caso classico)", () => {
    expect(funcao(2, 1000)).toBe(1.414213562373095);
});


test("argumento null/undefined", () => {
    expect(() => { funcao(); }).toThrow();
});


test("argumento nao numerico", () => {
    expect(() => { funcao("abcd", "desfhsj"); }).toThrow();
});


test("valor negativo fora da faixa", () => {
    expect(() => { funcao(-1, -3); }).toThrow(RangeError);
});


test("valor deve ser inteiro", () => {
    expect(() => funcao(10.3, 2.3)).toThrow(RangeError);
});
