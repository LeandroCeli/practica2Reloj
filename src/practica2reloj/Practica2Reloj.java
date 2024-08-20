/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

        Persona persona = new Persona("Ana", reloj);

        persona.mostrarInformacion();

        
       
    }

}
