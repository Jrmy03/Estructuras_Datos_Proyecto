/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.proyecto_ed;

/**
 *
 * @author Usuario
 */
public class ListaDobleCircular {
      
    private NodoC cabeza;
    private NodoC ultimo;

    public void inserta(Paciente p) {
        int cedulaPaciente = convertirStringAEntero(p.getNumeroCedulaPaciente());

        if (cabeza == null) {
            // Paso 1: Lista vacía, insertamos el primer nodo
            cabeza = new NodoC(p);
            ultimo = cabeza;
            cabeza.setAtras(ultimo);
            cabeza.setSiguiente(ultimo);
            ultimo.setSiguiente(cabeza);
            ultimo.setAtras(cabeza);
        } else {
            int cedulaCabeza = convertirStringAEntero(cabeza.getDatos().getNumeroCedulaPaciente());
            if (cedulaPaciente < cedulaCabeza) {
                // Paso 2: Insertar antes de la cabeza
                NodoC aux = new NodoC(p);
                aux.setSiguiente(cabeza);
                cabeza.setAtras(aux);
                cabeza = aux;
                cabeza.setAtras(ultimo);
                ultimo.setSiguiente(cabeza);
            } else {
                int cedulaUltimo = convertirStringAEntero(ultimo.getDatos().getNumeroCedulaPaciente());
                if (cedulaPaciente > cedulaUltimo) {
                    // Paso 3: Insertar después del último
                    NodoC aux = new NodoC(p);
                    aux.setAtras(ultimo);
                    ultimo.setSiguiente(aux);
                    ultimo = aux;
                    ultimo.setSiguiente(cabeza);
                    cabeza.setAtras(ultimo);
                } else {
                    // Paso 4: Insertar en medio
                    NodoC aux = cabeza.getSiguiente();
                    while (convertirStringAEntero(aux.getDatos().getNumeroCedulaPaciente()) < cedulaPaciente) {
                        aux = aux.getSiguiente();
                    }

                    NodoC temp = new NodoC(p);
                    temp.setAtras(aux.getAtras());
                    temp.setSiguiente(aux);
                    aux.setAtras(temp);
                    temp.getAtras().setSiguiente(temp);
                }
            }
        }
    }

    // Método para convertir un String a int
    private int convertirStringAEntero(String numero) {
        try {
            return Integer.parseInt(numero); // Convierte el String a un entero
        } catch (NumberFormatException e) {
            System.out.println("Error: La cadena no es un número válido. Valor: " + numero);
            return -1; // Devuelve un valor especial o lanza una excepción personalizada si prefieres
        }
    }
public NodoC buscarPorCedula(String cedula) {
    if (cabeza == null) {
        return null; 
    }

    NodoC aux = cabeza;
    do {
        if (aux.getDatos().getNumeroCedulaPaciente().equals(cedula)) {
            return aux; 
        }
        aux = aux.getSiguiente();
    } while (aux != cabeza);

    return null; 
}
    
    @Override
    public String toString() {
        String respuesta = "Lista doble circular: \n";

        if (cabeza != null) {
            NodoC aux = cabeza;

            respuesta += aux.toString() + "\n";

            aux = aux.getSiguiente();

            while (aux != cabeza) {
                respuesta += aux.toString() + "\n";
                aux = aux.getSiguiente();
            }
        } else {
            respuesta += "Vacía";
        }

        return respuesta;
    }
    
}
