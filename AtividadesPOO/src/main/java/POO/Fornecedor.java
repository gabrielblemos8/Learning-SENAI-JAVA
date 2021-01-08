
package POO;

public class Fornecedor extends Pessoa {
    private String cnpj;
    
    public String getCnpj(){
        return cnpj;
    }
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    
    public boolean Cadastro(boolean resp){
        if(resp == true){
            System.out.println("Cadastro realizado com sucesso");
        }else{
            System.out.println("Erro ao cadastrar fornecedor");
        }
        return resp;
    }

    void setCodigo(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int getCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
