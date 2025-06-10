/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package prestamointeressimple.prestamointeressimple;

/**
 *
 * @author IISEP
 */
import java.util.Scanner;  // Importamos la clase Scanner para la entrada de datos
public class PrestamoInteresSimple {

    public static void main(String[] args) {
         // Creamos un objeto Scanner para leer los datos desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que ingrese el monto del préstamo, tasa de interés y tiempo
        System.out.print("Ingresa el monto del préstamo (en unidades monetarias): ");
        double montoPrestamo = scanner.nextDouble();  // Leemos el monto del préstamo

        System.out.print("Ingresa la tasa de interés anual (en porcentaje): ");
        double tasaInteres = scanner.nextDouble();  // Leemos la tasa de interés
<
        System.out.print("Ingresa el tiempo en años: ");
        double tiempo = scanner.nextDouble();  // Leemos el tiempo en años

        // Llamamos al método para calcular el interés simple
        double interes = calcularInteresSimple(montoPrestamo, tasaInteres, tiempo);
        
        // Calculamos el monto total a pagar
        double montoTotal = montoPrestamo + interes;

        // Mostramos el resultado
        System.out.println("El interés generado es: " + interes);
        System.out.println("El monto total a pagar es: " + montoTotal);

        // Cerramos el scanner
        scanner.close();
    }
    // Método para calcular el interés simple
    public static double calcularInteresSimple(double principal, double tasa, double tiempo) {
        return (principal * tasa * tiempo) / 100;  // Fórmula del interés simple: P * r * t / 100
    }
}
