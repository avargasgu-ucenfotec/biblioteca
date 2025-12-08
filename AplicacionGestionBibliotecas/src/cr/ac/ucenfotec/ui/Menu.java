package cr.ac.ucenfotec.ui;

import cr.ac.ucenfotec.tl.Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

    //Atributo
    private static final BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    //Métodos
    public static void menuPrincipal() throws Exception {
        byte opcion = -1;

        do {
            System.out.println("\n === Menú principal ===\n");
            System.out.println("[ 1] Agregar administrador");
            System.out.println("[ 2] Agregar cliente");
            System.out.println("[ 3] Agregar libro a biblioteca");
            System.out.println("[ 4] Listar administradores");
            System.out.println("[ 5] Listar clientes");
            System.out.println("[ 6] Listar libros de la biblioteca");
            System.out.println("[ 7] Modificar administrador");
            System.out.println("[ 0] Salir");
            System.out.print("\nSeleccione una opción: ");
            try {
                opcion = Byte.parseByte(leerTexto());
            } catch (Exception e) {
                System.out.println("Lo sentimos, sucedió algo inesperado.");
            }
            Controller.procesarSeleccionPrincipal(opcion);
        } while (opcion != 0);
    }

    public static String leerTexto() throws IOException {
        return entrada.readLine();
    }
}

