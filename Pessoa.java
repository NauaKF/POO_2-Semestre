package Aula3;

public class Pessoa {
    
    private String cpf;
    private String nome;
    private char sexo;
    private int idade;
    
    public Pessoa(String cpf, String nome, char sexo, int idade){
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public String getNome(){
        return nome;
    }
    
    public char getSexo(){
        return sexo;
    }
    
    public int getIdade(){
        return idade;
    }
   
    public void imprimir(){
        System.out.println("\nDados do aluno:");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Sexo: " + sexo);
        System.out.println("Idade: " + idade);
    }
}
