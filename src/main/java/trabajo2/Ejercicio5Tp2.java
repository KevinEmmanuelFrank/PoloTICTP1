package trabajo2;

import java.util.Scanner;

public class Ejercicio5Tp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de términos de la sucesión de Fibonnacci que desea ver: ");
        int cantidad = scanner.nextInt();
        scanner.close();
        int prim = 0;
        int seg = 1;
        if (cantidad == 1) {
            System.out.println(prim);
        } else if (cantidad == 2) {
            System.out.println(prim + ", " + seg);
        }
        else {
            System.out.print(prim + ", " + seg);
            int sum = 0;
            for (int i = 2; i < cantidad; i++) {
                sum = prim + seg;
                prim = seg;
                seg = sum;
                System.out.print(", " + sum);
            }
        }
    }
}