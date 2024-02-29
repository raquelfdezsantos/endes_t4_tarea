import java.util.ArrayList;

/**
 * Clase Auto para representar un coche. <br>
 * La clase Auto contendra informacion sobre el coche: la marca y el modelo.
 * @author Raquel Fernandez Santos
 * @version 1.0 29/2/2024
 */
public class Auto {

    /**
     * La marca del coche.
     */
    private String marca;

    /**
     * El modelo del coche.
     */
    private String modelo;

    /**
     * Constructor de la clase Auto
     * @param marca La marca del coche.
     * @param modelo El modelo del coche.
     */
    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Metodo que devuelve una cadena con la marca del coche.
     * @return La marca del coche
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Metodo que establece la marca del coche.
     * @param marca La marca del coche.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Metodo que devuelve una cadena con el modelo del coche.
     * @return El modelo del coche.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Metodo que establece el modelo del coche.
     * @param modelo El modelo del coche.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Metodo que convierte un objeto Auto en un objeto String.
     * @return Un String con una representacion en texto de los campos marca y modelo.
     */
    @Override
    public String toString() {
        return "Auto [marca=" + marca + ", modelo=" + modelo + "]";
    }
}


