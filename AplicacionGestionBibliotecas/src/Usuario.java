import java.util.ArrayList;

public class Usuario {

    //Atributos
    private String nombre;
    private String apellidos;
    private Carnet carnet;
    private final ArrayList<Libro> listaLibroRetirado;

    //Métodos
    //Constructor
    public Usuario(
            String nombreObjeto,
            String apellidosObjeto
    ){
        nombre = nombreObjeto;
        apellidos = apellidosObjeto;
        listaLibroRetirado = new ArrayList<>();
    }

    public Usuario(){
        listaLibroRetirado = new ArrayList<>();
    }

    //Getter
    public String getNombre(){
        return nombre;
    }

    public String getApellidos(){
        return apellidos;
    }

    public Carnet getCarnet(){
        return carnet;
    }

    //Setter
    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    public void setApellidos(String nuevoApellidos){
        apellidos = nuevoApellidos;
    }

    //Obtiene un carnet para retirar libros de la biblioteca
    public void sacarCarnet(String nuevoNumeroCarnet, char nuevoTipo){
        carnet = new Carnet(nuevoNumeroCarnet, nuevoTipo);
    }

    //Retira un libro de la biblioteca y lo agrega a una lista de libros del usuario
    public void retirarLibro(Libro libro, Biblioteca biblioteca){
        if(biblioteca.getListaLibro().contains(libro)){
            listaLibroRetirado.add(libro);
            biblioteca.getListaLibro().remove(libro);
        }else{
            System.out.println("El libro no está disponible en la biblioteca.");
        }
    }
}
