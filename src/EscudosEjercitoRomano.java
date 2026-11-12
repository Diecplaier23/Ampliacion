import java.util.Scanner;

public class EscudosEjercitoRomano {
    public static final String R = "\u001B[31m";
    public static final String V = "\u001B[32m";
    public static final String A = "\u001B[33m";
    public static final String RS = "\u001B[0m";

    public static void main(String[] args) {
        int soldados;
        System.out.println(V + "Introduce el numero de soldados:" + RS);
        Scanner sc = new Scanner(System.in);
        soldados = sc.nextInt();
        System.out.println(V + "Se necesitan " + A + cuantosEscudos(soldados) + V + " escudos." + RS);
    }
    public static int cuantosEscudos(int soldados) {
        if (soldados < 0) {
            System.out.println(R + "El numero de soldados no puede ser negativo." + RS);
        }
        int restantes = soldados;
        int escudos = 0;

        while (restantes > 0) {
            int lado = (int) Math.sqrt(restantes);
            while (lado + 1 <= restantes / (lado + 1)) {
                lado++;
            }
            while (lado > restantes / lado) {
                lado--;
            }

            int legionarios = lado * lado;
            escudos += legionarios + 4 * lado;
            restantes -= legionarios;
        }

        return escudos;
    }
}
