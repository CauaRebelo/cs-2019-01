function propriedade153(numero){
if(numero >= 100 && numero >= 999)
{
return(false)
}
else
{
var b = numero/100;
b = parseInt(b);
var c = a%100;
c= parseInt(c);
var d = c/10;
d= parseInt(d);
var e = c%10;
return(numero == (Math.pow(b, 3) + Math.pow(d, 3) + Math.pow(e, 3)));
}
}
