import java.util.Scanner;
public class Ejercicio1Tp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int entero = scanner.nextInt();
        scanner.close();

        System.out.println("Tabla de multiplicar del " + entero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = entero * i;
            System.out.println(entero + " x " + i + " = " + resultado);
        }
    }
}

