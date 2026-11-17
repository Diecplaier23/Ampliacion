
import java.util.Scanner;

public class Reversible {
    public static final String R = "\u001B[31m";
    public static final String V = "\u001B[32m";
    public static final String B = "\u001B[97m";
    public static final String C = "\u001B[36m";
    public static final String A = "\u001B[33m";
    public static final String CC = "\u001B[96m";
    public static final String RS = "\u001B[0m";
    public static final String I = "\u001B[3m";
    public static final String N = "\u001B[1m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(V + "Introduce un numero: " + RS);
        int numero = sc.nextInt();
        if (numero < 0) {
            System.out.println(R + "Introduce un numero positivo." + RS);
            return;
        }
        if (esReversible(numero)) {
            System.out.println(CC + "El numero es reversible." + RS);
        } else {
            System.out.println(R + "El numero NO es reversible." + RS);
        }
    }
    public static int invertir(int numero) {
        int invertido = 0;
        while (numero > 0) {
            invertido = invertido * 10 + numero % 10;
            numero /= 10;
        }
        return invertido;
    }
    public static boolean impares(int numero) {
        while (numero > 0) {
            if (numero % 10 % 2 == 0) {
                return false;
            }
            numero /= 10;
        }
        return true;
    }
    public static boolean esReversible(int numero) {
        int invertido = invertir(numero);
        if (String.valueOf(numero).length() != String.valueOf(invertido).length()) {
            return false;
        }
        return impares(numero + invertido);
    }
}
