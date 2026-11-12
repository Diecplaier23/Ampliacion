import java.util.Scanner;

public class CuantasMeLlevo {
    public static final String R = "\u001B[31m";
    public static final String V = "\u001B[32m";
    public static final String A = "\u001B[33m";
    public static final String RS = "\u001B[0m";

    public static void main(String[] args) {
        int num1,num2,llevadas=0,n_cifras1,n_cifras2;
        Scanner sc = new Scanner(System.in);
        System.out.println(V + "Introduce los numeros:" + RS);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        n_cifras1 = String.valueOf(num1).length();
        n_cifras2 = String.valueOf(num2).length();

        if (n_cifras1 != n_cifras2) {
            System.out.println(R + "Los numeros deben ser iguales" + RS);
            return;
        }
        int a[] = new int[n_cifras1];
        int b[] = new int[n_cifras2];

        for (int i = 0; i < n_cifras2; i++) {
            a[i] = Integer.parseInt(String.valueOf(num1).substring(i,i+1));
        }

        for (int i = 0; i < n_cifras2; i++) {
            b[i] = Integer.parseInt(String.valueOf(num2).substring(i,i+1));
        }

        for (int i = 0; i < n_cifras1; i++) {
            if (a[i]+b[i]>9){
                llevadas += 1;
            }
        }
        System.out.println(V + "Esa combinacion de numeros tras sumarlos se llevan " + A + llevadas + RS);
    }
}
