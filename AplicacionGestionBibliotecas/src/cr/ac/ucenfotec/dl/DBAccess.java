package cr.ac.ucenfotec.dl;

import cr.ac.ucenfotec.utils.Utils;

import java.sql.*;

public class DBAccess {

    //Atributos
    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    //Métodos
    public DBAccess(String direccion, String usuario, String contrasena) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(direccion, usuario, contrasena);
    }

    public void ejecutarStatement(String pStatement) throws SQLException {
        statement = connection.createStatement();
        statement.executeUpdate(pStatement);
    }

    public ResultSet ejecutarQuery(String query) throws SQLException {
        ResultSet resultado;
        statement = connection.createStatement();
        resultado = statement.executeQuery(query);
        return resultado;
    }

    public void ejecutarStatement(String pStatement, int pValor1) throws SQLException {
        preparedStatement = connection.prepareStatement(pStatement);
        preparedStatement.setInt(1, pValor1);
        preparedStatement.executeUpdate();
    }

    public void ejecutarStatement(String pStatement, String pValor1, String pValor2, String pValor3, int pValor4) throws SQLException {
        preparedStatement = connection.prepareStatement(pStatement);
        preparedStatement.setString(1, pValor1);
        preparedStatement.setString(2, pValor2);
        preparedStatement.setString(3, pValor3);
        preparedStatement.setInt(4, pValor4);
        preparedStatement.executeUpdate();
    }

    public void ejecutarStatement(String pStatement, String pValor1, String pValor2, int pValor3, int pValor4) throws SQLException {
        preparedStatement = connection.prepareStatement(pStatement);
        preparedStatement.setString(1, pValor1);
        preparedStatement.setString(2, pValor2);
        preparedStatement.setInt(3, pValor3);
        preparedStatement.setInt(4, pValor4);
        preparedStatement.executeUpdate();
    }
}
