var a = prompt('Digite um numero n maior que 0 e menor e igual a 9999')
if(a <= 0 && a > 9999)
{
console.log('Numero invalido')
}
else
{
var b = a/100;
b = parseInt(b);
var c = a%100;
console.log(a == Math.pow(b+c, 2))
}
