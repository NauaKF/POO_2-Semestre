public class Apolice {
    
    private int numero;
    private String nome;
    private int idade;
    private char sexo;
    private double valorAutomovel;
    
    public Apolice(){
    }
    
    public void Apolice(int numero, String nome, int idade, char sexo, double valorAutomovel){
        this.idade = idade;
        this.nome = nome;
        this.numero = numero;
        this.sexo = sexo;
        this.valorAutomovel = valorAutomovel;
    }
    
    public double calcularValor(){
        if(sexo == 'M' && idade <= 25){
            return this.valorAutomovel*10/100;
        }
        else if(sexo == 'M' && idade > 25){
            return this.valorAutomovel*5/100;
        }
        else {
            return this.valorAutomovel*2/100;
        }
    }
    
    public String imprimir(){
        String str = "\nNumero = " + this.numero + "\nNome = " + this.nome + "\nIdade = " + this.idade + "\nSexo = " + this.sexo + "\nValor do Automovel = " + valorAutomovel + "\nValor da Apolice = " + calcularValor();
        return str;     
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getValorAutomovel() {
        return valorAutomovel;
    }

    public void setValorAutomovel(double valorAutomovel) {
        this.valorAutomovel = valorAutomovel;
    }
    
    
    
}
