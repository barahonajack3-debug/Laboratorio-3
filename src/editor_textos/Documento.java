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
    // Atributos de Documento
    private String nombre;
    private String ruta;
    private String contenido;
    private boolean guardado;
    private String mensajeError;
    private boolean modificado;

    // Constructor
    public Documento(String nombre, String ruta, String contenido, boolean guardado) {
        this.nombre = nombre;
        this.ruta = ruta;
        this.contenido = contenido;
        this.guardado = guardado;
        this.modificado = false;
        this.mensajeError = "";
    }

    // Constructor vacío
    public Documento() {
        this.nombre = "";
        this.ruta = "";
        this.contenido = "";
        this.guardado = true;
        this.modificado = false;
        this.mensajeError = "";
    }

    // Métodos Getter
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

    public String getMensajeError() {
        return mensajeError;
    }

    // Métodos Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
        this.guardado = false;
        this.modificado = true;
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

    // Abrir documento
    public boolean abrir(String ruta) {
        try {
            String texto = new String(Files.readAllBytes(Paths.get(ruta)));

            this.contenido = texto;
            this.ruta = ruta;
            this.guardado = true;
            this.modificado = false;
            this.mensajeError = null;

            return true;

        } catch (Exception ex) {
            this.mensajeError = ex.getMessage();
            return false;
        }
    }

    // Guardar documento
    public boolean guardar(String ruta) {
        try (FileWriter fw = new FileWriter(ruta)) {

            fw.write(contenido);

            this.ruta = ruta;
            this.guardado = true;
            this.modificado = false;
            this.mensajeError = null;

            return true;

        } catch (Exception ex) {
            this.mensajeError = ex.getMessage();
            return false;
        }
    }

}


