function contagemLetras(str, letra) {
    let contagem = 0;
    for(let i=0;i < str.length;i++) {
       if(str[i] == letra) {
           contagem++;
       }
    }
    return contagem;
}
module.exports = contagemLetras;
