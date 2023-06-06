package trabajo2;

import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio3Tp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números enteros que ingresará: ");
        int cantidad = scanner.nextInt();
        int[] array = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el " + (i + 1) + "º entero: ");
            int numero = scanner.nextInt();
            array[i] = numero;
        }
        scanner.close();

        Arrays.sort(array);

        System.out.println("Números ordenados:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print(array[i] + "  ");
        }
    }
}
