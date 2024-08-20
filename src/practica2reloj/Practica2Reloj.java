package practica2reloj;

import java.time.LocalDate;

/**
 *
 * @author Celi Leandro
 */
public class Practica2Reloj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Reloj reloj = new Reloj(LocalDate.now());

        Persona persona = new Persona("Leandro", reloj);

        persona.mostrarInformacion();

        RelojFit relojFit = new RelojFit(LocalDate.now());
        // En desarollo 
        relojFit.cuentaPasos(10, 4); // Ejemplo de coordenadas

    }

}
