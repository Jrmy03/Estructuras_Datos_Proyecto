
package project.proyecto_ed;

/*/**
 * Clase Pila que representa una estructura de datos LIFO (Last In, First Out) utilizando nodos.
 * Proporciona métodos para apilar, desapilar y verificar el estado de la pila.
 * @author 
 * JOSE ALFREDO CHAVES BARBOZA
 * VEGA OREAMUNO BRANDON JOSHUE
 */
public class Pila {

    private NodoP top;
 /**
     * Constructor de la clase Pila. Inicializa la pila vacía.
     */
    public Pila() {
        top = null;
    }
 /**
     * Obtiene el nodo en la cima de la pila.
     * @autor 
     * JOSE ALFREDO CHAVES BARBOZA
     * VEGA OREAMUNO BRANDON JOSHUE
     * @return NodoP El nodo que se encuentra en la cima de la pila.
     */
    public NodoP getTop() {
        return top;
    }
/**
     * Establece el nodo que estará en la cima de la pila.
     * @autor 
     * JOSE ALFREDO CHAVES BARBOZA
     * VEGA OREAMUNO BRANDON JOSHUE
     * @param top El nodo que se desea establecer como cima de la pila.
     */
    public void setTop(NodoP top) {
        this.top = top;
    }
  /**
     * Verifica si la pila está vacía.
     * @autor 
     * JOSE ALFREDO CHAVES BARBOZA
     * VEGA OREAMUNO BRANDON JOSHUE
     * @return boolean true si la pila está vacía, false en caso contrario.
     */
    public boolean esVacia() {
        if (this.top == null) {
            return true;
        } else {
            return false;
        }
    }
 /**
     * Apila un nuevo nodo en la cima de la pila.
     * @autor 
     * JOSE ALFREDO CHAVES BARBOZA
     * VEGA OREAMUNO BRANDON JOSHUE
     * @param nuevoNodo El nodo que se desea apilar.
     */
    public void push(NodoP nuevoNodo) {

        if (esVacia()) {
            top = nuevoNodo;
        } else {

            nuevoNodo.setAbajo(top);
            top = nuevoNodo;
        }

    }
/**
     * Desapila el nodo que se encuentra en la cima de la pila.
     * @autor 
     * JOSE ALFREDO CHAVES BARBOZA
     * VEGA OREAMUNO BRANDON JOSHUE
     */
    public void pop() {
        if (!esVacia()) {
            top = top.getAbajo();
        }
    }
}
