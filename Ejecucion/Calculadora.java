package Ejecucion;

public class Calculadora {

    private int num1;
    private int num2;



    public Calculadora (int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int sumar(){
        int suma = this.num1 + this.num2;
        return suma;
    }

    public int restar(){
        int resta = this.num1 - this.num2;
        return resta;
    }

    public int multiplicar(){
        int multiplicacion = this.num1*this.num2;
        return multiplicacion;
    }
    public double dividir(){
        double  division = (double)this.num1/(double) this.num2;
        return division;
    }
    ////////////////////////////7
    public int getnum1() {
        return num1;
    }

    public int getnum2() {
        return num2;
    }

    public void setnum1(int num1) {
        this.num1 = num1;
    }

    public void setnum2(int num2) {
        this.num2 = num2;
    }
}
