
package POO;

public class Vendas {
    private int idVendas;
    private int idCliente;
    private int idProduto;
    private int quantidade;

    public int getIdVendas() {
        return idVendas;
    }
    public void setIdVendas(int idVendas) {
        this.idVendas = idVendas;
    }

    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdProduto() {
        return idProduto;
    }
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public void Cadastrar(boolean resp){
        if(resp){
            System.out.println("Venda realizada");
        }else{
            System.out.println("Venda cancelada"); 
        } 
    }
    
    public boolean Atualizar(){
        return true;
    }
    
    public double CalcularJuros(int quantidade, double valor){
        double calculo = 0;
        calculo = quantidade * valor;
        return calculo;
    }
    
    public double CalcularJuros(int quantidade, double valor, int juros){
        double calculo = 0;
        calculo = (quantidade * valor) * juros;
        return calculo;
    }
 
}
