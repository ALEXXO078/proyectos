 package clasesalumno.clasealumnos;

/**
 *
 * @author Calzada Meza Jose
 */
public class Alumno {
  // Atributos de la clase Alumno
    private String nombre;
    private String apellido;
    private String dni;
    // Constructor de la clase Alumno
    public Alumno(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    
     // Metodos get para obtener los datos del alumno.
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }
     // Método para mostrar la información del alumno
    public void mostrarInformacion() {
        System.out.println("Nombre completo: " + nombre + " " + apellido);
        System.out.println("DNI: " + dni);
    }
    
    public static void main(String[] args) {
         // Creación de objetos Alumno
        Alumno alumno1 = new Alumno("Juan", "Pérez", "12345678A");
        Alumno alumno2 = new Alumno("María", "García", "98765432B");
        Alumno alumno3 = new Alumno("Carlos", "López", "55555555C");

        // Mostrar información de los alumnos
        System.out.println("Información de los alumnos:");
        System.out.println("-------------------------");

        System.out.println("Alumno 1:");
        alumno1.mostrarInformacion();
        System.out.println("-------------------------");

        System.out.println("Alumno 2:");
        alumno2.mostrarInformacion();
        System.out.println("-------------------------");

        System.out.println("Alumno 3:");
        alumno3.mostrarInformacion();
        System.out.println("-------------------------");

        // Ejemplo de métodos de la clase String
        String nombreCompleto = alumno1.getNombre() + " " + alumno1.getApellido();
        System.out.println("Nombre completo en mayúsculas: " + nombreCompleto.toUpperCase());
        System.out.println("Longitud del nombre completo: " + nombreCompleto.length());
        System.out.println("Inicial del nombre: " + alumno1.getNombre().charAt(0));
    }
    }
