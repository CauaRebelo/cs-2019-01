const funcao = require("../Fibonacci");

test("3 retorna 2 (caso classico)", () => {
  expect(funcao(3)).toBe(2);
});

test("1 retorna 1 (caso classico)", () => {
  expect(funcao(1)).toBe(1);
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
