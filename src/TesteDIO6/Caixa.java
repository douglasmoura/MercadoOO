package TesteDIO6;

public class Caixa {
    
    
    

    public Double calculaValorFinal(Produto produto, Integer quantidade){

        if (produto.getTipo() == 1) {       
            return (produto.getValor() * quantidade)-(produto.getValor() * 0.10);
        }else if (produto.getTipo() == 2) {
            return (produto.getValor()* quantidade)-(produto.getValor() * 0.20);
        }else if (produto.getTipo() == 3 && quantidade > 5) {
            return (produto.getValor()* quantidade)-(produto.getValor() * 0.10);
        }else return produto.getValor()* quantidade;
    }
}
