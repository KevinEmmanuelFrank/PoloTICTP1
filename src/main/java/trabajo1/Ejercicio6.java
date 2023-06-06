package trabajo1;

import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto:");
        float precio = scanner.nextFloat();

        System.out.println("Ingrese el descuento a calcular:");
        int descuento = scanner.nextInt();
        scanner.close();

        float totalDescuento = precio * descuento / 100;
        float totalPrecio = precio - totalDescuento;
        System.out.println("El descuento total es de: "+ totalDescuento
                + " y el precio total a pagar es de: " + totalPrecio);
    }
}