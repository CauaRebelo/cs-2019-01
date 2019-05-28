const funcao = require("../ex8");

test("Produto de 1 e 2 = 2 (caso classico)", () => {
    expect(funcao.produto(1, 2)).toBe(2);
});

test("Produto de 2 e 1 = 2 (caso classico)", () => {
    expect(funcao.produto(2, 1)).toBe(2);
});

test("argumento null/undefined", () => {
    expect(() => { funcao.produto(); }).toThrow();
});


test("argumento nao numerico", () => {
    expect(() => { funcao.produto("abcd", "ac"); }).toThrow();
});


test("valor negativo fora da faixa", () => {
    expect(() => { funcao.produto(-1, -2); }).toThrow(RangeError);
});

test("valor deve ser inteiro", () => {
    expect(() => funcao.produto(10.3, 2.5)).toThrow(RangeError);
});
test("Potencia de 1 e 2 = 2 (caso classico)", () => {
    expect(funcao.potencia(1, 2)).toBe(1);
});

test("Produto de 2 e 1 = 2 (caso classico)", () => {
    expect(funcao.potencia(2, 1)).toBe(2);
});

test("argumento null/undefined", () => {
    expect(() => { funcao.potencia(); }).toThrow();
});


test("argumento nao numerico", () => {
    expect(() => { funcao.potencia("abcd", "ac"); }).toThrow();
});


test("valor negativo fora da faixa", () => {
    expect(() => { funcao.potencia(-1, -2); }).toThrow(RangeError);
});


test("valor deve ser inteiro", () => {
    expect(() => funcao.potencia(10.3, 2.5)).toThrow(RangeError);
});
