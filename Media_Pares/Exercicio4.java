import java.util.Scanner;

public class Exercicio4{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int numero = 0;
        double soma = 0, cont = 0, media = 0;

        do {
            System.out.println("Digite o numero:");
            numero = scn.nextInt();

            if(numero % 2 == 0 && numero != 0){
            soma += numero;
            cont++;
            }
            
        } while (numero != 0);

        if(cont > 0){
            media = soma/cont;
            System.out.println("\nMedia = " + media);
        } else{
            System.out.println("Nenhum numero par foi digitado!");
        }
    }
}