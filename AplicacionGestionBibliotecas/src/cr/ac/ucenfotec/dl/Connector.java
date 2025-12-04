package cr.ac.ucenfotec.dl;

import cr.ac.ucenfotec.utils.Utils;

public class Connector {

    //Atributos
    private static DBAccess dbConnection = null;

    public static DBAccess getConnection() throws Exception {
        String[] infoAccesoBD = Utils.getPropiedades();
        String direccion = infoAccesoBD[0] + "//" + infoAccesoBD[1] + "/" + infoAccesoBD[2];
        String usuario = infoAccesoBD[3];
        String contrasena = infoAccesoBD[4];
        if(dbConnection == null){
            dbConnection = new DBAccess(direccion, usuario, contrasena);
        }
        return dbConnection;
    }
}
