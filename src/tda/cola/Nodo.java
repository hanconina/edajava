package tda.cola;

public class Nodo {
    private Object item;
    private Nodo siguiente;

    public Nodo() {
        this.item = null;
        this.siguiente = null;
    }
    public Nodo(Object item) {
        this.item = item;
        this.siguiente = null;
    }

    public Nodo(Object item, Nodo siguiente) {
        this.item = item;
        this.siguiente = siguiente;
    }

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    

    @Override
    public String toString() {
        return item.toString();
    }
    
    
    
}
