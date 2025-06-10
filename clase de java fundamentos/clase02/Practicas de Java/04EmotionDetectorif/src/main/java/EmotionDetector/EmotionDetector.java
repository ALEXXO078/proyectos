 

package EmotionDetector;
 
import java.util.Scanner;
public class EmotionDetector  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cómo te sientes? ");
        String mensaje = scanner.nextLine().toLowerCase();

        if (mensaje.contains("feliz") || mensaje.contains("bien")) {
            System.out.println("😃 ¡Genial!");
        } else if (mensaje.contains("triste") || mensaje.contains("mal")) {
            System.out.println("😢 Ánimo.");
        } else if (mensaje.contains("enojado") || mensaje.contains("molesto")) {
            System.out.println("😠 Respira.");
        } else if (mensaje.contains("confundido") || mensaje.contains("duda")) {
            System.out.println("🤔 Tranquilo.");
        } else {
            System.out.println("🤖 Ok.");
        }

        scanner.close();
    }
    }

