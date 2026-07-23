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
public class controlador_editor {
    
    private Editor editor;

    public controlador_editor(Editor editor) {
        this.editor = editor;
    }

    public Editor getEditor() {
        return editor;
    }

    // Abre un documento
    public void abrir(String ruta) {
        editor.setNombre(ruta);
        editor.setGuardado(true);
    }

    // Guarda un documento
    public void guardar(String ruta) {
        editor.setNombre(ruta);
        editor.setGuardado(true);
    }

    // Marca el editor como modificado
    public void establecerModificado() {
        editor.setGuardado(false);
    }

    // Cambiar negrita
    public void establecerNegrita(boolean estado) {
        editor.setNegrita(estado);
        establecerModificado();
    }

    // Cambiar cursiva
    public void establecerCursiva(boolean estado) {
        editor.setCursiva(estado);
        establecerModificado();
    }

    // Cambiar color de fondo
    public void cambiarcolorFondo(Color estado) {
        editor.setFondo(estado);
        establecerModificado();
    }

    // Cambiar color de letra
    public void cambiarcolorLetra(Color estado) {
        editor.setLetra(estado);
        establecerModificado();
    }

}