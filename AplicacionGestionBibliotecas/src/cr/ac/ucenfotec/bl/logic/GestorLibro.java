package cr.ac.ucenfotec.bl.logic;

import cr.ac.ucenfotec.bl.entities.libro.Libro;
import cr.ac.ucenfotec.bl.entities.libro.DAOLibro;

import java.util.ArrayList;
import java.util.HashMap;

public class GestorLibro {

    //Métodos
    public static String agregarLibro(String titulo, String autor, int cantidad) throws Exception {
        Libro libro = new Libro(titulo, autor, cantidad);
        return DAOLibro.insertarLibro(libro);
    }

    public static void listarLibrosID(HashMap<Integer, Libro> listaLibrosID) throws Exception {
        ArrayList<Integer> listaIDs = DAOLibro.listarIDs();
        ArrayList<Libro> listaLibros = DAOLibro.listarLibros();
        if (!listaIDs.isEmpty()) {
            for (int i = 0; i < listaIDs.size(); i++) {
                assert listaLibros != null;
                listaLibrosID.putIfAbsent(listaIDs.get(i), listaLibros.get(i));
            }
        }
    }

    public static String modificarLibro(int idLibro, String titulo, String autor, int cantidad) throws Exception {
        Libro nuevoLibro = new Libro(titulo, autor, cantidad);
        return DAOLibro.modificarLibro(idLibro, nuevoLibro);
    }
}
