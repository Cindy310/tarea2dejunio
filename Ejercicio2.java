import java.util.Scanner;
public class Ejercicio2 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una cadena con espacios en blanco: ");
        String cadena = scanner.nextLine();

        // Eliminar espacios en blanco
        String cadenaSinEspacios = cadena.replaceAll("\\s+", "");

        System.out.println("Cadena sin espacios: " + cadenaSinEspacios);

        scanner.close();
    }
}