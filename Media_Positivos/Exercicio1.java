import java.util.Scanner;

public class Exercicio1{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int num = 0, cont = 0, soma = 0;

       do {
        System.out.println("Digite o valor desejado:");
        num = scn.nextInt();
        
        if(num >= 0){
            soma += num;
            cont++;
        }
       } while (num >= 0);

       if(cont > 0){
        System.out.println("\nResultado = " + (soma / cont));
       } else{
        System.out.println("\nNao foi digitado nenhum numero positivo!");
       }
    }
}