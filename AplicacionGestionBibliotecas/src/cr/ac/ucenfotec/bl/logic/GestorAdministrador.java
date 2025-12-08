package cr.ac.ucenfotec.bl.logic;

import cr.ac.ucenfotec.bl.entities.administrador.Administrador;
import cr.ac.ucenfotec.bl.entities.administrador.DAOAdministrador;

import java.util.ArrayList;
import java.util.HashMap;

public class GestorAdministrador {

    //Métodos
    public static String agregarAdministrador(String nombreCompleto, String cedula, String correoElectronico) throws Exception {
        Administrador administrador = new Administrador(nombreCompleto, cedula, correoElectronico);
        return DAOAdministrador.insertarAdministrador(administrador);
    }

    public static void listarAdministradoresID(HashMap<Integer, Administrador> listaAdministradoresID) throws Exception {
        ArrayList<Integer> listaIDs = DAOAdministrador.listarIDs();
        ArrayList<Administrador> listaAdministradores = DAOAdministrador.listarAdministradores();
        if (!listaIDs.isEmpty()) {
            for (int i = 0; i < listaIDs.size(); i++) {
                assert listaAdministradores != null;
                listaAdministradoresID.putIfAbsent(listaIDs.get(i), listaAdministradores.get(i));
            }
        }
    }
}
