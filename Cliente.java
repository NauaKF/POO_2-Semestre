package Aula2_Exercicio;

public class Cliente {
    
    private String cpf;
    private String nome;
    private int idade;
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Idade: " + this.idade);
    }  
}
