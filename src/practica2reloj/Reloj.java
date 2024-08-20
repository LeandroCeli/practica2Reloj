package practica2reloj;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Celi Leandro
 */
public class Reloj {

    private LocalDate fecha;
    private LocalTime hora;
    private LocalDate fechaInicial;
    
    
    public Reloj(LocalDate fecha,LocalTime hora) {
        this.fecha = fecha;
        this.hora = hora;
        this.fechaInicial= fecha;
    }

   // Método para obtener el día
    public LocalDate getDia() {
        return fecha;
    }

    // Método para obtener la hora
    public LocalTime getHora() {
        return hora;
    }

    // Método para incrementar el día
    public void incrementarDia() {
        fecha = fecha.plusDays(1);
    }

    // Método para incrementar la hora
    public void incrementarHora() {
        hora = hora.plusHours(1);
    }

    // Método para limpiar la pantalla, restableciendo la fecha a la inicial
    public void limpiarPantalla() {
        fecha = fechaInicial;
        hora = LocalTime.of(0, 0); // Resetear la hora a medianoche
    }

    // Método para mostrar la fecha y hora en un formato legible
    public void mostrarFechaHora() {
        DateTimeFormatter fechaFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter horaFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Fecha: " + fecha.format(fechaFormatter));
        System.out.println("Hora: " + hora.format(horaFormatter));
    }
}
