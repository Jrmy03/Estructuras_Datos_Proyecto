/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.proyecto_ed;

/**
 * Clase que representa una pila específica para el manejo de quejas.
 * Extiende la funcionalidad de la clase base 
 * 
 * @author Jeremy Emmanuel Lorente Cerdas
 * @author Antonio Jesus Lopez Chacon
 */
public class PilaQuejas extends Pila {

    public PilaQuejas() {
    }

    public void listarQuejas() {
        NodoP aux = getTop();
        if (aux == null) {
            System.out.println("No hay quejas registradas.");
        } else {
            while (aux != null) {
                System.out.println(aux.getQuejas());
                aux = aux.getAbajo();
            }
        }
    }
}
