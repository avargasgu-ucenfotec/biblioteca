package cr.ac.ucenfotec.bl.entities.libro;

import cr.ac.ucenfotec.dl.Connector;

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
}
