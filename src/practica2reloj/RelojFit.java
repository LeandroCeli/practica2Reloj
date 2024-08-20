package practica2reloj;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Celi Leandro
 */
public class RelojFit extends Reloj {

    private int pasos;

    public RelojFit(int pasos, LocalDate fecha, LocalTime hora) {
        super(fecha, hora);
        this.pasos = pasos;
    }
    public void cuentaPasos(int x, int y) 
    {
       
    }

}
