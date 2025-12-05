package cr.ac.ucenfotec.bl.entities.libro;

public class Libro {

    //Atributos
    private String titulo;
    private String autor;
    private int cantidad;

    //Métodos
    //Constructor
    public Libro(String titulo, String autor, int cantidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantidad = cantidad;
    }

    //Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getCantidad() {
        return cantidad;
    }

    //Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    //String()
    public String toString() {
        return "\nTítulo: " + titulo +
                "\nAutor: " + autor +
                "\nCantidad: " + cantidad +
                "\n";
    }

    //equals()
    public boolean equals(Libro libro) {
        return (titulo.equals(libro.titulo));
    }
}
