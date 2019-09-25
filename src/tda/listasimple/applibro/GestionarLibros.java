package tda.listasimple.applibro;

import tda.listasimple.ListaSimple;
import java.util.Scanner;

public class GestionarLibros {

    public static int menu() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("MENU PRINCIPAL");
        System.out.println("1. Registrar Libro");
        System.out.println("2. Buscar Libro");
        System.out.println("3. Eliminar Libro");
        System.out.println("4. Listado de Libros");
        System.out.println("5. Salir");
        System.out.print("Elija una opción: ");
        int opcion = entrada.nextInt();
        return opcion;
    }

    public static void main(String[] args) {
        ListaLibro biblioteca = new ListaLibro();
        boolean terminado = false;
        do {
            switch (menu()) {
                case 1:
                    biblioteca.agregarLibro();
                    break;
                case 2:
                    biblioteca.buscarLibro();
                    break;
                case 3:
                    biblioteca.eliminarLibro();
                    break;
                case 4:
                    biblioteca.imprimirLibros();
                    break;
                case 5:
                    terminado = true;

            }
        } while (!terminado);

    }

}
