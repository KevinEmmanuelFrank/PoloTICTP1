package trabajo1;

import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor del radio de la circunferencia:");
        double radio = scanner.nextDouble();
        scanner.close();

        // La fórmula del área no es correcta
        double area = Math.PI * (radio * radio);
        double perimetro = 2 * radio * Math.PI;

        System.out.println("El área de la circunferencia es: " + area);
        System.out.println("El perímetro de la circunferencia es: " + perimetro);
    }
}