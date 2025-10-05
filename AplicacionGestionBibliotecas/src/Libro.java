public class Libro {

    //Atributo
    private String titulo;
    private String autor;

    //Métodos
    //Constructor
    public Libro(
            String tituloObjeto,
            String autorObjeto
    ){
        titulo = tituloObjeto;
        autor = autorObjeto;
    }

    public Libro(){}

    //Getter
    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    //Setter
    public void setTitulo(String nuevoTitulo){
        titulo = nuevoTitulo;
    }

    public void setAutor(String nuevoAutor){
        titulo = nuevoAutor;
    }
}
