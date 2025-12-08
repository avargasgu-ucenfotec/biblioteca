package cr.ac.ucenfotec.bl.entities.administrador;

import cr.ac.ucenfotec.dl.Connector;

import java.sql.ResultSet;
import java.util.ArrayList;

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

    public static ArrayList<Administrador> listarAdministradores() throws Exception {
        ArrayList<Administrador> listaAdministradores = new ArrayList<>();
        query = "SELECT * FROM t_administradores";
        ResultSet resultado = Connector.getConnection().ejecutarQuery(query);
        if(!resultado.next()){
            return null;
        }
        do {
            Administrador administradorTemp = new Administrador(resultado.getNString("nombreCompleto"),
                    resultado.getNString("cedula"),
                    resultado.getNString("correoElectronico"));
            listaAdministradores.add(administradorTemp);
        } while (resultado.next());
        return listaAdministradores;
    }

    public static ArrayList<Integer> listarIDs() throws Exception {
        ArrayList<Integer> listaIDs = new ArrayList<>();
        query = "SELECT * FROM t_administradores";
        ResultSet resultado = Connector.getConnection().ejecutarQuery(query);
        if(!resultado.next()){
            return null;
        }
        do {
            listaIDs.add(resultado.getInt("id"));
        } while (resultado.next());
        return listaIDs;
    }

    public static String modificarAdministrador(int idAdministrador, Administrador administrador) throws Exception {
        statement = "UPDATE t_administradores SET nombreCompleto = ? , cedula = ? , correoElectronico = ? WHERE id = ?";
        Connector.getConnection().ejecutarStatement(statement, administrador.getNombreCompleto(),
                administrador.getCedula(),
                administrador.getCorreoElectronico(),
                idAdministrador);
        return "El administrador se modificó en la base de datos correctamente.\n";
    }

    public static String eliminarAdministrador(int idAdministrador) throws Exception {
        statement = "DELETE FROM t_administradores WHERE id = ?";
        Connector.getConnection().ejecutarStatement(statement, idAdministrador);
        return "El administrador se eliminó de la base de datos correctamente (si existía).\n";
    }
}
