public class Main_ContaBancaria {

    public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria();
        
        conta.depositar(100);
        System.out.println(conta.getSaldo());
        conta.sacar(100);
        System.out.println(conta.getSaldo());
    }
    
}
