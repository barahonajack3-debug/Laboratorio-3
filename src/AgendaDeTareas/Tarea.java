/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AgendaDeTareas;

/**
 *
 * @author USER
 */
public class Tarea {
    //Atributos
    private String Descripcion;
    private EstadoTarea Estado;
    
    //M get
    public String getDescripcion() {
        return Descripcion;
    }
    public EstadoTarea getEstado() {
        return Estado;
    }
    
    //M set
    public void setEstado(EstadoTarea Estado) {
        this.Estado = Estado;
    }
     public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
     
    //M constructor
    public Tarea(String Descripcion) {
        this.Descripcion = Descripcion;
        this.Estado = EstadoTarea.PENDIENTE;
    }

    //To String
    @Override
    public String toString() {
        String texto = (this.Estado == EstadoTarea.PENDIENTE) ? "Pendiente" : "Completada";
        return this.Descripcion + "  ("+texto+")";
    }
    
}
