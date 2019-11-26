package tda.grafo.matriz;

public class AppGrafoMatriz {

    public static void main(String args[]) {
        GrafoMatriz grafo = new GrafoMatriz(9, 9, true);
        //fila 0
        grafo.agregarArco(0, 1, 4);
        grafo.agregarArco(0, 8, 8);

        grafo.agregarArco(1, 0, 4);
        grafo.agregarArco(1, 2, 8);
        grafo.agregarArco(1, 7, 11);

        grafo.agregarArco(2, 1, 8);
        grafo.agregarArco(2, 3, 7);
        grafo.agregarArco(2, 5, 4);
        grafo.agregarArco(2, 8, 2);

        grafo.agregarArco(3, 2, 7);
        grafo.agregarArco(3, 4, 9);
        grafo.agregarArco(3, 5, 14);

        grafo.agregarArco(4, 3, 9);
        grafo.agregarArco(4, 5, 10);

        grafo.agregarArco(5, 2, 4);
        grafo.agregarArco(5, 3, 14);
        grafo.agregarArco(5, 4, 10);
        grafo.agregarArco(5, 6, 2);

        grafo.agregarArco(6, 5, 2);
        grafo.agregarArco(6, 7, 1);
        grafo.agregarArco(6, 8, 6);

        grafo.agregarArco(7, 0, 8);
        grafo.agregarArco(7, 1, 11);
        grafo.agregarArco(7, 6, 1);
        grafo.agregarArco(7, 8, 7);

        grafo.agregarArco(8, 2, 2);
        grafo.agregarArco(8, 6, 6);
        grafo.agregarArco(8, 7, 7);

        grafo.mostrarGrafo();

        grafo.recorridoALoAncho();
        grafo.recorridoEnProfundiad();
        grafo.dijkstra(0);
        
        System.out.println("Otro Ejemplo: ");

        //fila 0
        GrafoMatriz grafo2 = new GrafoMatriz(8,8,true);
        grafo2.agregarArco(0, 1, 1);
        grafo2.agregarArco(0, 2, 2);

        grafo2.agregarArco(1, 2, 1);
        grafo2.agregarArco(1, 3, 1);

        grafo2.agregarArco(2, 3, 1);
        grafo2.agregarArco(2, 5, 1);

        grafo2.agregarArco(7, 6, 1);

        grafo2.mostrarGrafo();
        grafo2.dijkstra(0);
    }

}
