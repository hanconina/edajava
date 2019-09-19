package tda.listasimple;

public class Nodo {
    // ATRIBUTOS
    // Elemento del noto
    private Object elemento;
    // Apuntador al siguiente elemento
    private Nodo sgteNodo;
    // METODOS
    // Contructores
    public Nodo(){
        
    }
    public Nodo(Object elemento){
        this.elemento = elemento;
    }
    public Nodo(Object elemento, Nodo sgteNodo){
        this.elemento = elemento;
        this.sgteNodo = sgteNodo;
    }
    // Accesadores y modificadores

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public Nodo getSgteNodo() {
        return sgteNodo;
    }

    public void setSgteNodo(Nodo sgteNodo) {
        this.sgteNodo = sgteNodo;
    }
    
    
    
}
