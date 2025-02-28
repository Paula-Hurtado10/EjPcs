
package Helpers;

import Logica_Negocio.Solicitud;
/**
 *
 * @author 1059597191
 */
public class HelperImpresion {

    public static void ImprimirSolicitud(Solicitud objSolicitud) {
        
        System.out.println("----------------------------------------");
        System.out.println("IMPRESION DE DATOS.");
        System.out.println("");
        System.out.println("El nombre del solicitante es: " + "\t" + objSolicitud.getSolicitante());
        System.out.println("El codigo del solicitante es: " + "\t" + objSolicitud.getCodigo());
        System.out.println("La cedula del solicitante es: " + "\t" + objSolicitud.getCedula());
        System.out.println("");
        System.out.println("El nombre de la actividad es: " + "\t" + objSolicitud.getObjActividad().getNombre());
        System.out.println("El ID de la actividad es: " + "\t" + objSolicitud.getObjActividad().getId());
        System.out.println("Descripcion de la actividad: " + "\t" + objSolicitud.getObjActividad().getDescripcion());
    }
}
