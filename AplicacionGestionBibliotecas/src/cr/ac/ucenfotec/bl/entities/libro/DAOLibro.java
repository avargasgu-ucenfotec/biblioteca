package cr.ac.ucenfotec.bl.entities.libro;

import cr.ac.ucenfotec.dl.Connector;

import java.sql.ResultSet;
import java.util.ArrayList;

public class DAOLibro {

    //Atributos
    private static String statement;
    private static String query;

    //Métodos
    public static String insertarLibro(Libro libro) throws Exception {
        statement = "INSERT INTO t_libros(titulo, autor, cantidad) VALUES ('"
                + libro.getTitulo() + "'"
                + ",'" + libro.getAutor() + "'"
                + "," + libro.getCantidad()
                + ");";
        Connector.getConnection().ejecutarStatement(statement);
        return "El libro se registró correctamente en la base de datos.\n";
    }

    public static ArrayList<Libro> listarLibros() throws Exception {
        ArrayList<Libro> listaLibros = new ArrayList<>();
        query = "SELECT * FROM t_libros";
        ResultSet resultado = Connector.getConnection().ejecutarQuery(query);
        if(!resultado.next()){
            return null;
        }
        do {
            Libro libroTemp = new Libro(resultado.getNString("titulo"),
                    resultado.getNString("autor"),
                    resultado.getInt("cantidad"));
            listaLibros.add(libroTemp);
        } while (resultado.next());
        return listaLibros;
    }

    public static ArrayList<Integer> listarIDs() throws Exception {
        ArrayList<Integer> listaIDs = new ArrayList<>();
        query = "SELECT * FROM t_libros";
        ResultSet resultado = Connector.getConnection().ejecutarQuery(query);
        if(!resultado.next()){
            return null;
        }
        do {
            listaIDs.add(resultado.getInt("id"));
        } while (resultado.next());
        return listaIDs;
    }

    public static String modificarLibro(int idLibro, Libro libro) throws Exception {
        statement = "UPDATE t_libros SET titulo = ? , autor = ? , cantidad = ? WHERE id = ?";
        Connector.getConnection().ejecutarStatement(statement, libro.getTitulo(),
                libro.getAutor(),
                libro.getCantidad(),
                idLibro);
        return "El cliente se modificó en la base de datos correctamente.\n";
    }

    public static String eliminarLibro(int idLibro) throws Exception {
        statement = "DELETE FROM t_libros WHERE id = ?";
        Connector.getConnection().ejecutarStatement(statement, idLibro);
        return "El libro se eliminó de la base de datos correctamente (si existía).\n";
    }
}
