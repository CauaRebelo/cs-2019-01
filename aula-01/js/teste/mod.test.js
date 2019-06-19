const funcao = require("../mod");

test("Modulo de 3 com 2 = 1 (caso classico)", () => {
    expect(funcao(3, 2)).toBe(1);
});

test("Modulo de 3 com 4 = 3", () => {
    expect(funcao(3, 4)).toBe(3);
});

test("Argumento null/undefined", () => {
    expect(() => { funcao(); }).toThrow();
});

test("Argumento nao numerico", () => {
    expect(() => { funcao("abcd", "abc"); }).toThrow();
});


test("Valores negativo fora da faixa", () => {
    expect(() => { funcao(-1, -2); }).toThrow(RangeError);
});


test("Valores devem ser inteiro", () => {
    expect(() => funcao(10.3, 10.2)).toThrow(RangeError);
});
