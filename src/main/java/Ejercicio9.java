import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de pesos a calcular: ");
        double pesos = scanner.nextDouble();

        scanner.close();

        double dolar = 231.68 / pesos;
        double euro = 250.69 / pesos;
        double guaranies = 31 * pesos;
        double real = 46.81 / pesos;

        System.out.printf("Dólares: %.4f\nEuros: %.4f\nGuaraníes: %.1f\nReales: %.4f", dolar, euro, guaranies, real);
    }
}

