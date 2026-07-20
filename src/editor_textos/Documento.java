/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package editor_textos;

/**
 *
 * @author Dario R
 */
public class Documento {
    //Atributos de Documento
    private String nombre;
    private String ruta;
    private String contenido;
    private boolean guardado;
    
    //Constructor

    public Documento(String nombre, String ruta, String contenido, boolean guardado) {
        this.nombre = nombre;
        this.ruta = ruta;
        this.contenido = contenido;
        this.guardado = guardado;
    }
    //Metodos getter
    public String getNombre() {
        return nombre;
    }
    public String getRuta() {
        return ruta;
    }
    public String getContenido() {
        return contenido;
    }
    public boolean isGuardado() {
        return guardado;
    }
    //Metodos setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    public void setGuardado(boolean guardado) {
        this.guardado = guardado;
    }
}
