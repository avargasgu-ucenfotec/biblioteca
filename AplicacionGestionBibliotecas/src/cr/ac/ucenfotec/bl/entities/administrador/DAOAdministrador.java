package cr.ac.ucenfotec.bl.entities.administrador;

import cr.ac.ucenfotec.dl.Connector;

public class DAOAdministrador {

    //Atributos
    private static String statement;
    private static String query;

    //Métodos
    public static String insertarAdministrador(Administrador administrador) throws Exception {
        statement = "INSERT INTO t_administradores(nombreCompleto, cedula, correoElectronico) VALUES ('"
                + administrador.getNombreCompleto() + "'"
                + ",'" + administrador.getCedula() + "'"
                + ",'" + administrador.getCorreoElectronico()
                + "');";
        Connector.getConnection().ejecutarStatement(statement);
        return "El administrador se registró correctamente en la base de datos.\n";
    }
}
