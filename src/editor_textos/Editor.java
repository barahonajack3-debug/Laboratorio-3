/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package editor_textos;
import java.awt.Color;
/**
 *
 * @author EMMAXZZ
 */
public class Editor {
    private String nombre;
    private boolean guardado;
    private boolean negrita;
    private boolean cursiva;
    private Color fondo;
    private Color letra;

    // Constructor
    public Editor(String nombre) {
        this.nombre = nombre;
        this.guardado = true;
        this.negrita = false;
        this.cursiva = false;
        this.fondo = Color.WHITE;
        this.letra = Color.BLACK;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public boolean isGuardado() {
        return guardado;
    }

    public boolean isNegrita() {
        return negrita;
    }

    public boolean isCursiva() {
        return cursiva;
    }

    public Color getFondo() {
        return fondo;
    }

    public Color getLetra() {
        return letra;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGuardado(boolean guardado) {
        this.guardado = guardado;
    }

    public void setNegrita(boolean negrita) {
        this.negrita = negrita;
    }

    public void setCursiva(boolean cursiva) {
        this.cursiva = cursiva;
    }

    public void setFondo(Color fondo) {
        this.fondo = fondo;
    }

    public void setLetra(Color letra) {
        this.letra = letra;
    }

}