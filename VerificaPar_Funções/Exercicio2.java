import java.util.Scanner;

public class Exercicio2{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int num = 0;
        int verificaPar = 0;

        System.out.println("Digite o numero que deseja verificar:");
        num = scn.nextInt();

        boolean resultado = verificaPar(num);
        System.out.println(resultado);
    }

    public static boolean verificaPar(int num){
        return num % 2 == 0;
    }
}
