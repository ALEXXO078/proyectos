/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Passwordgenerator;
import java.security.SecureRandom;
import java.util.Scanner;
public class RandomPasswordGenerator {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        String simbolos = "!@#$%^&*()_+-=";

        StringBuilder caracteresPermitidos = new StringBuilder();

        System.out.print("Incluir mayúsculas? (s/n): ");
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            caracteresPermitidos.append(mayusculas);
        }

        System.out.print("Incluir minúsculas? (s/n): ");
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            caracteresPermitidos.append(minusculas);
        }

        System.out.print("Incluir números? (s/n): ");
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            caracteresPermitidos.append(numeros);
        }

        System.out.print("Incluir símbolos? (s/n): ");
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            caracteresPermitidos.append(simbolos);
        }

        if (caracteresPermitidos.length() == 0) {
            System.out.println("Debe seleccionar al menos un tipo de carácter.");
            scanner.close();
            return;
        }

        System.out.print("Ingrese la longitud de la contraseña: ");
        int longitud = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea pendiente

        if (longitud <= 0) {
            System.out.println("La longitud de la contraseña debe ser mayor que 0.");
            scanner.close();
            return;
        }

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteresPermitidos.length());
            password.append(caracteresPermitidos.charAt(index));
        }

        System.out.println("Contraseña generada: " + password.toString());
        scanner.close();
    }
    }

