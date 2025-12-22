package solicitante;


public class DocumentoSolicitante {
    
    private String nombre;
    private byte[] archivo;
    private String nombreArchivo;
    private String tipoArchivo;
    
    public DocumentoSolicitante() {
    }
    
    public DocumentoSolicitante(String nombre) {
        this.nombre = nombre;
    }
    
      public boolean isTieneArchivo() {
        return archivo != null;
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
    
    public String getTipoArchivo() {
        return tipoArchivo;
    }
    
    public void setTipoArchivo(String tipoArchivo) {
        this.tipoArchivo = tipoArchivo;
    }
}