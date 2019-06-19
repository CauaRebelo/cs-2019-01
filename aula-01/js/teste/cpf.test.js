const funcao = require("../cpf");

test("814.465.990-27 satisfaz (caso classico)", () => {
  let a = [8, 1, 4, 4, 6, 5, 9, 9, 0, 2, 7];
  expect(funcao(a)).toBe(true);
});

test("000.000.001-90 nao satisfaz", () => {
  let a = [0, 0, 0, 0, 0, 0, 0, 0, 1, 9, 0];
  expect(funcao(a)).toBe(false);
});

test("argumento null/undefined", () => {
  let a = [];
  expect(() => { funcao(a); }).toThrow();
});

test("argumento nao numerico", () => {
  let a = ["a", "b"];
  expect(() => { funcao(a); }).toThrow();
});


test("valor negativo fora da faixa", () => {
  let a = ["-1"];
  expect(() => { funcao(a); }).toThrow(RangeError);
});

test("valor com mais de 4 digitos fora da faixa", () => {
  let a = [10];
  expect(() => funcao(a)).toThrow(RangeError);
});

test("valor deve ser inteiro", () => {
  let a = [8.5];
  expect(() => funcao(a)).toThrow(RangeError);
});
