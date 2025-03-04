public class Animal {
    
    private String nome;
    private String tipo;
    private int idade;
    private int energia = 100;
    private int felicidade = 100;
    
    public Animal(String nome, String tipo, int idade){
        this.nome = nome;
        this.tipo = tipo;
        this.idade = idade;
    }
    
    public void alimentar(){
        System.out.println(nome + " foi alimentado(a)!");
        energia += 10;
    }
    
    public void brincar(){
        System.out.println(nome + " esta brincando e esta mais feliz!");
        felicidade += 10;
        energia -= 5;
    }
    
    public void dormir(){
        System.out.println(nome + " dormiu e esta com energia maxima!");
        energia = 100;
    }
    
    public void mostraStatus(){
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Idade: " + idade);
        System.out.println("Energia: " + energia);
        System.out.println("Felicidade: " + felicidade);
    }
}
