package TesteDIO6;

public class Produto {
    
    private String nome;
    private Double valor;
    private Integer tipo;
    
    public Produto(String nome, Double valor, Integer tipo) {
        this.nome = nome;
        this.valor = valor;
        this.tipo = tipo;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    public Double getValor() {
        return valor;
    }
 
    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }
    public Integer getTipo() {
        return tipo;
    }
    
}
