package tda.listasimple.applibro;
import java.util.Scanner;

public class Libro {
    // Atributos
    private String id;
    private String autor;
    private String titulo;
    private int anio;
    // Métodos
    // Constructores
    public Libro(){
        this.id = "";
        this.autor = "";
        this.titulo = "";
        this.anio=0;
    }
    public Libro(String id, String autor, String titulo, int anio){
        this.id=id;
        this.autor=autor;
        this.titulo=titulo;
        this.anio = anio;
    }
    
    // Accesadores y Modificadores

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    // Otros Métodos

    @Override
    public String toString() {
        return id;
    }
    public void leer(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los datos del Libro");
        System.out.println("===========================");
        System.out.println("Ingrese el Id del Libro: ");
        id = entrada.nextLine();
        System.out.println("Ingrese el Autor: ");
        autor = entrada.nextLine();
        System.out.println("Ingrese el titulo del Libro: ");
        titulo = entrada.nextLine();
        System.out.println("Ingrese el año de publicacion del Libro: ");
        anio = entrada.nextInt();
    }
    public void escribir(){
        StringBuilder fila=new StringBuilder();
        fila.append(id);
        fila.append("\t");
        fila.append(autor);
        fila.append("\t");
        fila.append(titulo);
        fila.append("\t");
        fila.append(anio);
        System.out.println(fila.toString());
    }
    public void mostrar(){
        System.out.println("Datos del libro");
        System.out.println("========================");
        System.out.println("Id; "+id);
        System.out.println("Autor: "+autor);
        System.out.println("Titulo: "+titulo);
        System.out.println("Año: "+anio);
    }
}
