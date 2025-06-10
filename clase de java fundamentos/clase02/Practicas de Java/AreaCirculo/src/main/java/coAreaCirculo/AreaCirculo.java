
package coAreaCirculo;

/**
 * Vesion: ver01
 * @author Jose Calzada Meza
 */
public class AreaCirculo {

    public static void main(String[] args) {
      double radio = 5.0;  // Radio del círculo
      double area = calcularArea(radio);  // Llamada al método para calcular el área
      // Mostrar el resultado
        System.out.println("El área del círculo con radio " + radio + " es: " + area);
    }
    
    // Método para calcular el área del círculo
    public static double calcularArea(double radio) {
        return Math.PI * radio * radio;  // Fórmula del área: π * radio^2
    }
}
