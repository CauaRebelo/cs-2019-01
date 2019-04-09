var a = prompt('Digite um numero n maior e igual a 100 e menor e igual a 999')
if(a >= 100 && a >= 999)
{
console.log('Numero invalido')
}
else
{
var b = a/100;
b = parseInt(b);
var c = a%100;
c= parseInt(c);
var d = c/10;
d= parseInt(d);
var e = c%10;
console.log(a == (Math.pow(b, 3) + Math.pow(d, 3) + Math.pow(e, 3)));
}
