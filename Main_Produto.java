package Aula3;

import java.util.Scanner;

public class Main_Produto {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
                
        System.out.println("Digite o nome do produto:");
        String nome = scn.nextLine();
        
        System.out.println("Digite o valor do produto:");
        float valor = scn.nextFloat();
        
        scn.nextLine();
        
        System.out.println("Digite a quantidade do produto:");
        int quantidade = scn.nextInt();
        
        Produto prod = new Produto(nome, valor, quantidade);
        
        prod.setNome(nome);
        prod.setQuantidade(quantidade);
        prod.setValor(valor);
        
        System.out.println("\nNome do produto: " + nome + "\nQuantidade = " + quantidade + "\nValor = " + valor);

    }
    
}
