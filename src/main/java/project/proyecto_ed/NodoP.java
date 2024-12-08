/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.proyecto_ed;

/**
 * Clase NodoP que representa un nodo en una estructura de pila.
 * Almacena una queja y una referencia al nodo siguiente en la pila.
 * Utilizada como elemento básico en la implementación de una pila de quejas.
 * 
 * @author 
 * JOSE ALFREDO CHAVES BARBOZA
 * VEGA OREAMUNO BRANDON JOSHUE
 */

public class NodoP {
    private String quejas;
    private NodoP abajo;

    public NodoP() {
    }

    public String getQuejas() {
        return quejas;
    }

    public NodoP getAbajo() {
        return abajo;
    }

    public void setQuejas(String quejas) {
        this.quejas = quejas;
    }

    public void setAbajo(NodoP abajo) {
        this.abajo = abajo;
    }

   
}
