
package Logica_Cliente;

import Helpers.HelperValidacion;
import Logica_Negocio.Computador;
import Logica_Negocio.Persona;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        int rta = 0, conteo = 0;
        
        Scanner scan = new Scanner(System.in);
        String marca, serial, tamaño, color;
        String nombre, apellido, cedula, direccion;
        Computador objComputador;
        Persona objPersona;

        System.out.println("Digite la marca del computador");
        marca = scan.nextLine();
        
        rta = HelperValidacion.ValidarVacio(marca);

        while (rta > 0) {
            System.out.println("Digite la marca del computador");
            marca = scan.nextLine();
            rta = HelperValidacion.ValidarVacio(marca);
        }

        conteo = HelperValidacion.ValidarTodo(marca);

        while (conteo != 0) {
            System.out.println("Digite la marca de la computador");
            marca = scan.nextLine();
            conteo = HelperValidacion.ValidarTodo(marca);

        }

        //------------------------------------------------------------
        
        System.out.println("Digite el serial del computador");
        serial = scan.nextLine();
        
        rta = HelperValidacion.ValidarVacio(serial);

        while (rta > 0) {
            System.out.println("Digite el serial del computador");
            serial = scan.nextLine();
            rta = HelperValidacion.ValidarVacio(serial);
        }

        conteo = HelperValidacion.ValidarTodoSerial(serial);

        while (conteo != 0) {
            System.out.println("Digite el serial del computador");
            serial = scan.nextLine();
            conteo = HelperValidacion.ValidarTodoSerial(serial);

        }
        
        //-------------------------------------------------------------

        System.out.println("Digite el tamaño del computador");
        tamaño = scan.nextLine();
        
        rta = HelperValidacion.ValidarVacio(tamaño);

        while (rta > 0) {
            System.out.println("Digite el tamaño del computador");
            tamaño = scan.nextLine();
            rta = HelperValidacion.ValidarVacio(tamaño);
        }

        conteo = HelperValidacion.ValidarTodo(tamaño);

        while (conteo != 0) {
            System.out.println("Digite el tamaño del computador");
            tamaño = scan.nextLine();
            conteo = HelperValidacion.ValidarTodo(tamaño);

        }
        
        //---------------------------------------------------------------        

        System.out.println("Digite el color del computador");
        color = scan.nextLine();
        
        rta = HelperValidacion.ValidarVacio(color);

        while (rta > 0) {
            System.out.println("Digite el color del computador");
            color = scan.nextLine();
            rta = HelperValidacion.ValidarVacio(color);
        }

        conteo = HelperValidacion.ValidarTodo(color);

        while (conteo != 0) {
            System.out.println("Digite el color del computador");
            color = scan.nextLine();
            conteo = HelperValidacion.ValidarTodo(color);

        }
        
        
        objComputador= new Computador(marca, serial, tamaño, color);
        
        
        System.out.println("Digite el nombre de la persona");
        nombre=scan.nextLine();
        
        rta = HelperValidacion.ValidarVacio(nombre);

        while (rta > 0) {
            System.out.println("Digite el nombre de la persona");
            nombre = scan.nextLine();
            rta = HelperValidacion.ValidarVacio(nombre);
        }

        conteo = HelperValidacion.ValidarTodo(nombre);

        while (conteo != 0) {
            System.out.println("Digite la nombre de la persona");
            nombre = scan.nextLine();
            conteo = HelperValidacion.ValidarTodo(marca);
        }
        
        //----------------------------------------------------------------
        
        System.out.println("Digite el apellido de la persona");
        apellido=scan.nextLine();
        
        rta = HelperValidacion.ValidarVacio(apellido);

        while (rta > 0) {
            System.out.println("Digite el apellido de la persona");
            apellido = scan.nextLine();
            rta = HelperValidacion.ValidarVacio(apellido);
        }

        conteo = HelperValidacion.ValidarTodo(apellido);

        while (conteo != 0) {
            System.out.println("Digite el apellido de la persona");
            apellido = scan.nextLine();
            conteo = HelperValidacion.ValidarTodo(apellido);
        }
        
        //---------------------------------------------------------------
        
        System.out.println("Digite la cedula de la persona");
        cedula=scan.nextLine();
        
        rta = HelperValidacion.ValidarVacio(cedula);

        while (rta > 0) {
            System.out.println("Digite la cedula de la persona");
            cedula = scan.nextLine();
            rta = HelperValidacion.ValidarVacio(cedula);
        }

        conteo = HelperValidacion.ValidarTodoLetra(cedula);

        while (conteo != 0) {
            System.out.println("Digite la cedula de la persona");
            cedula = scan.nextLine();
            conteo = HelperValidacion.ValidarTodoLetra(cedula);
        }
        
        //---------------------------------------------------------------
        
        System.out.println("Digite la direccion de la persona");
        direccion=scan.nextLine();
        
        rta = HelperValidacion.ValidarVacio(direccion);

        while (rta > 0) {
            System.out.println("Digite la direccion de la persona");
            direccion = scan.nextLine();
            rta = HelperValidacion.ValidarVacio(direccion);
        }

        conteo = HelperValidacion.ValidarTodoDireccion(direccion);

        while (conteo != 0) {
            System.out.println("Digite la direccion de la persona");
            direccion = scan.nextLine();
            conteo = HelperValidacion.ValidarTodoDireccion(direccion);
        }
        
        
        
        
        objPersona= new Persona(nombre, apellido, cedula, direccion, objComputador); //eestoy asociando
        
        Helpers.HelperImpresion.ImprimirPersona(objPersona);
       
    }

}
