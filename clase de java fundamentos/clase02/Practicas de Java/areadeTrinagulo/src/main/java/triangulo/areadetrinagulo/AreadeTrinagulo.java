/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package triangulo.areadetrinagulo;

/**
 *
 * @author IISEP
 */
import java.util.Scanner;  // Importamos la clase Scanner para entrada de datos

public class AreadeTrinagulo {
 
    public static void main(String[] args) {
          // Creamos un objeto Scanner para leer datos desde el teclado
        Scanner scanner = new Scanner(System.in);
 
        // Pedimos al usuario que ingrese la base y la altura del triángulo
        System.out.print("Ingresa la base del triángulo: ");
        double base = scanner.nextDouble();  // Leemos la base

        System.out.print("Ingresa la altura del triángulo: ");
        double altura = scanner.nextDouble();  // Leemos la altura
        
         // Llamamos al método para calcular el área del triángulo
        double area = calcularArea(base, altura);
          // Mostramos el resultado
        System.out.println("El área del triángulo es: " + area);

        // Cerramos el scanner
        scanner.close();
    }
    // Método para calcular el área del triángulo
    public static double calcularArea(double base, double altura) {
        return (base * altura) / 2;  // Fórmula del área del triángulo: (base * altura) / 2
    }
    
}
