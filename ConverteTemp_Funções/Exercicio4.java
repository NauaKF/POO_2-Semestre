import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius que deseja converter:");
        double celsius = scn.nextDouble();

        double fahrenheit = conversao(celsius);

        System.out.println("\nA temperatura em Fahrenheit = " + fahrenheit);
    }

    public static double conversao(double celsius) {
        return celsius * 9 / 5 + 32;
    }
}
