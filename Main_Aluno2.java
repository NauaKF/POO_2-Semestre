package Aula3;

public class Main_Aluno {

    public static void main(String[] args) {
        
        Aluno alu = new Aluno("Kauan", 21, "Gestao de TI");
        
        System.out.println(alu.getNome());
        System.out.println(alu.getIdade());
        System.out.println(alu.getCurso());
    }
    
}
