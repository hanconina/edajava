package tda.cola;

public class Cola {
    private Nodo frente;
    private Nodo ultimo;
    private int n; // Tamaño de la cola
    
    // CONSTRUCTOR
    public Cola(){
        // inicializar referencia a cabeza y cola 
        frente = null;
        ultimo = null;
        n=0;
    }
    // Cola vácia
    public boolean esVacia(){
        boolean estado = false;
        if (frente==null){
            return true;
        }
        return estado;
    }
    
    public void encolar(Object item){
        Nodo nuevoNodo = new Nodo(item);
        if (esVacia()){
            frente = nuevoNodo;
            ultimo = nuevoNodo;
        }else{
            ultimo.setSiguiente(nuevoNodo);
            ultimo = nuevoNodo;
        }
        n++;
    }
    // Encolar
    public Object desencolar(){
        if (esVacia()){
            return null;
        }else{
            Object itemAux = frente.getItem();
            frente = frente.getSiguiente();
            n--;
            return itemAux;
        }
    }
    public int longitud(){
        return n;
    }    
}
