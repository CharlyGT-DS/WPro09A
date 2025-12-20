/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solicitante;

/**
 *
 * @author WINDOWS
 */
public class DocumentoSolicitante {

    private int ordenLista;
    private String nombre;
    private byte[] archivo;
    private String nombreArchivo;

    public DocumentoSolicitante(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTieneArchivo() {
        return archivo != null;
    }

    public int getOrdenLista() {
        return ordenLista;
    }

    public void setOrdenLista(int ordenLista) {
        this.ordenLista = ordenLista;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte[] getArchivo() {
        return archivo;
    }

    public void setArchivo(byte[] archivo) {
        this.archivo = archivo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
}
