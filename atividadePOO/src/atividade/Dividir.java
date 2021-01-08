
package atividade;

public class Dividir {

    String resp;
   
    private double resultado;

    public Dividir(double valor1, double valor2) {

        int zero = (int) valor2;
        if (zero == 0) {
            resp = "false";
            resultado = 33;
        } else {
            resultado = valor1 / valor2;
        }

    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

}
