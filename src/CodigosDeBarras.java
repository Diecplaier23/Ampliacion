import java.util.Scanner;

public class CodigosDeBarras {
    public static final String R = "\u001B[31m";
    public static final String V = "\u001B[32m";
    public static final String A = "\u001B[33m";
    public static final String RS = "\u001B[0m";

    public static void main(String[] args) {
        int n_cifras, resultado = 0;
        String codigo_de_barras = "";

        Scanner sc = new Scanner(System.in);
        System.out.println(V + "Introduce el numero de cifras del codigo de barras:" + RS);
        codigo_de_barras = sc.nextLine();
        n_cifras = codigo_de_barras.length();

        if (n_cifras != 8 && n_cifras != 13) {
            System.out.println(R + "El codigo de barras no es valido." + RS);
            return;
        }

        int[] a = new int[n_cifras];
        for (int i = 0; i < n_cifras; i++) {
            if (!Character.isDigit(codigo_de_barras.charAt(i))) {
                System.out.println(R + "El codigo de barras no es valido." + RS);
                return;
            }
            a[i] = Character.getNumericValue(codigo_de_barras.charAt(i));
        }

    //Saca los valores de cada cifra del codigo de barras y los mete en un array
    //comprobar que tipo de codigo es y calcular el digito de control
        for (int i = 0; i < n_cifras - 1; i++) {
            if ((n_cifras == 8 && i % 2 == 0) || (n_cifras == 13 && i % 2 != 0)) {
                resultado += a[i] * 3;
            } else {
                resultado += a[i];
            }
        }
        resultado = (10 - resultado % 10) % 10;
        System.out.println(V + "El digito de control es: " + A + resultado + RS);

    //comprobar si el digito de control es igual al ultimo numero del codigo de barras
        if (resultado == a[n_cifras - 1]) {
            System.out.println(V + "El codigo de barras es valido." + RS);
        } else {
            System.out.println(R + "El codigo de barras no es valido." + RS);
        }
    }
}
