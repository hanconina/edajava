package tda.grafo.matriz;

//Implementacion de Grafos con matriz de adyacencia.
public class GrafoMatriz {

    //numero de vertices del grafo
    int numVertices;
    //Maximo numero de vertices del grafo
    int maxVertices;
    //Matriz de adyacencia con Clase Float - Null significa que no hay arco
    Float[][] matriz;
    //dirigido o no
    boolean dirigido;

    public GrafoMatriz(int n, int max, boolean d) {
        maxVertices = max;
        numVertices = n;
        matriz = new Float[maxVertices][maxVertices];
        dirigido = d;
    }

    public void agregarVertice() {
        if (numVertices == maxVertices) {
            System.out.println("No es posible agregar vertice!!!");
            return;
        }
        //Ingrementar el numero de vertices
        numVertices++;
    }

    public int numeroVertices() {
        //devuelde el numero de vertices del grafo
        return numVertices;
    }

    public void agregarArco(int i, int j) {
        //Por defecto, el arco es añadido con peso cero
        agregarArco(i, j, 0);
    }

    public void agregarArco(int i, int j, float w) {
        matriz[i][j] = w;
        //si el grafo es no dirigido debemos agregar también el arco simetrico
        if (!dirigido) {
            matriz[j][i] = w;
        }
    }

    public void eliminarArco(int i, int j) {
        //Actualizar el valor a null
        matriz[i][j] = null;
        //Si es un grafo no dirijido, debemos actualizar el simetrico
        if (!dirigido) {
            matriz[j][i] = null;
        }
    }

    public void mostrarGrafo() {
        //visitar las filas
        for (int i = 0; i < numVertices; i++) {
            //Para cada fila, visitar todas la columnas
            for (int j = 0; j < numVertices; j++) {
                //Imprimir el elemento en la matriz[i,j] y un espacio
                System.out.print(matriz[i][j] + "\t");
            }
            //Nuev linea para una nueva fila
            System.out.println();
        }
        System.out.println();
    }

    public int numArcosEntrada(int i) {
        //Un grafo dirigido no tiene arcos de entrada
        if (!dirigido) {
            System.out.println("Grafo no dirigido!!!");
            return 0;
        }
        //Contar el numero de filas que tienen un arco a i
        int ingreso = 0;
        for (int fila = 0; fila < numVertices; fila++) {
            if (matriz[fila][i] != null) {
                ingreso++;
            }
        }
        return ingreso;
    }

    //Solución a la pregunta 1 de la practica calificada 2
    public int numArcosSalida(int i) {
        //Los grafos no dirigidos no tienen arcos de salida
        if (!dirigido) {
            System.out.println("Es un grafo no dirigido!!!");
            return 0;
        }

        int arcosSalida = 0;
        //contar las columnas que tienen un arco de i
        for (int col = 0; col < numVertices; col++) {
            if (matriz[i][col] != null) {
                arcosSalida++;
            }
        }
        return arcosSalida;
    }

    public int numTriangulos() {

        int n = 0;
        if (numVertices > 2) {
            for (int i = 0; i < numVertices - 2; i++) {
                if ((matriz[i][i + 1] != null || matriz[i + 1][i] != null)
                        && (matriz[i + 1][i + 2] != null || matriz[i + 2][i + 1] != null)
                        && (matriz[i][i + 2] != null || matriz[i + 2][i] != null)) {
                    n++;
                }

            }
        }
        return n;
    }

    public int recuperarGrado(int i) {
        int grado = 0;
        if (dirigido) {
            grado = numArcosEntrada(i) + numArcosSalida(i);
        } else {
            //nosotros debemos contar el numero de filas o columnas
            // que tiene un arco con i
            //en ese sentido decidimos contar las filas
            for (int fila = 0; fila < numVertices; fila++) {
                if (matriz[fila][i] != null) {
                    grado++;
                }
            }
        }
        return grado;
    }

    //Devolver unarreglo con los adyacentes del vertoce i
    public int[] recuperarAdyacentes(int i) {
        //obtener el numero de adyacentes,
        //El cual se utilizara para el tamaño del arreglo
        int numAdyacentes = 0;
        if (dirigido) {
            numAdyacentes = numArcosSalida(i);
        } else {
            numAdyacentes = recuperarGrado(i);
        }

        int[] adyacentes = new int[numAdyacentes];

        if (numAdyacentes > 0) {
            int j = 0;
            //recuerar los arcos (i,col) y guardar la columna en los adyacentes
            for (int col = 0; col < numVertices; col++) {
                if (matriz[i][col] != null) {
                    adyacentes[j] = col;
                    j++;
                }
            }
        }
        //devolver un arreglo con los adyacentes del vertoce i
        return adyacentes;
    }

    public void recorridoALoAncho() {
        System.out.println("Recorrido a lo ancho del grafo:");

        //Crear una matriz boolean para conocer si los vertices fueron visitados
        boolean visitado[] = new boolean[numVertices];

        //Realizar el recorrido por todos los vertices empezando desde el vertice en la posicion 0
        for (int i = 0; i < numVertices; i++) {
            if (!visitado[i]) { //Solo si el vertice no fue visitado
                amplitud(i, visitado);
            }
        }
        System.out.println();
    }

    //recorrido en amplitud en forma ordenada para cada vertice i 
    protected void amplitud(int i, boolean[] visitado) {
        //creamos un arreglo para conocer que vertices han sido almacenados en la cola
        boolean almacenados[] = new boolean[numVertices];
        //Creamos una cola para guardar los vertice adyacentes que fueron visitados
        Cola q = new Cola();
        //encolar el primero
        q.encolar(i);
        //Mientras la cola no este vácia
        while (!q.esVacia()) {
            //recuperar el primero
            int vertice = q.desencolar().hashCode();
            //Mostrar el vertice y marcar como visitado
            System.out.print(vertice + "\t");
            visitado[vertice] = true;
            //Recuperar sus vertice adyacentes
            int[] adyacentes = this.recuperarAdyacentes(vertice);
            for (int verticeAdyacente : adyacentes) {
                //encolar solo aquellos que no están visitados o almacenados 
                if (!visitado[verticeAdyacente] && !almacenados[verticeAdyacente]) {
                    q.encolar(verticeAdyacente);
                    almacenados[verticeAdyacente] = true;
                }
            }
        }
    }

    public void recorridoEnProfundiad() {
        System.out.println("Recorrido en Profundidad del Grafo:");
        //arreglo para marcar cuando un vertice ya fue visitado
        boolean visitado[] = new boolean[numVertices];
        //Debemos recorrer todos los vertice
        for (int i = 0; i < numVertices; i++) {
            if (!visitado[i]) {
                DFS(i, visitado);
            }
        }
        System.out.println();
    }

    protected void DFS(int i, boolean[] visitado) {
        //MOstrar en pantalla los vertice y marcar como visitados
        System.out.print(i + "\t");
        visitado[i] = true;
        //recuperar sus vertices adyacentes
        int[] adyacentes = this.recuperarAdyacentes(i);
        for (int adyacente : adyacentes) {
            if (!visitado[adyacente]) {
                //Solo recorrer en profundidad los vertices adyacentes que no hayan 
                // sido visitados
                DFS(adyacente, visitado);
            }
        }
    }

    // Devuelve el indice con peso minimo del arreglo distancias
    public int distanciaMinima(float distancias[], boolean conjuntoS[]) {
        // inicializar valor minimo 
        float min = Float.MAX_VALUE;
        int min_index = -1;

        for (int v = 0; v < numVertices; v++) {
            if (conjuntoS[v] == false && distancias[v] <= min) {
                min = distancias[v];
                min_index = v;
            }
        }
        return min_index;
    }

    // Mostrar arreglo de ditancias minimas
    public void mostrarDistancias(float distancias[]) {
        System.out.println("Distancias desde el vertice fuente");
        for (int i = 0; i < numVertices; i++) {
            System.out.println(i + " tt " + distancias[i]);
        }
    }

    // Implmentacion de la funcion Dijkstra's de la distancia mas corta desde 
    // la fuente utilizando una matriz de adyacencia
    public void dijkstra(int verticeFuente) {
        // El arreglo resultante de las distancias mas cortas hacia todos los vertices
        float distancias[] = new float[numVertices];
        // la distancia mas corta de la fuente a i 

        // conjuntoS[i] será verdadero si el vertice i es incluido en el  
        // conjuntoS de caminos mas corto al origen
        // O la distancia del camino mas corto del vertice fuente a i ya finalizo 
        boolean conjuntoS[] = new boolean[numVertices];

        // inicializar todas las distancas como infinitas y el conjuntoS de camino mas corto
        // como falso 
        for (int i = 0; i < numVertices; i++) {
            distancias[i] = Float.MAX_VALUE;
            conjuntoS[i] = false;
        }

        // La distancia del vertice fuente a si mismo siempre es cero
        distancias[verticeFuente] = 0;

        // Encontrar el camino mas corto para todos los vertices 
        for (int contador = 0; contador < numVertices - 1; contador++) {
            // elija el vertice con la minima distancia del conjunto de vertices 
            // que todavia no hayan sido procesados. 
            // w es siempre igual al vertice fuente al inicio de la iteracion 

            int w = distanciaMinima(distancias, conjuntoS);

            // Marcar el vertice elejido como procesado 
            conjuntoS[w] = true;

            // Actualiza el valor de la distacia de los vértices adyacentes
            // del vértice seleccionado.
            for (int v = 0; v < numVertices; v++) {
                // Actualice distancias [v] solo si no fue visitado, hay un
                // arco de w a v, y peso total de la ruta del vertice fuente a
                // v a través de w es menor que el valor actual de distancias [v]            
                if (!conjuntoS[v] && matriz[w][v] != null
                        && distancias[w] != Float.MAX_VALUE
                        && distancias[w] + matriz[w][v] < distancias[v]) {
                    distancias[v] = distancias[w] + matriz[w][v];
                }
            }
        }

        // imprimir el arreglo construido
        this.mostrarDistancias(distancias);
    }

    public void adyacentesDelPrimerPredecesor(int vertice) {
        int primerPredecesor = -1;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][vertice] != null) {
                primerPredecesor = i;
                break;
            }
        }
        if (primerPredecesor >= 0) {
            for (int i = 0; i < matriz.length; i++) {
                if (matriz[primerPredecesor][i] != null && i !=vertice) {
                    System.out.print(i + "\t");
                }
            }
            System.out.println();
        }else{
            System.out.println("No tiene predecesores");
        }
    }

}
