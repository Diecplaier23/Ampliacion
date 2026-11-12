import java.util.Arrays;
import java.util.Scanner;

public class EscaleraDeColor {
    public static final String R = "\u001B[31m";
    public static final String V = "\u001B[32m";
    public static final String A = "\u001B[33m";
    public static final String RS = "\u001B[0m";

    public static void main(String[] args) {
        int num;
        int a[] = new int[4];
        System.out.println(V + "Introduce un numero tus 4 cartas" + RS);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            a[i]= sc.nextInt();
        }
        Arrays.sort(a);

            if (a[1] == a[0]+1 && a[2] == a[1]+1 && a[3] == a[2]+1) {
                if (a[3] + 1 == 14) {
                    System.out.println(A + (a[0] - 1) + RS);
                } else {
                    System.out.println(A + (a[3] + 1) + RS);
                }
            } else {
                for (int i = 1; i < a.length; i++) {
                    if (a[i] != a[i - 1] + 1 && a[i] == a[i - 1] +2) {
                        System.out.println(A + (a[i - 1] + 1) + RS);
                    }else{
                        System.out.println(R + "No se puede formar una escalera" + RS);
                        break;
                    }
                }
            }

    }
}