import java.util.Scanner;

public class Ejercicio5 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();

        int cantidadA = contarVocalA(frase);

        System.out.println("La vocal 'A' aparece " + cantidadA + " veces en la frase.");

        scanner.close();
    }
    public static int contarVocalA(String frase) {
        int contador = 0;

        // Convertir la frase a minúsculas o mayúsculas para ignorar diferencias de caso
        frase = frase.toLowerCase();

        // Recorrer cada carácter de la frase
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a') {
                contador++;
            }
        }

        return contador;
    }
}