const funcao = require("../mdc");

test("10, 8 retorna 2 (caso classico)", () => {
  expect(funcao(10, 8)).toBe(2);
});

test("argumento null/undefined", () => {
  let a;
  let b;
  expect(() => { funcao(a, b); }).toThrow();
});

test("argumento nao numerico", () => {
  expect(() => { funcao("d", "s"); }).toThrow();
});


test("valor negativo fora da faixa", () => {
  expect(() => { funcao(-1, -1); }).toThrow(RangeError);
});

test("valor deve ser inteiro", () => {
  expect(() => funcao(10.3, 5.6)).toThrow(RangeError);
});
