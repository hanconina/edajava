package tda.listasimple;

public class ListaSimple {

    // ATRIBUTOS
    private Nodo primerNodo;

    // CONSTRUCTORES
    public ListaSimple() {
        this.primerNodo = new Nodo();
    }

    public ListaSimple(Object elemento, Nodo sgteNodo) {
        this.primerNodo.setElemento(elemento);
        this.primerNodo.setSgteNodo(sgteNodo);
    }
    // MODIFICADORES Y ACCESADORES

    public Nodo getPrimerNodo() {
        return primerNodo;
    }

    public void setPrimerNodo(Nodo primerNodo) {
        this.primerNodo = primerNodo;
    }

    // OTROS METODOS
    /* EsVacia: determina si la lista es o no vacia
     */
    public boolean esVacia() {
        return primerNodo.getElemento() == null
                && primerNodo.getSgteNodo() == null;
    }

    /* Insertar: Inserta un objeto en un posición determinada de la lista
         * PreCondición {| 1 <= Posicion_Insertar <= Longitud(lista) + 1 |}
     */
    public void insertar(Object elemento, int posicion) {
        if (posicion == 1) {
            if (esVacia()) {
                primerNodo.setElemento(elemento);;
            } else {
                //---- insertar un nuevo nodo al inicio
                Nodo nuevoNodo = new Nodo(primerNodo.getElemento(), primerNodo.getSgteNodo());
                primerNodo.setSgteNodo(nuevoNodo);
                primerNodo.setElemento(elemento);
            }
        } else {
            //---- Buscar la posición a insertar
            Nodo ONodoAux = primerNodo;
            int i = 1;
            while (i < posicion - 1) {
                ONodoAux = ONodoAux.getSgteNodo();
                i++;
            }

            //---- crear un nuevo nodo e insertar
            Nodo nuevoNodo = new Nodo(elemento, ONodoAux.getSgteNodo());
            ONodoAux.setSgteNodo(nuevoNodo);
        }
    }

    /* Iésimo: Recupera el i-ésimo elemento de la lista
         * PreCondición {| 1 <= Posicion_Iésima <= Longitud(lista)|}
     */
    public Object iesimo(int posicion) {
        Nodo ONodoAux = primerNodo;
        int i = 1;
        while (i < posicion) {
            ONodoAux = ONodoAux.getSgteNodo();
            i++;
        }
        return ONodoAux.getElemento();
    }

    /* Longitud : Determina la longitud de la lista (cant. de elementios de la lista)
     */
    public int longitud() {
        if (esVacia()) {
            return 0;
        } else {
            Nodo ONodoAux = primerNodo;
            int i = 1;
            while (ONodoAux.getSgteNodo() != null) {
                ONodoAux = ONodoAux.getSgteNodo();
                i++;
            }
            return i;
        }
    }

    /* Eliminar: Elimina un objeto de la íesima posición de la lista
         * PreCondición {| 1 <= Posicion_Eliminar <= Longitud(lista) |}
     */
    //----Pre-Condicion {| pPosicion <= Longotid(Lista)|}
    public void eliminar(int posicion) {
        if (posicion >= 1 && posicion <= longitud()) {
            //---- Si la posición es la primera
            if (longitud() == 1) {
                primerNodo.setSgteNodo(null);
                primerNodo.setElemento(null);
            } else {
                if (posicion == 1) {
                    primerNodo = primerNodo.getSgteNodo();
                } else {
                    Nodo nodoAntentior = primerNodo;
                    int i = 1;
                    while (i < posicion - 1) {
                        nodoAntentior = nodoAntentior.getSgteNodo();
                        i++;
                    }
                    Nodo nodoSuprimir = nodoAntentior.getSgteNodo();
                    //---- Eliminar nodo
                    nodoAntentior.setSgteNodo(nodoSuprimir.getSgteNodo());
                    nodoSuprimir.setSgteNodo(null);
                }

            }
        }
    }

    /* Ubicacion: Obtiene la ubicación o posición e un elemento en la lista
     */
    public int ubicacion(Object elemento) {
        if (esVacia()) //---- No existe el objeto xq la lista es vacia
        {
            return 0;
        } else {
            Nodo ONodoAux = primerNodo;
            int i = 1;
            while (!ONodoAux.getElemento().toString().equals(elemento) && i <= longitud()) {
                i++;
                //---- En caso que el SgteNodo se a vacio, es el final de la lista
                if (ONodoAux.getSgteNodo() == null) {
                    return 0;
                } else {
                    ONodoAux = ONodoAux.getSgteNodo();
                }
            }
            return i;
        }
    }
    
    public void limpiar(){
        for (int i=longitud();i>=1;i--){
            eliminar(i);
        }
    }
    
   public void mostrarIntervalo(int ini, int fin){
       if (ini <=fin && ini>=1 && ini<=longitud() && fin>= 1 && fin <=longitud()){
           for (int i=ini;i<=fin;i++){
               System.out.println(iesimo(i));
           }
       }
   }
}
