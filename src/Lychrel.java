public class Lychrel {
    public static final String R = "\u001B[31m";  // Rojo
    public static final String V = "\u001B[32m";  // Verde
    public static final String B = "\u001B[97m";  // Blanco
    public static final String C = "\u001B[36m";  // Cian
    public static final String A = "\u001B[33m";  // Amarillo
    public static final String CC = "\u001B[96m";// Cian claro
    public static final String RS = "\u001B[0m";//Reiniciar
    public static final String I = "\u001B[3m"; // Cursiva
    public static final String N = "\u001B[1m";// Restablece el color original
    public static void main(String[] args){

    }
    public static int iteraciones(int numero) {

        int contador = 0;

        while (true) {

            // Comprobar si es capicúa
            String texto = String.valueOf(numero);
            String invertidoTexto = new StringBuilder(texto).reverse().toString();

            if (texto.equals(invertidoTexto)) {
                return contador;
            }

            // Invertir el número
            int invertido = 0;
            int copia = numero;

            while (copia > 0) {
                int digito = copia % 10;
                invertido = invertido * 10 + digito;
                copia /= 10;
            }

            // Sumar el número y su inverso
            numero += invertido;
            contador++;

            // Comprobar el límite
            if (numero >= 1000000000) {
                return -1;
            }
        }
    }
}
