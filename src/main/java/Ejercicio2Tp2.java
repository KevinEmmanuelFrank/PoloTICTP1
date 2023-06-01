import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2Tp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String palabra = scanner.nextLine();
        scanner.close();

        char[] array = palabra.toLowerCase().toCharArray();
        char[] palindromo = new char[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            palindromo[i] = array[palabra.length() - i - 1];
        }
        if (Arrays.equals(palindromo, array)) {
            System.out.println("Es palíndromo");
        }
        else {
            System.out.println("No es palíndromo");
        }
    }


}
