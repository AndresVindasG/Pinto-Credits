
import java.util.Scanner;

public class Keylor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cómo te llamás? gay ");
        String nombre = teclado.nextLine();

        System.out.println("¡Hola, " + nombre + "!");
        System.out.println("Bienvenido a Java.");

        teclado.close();
    }
}
