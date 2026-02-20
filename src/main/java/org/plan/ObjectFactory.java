
package org.plan;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.plan package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EstadoId_QNAME = new QName("", "estadoId");
    private final static QName _Turno_QNAME = new QName("", "turno");
    private final static QName _AnexoGestionId_QNAME = new QName("", "anexoGestionId");
    private final static QName _Extension_QNAME = new QName("", "extension");
    private final static QName _Nombre_QNAME = new QName("", "nombre");
    private final static QName _Ruta_QNAME = new QName("", "ruta");
    private final static QName _Size_QNAME = new QName("", "size");
    private final static QName _TipoAnexoId_QNAME = new QName("", "tipoAnexoId");
    private final static QName _FechaRegistro_QNAME = new QName("", "fechaRegistro");
    private final static QName _Obligatorio_QNAME = new QName("", "obligatorio");
    private final static QName _GrupoRequisitoDesc_QNAME = new QName("", "grupoRequisitoDesc");
    private final static QName _GrupoRequisitoId_QNAME = new QName("", "grupoRequisitoId");
    private final static QName _Tooltip_QNAME = new QName("", "tooltip");
    private final static QName _TipoAnexoDesc_QNAME = new QName("", "tipoAnexoDesc");
    private final static QName _UsoId_QNAME = new QName("", "usoId");
    private final static QName _Anio_QNAME = new QName("", "anio");
    private final static QName _Area_QNAME = new QName("", "area");
    private final static QName _CategoriaProfesionId_QNAME = new QName("", "categoriaProfesionId");
    private final static QName _ClaseDesarrolloId_QNAME = new QName("", "claseDesarrolloId");
    private final static QName _ClaseDesarrolloDesc_QNAME = new QName("", "claseDesarrolloDesc");
    private final static QName _Ocultar_QNAME = new QName("", "ocultar");
    private final static QName _ClaseDesarrolloGestionId_QNAME = new QName("", "claseDesarrolloGestionId");
    private final static QName _Cronograma_QNAME = new QName("", "cronograma");
    private final static QName _Abh_QNAME = new QName("", "abh");
    private final static QName _Abr_QNAME = new QName("", "abr");
    private final static QName _AbrExtraer_QNAME = new QName("", "abrExtraer");
    private final static QName _AlturaPromedio_QNAME = new QName("", "alturaPromedio");
    private final static QName _Arbolh_QNAME = new QName("", "arbolh");
    private final static QName _Arbolr_QNAME = new QName("", "arbolr");
    private final static QName _ArbolrExtraer_QNAME = new QName("", "arbolrExtraer");
    private final static QName _ConteoArbol_QNAME = new QName("", "conteoArbol");
    private final static QName _DapPromedio_QNAME = new QName("", "dapPromedio");
    private final static QName _Fuste_QNAME = new QName("", "fuste");
    private final static QName _PersonaActualizaId_QNAME = new QName("", "personaActualizaId");
    private final static QName _Codigo_QNAME = new QName("", "codigo");
    private final static QName _Ecuacion_QNAME = new QName("", "ecuacion");
    private final static QName _EspecieDesc_QNAME = new QName("", "especieDesc");
    private final static QName _EspecieId_QNAME = new QName("", "especieId");
    private final static QName _NombreCientifico_QNAME = new QName("", "nombreCientifico");
    private final static QName _TipoEspecieDesc_QNAME = new QName("", "tipoEspecieDesc");
    private final static QName _TipoEspecieId_QNAME = new QName("", "tipoEspecieId");
    private final static QName _AceptaFormula_QNAME = new QName("", "aceptaFormula");
    private final static QName _EcuacionLatifoliado_QNAME = new QName("", "ecuacionLatifoliado");
    private final static QName _Sinonimo_QNAME = new QName("", "sinonimo");
    private final static QName _PersonaRegistraId_QNAME = new QName("", "personaRegistraId");
    private final static QName _FechaActualiza_QNAME = new QName("", "fechaActualiza");
    private final static QName _Formula_QNAME = new QName("", "formula");
    private final static QName _TipoMaderaDesc_QNAME = new QName("", "tipoMaderaDesc");
    private final static QName _TipoMaderaId_QNAME = new QName("", "tipoMaderaId");
    private final static QName _TipoInventarioDesc_QNAME = new QName("", "tipoInventarioDesc");
    private final static QName _TipoInventarioId_QNAME = new QName("", "tipoInventarioId");
    private final static QName _TratamientoSilviculturalId_QNAME = new QName("", "tratamientoSilviculturalId");
    private final static QName _TratamientoSilviculturalDesc_QNAME = new QName("", "tratamientoSilviculturalDesc");
    private final static QName _Volh_QNAME = new QName("", "volh");
    private final static QName _Volr_QNAME = new QName("", "volr");
    private final static QName _VolrExtraer_QNAME = new QName("", "volrExtraer");
    private final static QName _AbResidual_QNAME = new QName("", "abResidual");
    private final static QName _ArbolResidual_QNAME = new QName("", "arbolResidual");
    private final static QName _Arboles_QNAME = new QName("", "arboles");
    private final static QName _Volumen_QNAME = new QName("", "volumen");
    private final static QName _AreaBasal_QNAME = new QName("", "areaBasal");
    private final static QName _Pintervenir_QNAME = new QName("", "pintervenir");
    private final static QName _DiametricaEspecieId_QNAME = new QName("", "diametricaEspecieId");
    private final static QName _ClaseDiametricaDesc_QNAME = new QName("", "claseDiametricaDesc");
    private final static QName _Minimo_QNAME = new QName("", "minimo");
    private final static QName _MarcaClase_QNAME = new QName("", "marcaClase");
    private final static QName _ClaseDiametricaId_QNAME = new QName("", "claseDiametricaId");
    private final static QName _Maximo_QNAME = new QName("", "maximo");
    private final static QName _EspecieGestionId_QNAME = new QName("", "especieGestionId");
    private final static QName _EspecieRodalId_QNAME = new QName("", "especieRodalId");
    private final static QName _Lenia_QNAME = new QName("", "lenia");
    private final static QName _MostrarPFuste_QNAME = new QName("", "mostrarPFuste");
    private final static QName _MostrarPGeneral_QNAME = new QName("", "mostrarPGeneral");
    private final static QName _No_QNAME = new QName("", "no");
    private final static QName _Parcela_QNAME = new QName("", "parcela");
    private final static QName _Porcentaje_QNAME = new QName("", "porcentaje");
    private final static QName _Ptroza_QNAME = new QName("", "ptroza");
    private final static QName _SumaAb_QNAME = new QName("", "sumaAb");
    private final static QName _SumaAltura_QNAME = new QName("", "sumaAltura");
    private final static QName _SumaDap_QNAME = new QName("", "sumaDap");
    private final static QName _SumaVolumen_QNAME = new QName("", "sumaVolumen");
    private final static QName _Troza_QNAME = new QName("", "troza");
    private final static QName _TtEspecieEvaluada_QNAME = new QName("", "ttEspecieEvaluada");
    private final static QName _VolResidual_QNAME = new QName("", "volResidual");
    private final static QName _Expediente_QNAME = new QName("", "expediente");
    private final static QName _ExpedienteVacId_QNAME = new QName("", "expedienteVacId");
    private final static QName _FechaAceptacion_QNAME = new QName("", "fechaAceptacion");
    private final static QName _FechaAnulacion_QNAME = new QName("", "fechaAnulacion");
    private final static QName _FechaCierre_QNAME = new QName("", "fechaCierre");
    private final static QName _FechaVencimiento_QNAME = new QName("", "fechaVencimiento");
    private final static QName _Folio_QNAME = new QName("", "folio");
    private final static QName _Libro_QNAME = new QName("", "libro");
    private final static QName _Notario_QNAME = new QName("", "notario");
    private final static QName _NumeroDocumento_QNAME = new QName("", "numeroDocumento");
    private final static QName _TcLibro_QNAME = new QName("", "tcLibro");
    private final static QName _PaisId_QNAME = new QName("", "paisId");
    private final static QName _PaisDesc_QNAME = new QName("", "paisDesc");
    private final static QName _DepartamentoDesc_QNAME = new QName("", "departamentoDesc");
    private final static QName _DepartamentoId_QNAME = new QName("", "departamentoId");
    private final static QName _MunicipioDesc_QNAME = new QName("", "municipioDesc");
    private final static QName _MunicipioId_QNAME = new QName("", "municipioId");
    private final static QName _TipoPropiedadId_QNAME = new QName("", "tipoPropiedadId");
    private final static QName _EsPropiedad_QNAME = new QName("", "esPropiedad");
    private final static QName _TipoPropiedadDesc_QNAME = new QName("", "tipoPropiedadDesc");
    private final static QName _Observaciones_QNAME = new QName("", "observaciones");
    private final static QName _GrupoId_QNAME = new QName("", "grupoId");
    private final static QName _FechaEmision_QNAME = new QName("", "fechaEmision");
    private final static QName _FincaGestionId_QNAME = new QName("", "fincaGestionId");
    private final static QName _Sigla_QNAME = new QName("", "sigla");
    private final static QName _FechaNacimiento_QNAME = new QName("", "fechaNacimiento");
    private final static QName _PersonaModificaId_QNAME = new QName("", "personaModificaId");
    private final static QName _FechaUltimaModicacion_QNAME = new QName("", "fechaUltimaModicacion");
    private final static QName _PuestoDesc_QNAME = new QName("", "puestoDesc");
    private final static QName _PuestoId_QNAME = new QName("", "puestoId");
    private final static QName _SexoId_QNAME = new QName("", "sexoId");
    private final static QName _SexoDesc_QNAME = new QName("", "sexoDesc");
    private final static QName _Correo_QNAME = new QName("", "correo");
    private final static QName _PasswordTmp_QNAME = new QName("", "passwordTmp");
    private final static QName _Nit_QNAME = new QName("", "nit");
    private final static QName _Confirmado_QNAME = new QName("", "confirmado");
    private final static QName _TcPerfil_QNAME = new QName("", "tcPerfil");
    private final static QName _UsuarioDesc_QNAME = new QName("", "usuarioDesc");
    private final static QName _RequiereCambioClave_QNAME = new QName("", "requiereCambioClave");
    private final static QName _Usuario_QNAME = new QName("", "usuario");
    private final static QName _UsuarioId_QNAME = new QName("", "usuarioId");
    private final static QName _Telefono_QNAME = new QName("", "telefono");
    private final static QName _CulturaDesc_QNAME = new QName("", "culturaDesc");
    private final static QName _CulturaId_QNAME = new QName("", "culturaId");
    private final static QName _TmpFoto_QNAME = new QName("", "tmpFoto");
    private final static QName _TcUsuarioSubregion_QNAME = new QName("", "tcUsuarioSubregion");
    private final static QName _Direccion_QNAME = new QName("", "direccion");
    private final static QName _IdiomaId_QNAME = new QName("", "idiomaId");
    private final static QName _IdiomaDesc_QNAME = new QName("", "idiomaDesc");
    private final static QName _Foto_QNAME = new QName("", "foto");
    private final static QName _Rf_QNAME = new QName("", "rf");
    private final static QName _PersonaDesc_QNAME = new QName("", "personaDesc");
    private final static QName _Cui_QNAME = new QName("", "cui");
    private final static QName _FechaUltModif_QNAME = new QName("", "fechaUltModif");
    private final static QName _Rfn_QNAME = new QName("", "rfn");
    private final static QName _EstadoCivilId_QNAME = new QName("", "estadoCivilId");
    private final static QName _EstadoCivilDesc_QNAME = new QName("", "estadoCivilDesc");
    private final static QName _PersonaId_QNAME = new QName("", "personaId");
    private final static QName _RutaFoto_QNAME = new QName("", "rutaFoto");
    private final static QName _OcupacionId_QNAME = new QName("", "ocupacionId");
    private final static QName _OcupacionDesc_QNAME = new QName("", "ocupacionDesc");
    private final static QName _PropietarioFincaId_QNAME = new QName("", "propietarioFincaId");
    private final static QName _Norte_QNAME = new QName("", "norte");
    private final static QName _FincaId_QNAME = new QName("", "fincaId");
    private final static QName _Oeste_QNAME = new QName("", "oeste");
    private final static QName _FechaUltimaModif_QNAME = new QName("", "fechaUltimaModif");
    private final static QName _GtmX_QNAME = new QName("", "gtmX");
    private final static QName _GtmY_QNAME = new QName("", "gtmY");
    private final static QName _FincaDesc_QNAME = new QName("", "fincaDesc");
    private final static QName _Este_QNAME = new QName("", "este");
    private final static QName _Sur_QNAME = new QName("", "sur");
    private final static QName _AreaDocumento_QNAME = new QName("", "areaDocumento");
    private final static QName _GestionId_QNAME = new QName("", "gestionId");
    private final static QName _Informes_QNAME = new QName("", "informes");
    private final static QName _FechaAsignacion_QNAME = new QName("", "fechaAsignacion");
    private final static QName _NotificacionGestionDesc_QNAME = new QName("", "notificacionGestionDesc");
    private final static QName _NotificacionGestionId_QNAME = new QName("", "notificacionGestionId");
    private final static QName _TipoNotificacionId_QNAME = new QName("", "tipoNotificacionId");
    private final static QName _EsDireccion_QNAME = new QName("", "esDireccion");
    private final static QName _Maxlength_QNAME = new QName("", "maxlength");
    private final static QName _TipoNotificacionDesc_QNAME = new QName("", "tipoNotificacionDesc");
    private final static QName _Type_QNAME = new QName("", "type");
    private final static QName _EsObligatorio_QNAME = new QName("", "esObligatorio");
    private final static QName _Nug_QNAME = new QName("", "nug");
    private final static QName _Numero_QNAME = new QName("", "numero");
    private final static QName _ObservacionesCronograma_QNAME = new QName("", "observacionesCronograma");
    private final static QName _PasoId_QNAME = new QName("", "pasoId");
    private final static QName _PersonaAnulaId_QNAME = new QName("", "personaAnulaId");
    private final static QName _PersonaGestionId_QNAME = new QName("", "personaGestionId");
    private final static QName _RepresentanteLegal_QNAME = new QName("", "representanteLegal");
    private final static QName _SoloRepresenta_QNAME = new QName("", "soloRepresenta");
    private final static QName _AreaMuestreada_QNAME = new QName("", "areaMuestreada");
    private final static QName _Correlativo_QNAME = new QName("", "correlativo");
    private final static QName _Incremento_QNAME = new QName("", "incremento");
    private final static QName _TamanioParcela_QNAME = new QName("", "tamanioParcela");
    private final static QName _AnioRepoblacion_QNAME = new QName("", "anioRepoblacion");
    private final static QName _AreaGarantia_QNAME = new QName("", "areaGarantia");
    private final static QName _CantidadEspecie_QNAME = new QName("", "cantidadEspecie");
    private final static QName _Edad_QNAME = new QName("", "edad");
    private final static QName _ImgRodal_QNAME = new QName("", "imgRodal");
    private final static QName _PendientePromedio_QNAME = new QName("", "pendientePromedio");
    private final static QName _Remanente_QNAME = new QName("", "remanente");
    private final static QName _RodalGestionId_QNAME = new QName("", "rodalGestionId");
    private final static QName _TipoCoberturaDesc_QNAME = new QName("", "tipoCoberturaDesc");
    private final static QName _TipoCoberturaId_QNAME = new QName("", "tipoCoberturaId");
    private final static QName _TotalParcelas_QNAME = new QName("", "totalParcelas");
    private final static QName _TtEstadisticoRodal_QNAME = new QName("", "ttEstadisticoRodal");
    private final static QName _TtEvaluacionCampo_QNAME = new QName("", "ttEvaluacionCampo");
    private final static QName _Ubicacion_QNAME = new QName("", "ubicacion");
    private final static QName _ValorMadera_QNAME = new QName("", "valorMadera");
    private final static QName _AnioPlantacion_QNAME = new QName("", "anioPlantacion");
    private final static QName _DensidadInicial_QNAME = new QName("", "densidadInicial");
    private final static QName _SistemaRepoblacionId_QNAME = new QName("", "sistemaRepoblacionId");
    private final static QName _SistemaRepoblacionDesc_QNAME = new QName("", "sistemaRepoblacionDesc");
    private final static QName _EspecieRecuperacionId_QNAME = new QName("", "especieRecuperacionId");
    private final static QName _MetodoSiembraDesc_QNAME = new QName("", "metodoSiembraDesc");
    private final static QName _MetodoSiembraId_QNAME = new QName("", "metodoSiembraId");
    private final static QName _RodalRepoblacionId_QNAME = new QName("", "rodalRepoblacionId");
    private final static QName _SistemaRepoblacionGestionId_QNAME = new QName("", "sistemaRepoblacionGestionId");
    private final static QName _PlanTipoGestionId_QNAME = new QName("", "planTipoGestionId");
    private final static QName _AreaMaxima_QNAME = new QName("", "areaMaxima");
    private final static QName _AreaMinima_QNAME = new QName("", "areaMinima");
    private final static QName _PlanTipoGestionDesc_QNAME = new QName("", "planTipoGestionDesc");
    private final static QName _SubregionReferenciaId_QNAME = new QName("", "subregionReferenciaId");
    private final static QName _SubregionId_QNAME = new QName("", "subregionId");
    private final static QName _SubregionDesc_QNAME = new QName("", "subregionDesc");
    private final static QName _Alias_QNAME = new QName("", "alias");
    private final static QName _RegionId_QNAME = new QName("", "regionId");
    private final static QName _RegionDesc_QNAME = new QName("", "regionDesc");
    private final static QName _RegionReferenciaId_QNAME = new QName("", "regionReferenciaId");
    private final static QName _TipoBosqueDesc_QNAME = new QName("", "tipoBosqueDesc");
    private final static QName _TipoBosqueId_QNAME = new QName("", "tipoBosqueId");
    private final static QName _ModuloDesc_QNAME = new QName("", "moduloDesc");
    private final static QName _ModuloId_QNAME = new QName("", "moduloId");
    private final static QName _TipoGestionDesc_QNAME = new QName("", "tipoGestionDesc");
    private final static QName _TipoGestionId_QNAME = new QName("", "tipoGestionId");
    private final static QName _TieneRepresentante_QNAME = new QName("", "tieneRepresentante");
    private final static QName _BiofisicaGestionId_QNAME = new QName("", "biofisicaGestionId");
    private final static QName _Clima_QNAME = new QName("", "clima");
    private final static QName _Elevacion_QNAME = new QName("", "elevacion");
    private final static QName _Hidrografia_QNAME = new QName("", "hidrografia");
    private final static QName _TipoBosque_QNAME = new QName("", "tipoBosque");
    private final static QName _Topografia_QNAME = new QName("", "topografia");
    private final static QName _ZonaVida_QNAME = new QName("", "zonaVida");
    private final static QName _AreaBosque_QNAME = new QName("", "areaBosque");
    private final static QName _AreaFuera_QNAME = new QName("", "areaFuera");
    private final static QName _AreaIntervenirBosque_QNAME = new QName("", "areaIntervenirBosque");
    private final static QName _AreaIntervenirFuera_QNAME = new QName("", "areaIntervenirFuera");
    private final static QName _AreaProduccion_QNAME = new QName("", "areaProduccion");
    private final static QName _AreaProteccionBosque_QNAME = new QName("", "areaProteccionBosque");
    private final static QName _AreaProteccionFuera_QNAME = new QName("", "areaProteccionFuera");
    private final static QName _DivisionAreaGestionId_QNAME = new QName("", "divisionAreaGestionId");
    private final static QName _FueraBosque_QNAME = new QName("", "fueraBosque");
    private final static QName _TtRepresentanteGestion_QNAME = new QName("", "ttRepresentanteGestion");
    private final static QName _UsoFincaDesc_QNAME = new QName("", "usoFincaDesc");
    private final static QName _UsoFincaId_QNAME = new QName("", "usoFincaId");
    private final static QName _UsoFincaGestionId_QNAME = new QName("", "usoFincaGestionId");
    private final static QName _TtEstadisticoGestion_QNAME = new QName("", "ttEstadisticoGestion");
    private final static QName _Anios_QNAME = new QName("", "anios");
    private final static QName _AniosSolicitado_QNAME = new QName("", "aniosSolicitado");
    private final static QName _DpiFiador_QNAME = new QName("", "dpiFiador");
    private final static QName _EdadRotacion_QNAME = new QName("", "edadRotacion");
    private final static QName _Meses_QNAME = new QName("", "meses");
    private final static QName _NoTurnos_QNAME = new QName("", "noTurnos");
    private final static QName _NombreEmpresa_QNAME = new QName("", "nombreEmpresa");
    private final static QName _NombreFiador_QNAME = new QName("", "nombreFiador");
    private final static QName _ResumenGestionId_QNAME = new QName("", "resumenGestionId");
    private final static QName _Rnf_QNAME = new QName("", "rnf");
    private final static QName _SistemaCortaId_QNAME = new QName("", "sistemaCortaId");
    private final static QName _SistemaCortaDesc_QNAME = new QName("", "sistemaCortaDesc");
    private final static QName _TipoGarantiaId_QNAME = new QName("", "tipoGarantiaId");
    private final static QName _TipoGarantiaDesc_QNAME = new QName("", "tipoGarantiaDesc");
    private final static QName _TipoFiadorId_QNAME = new QName("", "tipoFiadorId");
    private final static QName _AnalisisDescriptivo_QNAME = new QName("", "analisisDescriptivo");
    private final static QName _Brinzal_QNAME = new QName("", "brinzal");
    private final static QName _CompensaPendiente_QNAME = new QName("", "compensaPendiente");
    private final static QName _DescripcionCausa_QNAME = new QName("", "descripcionCausa");
    private final static QName _DescripcionDanio_QNAME = new QName("", "descripcionDanio");
    private final static QName _Diametro_QNAME = new QName("", "diametro");
    private final static QName _IntensidadMuestreo_QNAME = new QName("", "intensidadMuestreo");
    private final static QName _InventarioGestionId_QNAME = new QName("", "inventarioGestionId");
    private final static QName _Latizal_QNAME = new QName("", "latizal");
    private final static QName _ObsRegeneracion_QNAME = new QName("", "obsRegeneracion");
    private final static QName _Regresion_QNAME = new QName("", "regresion");
    private final static QName _TcFormaParcela_QNAME = new QName("", "tcFormaParcela");
    private final static QName _OrigenCalculoId_QNAME = new QName("", "origenCalculoId");
    private final static QName _OrigenCalculoDesc_QNAME = new QName("", "origenCalculoDesc");
    private final static QName _TcTipoMuestreo_QNAME = new QName("", "tcTipoMuestreo");
    private final static QName _TotalRodales_QNAME = new QName("", "totalRodales");
    private final static QName _Justificacion_QNAME = new QName("", "justificacion");
    private final static QName _ActividadAprovechamiento_QNAME = new QName("", "actividadAprovechamiento");
    private final static QName _AreaCompromiso_QNAME = new QName("", "areaCompromiso");
    private final static QName _AreaExistente_QNAME = new QName("", "areaExistente");
    private final static QName _AreaExtraer_QNAME = new QName("", "areaExtraer");
    private final static QName _AreaIntervenir_QNAME = new QName("", "areaIntervenir");
    private final static QName _Cap_QNAME = new QName("", "cap");
    private final static QName _Carbon_QNAME = new QName("", "carbon");
    private final static QName _Establecimiento_QNAME = new QName("", "establecimiento");
    private final static QName _HayReforestacion_QNAME = new QName("", "hayReforestacion");
    private final static QName _JustificacionEspecie_QNAME = new QName("", "justificacionEspecie");
    private final static QName _MasaForestal_QNAME = new QName("", "masaForestal");
    private final static QName _PlanificacionGestionId_QNAME = new QName("", "planificacionGestionId");
    private final static QName _PostAprovechamiento_QNAME = new QName("", "postAprovechamiento");
    private final static QName _CriterioCortaId_QNAME = new QName("", "criterioCortaId");
    private final static QName _CriterioCortaDesc_QNAME = new QName("", "criterioCortaDesc");
    private final static QName _Criterio_QNAME = new QName("", "criterio");
    private final static QName _AmpliacionRonda_QNAME = new QName("", "ampliacionRonda");
    private final static QName _AreaCritica_QNAME = new QName("", "areaCritica");
    private final static QName _Combustible_QNAME = new QName("", "combustible");
    private final static QName _ControlPlaga_QNAME = new QName("", "controlPlaga");
    private final static QName _Cortafuego_QNAME = new QName("", "cortafuego");
    private final static QName _JustificacionPf_QNAME = new QName("", "justificacionPf");
    private final static QName _MonitoreoPlaga_QNAME = new QName("", "monitoreoPlaga");
    private final static QName _ProteccionGestionId_QNAME = new QName("", "proteccionGestionId");
    private final static QName _RespuestaIf_QNAME = new QName("", "respuestaIf");
    private final static QName _RondaCortafuego_QNAME = new QName("", "rondaCortafuego");
    private final static QName _RutaEscape_QNAME = new QName("", "rutaEscape");
    private final static QName _Vigilancia_QNAME = new QName("", "vigilancia");
    private final static QName _TtRepoblacionGestion_QNAME = new QName("", "ttRepoblacionGestion");
    private final static QName _UltimoPanel_QNAME = new QName("", "ultimoPanel");
    private final static QName _NitEntidad_QNAME = new QName("", "nitEntidad");
    private final static QName _NombreComercial_QNAME = new QName("", "nombreComercial");
    private final static QName _RazonSocial_QNAME = new QName("", "razonSocial");
    private final static QName _TcTipoEntidad_QNAME = new QName("", "tcTipoEntidad");
    private final static QName _TipoPropietarioId_QNAME = new QName("", "tipoPropietarioId");
    private final static QName _TipoPropietarioDesc_QNAME = new QName("", "tipoPropietarioDesc");
    private final static QName _TipoPropietarioGestionId_QNAME = new QName("", "tipoPropietarioGestionId");
    private final static QName _SingleValue_QNAME = new QName("", "singleValue");
    private final static QName _Message_QNAME = new QName("", "message");
    private final static QName _Status_QNAME = new QName("", "status");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.plan
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PlanEditado }
     * 
     */
    public PlanEditado createPlanEditado() {
        return new PlanEditado();
    }

    /**
     * Create an instance of {@link Data }
     * 
     */
    public Data createData() {
        return new Data();
    }

    /**
     * Create an instance of {@link Anexo }
     * 
     */
    public Anexo createAnexo() {
        return new Anexo();
    }

    /**
     * Create an instance of {@link TcTipoAnexo }
     * 
     */
    public TcTipoAnexo createTcTipoAnexo() {
        return new TcTipoAnexo();
    }

    /**
     * Create an instance of {@link TcGrupoRequisito }
     * 
     */
    public TcGrupoRequisito createTcGrupoRequisito() {
        return new TcGrupoRequisito();
    }

    /**
     * Create an instance of {@link CodigoClase }
     * 
     */
    public CodigoClase createCodigoClase() {
        return new CodigoClase();
    }

    /**
     * Create an instance of {@link TcClaseDesarrollo }
     * 
     */
    public TcClaseDesarrollo createTcClaseDesarrollo() {
        return new TcClaseDesarrollo();
    }

    /**
     * Create an instance of {@link Especies }
     * 
     */
    public Especies createEspecies() {
        return new Especies();
    }

    /**
     * Create an instance of {@link TcEspecie }
     * 
     */
    public TcEspecie createTcEspecie() {
        return new TcEspecie();
    }

    /**
     * Create an instance of {@link TcTipoEspecie }
     * 
     */
    public TcTipoEspecie createTcTipoEspecie() {
        return new TcTipoEspecie();
    }

    /**
     * Create an instance of {@link TcTipoMadera }
     * 
     */
    public TcTipoMadera createTcTipoMadera() {
        return new TcTipoMadera();
    }

    /**
     * Create an instance of {@link TcTipoInventario }
     * 
     */
    public TcTipoInventario createTcTipoInventario() {
        return new TcTipoInventario();
    }

    /**
     * Create an instance of {@link TcTratamientoSilvicultural }
     * 
     */
    public TcTratamientoSilvicultural createTcTratamientoSilvicultural() {
        return new TcTratamientoSilvicultural();
    }

    /**
     * Create an instance of {@link Distribucion }
     * 
     */
    public Distribucion createDistribucion() {
        return new Distribucion();
    }

    /**
     * Create an instance of {@link TcClaseDiametrica }
     * 
     */
    public TcClaseDiametrica createTcClaseDiametrica() {
        return new TcClaseDiametrica();
    }

    /**
     * Create an instance of {@link Fincas }
     * 
     */
    public Fincas createFincas() {
        return new Fincas();
    }

    /**
     * Create an instance of {@link TcMunicipioEmite }
     * 
     */
    public TcMunicipioEmite createTcMunicipioEmite() {
        return new TcMunicipioEmite();
    }

    /**
     * Create an instance of {@link TcDepartamento }
     * 
     */
    public TcDepartamento createTcDepartamento() {
        return new TcDepartamento();
    }

    /**
     * Create an instance of {@link TcPais }
     * 
     */
    public TcPais createTcPais() {
        return new TcPais();
    }

    /**
     * Create an instance of {@link TcTipoPropiedad }
     * 
     */
    public TcTipoPropiedad createTcTipoPropiedad() {
        return new TcTipoPropiedad();
    }

    /**
     * Create an instance of {@link Propietarios }
     * 
     */
    public Propietarios createPropietarios() {
        return new Propietarios();
    }

    /**
     * Create an instance of {@link TcPersona }
     * 
     */
    public TcPersona createTcPersona() {
        return new TcPersona();
    }

    /**
     * Create an instance of {@link TcPuesto }
     * 
     */
    public TcPuesto createTcPuesto() {
        return new TcPuesto();
    }

    /**
     * Create an instance of {@link TcSexo }
     * 
     */
    public TcSexo createTcSexo() {
        return new TcSexo();
    }

    /**
     * Create an instance of {@link TcUsuario }
     * 
     */
    public TcUsuario createTcUsuario() {
        return new TcUsuario();
    }

    /**
     * Create an instance of {@link TcCultura }
     * 
     */
    public TcCultura createTcCultura() {
        return new TcCultura();
    }

    /**
     * Create an instance of {@link TcIdioma }
     * 
     */
    public TcIdioma createTcIdioma() {
        return new TcIdioma();
    }

    /**
     * Create an instance of {@link TcMunicipio }
     * 
     */
    public TcMunicipio createTcMunicipio() {
        return new TcMunicipio();
    }

    /**
     * Create an instance of {@link TcEstadoCivil }
     * 
     */
    public TcEstadoCivil createTcEstadoCivil() {
        return new TcEstadoCivil();
    }

    /**
     * Create an instance of {@link TcOcupacion }
     * 
     */
    public TcOcupacion createTcOcupacion() {
        return new TcOcupacion();
    }

    /**
     * Create an instance of {@link TcFinca }
     * 
     */
    public TcFinca createTcFinca() {
        return new TcFinca();
    }

    /**
     * Create an instance of {@link Notificaciones }
     * 
     */
    public Notificaciones createNotificaciones() {
        return new Notificaciones();
    }

    /**
     * Create an instance of {@link TcTipoNotificacion }
     * 
     */
    public TcTipoNotificacion createTcTipoNotificacion() {
        return new TcTipoNotificacion();
    }

    /**
     * Create an instance of {@link Personas }
     * 
     */
    public Personas createPersonas() {
        return new Personas();
    }

    /**
     * Create an instance of {@link Representantes }
     * 
     */
    public Representantes createRepresentantes() {
        return new Representantes();
    }

    /**
     * Create an instance of {@link Rodal }
     * 
     */
    public Rodal createRodal() {
        return new Rodal();
    }

    /**
     * Create an instance of {@link TcTipoCobertura }
     * 
     */
    public TcTipoCobertura createTcTipoCobertura() {
        return new TcTipoCobertura();
    }

    /**
     * Create an instance of {@link RodalesRepoblacion }
     * 
     */
    public RodalesRepoblacion createRodalesRepoblacion() {
        return new RodalesRepoblacion();
    }

    /**
     * Create an instance of {@link Repoblacion }
     * 
     */
    public Repoblacion createRepoblacion() {
        return new Repoblacion();
    }

    /**
     * Create an instance of {@link TcSistemaRepoblacion }
     * 
     */
    public TcSistemaRepoblacion createTcSistemaRepoblacion() {
        return new TcSistemaRepoblacion();
    }

    /**
     * Create an instance of {@link TcMetodoSiembra }
     * 
     */
    public TcMetodoSiembra createTcMetodoSiembra() {
        return new TcMetodoSiembra();
    }

    /**
     * Create an instance of {@link SistemaRepoblacion }
     * 
     */
    public SistemaRepoblacion createSistemaRepoblacion() {
        return new SistemaRepoblacion();
    }

    /**
     * Create an instance of {@link TcElaborador }
     * 
     */
    public TcElaborador createTcElaborador() {
        return new TcElaborador();
    }

    /**
     * Create an instance of {@link TcPersonaCrea }
     * 
     */
    public TcPersonaCrea createTcPersonaCrea() {
        return new TcPersonaCrea();
    }

    /**
     * Create an instance of {@link TcPlanTipoGestion }
     * 
     */
    public TcPlanTipoGestion createTcPlanTipoGestion() {
        return new TcPlanTipoGestion();
    }

    /**
     * Create an instance of {@link TcSubregion }
     * 
     */
    public TcSubregion createTcSubregion() {
        return new TcSubregion();
    }

    /**
     * Create an instance of {@link TcSubregional }
     * 
     */
    public TcSubregional createTcSubregional() {
        return new TcSubregional();
    }

    /**
     * Create an instance of {@link TcRegion }
     * 
     */
    public TcRegion createTcRegion() {
        return new TcRegion();
    }

    /**
     * Create an instance of {@link TcTipoBosque }
     * 
     */
    public TcTipoBosque createTcTipoBosque() {
        return new TcTipoBosque();
    }

    /**
     * Create an instance of {@link TcTipoGestion }
     * 
     */
    public TcTipoGestion createTcTipoGestion() {
        return new TcTipoGestion();
    }

    /**
     * Create an instance of {@link TcModulo }
     * 
     */
    public TcModulo createTcModulo() {
        return new TcModulo();
    }

    /**
     * Create an instance of {@link TtBiofisicaGestion }
     * 
     */
    public TtBiofisicaGestion createTtBiofisicaGestion() {
        return new TtBiofisicaGestion();
    }

    /**
     * Create an instance of {@link TtDivisionAreaGestion }
     * 
     */
    public TtDivisionAreaGestion createTtDivisionAreaGestion() {
        return new TtDivisionAreaGestion();
    }

    /**
     * Create an instance of {@link TtGestion }
     * 
     */
    public TtGestion createTtGestion() {
        return new TtGestion();
    }

    /**
     * Create an instance of {@link Uso }
     * 
     */
    public Uso createUso() {
        return new Uso();
    }

    /**
     * Create an instance of {@link TcUsoFinca }
     * 
     */
    public TcUsoFinca createTcUsoFinca() {
        return new TcUsoFinca();
    }

    /**
     * Create an instance of {@link TtResumenGestion }
     * 
     */
    public TtResumenGestion createTtResumenGestion() {
        return new TtResumenGestion();
    }

    /**
     * Create an instance of {@link TcRegente }
     * 
     */
    public TcRegente createTcRegente() {
        return new TcRegente();
    }

    /**
     * Create an instance of {@link TcSistemaCorta }
     * 
     */
    public TcSistemaCorta createTcSistemaCorta() {
        return new TcSistemaCorta();
    }

    /**
     * Create an instance of {@link TcTipoGarantia }
     * 
     */
    public TcTipoGarantia createTcTipoGarantia() {
        return new TcTipoGarantia();
    }

    /**
     * Create an instance of {@link TtInventarioGestion }
     * 
     */
    public TtInventarioGestion createTtInventarioGestion() {
        return new TtInventarioGestion();
    }

    /**
     * Create an instance of {@link TcOrigenCalculo }
     * 
     */
    public TcOrigenCalculo createTcOrigenCalculo() {
        return new TcOrigenCalculo();
    }

    /**
     * Create an instance of {@link TtPlanificacionGestion }
     * 
     */
    public TtPlanificacionGestion createTtPlanificacionGestion() {
        return new TtPlanificacionGestion();
    }

    /**
     * Create an instance of {@link TcCriterioCorta }
     * 
     */
    public TcCriterioCorta createTcCriterioCorta() {
        return new TcCriterioCorta();
    }

    /**
     * Create an instance of {@link TtProteccionGestion }
     * 
     */
    public TtProteccionGestion createTtProteccionGestion() {
        return new TtProteccionGestion();
    }

    /**
     * Create an instance of {@link TtTipoPropietarioGestion }
     * 
     */
    public TtTipoPropietarioGestion createTtTipoPropietarioGestion() {
        return new TtTipoPropietarioGestion();
    }

    /**
     * Create an instance of {@link TcTipoPropietario }
     * 
     */
    public TcTipoPropietario createTcTipoPropietario() {
        return new TcTipoPropietario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "estadoId")
    public JAXBElement<BigInteger> createEstadoId(BigInteger value) {
        return new JAXBElement<BigInteger>(_EstadoId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "turno")
    public JAXBElement<BigInteger> createTurno(BigInteger value) {
        return new JAXBElement<BigInteger>(_Turno_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "anexoGestionId")
    public JAXBElement<BigInteger> createAnexoGestionId(BigInteger value) {
        return new JAXBElement<BigInteger>(_AnexoGestionId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "extension")
    public JAXBElement<String> createExtension(String value) {
        return new JAXBElement<String>(_Extension_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "nombre")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNombre(String value) {
        return new JAXBElement<String>(_Nombre_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ruta")
    public JAXBElement<String> createRuta(String value) {
        return new JAXBElement<String>(_Ruta_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "size")
    public JAXBElement<BigDecimal> createSize(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Size_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tipoAnexoId")
    public JAXBElement<BigInteger> createTipoAnexoId(BigInteger value) {
        return new JAXBElement<BigInteger>(_TipoAnexoId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "fechaRegistro")
    public JAXBElement<XMLGregorianCalendar> createFechaRegistro(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FechaRegistro_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "obligatorio")
    public JAXBElement<Boolean> createObligatorio(Boolean value) {
        return new JAXBElement<Boolean>(_Obligatorio_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "grupoRequisitoDesc")
    public JAXBElement<String> createGrupoRequisitoDesc(String value) {
        return new JAXBElement<String>(_GrupoRequisitoDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "grupoRequisitoId")
    public JAXBElement<BigInteger> createGrupoRequisitoId(BigInteger value) {
        return new JAXBElement<BigInteger>(_GrupoRequisitoId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tooltip")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTooltip(String value) {
        return new JAXBElement<String>(_Tooltip_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tipoAnexoDesc")
    public JAXBElement<String> createTipoAnexoDesc(String value) {
        return new JAXBElement<String>(_TipoAnexoDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "usoId")
    public JAXBElement<BigInteger> createUsoId(BigInteger value) {
        return new JAXBElement<BigInteger>(_UsoId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "anio")
    public JAXBElement<BigInteger> createAnio(BigInteger value) {
        return new JAXBElement<BigInteger>(_Anio_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "area")
    public JAXBElement<BigDecimal> createArea(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Area_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "categoriaProfesionId")
    public JAXBElement<BigInteger> createCategoriaProfesionId(BigInteger value) {
        return new JAXBElement<BigInteger>(_CategoriaProfesionId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "claseDesarrolloId")
    public JAXBElement<BigInteger> createClaseDesarrolloId(BigInteger value) {
        return new JAXBElement<BigInteger>(_ClaseDesarrolloId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "claseDesarrolloDesc")
    public JAXBElement<String> createClaseDesarrolloDesc(String value) {
        return new JAXBElement<String>(_ClaseDesarrolloDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ocultar")
    public JAXBElement<BigInteger> createOcultar(BigInteger value) {
        return new JAXBElement<BigInteger>(_Ocultar_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "claseDesarrolloGestionId")
    public JAXBElement<BigInteger> createClaseDesarrolloGestionId(BigInteger value) {
        return new JAXBElement<BigInteger>(_ClaseDesarrolloGestionId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "cronograma")
    public JAXBElement<String> createCronograma(String value) {
        return new JAXBElement<String>(_Cronograma_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "abh")
    public JAXBElement<BigDecimal> createAbh(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Abh_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "abr")
    public JAXBElement<BigDecimal> createAbr(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Abr_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "abrExtraer")
    public JAXBElement<BigDecimal> createAbrExtraer(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AbrExtraer_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "alturaPromedio")
    public JAXBElement<BigDecimal> createAlturaPromedio(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AlturaPromedio_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "arbolh")
    public JAXBElement<BigInteger> createArbolh(BigInteger value) {
        return new JAXBElement<BigInteger>(_Arbolh_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "arbolr")
    public JAXBElement<BigInteger> createArbolr(BigInteger value) {
        return new JAXBElement<BigInteger>(_Arbolr_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "arbolrExtraer")
    public JAXBElement<BigInteger> createArbolrExtraer(BigInteger value) {
        return new JAXBElement<BigInteger>(_ArbolrExtraer_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "conteoArbol")
    public JAXBElement<BigInteger> createConteoArbol(BigInteger value) {
        return new JAXBElement<BigInteger>(_ConteoArbol_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "dapPromedio")
    public JAXBElement<BigDecimal> createDapPromedio(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_DapPromedio_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "fuste")
    public JAXBElement<String> createFuste(String value) {
        return new JAXBElement<String>(_Fuste_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "personaActualizaId")
    public JAXBElement<BigInteger> createPersonaActualizaId(BigInteger value) {
        return new JAXBElement<BigInteger>(_PersonaActualizaId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "codigo")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCodigo(String value) {
        return new JAXBElement<String>(_Codigo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ecuacion")
    public JAXBElement<String> createEcuacion(String value) {
        return new JAXBElement<String>(_Ecuacion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "especieDesc")
    public JAXBElement<String> createEspecieDesc(String value) {
        return new JAXBElement<String>(_EspecieDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "especieId")
    public JAXBElement<BigInteger> createEspecieId(BigInteger value) {
        return new JAXBElement<BigInteger>(_EspecieId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "nombreCientifico")
    public JAXBElement<String> createNombreCientifico(String value) {
        return new JAXBElement<String>(_NombreCientifico_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tipoEspecieDesc")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTipoEspecieDesc(String value) {
        return new JAXBElement<String>(_TipoEspecieDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tipoEspecieId")
    public JAXBElement<BigInteger> createTipoEspecieId(BigInteger value) {
        return new JAXBElement<BigInteger>(_TipoEspecieId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "aceptaFormula")
    public JAXBElement<BigInteger> createAceptaFormula(BigInteger value) {
        return new JAXBElement<BigInteger>(_AceptaFormula_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ecuacionLatifoliado")
    public JAXBElement<String> createEcuacionLatifoliado(String value) {
        return new JAXBElement<String>(_EcuacionLatifoliado_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "sinonimo")
    public JAXBElement<String> createSinonimo(String value) {
        return new JAXBElement<String>(_Sinonimo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "personaRegistraId")
    public JAXBElement<BigInteger> createPersonaRegistraId(BigInteger value) {
        return new JAXBElement<BigInteger>(_PersonaRegistraId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "fechaActualiza")
    public JAXBElement<XMLGregorianCalendar> createFechaActualiza(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FechaActualiza_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "formula")
    public JAXBElement<String> createFormula(String value) {
        return new JAXBElement<String>(_Formula_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tipoMaderaDesc")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTipoMaderaDesc(String value) {
        return new JAXBElement<String>(_TipoMaderaDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tipoMaderaId")
    public JAXBElement<BigInteger> createTipoMaderaId(BigInteger value) {
        return new JAXBElement<BigInteger>(_TipoMaderaId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tipoInventarioDesc")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTipoInventarioDesc(String value) {
        return new JAXBElement<String>(_TipoInventarioDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tipoInventarioId")
    public JAXBElement<BigInteger> createTipoInventarioId(BigInteger value) {
        return new JAXBElement<BigInteger>(_TipoInventarioId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tratamientoSilviculturalId")
    public JAXBElement<BigInteger> createTratamientoSilviculturalId(BigInteger value) {
        return new JAXBElement<BigInteger>(_TratamientoSilviculturalId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tratamientoSilviculturalDesc")
    public JAXBElement<String> createTratamientoSilviculturalDesc(String value) {
        return new JAXBElement<String>(_TratamientoSilviculturalDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "volh")
    public JAXBElement<BigDecimal> createVolh(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Volh_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "volr")
    public JAXBElement<BigDecimal> createVolr(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Volr_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "volrExtraer")
    public JAXBElement<BigDecimal> createVolrExtraer(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_VolrExtraer_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "abResidual")
    public JAXBElement<BigDecimal> createAbResidual(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AbResidual_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "arbolResidual")
    public JAXBElement<BigInteger> createArbolResidual(BigInteger value) {
        return new JAXBElement<BigInteger>(_ArbolResidual_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "arboles")
    public JAXBElement<BigInteger> createArboles(BigInteger value) {
        return new JAXBElement<BigInteger>(_Arboles_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "volumen")
    public JAXBElement<BigDecimal> createVolumen(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Volumen_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "areaBasal")
    public JAXBElement<BigDecimal> createAreaBasal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AreaBasal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "pintervenir")
    public JAXBElement<BigDecimal> createPintervenir(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Pintervenir_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "diametricaEspecieId")
    public JAXBElement<BigInteger> createDiametricaEspecieId(BigInteger value) {
        return new JAXBElement<BigInteger>(_DiametricaEspecieId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "claseDiametricaDesc")
    public JAXBElement<String> createClaseDiametricaDesc(String value) {
        return new JAXBElement<String>(_ClaseDiametricaDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "minimo")
    public JAXBElement<BigDecimal> createMinimo(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Minimo_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "marcaClase")
    public JAXBElement<BigDecimal> createMarcaClase(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MarcaClase_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "claseDiametricaId")
    public JAXBElement<BigInteger> createClaseDiametricaId(BigInteger value) {
        return new JAXBElement<BigInteger>(_ClaseDiametricaId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "maximo")
    public JAXBElement<BigDecimal> createMaximo(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Maximo_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "especieGestionId")
    public JAXBElement<BigInteger> createEspecieGestionId(BigInteger value) {
        return new JAXBElement<BigInteger>(_EspecieGestionId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "especieRodalId")
    public JAXBElement<BigInteger> createEspecieRodalId(BigInteger value) {
        return new JAXBElement<BigInteger>(_EspecieRodalId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "lenia")
    public JAXBElement<BigDecimal> createLenia(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Lenia_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "mostrarPFuste")
    public JAXBElement<BigInteger> createMostrarPFuste(BigInteger value) {
        return new JAXBElement<BigInteger>(_MostrarPFuste_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "mostrarPGeneral")
    public JAXBElement<BigInteger> createMostrarPGeneral(BigInteger value) {
        return new JAXBElement<BigInteger>(_MostrarPGeneral_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "no")
    public JAXBElement<BigInteger> createNo(BigInteger value) {
        return new JAXBElement<BigInteger>(_No_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "parcela")
    public JAXBElement<BigInteger> createParcela(BigInteger value) {
        return new JAXBElement<BigInteger>(_Parcela_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "porcentaje")
    public JAXBElement<BigDecimal> createPorcentaje(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Porcentaje_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ptroza")
    public JAXBElement<BigDecimal> createPtroza(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Ptroza_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "sumaAb")
    public JAXBElement<BigDecimal> createSumaAb(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SumaAb_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "sumaAltura")
    public JAXBElement<BigDecimal> createSumaAltura(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SumaAltura_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "sumaDap")
    public JAXBElement<BigDecimal> createSumaDap(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SumaDap_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "sumaVolumen")
    public JAXBElement<BigDecimal> createSumaVolumen(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SumaVolumen_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "troza")
    public JAXBElement<BigDecimal> createTroza(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Troza_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ttEspecieEvaluada")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTtEspecieEvaluada(String value) {
        return new JAXBElement<String>(_TtEspecieEvaluada_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "volResidual")
    public JAXBElement<BigDecimal> createVolResidual(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_VolResidual_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "expediente")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createExpediente(String value) {
        return new JAXBElement<String>(_Expediente_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "expedienteVacId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createExpedienteVacId(String value) {
        return new JAXBElement<String>(_ExpedienteVacId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "fechaAceptacion")
    public JAXBElement<XMLGregorianCalendar> createFechaAceptacion(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FechaAceptacion_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "fechaAnulacion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFechaAnulacion(String value) {
        return new JAXBElement<String>(_FechaAnulacion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "fechaCierre")
    public JAXBElement<XMLGregorianCalendar> createFechaCierre(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FechaCierre_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "fechaVencimiento")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFechaVencimiento(String value) {
        return new JAXBElement<String>(_FechaVencimiento_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "folio")
    public JAXBElement<BigInteger> createFolio(BigInteger value) {
        return new JAXBElement<BigInteger>(_Folio_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "libro")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLibro(String value) {
        return new JAXBElement<String>(_Libro_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "notario")
    public JAXBElement<String> createNotario(String value) {
        return new JAXBElement<String>(_Notario_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "numeroDocumento")
    public JAXBElement<BigInteger> createNumeroDocumento(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumeroDocumento_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tcLibro")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTcLibro(String value) {
        return new JAXBElement<String>(_TcLibro_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "paisId")
    public JAXBElement<BigInteger> createPaisId(BigInteger value) {
        return new JAXBElement<BigInteger>(_PaisId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "paisDesc")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPaisDesc(String value) {
        return new JAXBElement<String>(_PaisDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "departamentoDesc")
    public JAXBElement<String> createDepartamentoDesc(String value) {
        return new JAXBElement<String>(_DepartamentoDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "departamentoId")
    public JAXBElement<BigInteger> createDepartamentoId(BigInteger value) {
        return new JAXBElement<BigInteger>(_DepartamentoId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "municipioDesc")
    public JAXBElement<String> createMunicipioDesc(String value) {
        return new JAXBElement<String>(_MunicipioDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "municipioId")
    public JAXBElement<BigInteger> createMunicipioId(BigInteger value) {
        return new JAXBElement<BigInteger>(_MunicipioId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tipoPropiedadId")
    public JAXBElement<BigInteger> createTipoPropiedadId(BigInteger value) {
        return new JAXBElement<BigInteger>(_TipoPropiedadId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "esPropiedad")
    public JAXBElement<BigInteger> createEsPropiedad(BigInteger value) {
        return new JAXBElement<BigInteger>(_EsPropiedad_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tipoPropiedadDesc")
    public JAXBElement<String> createTipoPropiedadDesc(String value) {
        return new JAXBElement<String>(_TipoPropiedadDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "observaciones")
    public JAXBElement<String> createObservaciones(String value) {
        return new JAXBElement<String>(_Observaciones_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "grupoId")
    public JAXBElement<BigInteger> createGrupoId(BigInteger value) {
        return new JAXBElement<BigInteger>(_GrupoId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "fechaEmision")
    public JAXBElement<XMLGregorianCalendar> createFechaEmision(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FechaEmision_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "fincaGestionId")
    public JAXBElement<BigInteger> createFincaGestionId(BigInteger value) {
        return new JAXBElement<BigInteger>(_FincaGestionId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "sigla")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSigla(String value) {
        return new JAXBElement<String>(_Sigla_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "fechaNacimiento")
    public JAXBElement<XMLGregorianCalendar> createFechaNacimiento(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FechaNacimiento_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "personaModificaId")
    public JAXBElement<BigInteger> createPersonaModificaId(BigInteger value) {
        return new JAXBElement<BigInteger>(_PersonaModificaId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "fechaUltimaModicacion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFechaUltimaModicacion(String value) {
        return new JAXBElement<String>(_FechaUltimaModicacion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "puestoDesc")
    public JAXBElement<String> createPuestoDesc(String value) {
        return new JAXBElement<String>(_PuestoDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "puestoId")
    public JAXBElement<BigInteger> createPuestoId(BigInteger value) {
        return new JAXBElement<BigInteger>(_PuestoId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "sexoId")
    public JAXBElement<BigInteger> createSexoId(BigInteger value) {
        return new JAXBElement<BigInteger>(_SexoId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "sexoDesc")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSexoDesc(String value) {
        return new JAXBElement<String>(_SexoDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "correo")
    public JAXBElement<String> createCorreo(String value) {
        return new JAXBElement<String>(_Correo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "passwordTmp")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPasswordTmp(String value) {
        return new JAXBElement<String>(_PasswordTmp_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "nit")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNit(String value) {
        return new JAXBElement<String>(_Nit_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "confirmado")
    public JAXBElement<BigInteger> createConfirmado(BigInteger value) {
        return new JAXBElement<BigInteger>(_Confirmado_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tcPerfil")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTcPerfil(String value) {
        return new JAXBElement<String>(_TcPerfil_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "usuarioDesc")
    public JAXBElement<String> createUsuarioDesc(String value) {
        return new JAXBElement<String>(_UsuarioDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "requiereCambioClave")
    public JAXBElement<BigInteger> createRequiereCambioClave(BigInteger value) {
        return new JAXBElement<BigInteger>(_RequiereCambioClave_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "usuario")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createUsuario(String value) {
        return new JAXBElement<String>(_Usuario_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "usuarioId")
    public JAXBElement<BigInteger> createUsuarioId(BigInteger value) {
        return new JAXBElement<BigInteger>(_UsuarioId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "telefono")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTelefono(String value) {
        return new JAXBElement<String>(_Telefono_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "culturaDesc")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCulturaDesc(String value) {
        return new JAXBElement<String>(_CulturaDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "culturaId")
    public JAXBElement<BigInteger> createCulturaId(BigInteger value) {
        return new JAXBElement<BigInteger>(_CulturaId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tmpFoto")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTmpFoto(String value) {
        return new JAXBElement<String>(_TmpFoto_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tcUsuarioSubregion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTcUsuarioSubregion(String value) {
        return new JAXBElement<String>(_TcUsuarioSubregion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "direccion")
    public JAXBElement<String> createDireccion(String value) {
        return new JAXBElement<String>(_Direccion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "idiomaId")
    public JAXBElement<BigInteger> createIdiomaId(BigInteger value) {
        return new JAXBElement<BigInteger>(_IdiomaId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "idiomaDesc")
    public JAXBElement<String> createIdiomaDesc(String value) {
        return new JAXBElement<String>(_IdiomaDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "foto")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFoto(String value) {
        return new JAXBElement<String>(_Foto_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "rf")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRf(String value) {
        return new JAXBElement<String>(_Rf_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "personaDesc")
    public JAXBElement<String> createPersonaDesc(String value) {
        return new JAXBElement<String>(_PersonaDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "cui")
    public JAXBElement<BigInteger> createCui(BigInteger value) {
        return new JAXBElement<BigInteger>(_Cui_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "fechaUltModif")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFechaUltModif(String value) {
        return new JAXBElement<String>(_FechaUltModif_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "rfn")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRfn(String value) {
        return new JAXBElement<String>(_Rfn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "estadoCivilId")
    public JAXBElement<BigInteger> createEstadoCivilId(BigInteger value) {
        return new JAXBElement<BigInteger>(_EstadoCivilId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "estadoCivilDesc")
    public JAXBElement<String> createEstadoCivilDesc(String value) {
        return new JAXBElement<String>(_EstadoCivilDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "personaId")
    public JAXBElement<BigInteger> createPersonaId(BigInteger value) {
        return new JAXBElement<BigInteger>(_PersonaId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "rutaFoto")
    public JAXBElement<String> createRutaFoto(String value) {
        return new JAXBElement<String>(_RutaFoto_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ocupacionId")
    public JAXBElement<BigInteger> createOcupacionId(BigInteger value) {
        return new JAXBElement<BigInteger>(_OcupacionId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ocupacionDesc")
    public JAXBElement<String> createOcupacionDesc(String value) {
        return new JAXBElement<String>(_OcupacionDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "propietarioFincaId")
    public JAXBElement<BigInteger> createPropietarioFincaId(BigInteger value) {
        return new JAXBElement<BigInteger>(_PropietarioFincaId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "norte")
    public JAXBElement<String> createNorte(String value) {
        return new JAXBElement<String>(_Norte_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "fincaId")
    public JAXBElement<BigInteger> createFincaId(BigInteger value) {
        return new JAXBElement<BigInteger>(_FincaId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "oeste")
    public JAXBElement<String> createOeste(String value) {
        return new JAXBElement<String>(_Oeste_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "fechaUltimaModif")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFechaUltimaModif(String value) {
        return new JAXBElement<String>(_FechaUltimaModif_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "gtmX")
    public JAXBElement<BigDecimal> createGtmX(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GtmX_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "gtmY")
    public JAXBElement<BigDecimal> createGtmY(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GtmY_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "fincaDesc")
    public JAXBElement<String> createFincaDesc(String value) {
        return new JAXBElement<String>(_FincaDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "este")
    public JAXBElement<String> createEste(String value) {
        return new JAXBElement<String>(_Este_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "sur")
    public JAXBElement<String> createSur(String value) {
        return new JAXBElement<String>(_Sur_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "areaDocumento")
    public JAXBElement<BigDecimal> createAreaDocumento(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AreaDocumento_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "gestionId")
    public JAXBElement<BigInteger> createGestionId(BigInteger value) {
        return new JAXBElement<BigInteger>(_GestionId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "informes")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createInformes(String value) {
        return new JAXBElement<String>(_Informes_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "fechaAsignacion")
    public JAXBElement<XMLGregorianCalendar> createFechaAsignacion(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FechaAsignacion_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "notificacionGestionDesc")
    public JAXBElement<String> createNotificacionGestionDesc(String value) {
        return new JAXBElement<String>(_NotificacionGestionDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "notificacionGestionId")
    public JAXBElement<BigInteger> createNotificacionGestionId(BigInteger value) {
        return new JAXBElement<BigInteger>(_NotificacionGestionId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tipoNotificacionId")
    public JAXBElement<BigInteger> createTipoNotificacionId(BigInteger value) {
        return new JAXBElement<BigInteger>(_TipoNotificacionId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "esDireccion")
    public JAXBElement<BigInteger> createEsDireccion(BigInteger value) {
        return new JAXBElement<BigInteger>(_EsDireccion_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "maxlength")
    public JAXBElement<BigInteger> createMaxlength(BigInteger value) {
        return new JAXBElement<BigInteger>(_Maxlength_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tipoNotificacionDesc")
    public JAXBElement<String> createTipoNotificacionDesc(String value) {
        return new JAXBElement<String>(_TipoNotificacionDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createType(String value) {
        return new JAXBElement<String>(_Type_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "esObligatorio")
    public JAXBElement<BigInteger> createEsObligatorio(BigInteger value) {
        return new JAXBElement<BigInteger>(_EsObligatorio_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "nug")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNug(String value) {
        return new JAXBElement<String>(_Nug_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "numero")
    public JAXBElement<BigInteger> createNumero(BigInteger value) {
        return new JAXBElement<BigInteger>(_Numero_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "observacionesCronograma")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createObservacionesCronograma(String value) {
        return new JAXBElement<String>(_ObservacionesCronograma_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "pasoId")
    public JAXBElement<BigInteger> createPasoId(BigInteger value) {
        return new JAXBElement<BigInteger>(_PasoId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "personaAnulaId")
    public JAXBElement<BigInteger> createPersonaAnulaId(BigInteger value) {
        return new JAXBElement<BigInteger>(_PersonaAnulaId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "personaGestionId")
    public JAXBElement<BigInteger> createPersonaGestionId(BigInteger value) {
        return new JAXBElement<BigInteger>(_PersonaGestionId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "representanteLegal")
    public JAXBElement<BigInteger> createRepresentanteLegal(BigInteger value) {
        return new JAXBElement<BigInteger>(_RepresentanteLegal_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "soloRepresenta")
    public JAXBElement<BigInteger> createSoloRepresenta(BigInteger value) {
        return new JAXBElement<BigInteger>(_SoloRepresenta_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "areaMuestreada")
    public JAXBElement<BigDecimal> createAreaMuestreada(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AreaMuestreada_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "correlativo")
    public JAXBElement<BigInteger> createCorrelativo(BigInteger value) {
        return new JAXBElement<BigInteger>(_Correlativo_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "incremento")
    public JAXBElement<BigDecimal> createIncremento(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Incremento_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tamanioParcela")
    public JAXBElement<BigDecimal> createTamanioParcela(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TamanioParcela_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "anioRepoblacion")
    public JAXBElement<BigInteger> createAnioRepoblacion(BigInteger value) {
        return new JAXBElement<BigInteger>(_AnioRepoblacion_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "areaGarantia")
    public JAXBElement<BigDecimal> createAreaGarantia(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AreaGarantia_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "cantidadEspecie")
    public JAXBElement<BigInteger> createCantidadEspecie(BigInteger value) {
        return new JAXBElement<BigInteger>(_CantidadEspecie_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "edad")
    public JAXBElement<BigInteger> createEdad(BigInteger value) {
        return new JAXBElement<BigInteger>(_Edad_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "imgRodal")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createImgRodal(String value) {
        return new JAXBElement<String>(_ImgRodal_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "pendientePromedio")
    public JAXBElement<BigDecimal> createPendientePromedio(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PendientePromedio_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "remanente")
    public JAXBElement<BigInteger> createRemanente(BigInteger value) {
        return new JAXBElement<BigInteger>(_Remanente_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "rodalGestionId")
    public JAXBElement<BigInteger> createRodalGestionId(BigInteger value) {
        return new JAXBElement<BigInteger>(_RodalGestionId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tipoCoberturaDesc")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTipoCoberturaDesc(String value) {
        return new JAXBElement<String>(_TipoCoberturaDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tipoCoberturaId")
    public JAXBElement<BigInteger> createTipoCoberturaId(BigInteger value) {
        return new JAXBElement<BigInteger>(_TipoCoberturaId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "totalParcelas")
    public JAXBElement<BigInteger> createTotalParcelas(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalParcelas_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ttEstadisticoRodal")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTtEstadisticoRodal(String value) {
        return new JAXBElement<String>(_TtEstadisticoRodal_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ttEvaluacionCampo")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTtEvaluacionCampo(String value) {
        return new JAXBElement<String>(_TtEvaluacionCampo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ubicacion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createUbicacion(String value) {
        return new JAXBElement<String>(_Ubicacion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "valorMadera")
    public JAXBElement<Boolean> createValorMadera(Boolean value) {
        return new JAXBElement<Boolean>(_ValorMadera_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "anioPlantacion")
    public JAXBElement<BigInteger> createAnioPlantacion(BigInteger value) {
        return new JAXBElement<BigInteger>(_AnioPlantacion_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "densidadInicial")
    public JAXBElement<BigDecimal> createDensidadInicial(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_DensidadInicial_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "sistemaRepoblacionId")
    public JAXBElement<BigInteger> createSistemaRepoblacionId(BigInteger value) {
        return new JAXBElement<BigInteger>(_SistemaRepoblacionId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "sistemaRepoblacionDesc")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSistemaRepoblacionDesc(String value) {
        return new JAXBElement<String>(_SistemaRepoblacionDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "especieRecuperacionId")
    public JAXBElement<BigInteger> createEspecieRecuperacionId(BigInteger value) {
        return new JAXBElement<BigInteger>(_EspecieRecuperacionId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "metodoSiembraDesc")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createMetodoSiembraDesc(String value) {
        return new JAXBElement<String>(_MetodoSiembraDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "metodoSiembraId")
    public JAXBElement<BigInteger> createMetodoSiembraId(BigInteger value) {
        return new JAXBElement<BigInteger>(_MetodoSiembraId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "rodalRepoblacionId")
    public JAXBElement<BigInteger> createRodalRepoblacionId(BigInteger value) {
        return new JAXBElement<BigInteger>(_RodalRepoblacionId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "sistemaRepoblacionGestionId")
    public JAXBElement<BigInteger> createSistemaRepoblacionGestionId(BigInteger value) {
        return new JAXBElement<BigInteger>(_SistemaRepoblacionGestionId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "planTipoGestionId")
    public JAXBElement<BigInteger> createPlanTipoGestionId(BigInteger value) {
        return new JAXBElement<BigInteger>(_PlanTipoGestionId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "areaMaxima")
    public JAXBElement<BigDecimal> createAreaMaxima(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AreaMaxima_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "areaMinima")
    public JAXBElement<BigDecimal> createAreaMinima(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AreaMinima_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "planTipoGestionDesc")
    public JAXBElement<String> createPlanTipoGestionDesc(String value) {
        return new JAXBElement<String>(_PlanTipoGestionDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "subregionReferenciaId")
    public JAXBElement<BigInteger> createSubregionReferenciaId(BigInteger value) {
        return new JAXBElement<BigInteger>(_SubregionReferenciaId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "subregionId")
    public JAXBElement<BigInteger> createSubregionId(BigInteger value) {
        return new JAXBElement<BigInteger>(_SubregionId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "subregionDesc")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSubregionDesc(String value) {
        return new JAXBElement<String>(_SubregionDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "alias")
    public JAXBElement<String> createAlias(String value) {
        return new JAXBElement<String>(_Alias_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "regionId")
    public JAXBElement<BigInteger> createRegionId(BigInteger value) {
        return new JAXBElement<BigInteger>(_RegionId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "regionDesc")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRegionDesc(String value) {
        return new JAXBElement<String>(_RegionDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "regionReferenciaId")
    public JAXBElement<BigInteger> createRegionReferenciaId(BigInteger value) {
        return new JAXBElement<BigInteger>(_RegionReferenciaId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tipoBosqueDesc")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTipoBosqueDesc(String value) {
        return new JAXBElement<String>(_TipoBosqueDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tipoBosqueId")
    public JAXBElement<BigInteger> createTipoBosqueId(BigInteger value) {
        return new JAXBElement<BigInteger>(_TipoBosqueId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "moduloDesc")
    public JAXBElement<String> createModuloDesc(String value) {
        return new JAXBElement<String>(_ModuloDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "moduloId")
    public JAXBElement<BigInteger> createModuloId(BigInteger value) {
        return new JAXBElement<BigInteger>(_ModuloId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tipoGestionDesc")
    public JAXBElement<String> createTipoGestionDesc(String value) {
        return new JAXBElement<String>(_TipoGestionDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tipoGestionId")
    public JAXBElement<BigInteger> createTipoGestionId(BigInteger value) {
        return new JAXBElement<BigInteger>(_TipoGestionId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tieneRepresentante")
    public JAXBElement<BigInteger> createTieneRepresentante(BigInteger value) {
        return new JAXBElement<BigInteger>(_TieneRepresentante_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "biofisicaGestionId")
    public JAXBElement<BigInteger> createBiofisicaGestionId(BigInteger value) {
        return new JAXBElement<BigInteger>(_BiofisicaGestionId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "clima")
    public JAXBElement<String> createClima(String value) {
        return new JAXBElement<String>(_Clima_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "elevacion")
    public JAXBElement<String> createElevacion(String value) {
        return new JAXBElement<String>(_Elevacion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "hidrografia")
    public JAXBElement<String> createHidrografia(String value) {
        return new JAXBElement<String>(_Hidrografia_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tipoBosque")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTipoBosque(String value) {
        return new JAXBElement<String>(_TipoBosque_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "topografia")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTopografia(String value) {
        return new JAXBElement<String>(_Topografia_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "zonaVida")
    public JAXBElement<String> createZonaVida(String value) {
        return new JAXBElement<String>(_ZonaVida_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "areaBosque")
    public JAXBElement<BigDecimal> createAreaBosque(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AreaBosque_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "areaFuera")
    public JAXBElement<BigDecimal> createAreaFuera(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AreaFuera_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "areaIntervenirBosque")
    public JAXBElement<BigDecimal> createAreaIntervenirBosque(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AreaIntervenirBosque_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "areaIntervenirFuera")
    public JAXBElement<BigDecimal> createAreaIntervenirFuera(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AreaIntervenirFuera_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "areaProduccion")
    public JAXBElement<BigDecimal> createAreaProduccion(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AreaProduccion_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "areaProteccionBosque")
    public JAXBElement<BigDecimal> createAreaProteccionBosque(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AreaProteccionBosque_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "areaProteccionFuera")
    public JAXBElement<BigDecimal> createAreaProteccionFuera(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AreaProteccionFuera_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "divisionAreaGestionId")
    public JAXBElement<BigInteger> createDivisionAreaGestionId(BigInteger value) {
        return new JAXBElement<BigInteger>(_DivisionAreaGestionId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "fueraBosque")
    public JAXBElement<BigInteger> createFueraBosque(BigInteger value) {
        return new JAXBElement<BigInteger>(_FueraBosque_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ttRepresentanteGestion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTtRepresentanteGestion(String value) {
        return new JAXBElement<String>(_TtRepresentanteGestion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "usoFincaDesc")
    public JAXBElement<String> createUsoFincaDesc(String value) {
        return new JAXBElement<String>(_UsoFincaDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "usoFincaId")
    public JAXBElement<BigInteger> createUsoFincaId(BigInteger value) {
        return new JAXBElement<BigInteger>(_UsoFincaId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "usoFincaGestionId")
    public JAXBElement<BigInteger> createUsoFincaGestionId(BigInteger value) {
        return new JAXBElement<BigInteger>(_UsoFincaGestionId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ttEstadisticoGestion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTtEstadisticoGestion(String value) {
        return new JAXBElement<String>(_TtEstadisticoGestion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "anios")
    public JAXBElement<BigInteger> createAnios(BigInteger value) {
        return new JAXBElement<BigInteger>(_Anios_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "aniosSolicitado")
    public JAXBElement<BigInteger> createAniosSolicitado(BigInteger value) {
        return new JAXBElement<BigInteger>(_AniosSolicitado_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "dpiFiador")
    public JAXBElement<BigInteger> createDpiFiador(BigInteger value) {
        return new JAXBElement<BigInteger>(_DpiFiador_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "edadRotacion")
    public JAXBElement<BigInteger> createEdadRotacion(BigInteger value) {
        return new JAXBElement<BigInteger>(_EdadRotacion_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "meses")
    public JAXBElement<BigInteger> createMeses(BigInteger value) {
        return new JAXBElement<BigInteger>(_Meses_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "noTurnos")
    public JAXBElement<BigInteger> createNoTurnos(BigInteger value) {
        return new JAXBElement<BigInteger>(_NoTurnos_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "nombreEmpresa")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNombreEmpresa(String value) {
        return new JAXBElement<String>(_NombreEmpresa_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "nombreFiador")
    public JAXBElement<String> createNombreFiador(String value) {
        return new JAXBElement<String>(_NombreFiador_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "resumenGestionId")
    public JAXBElement<BigInteger> createResumenGestionId(BigInteger value) {
        return new JAXBElement<BigInteger>(_ResumenGestionId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "rnf")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRnf(String value) {
        return new JAXBElement<String>(_Rnf_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "sistemaCortaId")
    public JAXBElement<BigInteger> createSistemaCortaId(BigInteger value) {
        return new JAXBElement<BigInteger>(_SistemaCortaId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "sistemaCortaDesc")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSistemaCortaDesc(String value) {
        return new JAXBElement<String>(_SistemaCortaDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tipoGarantiaId")
    public JAXBElement<BigInteger> createTipoGarantiaId(BigInteger value) {
        return new JAXBElement<BigInteger>(_TipoGarantiaId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tipoGarantiaDesc")
    public JAXBElement<String> createTipoGarantiaDesc(String value) {
        return new JAXBElement<String>(_TipoGarantiaDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tipoFiadorId")
    public JAXBElement<BigInteger> createTipoFiadorId(BigInteger value) {
        return new JAXBElement<BigInteger>(_TipoFiadorId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "analisisDescriptivo")
    public JAXBElement<String> createAnalisisDescriptivo(String value) {
        return new JAXBElement<String>(_AnalisisDescriptivo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "brinzal")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBrinzal(String value) {
        return new JAXBElement<String>(_Brinzal_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "compensaPendiente")
    public JAXBElement<BigInteger> createCompensaPendiente(BigInteger value) {
        return new JAXBElement<BigInteger>(_CompensaPendiente_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "descripcionCausa")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDescripcionCausa(String value) {
        return new JAXBElement<String>(_DescripcionCausa_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "descripcionDanio")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDescripcionDanio(String value) {
        return new JAXBElement<String>(_DescripcionDanio_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "diametro")
    public JAXBElement<BigDecimal> createDiametro(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Diametro_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "intensidadMuestreo")
    public JAXBElement<BigDecimal> createIntensidadMuestreo(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IntensidadMuestreo_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "inventarioGestionId")
    public JAXBElement<BigInteger> createInventarioGestionId(BigInteger value) {
        return new JAXBElement<BigInteger>(_InventarioGestionId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "latizal")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLatizal(String value) {
        return new JAXBElement<String>(_Latizal_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "obsRegeneracion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createObsRegeneracion(String value) {
        return new JAXBElement<String>(_ObsRegeneracion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "regresion")
    public JAXBElement<String> createRegresion(String value) {
        return new JAXBElement<String>(_Regresion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tcFormaParcela")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTcFormaParcela(String value) {
        return new JAXBElement<String>(_TcFormaParcela_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "origenCalculoId")
    public JAXBElement<BigInteger> createOrigenCalculoId(BigInteger value) {
        return new JAXBElement<BigInteger>(_OrigenCalculoId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "origenCalculoDesc")
    public JAXBElement<String> createOrigenCalculoDesc(String value) {
        return new JAXBElement<String>(_OrigenCalculoDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tcTipoMuestreo")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTcTipoMuestreo(String value) {
        return new JAXBElement<String>(_TcTipoMuestreo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "totalRodales")
    public JAXBElement<BigInteger> createTotalRodales(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalRodales_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "justificacion")
    public JAXBElement<String> createJustificacion(String value) {
        return new JAXBElement<String>(_Justificacion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "actividadAprovechamiento")
    public JAXBElement<String> createActividadAprovechamiento(String value) {
        return new JAXBElement<String>(_ActividadAprovechamiento_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "areaCompromiso")
    public JAXBElement<BigDecimal> createAreaCompromiso(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AreaCompromiso_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "areaExistente")
    public JAXBElement<BigDecimal> createAreaExistente(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AreaExistente_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "areaExtraer")
    public JAXBElement<BigDecimal> createAreaExtraer(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AreaExtraer_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "areaIntervenir")
    public JAXBElement<BigDecimal> createAreaIntervenir(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AreaIntervenir_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "cap")
    public JAXBElement<BigDecimal> createCap(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Cap_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "carbon")
    public JAXBElement<BigDecimal> createCarbon(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Carbon_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "establecimiento")
    public JAXBElement<String> createEstablecimiento(String value) {
        return new JAXBElement<String>(_Establecimiento_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "hayReforestacion")
    public JAXBElement<BigInteger> createHayReforestacion(BigInteger value) {
        return new JAXBElement<BigInteger>(_HayReforestacion_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "justificacionEspecie")
    public JAXBElement<String> createJustificacionEspecie(String value) {
        return new JAXBElement<String>(_JustificacionEspecie_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "masaForestal")
    public JAXBElement<String> createMasaForestal(String value) {
        return new JAXBElement<String>(_MasaForestal_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "planificacionGestionId")
    public JAXBElement<BigInteger> createPlanificacionGestionId(BigInteger value) {
        return new JAXBElement<BigInteger>(_PlanificacionGestionId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "postAprovechamiento")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPostAprovechamiento(String value) {
        return new JAXBElement<String>(_PostAprovechamiento_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "criterioCortaId")
    public JAXBElement<BigInteger> createCriterioCortaId(BigInteger value) {
        return new JAXBElement<BigInteger>(_CriterioCortaId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "criterioCortaDesc")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCriterioCortaDesc(String value) {
        return new JAXBElement<String>(_CriterioCortaDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "criterio")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCriterio(String value) {
        return new JAXBElement<String>(_Criterio_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ampliacionRonda")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAmpliacionRonda(String value) {
        return new JAXBElement<String>(_AmpliacionRonda_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "areaCritica")
    public JAXBElement<String> createAreaCritica(String value) {
        return new JAXBElement<String>(_AreaCritica_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "combustible")
    public JAXBElement<String> createCombustible(String value) {
        return new JAXBElement<String>(_Combustible_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "controlPlaga")
    public JAXBElement<String> createControlPlaga(String value) {
        return new JAXBElement<String>(_ControlPlaga_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "cortafuego")
    public JAXBElement<String> createCortafuego(String value) {
        return new JAXBElement<String>(_Cortafuego_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "justificacionPf")
    public JAXBElement<String> createJustificacionPf(String value) {
        return new JAXBElement<String>(_JustificacionPf_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "monitoreoPlaga")
    public JAXBElement<String> createMonitoreoPlaga(String value) {
        return new JAXBElement<String>(_MonitoreoPlaga_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "proteccionGestionId")
    public JAXBElement<BigInteger> createProteccionGestionId(BigInteger value) {
        return new JAXBElement<BigInteger>(_ProteccionGestionId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "respuestaIf")
    public JAXBElement<String> createRespuestaIf(String value) {
        return new JAXBElement<String>(_RespuestaIf_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "rondaCortafuego")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRondaCortafuego(String value) {
        return new JAXBElement<String>(_RondaCortafuego_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "rutaEscape")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRutaEscape(String value) {
        return new JAXBElement<String>(_RutaEscape_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "vigilancia")
    public JAXBElement<String> createVigilancia(String value) {
        return new JAXBElement<String>(_Vigilancia_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ttRepoblacionGestion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTtRepoblacionGestion(String value) {
        return new JAXBElement<String>(_TtRepoblacionGestion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ultimoPanel")
    public JAXBElement<BigInteger> createUltimoPanel(BigInteger value) {
        return new JAXBElement<BigInteger>(_UltimoPanel_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "nitEntidad")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNitEntidad(String value) {
        return new JAXBElement<String>(_NitEntidad_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "nombreComercial")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNombreComercial(String value) {
        return new JAXBElement<String>(_NombreComercial_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "razonSocial")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRazonSocial(String value) {
        return new JAXBElement<String>(_RazonSocial_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tcTipoEntidad")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTcTipoEntidad(String value) {
        return new JAXBElement<String>(_TcTipoEntidad_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tipoPropietarioId")
    public JAXBElement<BigInteger> createTipoPropietarioId(BigInteger value) {
        return new JAXBElement<BigInteger>(_TipoPropietarioId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tipoPropietarioDesc")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTipoPropietarioDesc(String value) {
        return new JAXBElement<String>(_TipoPropietarioDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tipoPropietarioGestionId")
    public JAXBElement<BigInteger> createTipoPropietarioGestionId(BigInteger value) {
        return new JAXBElement<BigInteger>(_TipoPropietarioGestionId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "singleValue")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSingleValue(String value) {
        return new JAXBElement<String>(_SingleValue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "message")
    public JAXBElement<String> createMessage(String value) {
        return new JAXBElement<String>(_Message_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "status")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStatus(String value) {
        return new JAXBElement<String>(_Status_QNAME, String.class, null, value);
    }

}
