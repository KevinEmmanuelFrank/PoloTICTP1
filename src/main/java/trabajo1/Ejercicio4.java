package trabajo1;

import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la primer altura:");
        float a = scanner.nextFloat();

        System.out.println("Ingrese la segunda altura:");
        float b = scanner.nextFloat();

        System.out.println("Ingrese la tercer altura:");
        float c = scanner.nextFloat();

        scanner.close();

        float alturaPromedio = ((a + b + c)/3);

        System.out.println("La altura promedio es: " + alturaPromedio);
    }
}