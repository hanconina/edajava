package tda.grafo;

public class AppGrafo {
    public static void main(String[] args) {
        Grafo g = new Grafo();
        Vertice v1 = new Vertice("a");        
        Vertice v2 = new Vertice("b");
        Vertice v3 = new Vertice("c");
        Vertice v4 = new Vertice("d");
        Vertice v5 = new Vertice("e");
        Vertice v6 = new Vertice("f");
        
        g.agregarVertice(v1);
        g.agregarVertice(v2);
        g.agregarVertice(v3);
        g.agregarVertice(v4);
        g.agregarVertice(v5);
        g.agregarArco(v1, v1);
        g.agregarArco(v1, v2);
        g.agregarArco(v1, v2);
        g.agregarArco(v1, v3);
        g.agregarArco(v1, v6);
        g.agregarArco(v3, v3);
        g.agregarArco(v3, v4);
        g.agregarArco(v3, v1);
        g.agregarArco(v4, v3);
        g.agregarArco(v6, v3);
        g.agregarArco(v4, v1);
        
        
        g.mostrarGrafo();
//        g.eliminarArco(v1, v3);
//        g.eliminarArco(v1, v1);
//        g.eliminarArco(v3, v4);
        g.eliminarVertice(v1);
        System.out.println("Grafo Resultante...");
        g.mostrarGrafo();
    }
    
}
