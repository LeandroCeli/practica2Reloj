package practica2reloj;

import java.time.LocalDate;

/**
 *
 * @author Celi Leandro
 */
public class Reloj {

    private LocalDate fecha;

    public Reloj(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void mostrarFecha() {
        System.out.println("Fecha: " + fecha);
    }
}
