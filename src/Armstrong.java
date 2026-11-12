import java.util.Scanner;

/*
assertEquals(amstrong.armstrong(370), true);
assertEquals(amstrong.armstrong(371), true);
assertEquals(amstrong.armstrong(407), true);
assertEquals(amstrong.armstrong(698), false);
*/
public class Armstrong {
    public static final String R = "\u001B[31m";
    public static final String V = "\u001B[32m";
    public static final String A = "\u001B[33m";
    public static final String RS = "\u001B[0m";

    public static void main(String[] args) {
    //Declarar variables
        int num, n_cifras, cifra, resultado=0;
    //Pedir numero al usuario
        Scanner sc = new Scanner(System.in);
        System.out.println(V + "Introduce un numero para comprobar si es un numero de Armstrong:" + RS);
        num = sc.nextInt();
    //Cuenta el numero de cifras

        char[] cifras = String.valueOf(num).toCharArray();
        n_cifras = cifras.length;


    //Cuenta cada cifra y la eleva


        for (int i = 0; i < n_cifras; i++) {
            cifra = Character.getNumericValue(cifras[i]);

            resultado += (int) Math.pow(cifra, n_cifras); // Eleva cifra al numero de cifras

        }
        if (resultado == num) {
            System.out.println(V + A + num + V + " Es un numero de Armstrong" + RS);
        } else {
            System.out.println(R + A + num + R + " no es un numero de Armstrong" + RS);
        }
    }
}
