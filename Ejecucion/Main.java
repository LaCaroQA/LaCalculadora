package Ejecucion;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora laCalculadora = new Calculadora(50,25);

            System.out.println("--------------------------------------------");

            int suma = laCalculadora.sumar();
            System.out.println("El resultado de la suma es: " + suma);

            System.out.println("--------------------------------------------");

            int resta = laCalculadora.restar();
            System.out.println("Resultado de la resta es: " + resta);

            System.out.println("--------------------------------------------");

            int multiplicacion = laCalculadora.multiplicar();
            System.out.println("Resultado de la multiplicación es: " + multiplicacion);

            System.out.println("--------------------------------------------");

            double division = laCalculadora.dividir();
            System.out.println("Resultado de la division es: " + division);

            System.out.println("--------------------------------------------");
    }
}