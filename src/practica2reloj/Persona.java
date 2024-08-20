/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2reloj;

/**
 *
 * @author Celi Leandro
 */
public class Persona {

    private String nombre;
    private Reloj reloj;

    public Persona(String nombre, Reloj reloj) {
        this.nombre = nombre;
        this.reloj = reloj;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Reloj getReloj() {
        return reloj;
    }

    public void setReloj(Reloj reloj) {
        this.reloj = reloj;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        reloj.mostrarFechaHora();
    }
}
