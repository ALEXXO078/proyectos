/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tinkagame.tinkagame;

/**
 *
 * @author IISEP
 */
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
public class TinkaGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Set<Integer> numerosUsuario = new HashSet<>();
        Set<Integer> numerosGanadores = new HashSet<>();

        // Usuario ingresa 7 números
        System.out.println("🎰 ¡Bienvenido a la Tinka! Ingresa 7 números entre 1 y 49:");
        while (numerosUsuario.size() < 7) {
            System.out.print("Número " + (numerosUsuario.size() + 1) + ": ");
            int num = scanner.nextInt();
            
            if (num < 1 || num > 49) {
                System.out.println("⚠️ Número fuera de rango. Debe ser entre 1 y 49.");
            } else if (!numerosUsuario.add(num)) {
                System.out.println("⚠️ Número repetido. Ingresa otro.");
            }
        }

        // Generar 7 números aleatorios sin repetir
        while (numerosGanadores.size() < 7) {
            numerosGanadores.add(random.nextInt(49) + 1);
        }

        // Mostrar resultados
        System.out.println("\n🎟️ Tus números: " + numerosUsuario);
        System.out.println("🏆 Números ganadores: " + numerosGanadores);

        // Comparar números
        Set<Integer> coincidencias = new HashSet<>(numerosUsuario);
        coincidencias.retainAll(numerosGanadores);

        // Resultado del sorteo
        if (coincidencias.size() == 7) {
            System.out.println("\n🎉 ¡FELICIDADES! Ganaste el premio mayor. 🏅💰");
        } else if (coincidencias.size() > 0) {
            System.out.println("\n🔎 Aciertos: " + coincidencias.size() + " -> " + coincidencias);
            System.out.println("¡Sigue participando! 😃");
        } else {
            System.out.println("\n😢 No acertaste ningún número. ¡Mejor suerte la próxima vez!");
        }

        scanner.close();
    }
    }

