package cr.ac.ucenfotec.bl.entities.cliente;

import cr.ac.ucenfotec.dl.Connector;

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
}
