package cr.ac.ucenfotec.bl.logic;

import cr.ac.ucenfotec.bl.entities.administrador.DAOAdministrador;
import cr.ac.ucenfotec.bl.entities.cliente.Cliente;
import cr.ac.ucenfotec.bl.entities.cliente.DAOCliente;

import java.util.ArrayList;
import java.util.HashMap;

public class GestorCliente {

    //Métodos
    public static String agregarCliente(String nombreCompleto, String cedula, String correoElectronico) throws Exception {
        Cliente cliente = new Cliente(nombreCompleto, cedula, correoElectronico);
        return DAOCliente.insertarCliente(cliente);
    }

    public static void listarClientesID(HashMap<Integer, Cliente> listaClientesID) throws Exception {
        ArrayList<Integer> listaIDs = DAOCliente.listarIDs();
        ArrayList<Cliente> listaClientes = DAOCliente.listarClientes();
        if (!listaIDs.isEmpty()) {
            for (int i = 0; i < listaIDs.size(); i++) {
                assert listaClientes != null;
                listaClientesID.putIfAbsent(listaIDs.get(i), listaClientes.get(i));
            }
        }
    }

    public static String modificarCliente(int idCliente, String nombreCompleto, String cedula, String correoElectronico) throws Exception {
        Cliente nuevoCliente = new Cliente(nombreCompleto, cedula, correoElectronico);
        return DAOCliente.modificarCliente(idCliente, nuevoCliente);
    }

    public static String eliminarCliente(int idCliente) throws Exception {
        return DAOCliente.eliminarCliente(idCliente);
    }
}