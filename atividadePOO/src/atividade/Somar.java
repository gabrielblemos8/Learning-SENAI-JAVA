package atividade;

public class Somar {

    private double resultado;

    public Somar(double valor1, double valor2) {

        resultado = valor1 + valor2;

    }

    public double Calcular(Somar somar1) {
        return 0;

    }

    Somar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

}
