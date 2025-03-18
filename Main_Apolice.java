import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main_Apolice {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        Apolice apo = new Apolice();
        int sair = 0;
        
        do{
            int num = Integer.parseInt(JOptionPane.showInputDialog("\n----- Sistema de Apolice -----\n[1] Criar Apolice\n[2] Ver Dados Apolice\n[3] Sair"));
            
            switch(num){
                case 1: 
                    int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero"));
                    String nome = JOptionPane.showInputDialog("Digite o nome");
                    int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
                    char sexo = JOptionPane.showInputDialog("Digite o sexo [M] ou [F]").charAt(0);
                    double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do automovel"));
        
                    apo.Apolice(numero, nome, idade, sexo, valor);
                    break;
                    
                case 2:{
                    System.out.println(apo.imprimir());
                    break;
                }
                
                case 3:{
                    sair = 3;
                    break;
                }
                
                default: System.out.println("Opcao invalida!");
            }
        }while(sair != 3);
    }
}
