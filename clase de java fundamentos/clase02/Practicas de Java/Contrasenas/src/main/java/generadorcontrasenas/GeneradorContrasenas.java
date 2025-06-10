 
package generadorcontrasenas;

/**
 *
 * @author Calzada Meza
 */
import java.util.Random;
public class GeneradorContrasenas  {

    public static void main(String[] args) {
        Random random = new Random();

        int longitud = 12; // Longitud de la contraseña
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+";
        StringBuilder contraseña = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(caracteres.length());
            contraseña.append(caracteres.charAt(indice));
        }

        System.out.println("Contraseña aleatoria: " + contraseña.toString());
    }

}
