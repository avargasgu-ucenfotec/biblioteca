package cr.ac.ucenfotec.bl.logic;

import cr.ac.ucenfotec.bl.entities.administrador.Administrador;
import cr.ac.ucenfotec.bl.entities.administrador.DAOAdministrador;

public class GestorAdministrador {

    //Métodos
    public static String agregarAdministrador(String nombreCompleto, String cedula, String correoElectronico) throws Exception {
        Administrador administrador = new Administrador(nombreCompleto, cedula, correoElectronico);
        return DAOAdministrador.insertarAdministrador(administrador);
    }
}
