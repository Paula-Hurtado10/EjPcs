
package Logica_Cliente;

import Helpers.HelperValidacion;
import Logica_Negocio.Actividad;
import Logica_Negocio.Solicitud;
import java.util.Scanner;

/**
 *
 * @author 1059597191
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nombre, descripcion, id;
        String solicitante, codigo, cedula;

        Actividad objActividad;
        Solicitud objSolicitud;

        int rta, conteo;
        
        System.out.println("DATOS DE LA ACTIVIDAD.");
        System.out.println("Ingrese el nombre de la actividad: ");
        nombre = scan.nextLine();

        rta = HelperValidacion.ValidarVacio(nombre);

        while (rta > 0) {
            System.out.println("Ingrese el nombre de la actividad: ");
            nombre = scan.nextLine();
            rta = HelperValidacion.ValidarVacio(nombre);
        }

        conteo = HelperValidacion.ValidarTodo(nombre);

        while (conteo != 0) {
            System.out.println("Ingrese el nombre de la actividad: ");
            nombre = scan.nextLine();
            conteo = HelperValidacion.ValidarTodo(nombre);

        }

        ///-------------------------------------------------------------
        System.out.println("Ingrese el ID de la actividad: ");
        id = scan.nextLine();

        rta = HelperValidacion.ValidarVacio(id);

        while (rta > 0) {
            System.out.println("Ingrese el ID de la actividad: ");
            id = scan.nextLine();
            rta = HelperValidacion.ValidarTodoSerial(id);
        }

        conteo = HelperValidacion.ValidarTodoSerial(id);

        while (conteo != 0) {
            System.out.println("Ingrese el ID de la actividad: ");
            id = scan.nextLine();
            conteo = HelperValidacion.ValidarTodoSerial(id);

        }

        ///-------------------------------------------------------------
        System.out.println("Ingrese la descripcion de la actividad: ");
        descripcion = scan.nextLine();

        rta = HelperValidacion.ValidarVacio(descripcion);

        while (rta > 0) {
            System.out.println("Ingrese la descripcion de la actividad: ");
            descripcion = scan.nextLine();
            rta = HelperValidacion.ValidarVacio(descripcion);
        }

        conteo = HelperValidacion.ValidarTodoDireccion(descripcion);

        while (conteo != 0) {
            System.out.println("Ingrese la descripcion de la actividad: ");
            descripcion = scan.nextLine();
            conteo = HelperValidacion.ValidarTodoDireccion(descripcion);

        }
        objActividad = new Actividad(nombre, id, descripcion); //eestoy asociando

        ///----------------------///
        
        System.out.println("");
        System.out.println("DATOS DEL SOLICITANTE. ");
        System.out.println("Ingrese el nombre del solicitante: ");
        solicitante = scan.nextLine();

        rta = HelperValidacion.ValidarVacio(solicitante);

        while (rta > 0) {
            System.out.println("Ingrese el nombre del solicitante: ");
            solicitante = scan.nextLine();
            rta = HelperValidacion.ValidarVacio(solicitante);
        }

        conteo = HelperValidacion.ValidarTodo(solicitante);

        while (conteo != 0) {
            System.out.println("Ingrese el nombre del solicitante: ");
            solicitante = scan.nextLine();
            conteo = HelperValidacion.ValidarTodo(solicitante);

        }
///---------------------------------------------------------------------------
        System.out.println("Ingrese el codigo del solicitante: ");
        codigo = scan.nextLine();

        rta = HelperValidacion.ValidarTodoSerial(codigo);

        while (rta > 0) {
            System.out.println("Ingrese el codigo del solicitante: ");
            codigo = scan.nextLine();
            rta = HelperValidacion.ValidarVacio(codigo);
        }

        conteo = HelperValidacion.ValidarTodoSerial(codigo);

        while (conteo != 0) {
            System.out.println("Ingrese el codigo del solicitante: ");
            codigo = scan.nextLine();
            conteo = HelperValidacion.ValidarTodoSerial(codigo);

        }
        //--------------------------------------------------------------
        System.out.println("Ingrese la cedula del solicitante: ");
        cedula = scan.nextLine();

        rta = HelperValidacion.ValidarVacio(cedula);

        while (rta > 0) {
            System.out.println("Ingrese la cedula del solicitante: ");
            cedula = scan.nextLine();
            rta = HelperValidacion.ValidarVacio(cedula);
        }

        conteo = HelperValidacion.ValidarTodoLetra(cedula);

        while (conteo != 0) {
            System.out.println("Ingrese la cedula del solicitante: ");
            cedula = scan.nextLine();
            conteo = HelperValidacion.ValidarTodoLetra(cedula);

        }

        //-------------------------------------------------------------
        objSolicitud = new Solicitud(solicitante, codigo, cedula, objActividad);

        Helpers.HelperImpresion.ImprimirSolicitud(objSolicitud);

    }

}
