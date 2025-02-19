import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner (System.in);
        int voto = 0, a = 0, b = 0, c = 0, d = 0, nulo = 0, branco = 0;

        do {
            System.out.println("\nDigite o seu voto para presidente!");
            System.out.println("[1] Candidato A\n[2] Candidato B\n[3] Candidato C");
            System.out.println("[4] Candidato D\n[5] Voto Nulo\n[6] Voto em Branco\n[0] Sair");
            voto = scn.nextInt();

            switch (voto) {
                case 1:
                    a++;
                    break;

                case 2:
                    b++;
                    break;

                case 3:
                    c++;
                    break;

                case 4:
                    d++;
                    break;

                case 5:
                    nulo++;
                    break;

                case 6:
                    branco++;
                    break;
        
                default:
                    System.out.println("Opcao invalida! Digite novamente.");
                    break;
            }
        } while (voto != 0);

        System.out.println("\nTotal de votos");
        System.out.println("Candidato A = " + a);
        System.out.println("Candidato B = " + b);
        System.out.println("Candidato C = " + c);
        System.out.println("Candidato D = " + d);
        System.out.println("Votos Nulo = " + nulo);
        System.out.println("Votos em Branco = " + branco);
    }
}