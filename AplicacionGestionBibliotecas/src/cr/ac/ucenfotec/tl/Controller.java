package cr.ac.ucenfotec.tl;

import cr.ac.ucenfotec.bl.logic.*;
import cr.ac.ucenfotec.ui.Menu;

public class Controller {

    //Métodos
    public static void procesarSeleccionPrincipal(byte seleccion) throws Exception {
        switch (seleccion) {
            case 1:
                agregarAdministrador();
                break;
            case 2:
                //agregarCliente();
                break;
            case 3:
                //agregarLibro();
                break;
            case 0:
                System.out.println("Cerrando el programa...");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    public static void agregarAdministrador() throws Exception {
        String nombreCompleto;
        String cedula;
        String correoElectronico;

        System.out.print("Ingrese el nombre completo del administrador: ");
        nombreCompleto = Menu.leerTexto();
        System.out.print("Ingrese el número de cédula del administrador: ");
        cedula = Menu.leerTexto();
        System.out.print("Ingrese el correo electrónico del administrador: ");
        correoElectronico = Menu.leerTexto();

        System.out.println(GestorAdministrador.agregarAdministrador(nombreCompleto, cedula, correoElectronico));
    }
/*
    public static void agregarCliente() throws Exception {
        String nombreCompleto;
        String cedula;
        String sexo;
        String correoElectronico;
        String profesion;
        String direccion;

        System.out.print("Ingrese el nombre completo del cliente: ");
        nombreCompleto = Menu.leerTexto();
        System.out.print("Ingrese el número de cédula del cliente: ");
        cedula = Menu.leerTexto();
        System.out.print("Ingrese el sexo del cliente: ");
        sexo = Menu.leerTexto();
        System.out.print("Ingrese el correo electrónico del cliente: ");
        correoElectronico = Menu.leerTexto();
        System.out.print("Ingrese la profesión del cliente: ");
        profesion = Menu.leerTexto();
        System.out.print("Ingrese la dirección del cliente: ");
        direccion = Menu.leerTexto();

        System.out.println(GestorCliente.agregarCliente(nombreCompleto, cedula, sexo, correoElectronico, profesion, direccion));
    }

    public static void agregarLibro() throws Exception {
        double porcentajeInteres;

        System.out.print("Ingrese el porcentaje de interés de la cuenta de ahorro: ");
        porcentajeInteres = Double.parseDouble(Menu.leerTexto());

        System.out.println(GestorAhorro.agregarAhorro(100.0, true, porcentajeInteres));
    }*/
}
