import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main_Funcionario {

    public static void main(String[] args) {
        
        Funcionario funcionario = null;
        ArrayList<Funcionario> lstFuncionarios = new ArrayList<Funcionario>();
        
        int sair = 0;
        
        do{
            int num = Integer.parseInt(JOptionPane.showInputDialog("\n----- Sistema de Funcionario -----\n[1] Cadastrar Funcionario\n[2] Mostrar todos os funcionarios\n[3] Mostrar um funcionario especifico\n[4] Sair"));
            
            switch(num){
                case 1: 
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo"));
                    String nome = JOptionPane.showInputDialog("Digite o nome");
                    String setor = JOptionPane.showInputDialog("Digite o setor");
                    String funcao = JOptionPane.showInputDialog("Digite a funcao");
                    double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario"));
        
                    funcionario = new Funcionario(codigo, nome, setor, funcao, salario);
                    lstFuncionarios.add(funcionario);
                    break;
                    
                case 2:{
                    if (lstFuncionarios.isEmpty()) {
                        System.out.println("Sem armas no momento");
                    }else{
                        for(Funcionario f : lstFuncionarios){
                            System.out.println(f.imprimir());
                        }
                    }
                    break;
                }
                
                case 3:{
                    int busca = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do Funcionario que deseja buscar"));
                    boolean achou = false;
                    for (int i=0; i < lstFuncionarios.size(); i++) {
                        if (lstFuncionarios.get(i).getCodigo() == busca) {
                            System.out.println(lstFuncionarios.get(i).imprimir());
                            achou = true;
                            break;
                        }
                    }
                        if(!achou){
                            System.out.println("Funcionario nao encontrado!");
                        }
                    break;
                }
                
                case 4:{
                    sair = 4;
                    break;
                }
                
                default: System.out.println("Opcao invalida!");
            }
        }while(sair != 4);
    }
    
}
