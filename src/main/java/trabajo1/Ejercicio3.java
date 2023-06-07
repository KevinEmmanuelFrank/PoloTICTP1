package trabajo1;

import java.util.Scanner;
public class Ejercicio3 {
    public static String operat(double a, double b) {
  /*      Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer valor:");
        double a = scanner.nextDouble();

        System.out.println("Ingrese el segundo valor:");
        double b = scanner.nextDouble();

        scanner.close();*/

        double suma = a + b;
        double resta = a - b;
        double multiplicacion = a * b;
        double division = a / b;

        System.out.println("La suma: " + suma);
        System.out.println("La resta: " + resta);
        System.out.println("La multiplicación: " + multiplicacion);
        System.out.println("La división: " + division);
        return ("La suma: " + suma + "La resta: " + resta + "La multiplicación: " + multiplicacion + "La división: " + division);
    }
}