package Aula3;

import java.util.Scanner;

public class Main_Pessoa {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int opcao = 0;
        
        Pessoa pe = null;
        
        do{
            System.out.println("\nDigite o que deseja fazer:");
            System.out.println("[1] Criar pessoa\n[2] Mostrar pessoa\n[3] Sair");
            opcao = scn.nextInt();
           
            scn.nextLine();
            
            switch(opcao){
                case 1: { 
                    System.out.println("\nDigite o nome da pessoa: ");
                    String nome = scn.nextLine();
                
                    System.out.println("Digite o CPF da pessoa: ");
                    String cpf = scn.nextLine();
                
                    System.out.println("Digite o sexo da pessoa [M] ou [F]: ");
                    char sexo = scn.next().charAt(0);
                
                    System.out.println("Digite a idade da pessoa: ");
                    int idade = scn.nextInt();            
                    scn.nextLine();
                
                    pe = new Pessoa(nome, cpf, sexo, idade);                
                    System.out.println("\nPessoa cadastrada com sucesso!");
                    
                    break;
                }
                
                case 2: {
                    if(pe == null){
                        System.out.println("\nNenhuma pessoa cadastrada");
                    }
                    else{
                    System.out.println();
                    pe.imprimir();
                    }
                    break;
                }
                
                case 3: {
                    System.out.println("\nSaindo do programa...");
                    break;
                }
                
                default: System.out.println("\nOpcao invalida!");
            }
        }while(opcao != 3);
        
    }
    
}
