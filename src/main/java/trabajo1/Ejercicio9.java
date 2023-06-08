package trabajo1;

import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de pesos a calcular: ");
        double pesos = scanner.nextDouble();

        scanner.close();

        // Las fórmulas de conversión tienen un error
        double dolar = pesos / 231.68;
        double euro =  pesos / 250.69;
        double guaranies = 31 * pesos;
        double real = pesos / 46.81 ;

        System.out.printf("Dólares: %.4f\nEuros: %.4f\nGuaraníes: %.1f\nReales: %.4f", dolar, euro, guaranies, real);
    }
}

