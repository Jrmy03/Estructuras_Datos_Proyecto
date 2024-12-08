
package project.proyecto_ed;

/**
 * Clase Cola que representa una estructura de datos FIFO (First In, First Out)
 * utilizando nodos. Proporciona métodos para encolar, desencolar y verificar el
 * estado de la cola.
 *
 * @autor JOSE ALFREDO CHAVES BARBOZA
 * @autor VEGA OREAMUNO BRANDON JOSHUE
 */
public class Cola {

    private NodoC frente;
    private NodoC ultimo;

    /**
     * Constructor de la clase Cola.
     */
    public Cola() {
    }

    /**
     * Obtiene el nodo en el frente de la cola.
     *
     * @author JOSE ALFREDO CHAVES BARBOZA
     * @autor VEGA OREAMUNO BRANDON JOSHUE
     * @return NodoC El nodo que se encuentra en el frente de la cola.
     */
    public NodoC getFrente() {
        return frente;
    }

    /**
     * Obtiene el nodo al final de la cola (último en ser encolado).
     *
     * @autor JOSE ALFREDO CHAVES BARBOZA
     * @autor VEGA OREAMUNO BRANDON JOSHUE
     * @return NodoC El nodo que se encuentra al final de la cola.
     */
    public NodoC getUltimo() {
        return ultimo;
    }

    /**
     * Establece el nodo que estará al frente de la cola.
     *
     * @autor JOSE ALFREDO CHAVES BARBOZA
     * @autor VEGA OREAMUNO BRANDON JOSHUE
     * @param frente El nodo que se desea establecer como frente de la cola.
     */
    public void setFrente(NodoC frente) {
        this.frente = frente;
    }

    /**
     * Establece el nodo que estará al final de la cola.
     *
     * @autor JOSE ALFREDO CHAVES BARBOZA
     * @autor VEGA OREAMUNO BRANDON JOSHUE
     * @param ultimo El nodo que se desea establecer como el último de la cola.
     */
    public void setUltimo(NodoC ultimo) {
        this.ultimo = ultimo;
    }

    /**
     * Verifica si la cola está vacía.
     *
     * @autor JOSE ALFREDO CHAVES BARBOZA
     * @autor VEGA OREAMUNO BRANDON JOSHUE
     * @return boolean true si la cola está vacía, false en caso contrario.
     */

    public boolean esVacia() {
        if (frente == null) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Encola un nuevo nodo al final de la cola.
     *
     * @autor JOSE ALFREDO CHAVES BARBOZA
     * @autor VEGA OREAMUNO BRANDON JOSHUE
     * @param nuevoNodo El nodo que se desea encolar.
     */

    public void encolar(NodoC nuevoNodo) {
        if (esVacia()) {
            frente = nuevoNodo;
            ultimo = nuevoNodo;
        } else {
            ultimo.setAtras(nuevoNodo);
            ultimo = nuevoNodo;
        }
    }

    /**
     * Desencola el nodo que se encuentra en el frente de la cola.
     *
     * @autor JOSE ALFREDO CHAVES BARBOZA
     * @autor VEGA OREAMUNO BRANDON JOSHUE
     * @return NodoC El nodo que estaba en el frente de la cola, o null si la
     * cola está vacía.
     */

    public NodoC desencolar() {
        if (esVacia()) {
            return null;

        }

        NodoC nodo = frente;
        frente = frente.getAtras();

        if (frente == null) {
            ultimo = null;
        }

        nodo.setAtras(null);
        return nodo;
    }

    /**
     * Muestra el nodo que se encuentra en el frente de la cola sin
     * desencolarlo.
     *
     * @autor JOSE ALFREDO CHAVES BARBOZA
     * @autor VEGA OREAMUNO BRANDON JOSHUE
     * @return NodoC El nodo que está en el frente de la cola.
     */
    public NodoC verFrente() {
        return frente;
    }

    public NodoC[] buscarNodo(String ficha) {
        NodoC anterior = null;
        NodoC actual = frente;

        while (actual != null) {
            Paciente paciente = (Paciente) actual.getDatos();
            if (paciente.getNumeroFicha().equals(ficha)) {
                return new NodoC[]{anterior, actual};
            }
            anterior = actual;
            actual = actual.getAtras();
        }

        return new NodoC[]{null, null};
    }

    public void eliminarNodo(String ficha) {
        NodoC[] resultado = buscarNodo(ficha);
        NodoC anterior = resultado[0];
        NodoC actual = resultado[1];

        if (actual == null) {
            System.out.println("No se encontró el nodo con la ficha: " + ficha);
            return;
        }

        if (anterior == null) {

            desencolar();
        } else {

            anterior.setAtras(actual.getAtras());
            if (actual == ultimo) {
                ultimo = anterior;
            }
        }

        System.out.println("Nodo con ficha " + ficha + " eliminado.");
    }

    public boolean eliminarNodoEspecifico(String numeroFicha) {
        NodoC anterior = null;
        NodoC actual = frente;

        while (actual != null) {
            Paciente paciente = (Paciente) actual.getDatos();
            if (paciente.getNumeroFicha().equals(numeroFicha)) {
                if (anterior == null) {

                    frente = actual.getAtras();
                } else {

                    anterior.setAtras(actual.getAtras());
                }

                if (actual == ultimo) {
                    ultimo = anterior;
                }
                return true;
            }
            anterior = actual;
            actual = actual.getAtras();
        }
        return false;
    }

    public void mostrarDatos(NodoC nodo) {
        if (esVacia()) {
            System.out.println("La Cola está vacía");
            return;
        }
        System.out.println(nodo.getDatos());

    }
}
