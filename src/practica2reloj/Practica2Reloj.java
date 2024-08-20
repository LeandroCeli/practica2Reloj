package practica2reloj;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Celi Leandro
 */
public class Practica2Reloj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Reloj reloj = new Reloj(LocalDate.now(),LocalTime.now());

        Persona persona = new Persona("Leandro", reloj);

        persona.mostrarInformacion();

        RelojFit relojFit = new RelojFit(0,LocalDate.now(),LocalTime.now());
        // En desarollo 
        relojFit.cuentaPasos(10, 4); // Ejemplo de coordenadas

    }

}
