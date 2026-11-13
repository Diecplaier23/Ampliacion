
import java.util.Scanner;

public class Año_2013 {
    public static final String R = "\u001B[31m";  // Rojo
    public static final String V = "\u001B[32m";  // Verde
    public static final String B = "\u001B[97m";  // Blanco
    public static final String C = "\u001B[36m";  // Cian
    public static final String A = "\u001B[33m";  // Amarillo
    public static final String CC = "\u001B[96m";// Cian claro
    public static final String RS = "\u001B[0m";//Reiniciar
    public static final String I = "\u001B[3m"; // Cursiva
    public static final String N = "\u001B[1m";// Restablece el color original

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(V + "Introduce un año con formato aaaa" + RS + "\n");
        int año_inicial = sc.nextInt();
        if (año_inicial < 1000 || año_inicial > 9999) {
            System.out.println(R + "Introduce un año de cuatro cifras." + RS);
            return;
        }
        int año = siguienteAño(año_inicial);
        System.out.print(V + "Desde el " + B + año_inicial
                + V + " hasta el " + B + año + RS + "\n");
    }
    public static int siguienteAño(int año) {
        boolean repetido;
        do {
            año++;
            repetido = tieneDigitosRepetidos(año);
        } while (repetido && año < 9999);
        return año;
    }
    public static boolean tieneDigitosRepetidos(int año) {
        String año_texto = String.valueOf(año);
        int[] año_arr = new int[año_texto.length()];

        for (int i = 0; i < año_arr.length; i++) {
            año_arr[i] = Character.getNumericValue(año_texto.charAt(i));
        }
        boolean repetido = false;
        for (int i = 0; i < año_arr.length; i++) {
            for (int j = i + 1; j < año_arr.length; j++) {
                if (año_arr[i] == año_arr[j]) {
                    repetido = true;
                    break;
                }
            }
            if (repetido) {
                break;
            }
        }
        return repetido;
    }
}
