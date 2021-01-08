package entidades;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public interface IForca 
{
    public void carregarImagem(ImageIcon icone, JLabel label);
    public void verificarTentativa(char letra);
    public void verificarErros();
    public void verificarAcertos();
    public void atualizarPlacar();
    public void limpar(); 
}
