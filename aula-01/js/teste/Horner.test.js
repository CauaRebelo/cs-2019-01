const funcao = require("../Horner");

test("argumento null/undefined", () => {
  expect(() => { funcao(); }).toThrow();
});

test("argumento nao numerico", () => {
  expect(() => { funcao(1, "abcd", 1); }).toThrow();
});


test("valor negativo fora da faixa", () => {
  expect(() => { funcao(1, -1, 1); }).toThrow(RangeError);
});

test("valor deve ser inteiro", () => {
  expect(() => funcao(1, 10.3, 1)).toThrow(RangeError);
});

