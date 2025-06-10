 
package VelocidadMovil;

/**
 *
 * @author JOSE CALZADA
 */
import java.util.Scanner;  // Importamos la clase Scanner para entrada de datos
public class VelocidadMovil {
    public static void main(String[] args) {
       // Creamos un objeto Scanner para leer datos desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que ingrese la distancia y el tiempo
        System.out.print("Ingresa la distancia en metros): ");
        double distancia = scanner.nextDouble();  // Leemos la distancia

        System.out.print("Ingresa el tiempo  (en segundos): ");
        double tiempo = scanner.nextDouble();  // Leemos el tiempo

        // Llamamos al método para calcular la velocidad
        double velocidad = calcularVelocidad(distancia, tiempo);

        // Mostramos el resultado
        System.out.println("La velocidad del móvil es: " + velocidad + " metros por segundo.");

        // Cerramos el scanner
        scanner.close();
    }
    public static double calcularVelocidad(double distancia, double tiempo) {
        if (tiempo == 0) {  // Verificamos si el tiempo es 0 para evitar división por cero
            System.out.println("El tiempo no puede ser cero.");
            return 0;
        }
        return distancia / tiempo;  // Fórmula de la velocidad: distancia / tiempo
    }
    
}
