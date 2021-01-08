package entidades;

import java.util.ArrayList;
import javax.swing.JLabel;

public abstract class Jogo
{ 
    private String palavra;
    private String dica;
    private String secreta;
    private int acertos;
    private int erros;
    
    public int tamanho()
    {
        return palavra.length();
    }
  
    
    public String getPalavra() {
        return palavra;
    }
    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public String getDica() {
        return dica;
    }
    public void setDica(String dica) {
        this.dica = dica;
    }

    public int getAcertos() {
        return acertos;
    }
    public void setAcertos() {
        this.acertos++;
    }
    public void setAcertos(int acertos)
    {
        this.acertos = acertos;
    }

    public int getErros() {
        return erros;
    }
    public void setErros(int erros) {
        this.erros = erros;
    }
    public void setErros()
    {
        this.erros++;
    }
    
    public String getSecreta() 
    {
        return secreta;
    }
    public void setSecreta(String secreta) {
        this.secreta = secreta;
    } 
   
}
