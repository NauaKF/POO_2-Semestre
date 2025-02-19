import java.util.Scanner;

public class Exercicio1{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        double num1 = 0.0, num2 = 0.0;
        char opcao = ' ';
        
        System.out.println("Digite o primeiro numero:");
        num1 = scn.nextDouble();

        System.out.println("Digite o segundo numero:");
        num2 = scn.nextDouble();

        System.out.println("Digite a operacao desejada:");
        opcao = scn.next().charAt(0);

        while (opcao == '/' && num2 == 0) {
            System.out.println("\nNão existe divisão por 0!");
            System.out.println("Digite o segundo numero:");
            num2 = scn.nextDouble();
        }

        double resultado = calcular(num1, num2, opcao);

        System.out.println("Resultado = " + resultado);
    }

    public static double calcular(double num1, double num2, char opcao){
        double result = 0.0;
        switch (opcao) {
            case '+': 
                return num1 + num2;

            case '-': 
                return num1 - num2;

            case '*': 
                return num1 * num2;
                
            case '/': 
                return num1 / num2;
        
            default: System.out.println("\nOpcao Invalida!");
                return 0;
        }
    }
}