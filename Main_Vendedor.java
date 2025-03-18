import javax.swing.JOptionPane;

public class Main_Vendedor {

    public static void main(String[] args) {
        
        Vendedor vendedor = null;
        int opcao;
        double desconto;
        
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog("\n----------- Menu -----------\n[1] Cadastrar Vendedor\n[2] Calcular Venda\n[3] Sair\n\nDigite o que deseja fazer:"));
    
            switch(opcao){
                case 1: {
                    String nome = JOptionPane.showInputDialog("Digite o nome da pessoa:");
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da pessoa:"));
                    double percentualComissao = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de comissão:"));
                    
                    vendedor = new Vendedor(codigo, nome, percentualComissao);
                    JOptionPane.showMessageDialog(null, "Cadastro Realizado!");
                    break;
                }
                
                case 2: {
                    if (vendedor == null) {
                        JOptionPane.showMessageDialog(null, "Nenhum vendedor cadastrado!");
                        break;
                    }
                    double valorVenda = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da venda:"));
                    desconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o desconto:"));
                    
                    if (desconto == 0) {
                        JOptionPane.showMessageDialog(null, vendedor.imprimir(valorVenda));
                    } else {
                        JOptionPane.showMessageDialog(null, vendedor.imprimir(valorVenda, desconto));
                    }
                    break;
                }
                
                case 3: {                   
                    break;
                }
                default: JOptionPane.showMessageDialog(null, "Opcao invalida!");
            }
        }while(opcao != 3);
    }
}
