import java.util.Scanner;
public class Ejercicio1 {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();

        int cantidadPalabras = contarPalabras(frase);

        System.out.println("La cantidad de palabras en la frase es: " + cantidadPalabras);

        scanner.close();
    }
    public static int contarPalabras(String frase) {

        frase = frase.trim();

        String[] palabras = frase.split("\\s+");

        return palabras.length;
    }
}