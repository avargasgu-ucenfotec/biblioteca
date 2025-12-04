package cr.ac.ucenfotec.dl;

import cr.ac.ucenfotec.utils.Utils;

import java.sql.*;

public class DBAccess {

    //Atributos
    private Connection connection = null;
    private Statement statement = null;

    //Métodos
    public DBAccess(String direccion, String usuario, String contrasena) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(direccion, usuario, contrasena);
    }

    public void ejecutarStatement(String pStatement) throws SQLException {
        statement = connection.createStatement();
        statement.executeUpdate(pStatement);
    }
}
