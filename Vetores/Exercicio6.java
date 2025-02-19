import java.util.Scanner;

public class Exercicio6{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        int vetor[] = new int[10];
        int vetorPar[] = new int[10];
        int vetorImpar[] = new int[10];

        for(int i = 0; i<vetor.length; i++){
            System.out.println("Digite o " + (i+1) + " valor do Vetor:");
            vetor[i] = scn.nextInt();

            if(vetor[i] % 2 == 0){
                vetorPar[i] = vetor[i];
            } else{
                vetorImpar[i] = vetor[i];
            }
        }
        for(int i = 0; i<vetor.length; i++){
            System.out.println("Vetor Principal = " + vetor[i]);
        }
        
        System.out.println();

        for(int i = 0; i<vetor.length; i++){
            System.out.println("Vetor Par = " + vetorPar[i]);
        }

        System.out.println();

        for(int i = 0; i<vetor.length; i++){
            System.out.println("Vetor Impar = " + vetorImpar[i]);
        }
    }
}
