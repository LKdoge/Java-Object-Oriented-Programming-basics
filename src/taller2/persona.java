/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

import javax.swing.*;

public class persona {

    private int cedula;
    private String nombre;
    
    public int getcedula() {
        return cedula;
    }

    public String getnombre() {
        return nombre;
    }

    public persona() {
        this.cedula = 0;
        this.nombre = "";
    }

    public persona(int cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

}
