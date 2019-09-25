package tda.listasimple.applibro;

import tda.listasimple.ListaSimple;
import java.util.Scanner;

public class ListaLibro {

    // ATRIBUTOS
    private ListaSimple listado;

    // METODOS
    public ListaLibro() {
        listado = new ListaSimple();
    }

    // ACCESADORES Y MODIFICADORES
    public ListaSimple getListado() {
        return listado;
    }

    public void setListado(ListaSimple listado) {
        this.listado = listado;
    }

    //-- Otros métodos
    public int indice(Object claveBusqueda) {
        return listado.ubicacion(claveBusqueda);
    }

    public void agregarALista(Libro libro) {
        // Verificar que el libro no exista
        if (indice(libro.getId()) == 0) {
            if (listado.esVacia()) {
                listado.insertar(libro, 1);
            } else {
                listado.insertar(libro, listado.longitud() + 1);
            }
        } else {
            System.out.println("El libro ya existe en la lista");
        }
    }

    public void agregarLibro() {
        //--- Crear objeto Libro y leer sus datos
        Libro OLibro = new Libro();
        OLibro.leer();
        //--- Agregar objeto a la lista de Libros
        agregarALista(OLibro);
    }

    public void imprimirLibros() {
        StringBuilder str = new StringBuilder();
        str.append("ID: ");
        str.append("\t");
        str.append("Autor");
        str.append("\t");
        str.append("Titulo");
        str.append("\t");
        str.append("Año");
        System.out.println(str);
        for (int i = 1; i <= listado.longitud(); i++) {
            Libro libro = (Libro) listado.iesimo(i);
            libro.escribir();
        }
    }

    public void buscarLibro() {
        Scanner entrada = new Scanner(System.in);
        // Leer el identificador del libro que se busca
        System.out.println("Ingrese el identificador del libro");
        String id = entrada.nextLine();
        //--- Determinar indice o ubicacion del libro
        int i = indice(id);
        if (i > 0) {
            Libro libro = (Libro) listado.iesimo(i);
            libro.mostrar();
        } else {
            // El libro no existe
            System.out.println("No existe el Libro");
        }
    }

    public void eliminarLibro() {
        Scanner entrada = new Scanner(System.in);
        // Leer el identificador del libro que se busca
        System.out.println("Ingrese el identificador del libro");
        String id = entrada.nextLine();
        //--- Determinar indice o ubicacion del libro
        int i = indice(id);
        if (i > 0) {
            listado.eliminar(i);
        } else {
            // El libro no existe
            System.out.println("No existe el Libro");
        }
    }

}
