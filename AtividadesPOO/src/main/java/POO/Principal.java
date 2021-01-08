
package POO;

public class Principal {
    public static void main (String[] args){
        Cliente cli = new Cliente();
        Fornecedor fornecedor = new Fornecedor();
        Produto produto = new Produto();
        Vendas  venda = new Vendas();
        cli.setCodigo(1);
        cli.setNome("Gabriel");
        cli.setCpf("12354321");
        fornecedor.setCodigo(2);
        fornecedor.setCnpj("4132");
        fornecedor.setNome("BBB");
        produto.setIdProduto(3);
        produto.setIdFornecedor(fornecedor.getCodigo());
        produto.setQuantidade(2);
        produto.setNome("ABC");
        venda.setIdVendas(4);
        venda.setIdCliente(Cliente.getCodigo());
        venda.setIdProduto(produto.getIdProduto());
        venda.setQuantidade(1);
        double total = venda.CalcularJuros(venda.getQuantidade(), 25, 2);
        System.out.println("Dados do cliente: "+cli.getCpf()+" "+cli.getNome());
        System.out.println("Dados do fornecedor: "+fornecedor.getCnpj()+" "+fornecedor.getNome());
        System.out.println("Dados do produto: "+produto.getNome());
        System.out.println("Dados da venda: "+venda.getIdVendas()+ "QTD = "+venda.getQuantidade());
        System.out.println("Total: "+total);
        venda.Cadastrar(true);
    }
}
