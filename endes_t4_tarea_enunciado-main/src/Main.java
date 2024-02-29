/**
 * La clase Main es la clase principal que contiene el metodo Main para poder ejecutar el programa.
 */
public class Main {

    /**
     * El metodo Main permite introducir los datos que queremos, en este caso: crear dos objetos de tipo Auto,
     * crear uno de tipo Concesionario, agregar los Autos al Concesionario e imprimirlos por pantalla.
     * @param args Los diferentes argumentos.
     */
    public static void main(String[] args) {
        Auto auto1 = new Auto("Peugeot", "308");
        Auto auto2 = new Auto("Seat", "Leon");

        Concesionario concesionario1 = new Concesionario();

        concesionario1.agregarAuto(auto1);
        concesionario1.agregarAuto(auto2);

        concesionario1.imprimirAutos();
    }
}
