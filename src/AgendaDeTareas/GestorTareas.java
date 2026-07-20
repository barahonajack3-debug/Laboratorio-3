/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AgendaDeTareas;

/**
 *
 * @author USER
 */
public class GestorTareas {
    //Atributos
    private Tareas[] tareas;
    private int CantidadTareas;
    
    //M get
    public int getCantidadTareas() {
        return CantidadTareas;
    }
    
    //M Constructor
    public GestorTareas() {
        this.tareas = new Tareas[100];
    }
    
    //Funciones
    public int obtenerCantidadTareas(){
        int cont=0;
        for(int x=0;x<100;x++){
            if(tareas[x]!=null){
                cont++;
            }
        }
        return cont;
    }
    
    public void agregarTarea(Tareas tarea) {
        if (CantidadTareas < tareas.length) {
            tareas[CantidadTareas] = tarea;
            CantidadTareas++;
        }
    }
    public void eliminarTarea(int index) {
        for (int i = index; i < CantidadTareas - 1; i++) {
            tareas[i] = tareas[i + 1];
        }
        tareas[CantidadTareas - 1] = null;
        CantidadTareas--;
    }
    public Tareas obtenerTarea(int index) {
        return tareas[index];
    }
}