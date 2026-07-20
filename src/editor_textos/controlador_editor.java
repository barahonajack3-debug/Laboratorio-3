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

   
    public void abrir(String ruta){
        editor.setNombre(ruta);
        editor.setGuardado(true);
    }
    
    public void guardar(String ruta){
        editor.setNombre(ruta);
        editor.setGuardado(true);
      
    }
     public void establecerModificado(){
         editor.setGuardado(false);
     }
  
    public void establecerNegrita(boolean estado){
        editor.setNegrita(estado);
        establecerModificado();
    }
    public void establecerCursiva(boolean estado){
         editor.setCursiva(estado);
        establecerModificado();
    }
    public void cambiarcolorFondo(Color estado){
           editor.setFondo(estado);
        establecerModificado();
    }
    public void cambiarcolorLetra(Color estado){
          editor.setLetra(estado);
        establecerModificado();
    }
    
}
