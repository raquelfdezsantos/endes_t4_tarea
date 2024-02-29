import java.util.ArrayList;

/**
 * Clase Concesionario para representar un concesionario de coches. <br>
 * Contendra toda la informacion relativa a un listado de coches.
 * @author Raquel Fernandez Santos
 * @version 1.0 29/02/2024
 */
public class Concesionario {

    /**
     * La lista de coches del concesionario.
     */
    private ArrayList<Auto> autos;

    /**
     * Constructor por defecto para poder iniciar la lista de coches del concesionario.
     */
    public Concesionario() {
        autos = new ArrayList<>();
    }

    /**
     * Metodo que agrega un coche al concesionario.
     * @param auto El coche que se va a agregar.
     */
    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }

    /**
     * Metodo que obtiene la lista de coches del concesionario.
     * Dentro de la lista aparecera: marca y modelo de cada coche.
     * @return La lista de coches del concesionario.
     */
    public ArrayList<Auto> listarAutos() {
        return autos;
    }

    /**
     * Metodo que imprime por pantalla los detalles de cada coche del concesionario.
     */
    public void imprimirAutos(){
        for (Auto auto: autos){
            System.out.println(auto);
        }
    }
}

