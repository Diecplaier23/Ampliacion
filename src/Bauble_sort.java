import java.util.Scanner;

public class Bauble_sort {
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
        int[] numeros = {5, 2, 8, 1, 4};


        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int auxiliar = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = auxiliar;
                }
            }
        }
        System.out.print(CC + "Array ordenado: " + RS);
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
