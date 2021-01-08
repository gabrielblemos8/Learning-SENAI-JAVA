
package atividade;

public class Multiplicar {

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    private double resultado;

    public Multiplicar(double valor1, double valor2) {
        resultado = valor1 * valor2;

    }

}
