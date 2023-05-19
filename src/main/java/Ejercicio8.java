import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la temperatura en grados Celsius: ");
        double Celsius = scanner.nextDouble();

        scanner.close();

        double Fahrenheit = (273.15 + Celsius);
        double Kelvin = (1.8 * Celsius);

        System.out.println("La temperatura en Kelvin es: " + Kelvin
                + " y la temperatura en Fahrenheit es: " + Fahrenheit);
    }
}