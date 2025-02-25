package Aula2_Exercicio;

public class Main_Cliente {

    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();
        
        cliente.imprimir();
        
        System.out.println();
        
        cliente.setNome("Kauan");
        cliente.setCpf("555.666.777-88");
        cliente.setIdade(21);
        
        cliente.imprimir();
    }
}
