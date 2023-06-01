import java.util.Scanner;

public class Ejercicio4Tp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor del cual quiere hallar el factorial: ");
        int factorial = scanner.nextInt();
        scanner.close();
        int resultado = 1;
        for (int i = 1; i <= factorial; i++) {
            resultado *= i;
        }
        System.out.println("El valor del factorial es: " + resultado);
    }
}