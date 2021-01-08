package entidades;

import java.util.ArrayList;
import javax.swing.JLabel;

public class Forca extends Jogo 
{
    
    
    public Forca(int categoria)
    {
        switch(categoria)
        {
            case 0:
            setPalavra("sistema");
            break;

        }
        
    }
    public Forca()
    {
        
        
        
    }
    
    
    public boolean  validarLetra(char letra)
    {
        boolean status = false;
        char[] palavra = new char[tamanho()];
        char aux;
        
        palavra = getPalavra().toCharArray();
        
        for (int i = 0; i < tamanho(); i++)
        {
            aux = getPalavra().charAt(i);
            if (aux == letra) 
            {
                status = true;
            }
        }
        return status;
    }
    
    public String esconderPalavra()
    {
        String aux = "";
        for (int i = 0; i < tamanho(); i++)
        {
            aux += "_ ";
        }
        return aux;
    }
    
    public ArrayList<Integer> pegarIndices(char letra)
    {
        char[] aux = getPalavra().toCharArray();
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < tamanho(); i++) 
        {
            if(aux[i] == letra)
            {
                indices.add(i);
                setAcertos();
                System.out.println("acertos: "+getAcertos());
            }
        }
        return indices;
    }
    
    public String trocarLetra(char letra, String Secreta, ArrayList<Integer> indices)
    {
        String[] sec = Secreta.split(" ");
        String novaSecreta = "";
        for(int i = 0; i < indices.size(); i++)
        {
            sec[indices.get(i)] = String.valueOf(letra);
        }
        for(int i = 0; i < tamanho(); i++)
        {
            novaSecreta += sec[i]+" ";        
        }
        setSecreta(novaSecreta);
        return getSecreta();
    }
    
   
}
