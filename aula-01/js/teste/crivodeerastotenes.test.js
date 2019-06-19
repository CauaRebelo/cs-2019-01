const funcao = require("../crivodeerastotenes");

test("argumento null/undefined", () => {
  let a = [];
  expect(() => { funcao(a, 2); }).toThrow();
});

test("argumento nao numerico", () => {
  let a = ["a", "b"];
  expect(() => { funcao(a, 2); }).toThrow();
});


test("valor negativo fora da faixa", () => {
  let a = ["-1"];
  expect(() => { funcao(a, 2); }).toThrow(RangeError);
});

test("Valor fora da faixa", () => {
  let a = [1];
  expect(() => funcao(a, 2)).toThrow(RangeError);
});

test("valor deve ser inteiro", () => {
  let a = [8.5];
  expect(() => funcao(a, 2)).toThrow(RangeError);
});

test("argumento null/undefined", () => {
  let a = [];
  let n;
  expect(() => { funcao(a, n); }).toThrow();
});

test("argumento nao numerico", () => {
  let a = [];
  expect(() => { funcao(a, "a"); }).toThrow();
});

test("valor negativo fora da faixa", () => {
  let a = [-1];
  expect(() => { funcao(a, -1); }).toThrow(RangeError);
});

test("Valor fora da faixa", () => {
  let a = [1];
  expect(() => funcao(a, 1)).toThrow(RangeError);
});

test("valor deve ser inteiro", () => {
  let a = [8.5];
  expect(() => funcao(a, 2.6)).toThrow(RangeError);
});

test("Vetor não está zerado", () => {
    expect(() => { funcao([0, 2, 1, -1, 0, 0], 6); }).toThrow(RangeError);
});

test("Caso classico", () => {
    expect(funcao([0, 0, 0, 0, 0, 0], 6)).toEqual([0, 0, 0, 0, 1, 0, 1]);
});

