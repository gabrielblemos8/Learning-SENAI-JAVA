
package POO;

public class Cliente extends Pessoa {

    static int getCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
  
    private String cpf;
    private String dataDeNascimento;

    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getDataDeNascimento(){
        return dataDeNascimento;
    }
    public void setDataDeNascimento(String dataDeNascimento){
        this.dataDeNascimento = dataDeNascimento;
    }
    
    public boolean Cadastrar(boolean resp){
        
        if(resp == true){
            System.out.println("Cliente cadastrado com sucesso!");
        }else{
            System.out.println("Cliente não cadastrado!");
        }
        return resp;
    }
    public boolean Atualizar(boolean resp){
        if(resp == true){
            System.out.println("Cliente atualizado com sucesso!");
        }else{
            System.out.println("Cliente não atualizado!");
        }
        return resp;
    }

    void setCodigo(int i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
