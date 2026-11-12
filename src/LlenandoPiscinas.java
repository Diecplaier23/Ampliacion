import java.util.Scanner;

public class LlenandoPiscinas {
    public static final String V = "\u001B[32m";
    public static final String A = "\u001B[33m";
    public static final String RS = "\u001B[0m";

    public static void main(String[] args) {
        int mi_piscina,mi_cubo,mi_perdida;
        int vecino_piscina,vecino_cubo,vecino_perdida;
        Scanner sc = new Scanner(System.in);
        System.out.println(V + "Introduce el numero de litros que le caben a la piscina como maximo:" + RS);
         mi_piscina= sc.nextInt();
        System.out.println(V + "Introduce el numero de litros que le caben en el cubo como maximo:" + RS);
        mi_cubo = sc.nextInt();
        System.out.println(V + "Introduce el numero de litros que se pierden:" + RS);
        mi_perdida = sc.nextInt();
        System.out.println(V + "Introduce el numero de litros que le caben a la piscina del vecino como maximo:" + RS);
        vecino_piscina = sc.nextInt();
        System.out.println(V + "Introduce el numero de litros que le caben en el cubo del vecino como maximo:" + RS);
        vecino_cubo = sc.nextInt();
        System.out.println(V + "Introduce el numero de litros que se pierden en la piscina del vecino:" + RS);
        vecino_perdida = sc.nextInt();

        int mi_viaje = mi_piscina/mi_cubo-mi_perdida;
        int v_viaje = vecino_piscina/vecino_cubo-vecino_perdida;

        if (mi_viaje>v_viaje){
            System.out.println(A + "1" + RS);
        } else if (mi_viaje<v_viaje){
            System.out.println(A + "-1" + RS);
        } else {
            System.out.println(A + "0" + RS);
        }

    }
}
