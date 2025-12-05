package cr.ac.ucenfotec.bl.logic;

import cr.ac.ucenfotec.bl.entities.cliente.Cliente;
import cr.ac.ucenfotec.bl.entities.cliente.DAOCliente;

public class GestorCliente {

    //Métodos
    public static String agregarCliente(String nombreCompleto, String cedula, String correoElectronico) throws Exception {
        Cliente cliente = new Cliente(nombreCompleto, cedula, correoElectronico);
        return DAOCliente.insertarCliente(cliente);
    }
}