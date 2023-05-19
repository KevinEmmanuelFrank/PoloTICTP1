import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la primer edad:");
        int edad1 = scanner.nextInt();

        System.out.println("Ingrese la segunda edad:");
        int edad2 = scanner.nextInt();;

        scanner.close();

        int temp = edad1;
        edad1 = edad2;
        edad2 = temp;

        System.out.println("La edad 1 es: " + edad1 + " y la edad 2 es: " + edad2);
    }
}