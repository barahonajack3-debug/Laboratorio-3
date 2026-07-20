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
    private Tarea[] tareas;
    private int CantidadTareas;
    
    //M get
    public int getCantidadTareas() {
        return CantidadTareas;
    }
    
    //M Constructor
    public GestorTareas() {
        this.tareas = new Tarea[100];
    }
    
    //Funciones
    public void agregarTarea(Tarea tarea) {
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
    public Tarea obtenerTarea(int index) {
        return tareas[index];
    }
}