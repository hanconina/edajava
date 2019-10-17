package tda.pila.nodos;

public class Pila {
    private Nodo cima;
    private int n;
    
    public Pila(){
        cima = null;
        n=0;
    }
    public boolean esVacia(){
        return cima==null;            
    }
    public void apilar(Object item){
        Nodo nuevoNodo = new Nodo(item);
        if (esVacia()){
            cima = nuevoNodo;
        }else{
            nuevoNodo.setSiguiente(cima);
            cima = nuevoNodo;
        }
        n++;
    }
    public Object desapilar(){
        if (esVacia()){
            return null;
        }
        Object itemAux = cima.getItem();
        cima = cima.getSiguiente();
        n--;
        return itemAux;
    }
    public int longitud(){
        return n;
    }
    public Object cima(){
        if (esVacia()){
            return null;
        }else{
            return cima.getItem();
        }
    }
    
}
