
package project.proyecto_ed;

/**
 * Clase NodoC que representa un nodo en una estructura de cola. Almacena datos
 * específicos del paciente y una referencia al siguiente nodo en la cola.
 * Utilizada como elemento básico en la implementación de una cola.
 *
 * @autor JOSE ALFREDO CHAVES BARBOZA
 * @autor VEGA OREAMUNO BRANDON JOSHUE
 */
public class NodoC {
     private Paciente datos;
    private NodoC atras;
    private NodoC siguiente;

    public NodoC() {
    }

    public NodoC(Paciente datos) {
        this.datos = datos;
        this.atras = atras;
        this.siguiente = siguiente;
    }

    public Paciente getDatos() {
        return datos;
    }

    public NodoC getAtras() {
        return atras;
    }

    public NodoC getSiguiente() {
        return siguiente;
    }

    public void setDatos(Paciente datos) {
        this.datos = datos;
    }

    public void setAtras(NodoC atras) {
        this.atras = atras;
    }

    public void setSiguiente(NodoC siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "NodoC{" + "datos=" + datos + ", atras=" + atras + ", siguiente=" + siguiente + '}';
    }
    
    
}
