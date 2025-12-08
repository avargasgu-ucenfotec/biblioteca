package cr.ac.ucenfotec.tl;

import cr.ac.ucenfotec.bl.entities.administrador.Administrador;
import cr.ac.ucenfotec.bl.entities.cliente.Cliente;
import cr.ac.ucenfotec.bl.entities.libro.Libro;
import cr.ac.ucenfotec.bl.logic.*;
import cr.ac.ucenfotec.ui.Menu;

import java.util.ArrayList;
import java.util.HashMap;

public class Controller {

    //Métodos
    public static void procesarSeleccionPrincipal(byte seleccion) throws Exception {
        switch (seleccion) {
            case 1:
                agregarAdministrador();
                break;
            case 2:
                agregarCliente();
                break;
            case 3:
                agregarLibro();
                break;
            case 4:
                listarAdministradores();
                break;
            case 5:
                listarClientes();
                break;
            case 6:
                listarLibros();
                break;
            case 7:
                modificarAdministrador();
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

    public static void agregarCliente() throws Exception {
        String nombreCompleto;
        String cedula;
        String correoElectronico;

        System.out.print("Ingrese el nombre completo del cliente: ");
        nombreCompleto = Menu.leerTexto();
        System.out.print("Ingrese el número de cédula del cliente: ");
        cedula = Menu.leerTexto();
        System.out.print("Ingrese el correo electrónico del cliente: ");
        correoElectronico = Menu.leerTexto();

        System.out.println(GestorCliente.agregarCliente(nombreCompleto, cedula, correoElectronico));
    }

    public static void agregarLibro() throws Exception {
        String titulo;
        String autor;
        int cantidad;

        System.out.print("Ingrese el título del libro: ");
        titulo = Menu.leerTexto();
        System.out.print("Ingrese el autor del libro: ");
        autor = Menu.leerTexto();
        System.out.print("Ingrese la cantidad de libros: ");
        cantidad = Integer.parseInt(Menu.leerTexto());

        System.out.println(GestorLibro.agregarLibro(titulo, autor, cantidad));
    }

    public static void listarAdministradores() throws Exception {
        HashMap<Integer, Administrador> listaAdministradoresID = new HashMap<>();
        GestorAdministrador.listarAdministradoresID(listaAdministradoresID);
        for (HashMap.Entry<Integer, Administrador> pareja : listaAdministradoresID.entrySet()) {
            System.out.println("ID: " + pareja.getKey() + ", Administrador: " + pareja.getValue());
        }
    }

    public static void listarClientes() throws Exception {
        HashMap<Integer, Cliente> listaClientesID = new HashMap<>();
        GestorCliente.listarClientesID(listaClientesID);
        for (HashMap.Entry<Integer, Cliente> pareja : listaClientesID.entrySet()) {
            System.out.println("ID: " + pareja.getKey() + ", Cliente: " + pareja.getValue());
        }
    }

    public static void listarLibros() throws Exception {
        HashMap<Integer, Libro> listaLibrosID = new HashMap<>();
        GestorLibro.listarLibrosID(listaLibrosID);
        for (HashMap.Entry<Integer, Libro> pareja : listaLibrosID.entrySet()) {
            System.out.println("ID: " + pareja.getKey() + ", Libro: " + pareja.getValue());
        }
    }

    public static void modificarAdministrador() throws Exception {
        listarAdministradores();
        int idAdministrador;

        System.out.print("Ingrese el ID del administrador por modificar: ");
        idAdministrador = Integer.parseInt(Menu.leerTexto());
        while (idAdministrador <= 0) {
            System.out.println("El ID del administrador debe ser mayor o igual que 1. Ingrese el ID de nuevo: ");
            idAdministrador = Integer.parseInt(Menu.leerTexto());
        }

        String nombreCompleto;
        String cedula;
        String correoElectronico;

        System.out.print("Ingrese el nuevo nombre completo del administrador: ");
        nombreCompleto = Menu.leerTexto();
        System.out.print("Ingrese el nuevo número de cédula del administrador: ");
        cedula = Menu.leerTexto();
        System.out.print("Ingrese el nuevo correo electrónico del administrador: ");
        correoElectronico = Menu.leerTexto();

        String mensaje = GestorAdministrador.modificarAdministrador(idAdministrador, nombreCompleto, cedula, correoElectronico);
        System.out.println(mensaje);
    }
}
