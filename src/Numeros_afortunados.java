
import java.util.Scanner;

public class Numeros_afortunados {
    public static final String R = "\u001B[31m";
    public static final String V = "\u001B[32m";
    public static final String B = "\u001B[97m";
    public static final String C = "\u001B[36m";
    public static final String A = "\u001B[33m";
    public static final String CC = "\u001B[96m";
    public static final String RS = "\u001B[0m";
    public static final String I = "\u001B[3m";
    public static final String N = "\u001B[1m";

    public static int eliminar(int[] numeros, int cantidad, int m) {
        for (int i = 0; i < cantidad; i += m - 1) {
            for (int j = i; j < cantidad - 1; j++) {
                numeros[j] = numeros[j + 1];
            }
            cantidad--;
        }
        return cantidad;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(V + "Introduce un numero: " + RS);
        if (!sc.hasNextInt()) {
            System.out.println(R + "ERROR! Introduce un numero entero." + RS);
            return;
        }
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println(R + "El numero debe ser mayor o igual a 2." + RS);
            return;
        }
        int[] n_array = new int[n];
        int cantidad = n;
        for (int i = 0; i < n; i++) {
            n_array[i] = i + 1;
        }
        int numero_m = 2;
        while (cantidad >= numero_m) {
            cantidad = eliminar(n_array, cantidad, numero_m);
            numero_m++;
        }
        System.out.print(CC + "Numeros afortunados: " + RS);
        for (int i = 0; i < cantidad; i++) {
            System.out.print(n_array[i] + " ");
        }
    }
}