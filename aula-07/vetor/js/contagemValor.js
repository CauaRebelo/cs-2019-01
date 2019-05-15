function contagemValor(vet, valor) {
    let contagem = 0;
    for(let i=0;i < vet.length;i++) {
       if(vet[i] == valor) {
           contagem++;
       }
    }
    return contagem;
}
module.exports = contagemValor;
