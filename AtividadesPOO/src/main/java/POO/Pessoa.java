
package POO;

import java.util.Date;

public class Pessoa {
    private int id; 
    private String nome;
    private String telefone;
    private String email;
    private String endereco;
    private int cpfcnpj;
    private Date dataNascimento;
    
    
    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    public Date getDataNascimento(){
        return dataNascimento;
    }
    public void setDateNascimento(Date dataNascimento){
        this.dataNascimento = dataNascimento;
    }
}
