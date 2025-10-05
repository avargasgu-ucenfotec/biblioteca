import java.util.ArrayList;

//La clase "Biblioteca" es una abstracción de un sistema de gestión de bibliotecas, donde cada biblioteca tiene un
//nombre y una lista de libros, que representa las colecciones físicas de libros.

public class Biblioteca {

    //Atributo
    private String nombre;
    private final ArrayList<Libro> listaLibro;

    //Métodos
    //Constructor
    public Biblioteca(
            String nombreObjeto
    ){
        nombre = nombreObjeto;
        listaLibro = new ArrayList<>();
    }

    public Biblioteca(){
        listaLibro = new ArrayList<>();
    }

    //Getter
    public String getNombre(){
        return nombre;
    }

    public ArrayList<Libro> getListaLibro(){
        return listaLibro;
    }

    //Setter
    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    //Agrega un libro a una colección de libros
    public void insertarLibro(Libro nuevoLibro){
        listaLibro.add(nuevoLibro);
    }

    //Remueve un libro de una colección de libros
    public void removerLibro(Libro nuevoLibro){
        listaLibro.remove(nuevoLibro);
    }
}
