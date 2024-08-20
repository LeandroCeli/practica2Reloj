package practica2reloj;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Celi Leandro
 */


// colaboradores 
//aucadelago123@gmail.com
//    nicolegrotz03@gmail.com

public class Reloj {

    private LocalDate fecha;
    private LocalTime hora;
    private LocalDate fechaInicial;

    public Reloj(LocalDate fecha, LocalTime hora) {
        this.fecha = fecha;
        this.hora = hora;
        this.fechaInicial = fecha;
    }

    public LocalDate getDia() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void incrementarDia() {
        fecha = fecha.plusDays(1);
    }

    public void incrementarHora() {
        hora = hora.plusHours(1);
    }

    public void limpiarPantalla() {
        fecha = fechaInicial;
        hora = LocalTime.of(0, 0); // Resetear la hora
    }

    public void mostrarFechaHora() {
        DateTimeFormatter fechaFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter horaFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Fecha: " + fecha.format(fechaFormatter));
        System.out.println("Hora: " + hora.format(horaFormatter));
    }
    
}
