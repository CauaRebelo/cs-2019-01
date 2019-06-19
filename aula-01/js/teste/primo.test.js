const funcao = require("../primo");

test("2 satisfaz (caso classico)", () => {
  expect(funcao(2)).toBe(true);
});

test("9 nao satisfaz", () => {
  expect(funcao(9)).toBe(false);
});

test("argumento null/undefined", () => {
  expect(() => { funcao(); }).toThrow();
});

test("argumento nao numerico", () => {
  expect(() => { funcao("abcd"); }).toThrow();
});

test("Valor fora da faixa", () => {
  expect(() => {funcao(0);}).toThrow(RangeError);
});

test("valor negativo fora da faixa", () => {
  expect(() => { funcao(-1); }).toThrow(RangeError);
});

test("valor deve ser inteiro", () => {
  expect(() => funcao(10.3)).toThrow(RangeError);
});