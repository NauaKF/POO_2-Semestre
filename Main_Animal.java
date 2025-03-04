import java.util.Scanner;

public class Main_Animal {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int opcao = 0;
        
        Animal animal_1 = null;
        Animal animal_2 = null;
        
        do{
            System.out.println("\n----------- Menu -----------");
            System.out.println("[1] Cadastrar Animal");
            System.out.println("[2] Alimentar");
            System.out.println("[3] Brincar");
            System.out.println("[4] Dormir");
            System.out.println("[5] Imprimir Dados");
            System.out.println("[6] Sair");
            System.out.println("\nDigite o que deseja fazer:");
            opcao = scn.nextInt();
            
            scn.nextLine();
            
            switch(opcao){
                case 1: {
                    System.out.println("Digite o nome do animal:");
                    String nome = scn.nextLine();   
                    
                    System.out.println("Digite o tipo do animal [cachorro, gato...]:");
                    String tipo = scn.nextLine();
                    
                    System.out.println("Digite a idade do animal:");
                    int idade = scn.nextInt();
                    scn.nextLine();
                    
                    if(animal_1 == null){
                        animal_1 = new Animal(nome, tipo, idade);
                        System.out.println("Animal cadastrado com sucesso!");
                        
                        System.out.println("\nStatus inicial do animal:");
                        animal_1.mostraStatus();
                    }else{
                        animal_2 = new Animal(nome, tipo, idade);
                        System.out.println("Animal cadastrado com sucesso!");
                        
                        System.out.println("\nStatus inicial do animal:");
                        animal_2.mostraStatus();
                    }
                    break;
                }
                
                case 2: {
                    int op = 0;
                    if(animal_1 != null && animal_2 != null){
                        System.out.println("Digite o animal que deseja alimentar [1] ou [2]:");
                        
                        op = scn.nextInt();
                        
                        if(op == 1){
                            animal_1.alimentar();
                        }else{
                            animal_2.alimentar();
                        }
                    }
                    else if(animal_1 != null){
                       animal_1.alimentar();
                    }else if(animal_2 != null){
                        animal_2.alimentar();
                    }
                    
                    break;
                }
                
                case 3: {
                    int op = 0;
                    if(animal_1 != null && animal_2 != null){
                        System.out.println("Digite o animal que deseja brincar [1] ou [2]:");
                        op = scn.nextInt();
                        
                        if(op == 1){
                            animal_1.brincar();
                        }else{
                            animal_2.brincar();
                        }
                    }else if(animal_1 != null){
                       animal_1.brincar();
                    }else{
                        animal_2.brincar();
                    }
                    
                    break;
                }
                
                case 4: {
                    int op = 0;
                    if(animal_1 != null && animal_2 != null){
                        System.out.println("Digite o animal que deseja dormir [1] ou [2]:");
                        op = scn.nextInt();
                        
                        if(op == 1){
                            animal_1.dormir();
                        }else{
                            animal_2.dormir();
                        }
                    }else if(animal_1 != null){
                       animal_1.dormir();
                    }else{
                        animal_2.dormir();
                    }
                    break;
                }
                
                case 5: {
                    if(animal_1 != null && animal_2 != null){
                        System.out.println("\nStatus apos alteracoes:");
                        animal_1.mostraStatus();
                        System.out.println();
                        animal_2.mostraStatus();
                    }else if(animal_1 != null){
                        System.out.println("\nStatus apos alteracoes:");
                       animal_1.mostraStatus();
                    }else{
                        System.out.println("\nStatus apos alteracoes:");
                        animal_2.mostraStatus();
                    }
                    break;
                }
                
                case 6: break;
                
                default: System.out.println("Opcao invalida!");
            }
        }while(opcao != 6);
    }
}
