/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dta.json.plan;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author csandoval
 */
public class TcTipoAnexo  implements  Serializable{
    
    public int tipoAnexoId;
    public String tipoAnexoDesc;
    public int estadoId;
    public Date fechaRegistro;
    public int usoId;
    public TcGrupoRequisito tcGrupoRequisito;

}
