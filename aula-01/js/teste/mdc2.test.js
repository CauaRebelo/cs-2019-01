const funcao = require("../mdc2");

test("10, 8 retorna 2 (caso classico)", () => {
  expect(funcao(10, 8)).toBe(2);
});

test("argumento null/undefined", () => {
  expect(() => { funcao(); }).toThrow();
});

test("argumento nao numerico", () => {
  expect(() => { funcao("abcd", "s"); }).toThrow();
});


test("valor negativo fora da faixa", () => {
  expect(() => { funcao(-1, -1); }).toThrow(RangeError);
});

test("valor deve ser inteiro", () => {
  expect(() => funcao(10.3, 5.6)).toThrow(RangeError);
});
