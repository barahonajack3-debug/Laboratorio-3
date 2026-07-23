/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package editor_textos.ControladorDocumento;

import editor_textos.Documento;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Dario R
 */
public class ControladorDocumentos {

    private Documento documentos;

    public ControladorDocumentos(Documento documentos) {
        this.documentos = documentos;
    }

    // Devuelve el documento actual
    public Documento getDocumentos() {
        return documentos;
    }

    // Abrir archivo
    public void abrirArchivo() {

        JFileChooser fileChooser = new JFileChooser();

        FileNameExtensionFilter filtro = new FileNameExtensionFilter(
                "Archivos de texto (*.txt)", "txt");
        fileChooser.setFileFilter(filtro);

        int resultado = fileChooser.showOpenDialog(null);

        if (resultado == JFileChooser.APPROVE_OPTION) {

            File archivoSeleccionado = fileChooser.getSelectedFile();
            String ruta = archivoSeleccionado.getAbsolutePath();

            documentos.abrir(ruta);
        }
    }

    // Guardar archivo
    public void guardarArchivo() {

        JFileChooser fileChooser = new JFileChooser();

        FileNameExtensionFilter filtro = new FileNameExtensionFilter(
                "Archivos de texto (*.txt)", "txt");

        fileChooser.setFileFilter(filtro);
        fileChooser.setAcceptAllFileFilterUsed(false);

        int resultado = fileChooser.showSaveDialog(null);

        if (resultado == JFileChooser.APPROVE_OPTION) {

            File archivoSeleccionado = fileChooser.getSelectedFile();
            String ruta = archivoSeleccionado.getAbsolutePath();

            if (!ruta.toLowerCase().endsWith(".txt")) {
                ruta += ".txt";
            }

            documentos.guardar(ruta);
        }
    }

}