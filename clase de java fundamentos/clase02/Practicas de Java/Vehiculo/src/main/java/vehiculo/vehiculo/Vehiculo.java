 package vehiculo.vehiculo;

/**
 *
 * @author jose
 */
public class Vehiculo{
    private String marca;
    private String modelo;
    private int anio;
    private String color;
    
    public Vehiculo(String marca, String modelo, int anio, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
    }
public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + anio + ", Color: " + color);
    }
 
    public static void main(String[] args) {
        Vehiculo auto1 = new Vehiculo("Toyota", "Corolla", 2020, "Gris");
        Vehiculo auto2 = new Vehiculo("Honda", "Civic", 2021, "Azul");
        Vehiculo auto3 = new Vehiculo("Ford", "Mustang", 2022, "Rojo");
        Vehiculo auto4 = new Vehiculo("Chevrolet", "Camaro", 2023, "Negro");

        System.out.println("Información de los automóviles:");
        auto1.mostrarInformacion();
        auto2.mostrarInformacion();
        auto3.mostrarInformacion();
        auto4.mostrarInformacion();

        if (auto1.getMarca().equals("Toyota")) {
            System.out.println("\nCambiando el color del Toyota...");
            auto1.setColor("Blanco");
            auto1.mostrarInformacion();
        }

        if (auto3.getMarca().equals("Ford")) {
            System.out.println("\nMostrando información del Ford...");
            auto3.mostrarInformacion();
        }
    }
    }
 
