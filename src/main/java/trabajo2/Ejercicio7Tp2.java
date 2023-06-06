package trabajo2;

import java.util.Scanner;

public class Ejercicio7Tp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Es herbívoro?");
        String respuesta = scanner.nextLine();
        boolean herb = guardarRespuesta(respuesta);

        System.out.println("¿Es mamífero?");
        respuesta = scanner.nextLine();
        boolean mam = guardarRespuesta(respuesta);

        System.out.println("¿Es doméstico?");
        respuesta = scanner.nextLine();
        boolean dom = guardarRespuesta(respuesta);

        scanner.close();
        System.out.println("El animal elegido es: " + mostrarAnimal(herb, mam, dom));
    }
        private static boolean guardarRespuesta(String respuesta) {
        boolean flag = true;
        if (respuesta.equalsIgnoreCase("no")) {
            flag = false;
        }
        return flag;
    }
    private static String mostrarAnimal(boolean herb, boolean mam, boolean dom) {
        String animal;
        if (herb && mam && dom) {
            animal = "Caballo";
        }
        else if ((!herb) && (!mam) && (!dom)) {
            animal = "Cóndor";
        }
        else if (herb && mam) {
            animal = "Alce";
        }
        else if ((!herb) && (!mam)) {
            animal = "Pitón";
        }
        else if (dom && mam) {
            animal = "Gato";
        }
        else if ((!dom) && (!mam)) {
            animal = "Caracol";
        }
        else if (herb) {
            animal = "Tortuga";
        }
        else {
            animal = "León";
        }
        return animal;
    }
}

