
package atividade;

public class Subtrair {

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    private double resultado;

    public Subtrair(double valor1, double valor2) {

        resultado = valor1 - valor2;
    }
}
