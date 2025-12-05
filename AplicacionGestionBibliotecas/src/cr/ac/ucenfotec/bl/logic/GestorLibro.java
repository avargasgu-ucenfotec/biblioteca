package cr.ac.ucenfotec.bl.logic;

import cr.ac.ucenfotec.bl.entities.libro.Libro;
import cr.ac.ucenfotec.bl.entities.libro.DAOLibro;

public class GestorLibro {

    //Métodos
    public static String agregarLibro(String titulo, String autor, int cantidad) throws Exception {
        Libro libro = new Libro(titulo, autor, cantidad);
        return DAOLibro.insertarLibro(libro);
    }
}
