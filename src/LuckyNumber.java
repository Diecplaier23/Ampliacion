import java.util.Scanner;

public class LuckyNumber {
    public static final String R = "\u001B[31m";
    public static final String V = "\u001B[32m";
    public static final String A = "\u001B[33m";
    public static final String RS = "\u001B[0m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(V + "Introduce tu fecha de nacimiento (dd/mm/aaaa):" + RS);
        String fecha = sc.nextLine();
        String[] fechaSeparada = fecha.split("/");

        if (fechaSeparada.length != 3 || fechaSeparada[0].length() != 2 || fechaSeparada[1].length() != 2 || fechaSeparada[2].length() != 4) {
            System.out.println(R + "La fecha debe tener el formato dd/mm/aaaa." + RS);
            return;
        }

        int numeroSuerte = 0;
        for (int i = 0; i < fechaSeparada.length; i++) {
            for (int j = 0; j < fechaSeparada[i].length(); j++) {
                char cifra = fechaSeparada[i].charAt(j);
                if (!Character.isDigit(cifra)) {
                    System.out.println(R + "La fecha solo puede contener numeros." + RS);
                    return;
                }
                numeroSuerte += Character.getNumericValue(cifra);
            }
        }

        System.out.println(V + "Tu numero de la suerte es: " + A + numeroSuerte + RS);
    }
}