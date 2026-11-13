import java.util.ArrayList;
import java.util.Scanner;

public class ExpresionesAritmeticas {
    public static final String R = "\u001B[31m";  // Rojo
    public static final String V = "\u001B[32m";  // Verde
    public static final String A = "\u001B[33m";  // Amarillo
    public static final String RS = "\u001B[0m";// Reiniciar

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expresion;
        System.out.print(V + "Introduce una expresion en formato postfija" + RS + "\n");
        expresion = sc.nextLine();
        boolean contieneLetras = expresion.matches(".*[a-zA-Z].*");
        if (contieneLetras) {
            System.out.print(R + "ERROR! No deben aparecer letras." + RS + "\n");
            return;
        }
        String[] elementos = expresion.trim().split("\\s+");
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i].matches("-?\\d+")) {numeros.add(Integer.parseInt(elementos[i]));
            } else if (elementos[i].equals("+") || elementos[i].equals("-") || elementos[i].equals("*") || elementos[i].equals("/")) {
                if (numeros.size() < 2) {
                    System.out.println(R + "ERROR! Expresión incorrecta." + RS);
                    return;
                }
                int num2 = numeros.remove(numeros.size() - 1);
                int num1 = numeros.remove(numeros.size() - 1);
                int resultados = 0;
                switch (elementos[i]) {
                    case "+":
                        resultados = num1 + num2;
                        break;
                    case "-":
                        resultados = num1 - num2;
                        break;
                    case "*":
                        resultados = num1 * num2;
                        break;
                    case "/":
                        if (num2 == 0) {
                            System.out.println(R + "ERROR! Division entre cero." + RS);
                            return;
                        }
                        resultados = num1 / num2;
                        break;
                }
                numeros.add(resultados);
            } else {
                System.out.println(R + "ERROR! Elemento no valido." + RS);
                return;
            }
        }
        if (numeros.size() != 1) {
            System.out.println(R + "ERROR! Expresión incorrecta." + RS);
        } else {
            System.out.println(V + "El resultado es: " + numeros.get(0) + RS);
        }
    }
}
