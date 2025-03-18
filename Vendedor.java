public class Vendedor {
    
    private int codigo;
    private String nome;
    private double percentualComissao;
    
    public Vendedor(){
    }
    
    public Vendedor(int codigo, String nome, double percentualComissao){
        this.codigo = codigo;
        this.nome = nome;
        this.percentualComissao = percentualComissao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
    
    public double calcularPagComissao(double valorVenda){
        return valorVenda * percentualComissao / 100;
    }
    
    public double calcularPagComissao(double valorVenda, double desconto){
        return calcularPagComissao(valorVenda) - desconto;
    }
    
    public String imprimir(){
        String mostrar = "\nCodigo = " + this.codigo + "\nNome = " + this.nome + "\n% comissao = " + this.percentualComissao;
        return mostrar;
    }
    
    public String imprimir(double valorVenda, double desconto){
        String mostrar = "\nCodigo: " + this.codigo + "\nNome: " + this.nome + "\nValor de Venda: " + valorVenda + "R$" + "\nComissao: " + this.percentualComissao + "%" + "\nDesconto: " + desconto + "R$" + "\nValor a pagar = " + this.calcularPagComissao(valorVenda, desconto) + "R$";
        return mostrar;
    }
    
    public String imprimir(double valorVenda){
        String mostrar = "\nCodigo: " + this.codigo + "\nNome: " + this.nome + "\nValor de Venda: " + valorVenda + "R$" + "\nComissao: " + this.percentualComissao + "%" + "\nValor a pagar: " + this.calcularPagComissao(valorVenda) + "R$";
        return mostrar;
    }
}
