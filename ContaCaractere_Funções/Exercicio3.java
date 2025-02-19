import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite a frase desejada:");
        String frase = scn.nextLine().toLowerCase();
        System.out.println("\nAgora digite a letra que deseja encontrar:");
        char letra = scn.nextLine().toLowerCase().charAt(0);

        int contagem = contagem(frase, letra);

        System.out.println("\nExistem " + contagem + " letra(s) " + letra + " nessa frase.");
    }

    public static int contagem(String frase, char letra) {
        int cont = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                cont++;
            }
        }
        return cont;
    }
}