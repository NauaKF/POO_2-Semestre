import java.util.Scanner;

public class Exercicio5{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner (System.in);

        int vetor[] = new int[5];
        int soma = 0, mult = 1;

        for(int i = 0; i<vetor.length; i++){
            System.out.println("Digite o " + (i+1) + " valor do vetor");
            vetor[i] = scn.nextInt();

            soma += vetor[i];
            mult *= vetor[i];
        }

        System.out.println();

        for(int i = 0; i<vetor.length; i++){
            System.out.println("Numeros = " + vetor[i]);
        }
        System.out.println("Soma = " + soma);
        System.out.println("Multiplicacao = " + mult);
    }
}