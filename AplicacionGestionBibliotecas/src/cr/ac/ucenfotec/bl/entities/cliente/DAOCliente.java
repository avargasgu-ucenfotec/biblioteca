package cr.ac.ucenfotec.bl.entities.cliente;

import cr.ac.ucenfotec.bl.entities.administrador.Administrador;
import cr.ac.ucenfotec.dl.Connector;

import java.sql.ResultSet;
import java.util.ArrayList;

public class DAOCliente {

    //Atributos
    private static String statement;
    private static String query;

    //Métodos
    public static String insertarCliente(Cliente cliente) throws Exception {
        statement = "INSERT INTO t_clientes(nombreCompleto, cedula, correoElectronico) VALUES ('"
                + cliente.getNombreCompleto() + "'"
                + ",'" + cliente.getCedula() + "'"
                + ",'" + cliente.getCorreoElectronico()
                + "');";
        Connector.getConnection().ejecutarStatement(statement);
        return "El cliente se registró correctamente en la base de datos.\n";
    }

    public static ArrayList<Cliente> listarClientes() throws Exception {
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        query = "SELECT * FROM t_clientes";
        ResultSet resultado = Connector.getConnection().ejecutarQuery(query);
        if(!resultado.next()){
            return null;
        }
        do {
            Cliente clienteTemp = new Cliente(resultado.getNString("nombreCompleto"),
                    resultado.getNString("cedula"),
                    resultado.getNString("correoElectronico"));
            listaClientes.add(clienteTemp);
        } while (resultado.next());
        return listaClientes;
    }

    public static ArrayList<Integer> listarIDs() throws Exception {
        ArrayList<Integer> listaIDs = new ArrayList<>();
        query = "SELECT * FROM t_clientes";
        ResultSet resultado = Connector.getConnection().ejecutarQuery(query);
        if(!resultado.next()){
            return null;
        }
        do {
            listaIDs.add(resultado.getInt("id"));
        } while (resultado.next());
        return listaIDs;
    }
}
