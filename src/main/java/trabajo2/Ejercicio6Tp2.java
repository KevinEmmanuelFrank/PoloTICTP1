package trabajo2;

public class Ejercicio6Tp2 {
    public static void main(String[] args) {
        for (int i = 2; i < 200; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.print(i + ", ");
            }
        }
    }
}