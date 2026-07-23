/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package editor_textos;

import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

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
    private String mensajeError;
    private boolean modificado;
    
    //Constructor

    public Documento(String nombre, String ruta, String contenido, boolean guardado) {
        this.nombre = nombre;
        this.ruta = ruta;
        this.contenido = contenido;
        this.guardado = guardado;
        this.modificado = modificado;
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
    public boolean isModificado() {
        return modificado;
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
        this.guardado= false;
    }
    public void setGuardado(boolean guardado) {
        this.guardado = guardado;
    }

    public void setMensajeError(String mensajeError) {
        this.mensajeError = mensajeError;
    }

    public void setModificado(boolean modificado) {
        this.modificado = modificado;
    }
    
    public Documento() {
        this.nombre = "";
        this.ruta = "";
        this.contenido = "";
        this.guardado = true;
    }
    public boolean abrir(String ruta){
        try{ 
            String texto = new String(Files.readAllBytes(Paths.get(ruta)));
            this.contenido=texto;
            this.ruta = ruta;
            this.guardado = true;
            this.mensajeError = null;
            return true;
        } catch (Exception ex) {
            this.mensajeError = ex.getMessage();
            return false;
        }
    }
    public boolean guardar(String ruta) {
        try (FileWriter fw = new FileWriter(ruta)) {
            fw.write(contenido);
            this.ruta = ruta;
            this.guardado = true; // ya quedó guardado
            this.mensajeError = null;
            return true;
        } catch (Exception ex) {
            this.mensajeError = ex.getMessage();
            return false;
        }
    }
 
    public String getMensajeError() {
        return mensajeError;
    }
    
}


