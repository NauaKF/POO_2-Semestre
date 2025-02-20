public class ContaBancaria {
    private String id;
    private double saldo;
    
    
    public double getSaldo(){
        return saldo;
    }
    
    public void depositar(double valor){
        this.saldo = saldo + valor;
    }
    
    public void sacar(double valor){
        this.saldo = saldo - valor;
    }
}