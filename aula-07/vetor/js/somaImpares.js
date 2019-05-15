function somaImpares(vet) {
    let soma = 0;
    for(let i=0;i < vet.length;i++) {
       if(vet[i]%2 != 0) {
           soma += vet[i];
       }
    }
    return soma;
}
module.exports = somaImpares;
