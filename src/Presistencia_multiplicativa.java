import java.util.Scanner;

public class Presistencia_multiplicativa {
    public static final String R = "\u001B[31m";
    public static final String V = "\u001B[32m";
    public static final String B = "\u001B[97m";
    public static final String C = "\u001B[36m";
    public static final String A = "\u001B[33m";
    public static final String CC = "\u001B[96m";
    public static final String RS = "\u001B[0m";
    public static final String I = "\u001B[3m";
    public static final String N = "\u001B[1m";

    public static int multiplicarDigitos(int numero) {
        int resultado = 1;

        while (numero > 0) {
            resultado *= numero % 10;
            numero /= 10;
        }
        return resultado;
    }
    public static int calcular(int numero) {
        int iteraciones = 0;
        while (numero >= 10) {
            numero = multiplicarDigitos(numero);
            iteraciones++;
        }
        return iteraciones;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(V + "Introduce un numero: " + RS);
        int numero = sc.nextInt();
        if (numero < 0) {
            System.out.println(R + "Introduce un numero positivo." + RS);
            return;
        }
        System.out.println(CC + "Persistencia multiplicativa: " +B+N+ calcular(numero) + RS);
    }
}
