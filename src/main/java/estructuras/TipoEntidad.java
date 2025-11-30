/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;


public enum TipoEntidad {
    EMPRESA_PRIVADA(1, "Empresas privadas"), 
    COOPERATIVA(3, "Cooperativas"),
    ASOCIACION_SIMPLE(4, "Asociaciones"),
    COMITE(5, "Comités"),
    FUNDACION(6, "Fundaciones"),
    MUNICIPALIDAD(7, "Municipalidades"),
    ONG(8, "ONG"),
    IGLESIA(9, "Iglesias"),
    ENTIDAD_PUBLICA(10, "Entidad Pública");

    private final int codigo;
    private final String descripcion;

    // Constructor
    TipoEntidad(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    // Getters
    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    // Buscar enum por código
    public static TipoEntidad fromCodigo(int codigo) {
        for (TipoEntidad tipo : TipoEntidad.values()) {
            if (tipo.getCodigo() == codigo) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código no válido: " + codigo);
    }
}
