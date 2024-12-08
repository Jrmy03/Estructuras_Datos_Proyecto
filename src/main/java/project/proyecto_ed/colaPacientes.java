
package project.proyecto_ed;


public class colaPacientes extends Cola {
    
    private int contadorR = 1;
    private int contadorP = 1;
    
    /**
     * Asigna una ficha preferencial a un paciente y lo encola en la cola
     * preferencial. La ficha asignada se genera con el prefijo "P" seguido de
     * un número único.
     *
     * @param Número_de_Cedula_del_Paciente Número de cédula del paciente.
     * @param Nombre_del_Paciente Nombre del paciente.
     * @param Timestamp Fecha y hora.
     */
    
    public void asignarFichaPreferencial(String Timestamp, String Nombre_del_Paciente, String genero, String Número_de_Cedula_del_Paciente, int edad) {
        String Número_de_ficha = "P" + contadorP++;

        Paciente nuevoPaciente = new Paciente(
                Timestamp,
                Nombre_del_Paciente,
                Número_de_ficha,
                genero,
                Número_de_Cedula_del_Paciente,
                edad);

        NodoC nuevoNodo = new NodoC();
        nuevoNodo.setDatos(nuevoPaciente);
        encolar(nuevoNodo);
        System.out.println("Su número de ficha es la " + Número_de_ficha);
    }
    
   
    /**
    * Asigna una ficha regular a un paciente y lo encola en la cola regular.
    * La ficha asignada se genera con el prefijo "R" seguido de un número único.
    * 
    * @param Número_de_Cedula_del_Paciente Número de cédula del paciente.
    * @param Nombre_del_Paciente Nombre del paciente.
    */
   public void asignarFichaRegulares(String Timestamp, String Nombre_del_Paciente, String genero, String Número_de_Cedula_del_Paciente, int edad){
        String Número_de_ficha = "R" + contadorR++;
        
        Paciente nuevoPaciente = new Paciente(
                Timestamp,
                Nombre_del_Paciente,
                Número_de_ficha,
                genero,
                Número_de_Cedula_del_Paciente,
                edad);
        
        NodoC nuevoNodo = new NodoC();
        nuevoNodo.setDatos(nuevoPaciente);
        encolar(nuevoNodo);
        System.out.println("Su número de ficha es la " + Número_de_ficha);
   }
   
   
}
