import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        double nota = 0.0, media = 0.0;
        int codigo = 0;

       do {
            System.out.println("\nDigite o codigo do aluno:");
            codigo = scn.nextInt();
            if(codigo <= 0){
                break;
            }

            double soma = 0.0;

            for(int i=0; i<3; i++){
            System.out.println("Digite a nota " + (i+1) + " do aluno");
            nota = scn.nextDouble();10
            soma += nota;
        }
        System.out.println("\nMedia = " + (soma/3));
        System.out.println("Codigo do Aluno = " + codigo);
       } while (codigo > 0);
    }
}