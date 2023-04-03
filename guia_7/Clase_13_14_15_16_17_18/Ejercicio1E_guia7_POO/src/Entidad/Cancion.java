package Entidad;

/*Desarrollar una clase Cancion con los siguientes atributos: 
título y autor. Se deberá definir además dos constructores: 
uno vacío que inicializa el título y el autor a cadenas vacías
y otro que reciba como parámetros el título y el autor de la 
canción. Se deberán además definir los métodos getters y setters
correspondientes.*/

public class Cancion {
    private String titulo;
    private String autor;

    public Cancion() {
       titulo = " ";
       autor = " ";
        
    }

    public Cancion(String titulo, String autor) {
        this.autor = autor;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", autor=" + autor + '}';
    }

    public void close() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
