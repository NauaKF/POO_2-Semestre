package Aula3;

public class Produto {
    private String nome;
    private float valor;
    private int quantidade;
    
    public Produto(String nome, float valor, int quantidade){
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setValor(float valor){
        this.valor = valor;
    }
    
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
    public String getNome(){
        return nome;
    }
    
    public float getValor(){
        return valor;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
}
