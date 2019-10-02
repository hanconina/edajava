package tda.cola;

public class Cola {
    private Nodo frente;
    private Nodo ultimo;
    public static int tamaño;
    private int n;
    
    // CONSTRUCTOR
    public Cola(){
        // inicializar referencia a cabeza y cola 
        frente = null;
        ultimo = null;
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
        Nodo aux = ultimo;
        ultimo = new Nodo();
        ultimo.setItem(item);
        ultimo.setSiguiente(null);
        if (esVacia()){
            frente = ultimo;
        }else{
            aux.setSiguiente(ultimo);
        }
        n++;
    }
    // Encolar
    public Object decolar(){
        if (esVacia()){
            System.out.println("la cola no tiene elementos");
            return null;
        }else{
            Object itemAux = frente.getItem();
            frente = frente.getSiguiente();
            n--;
            if (esVacia()){
                ultimo=null;
            }
            return itemAux;
        }
    }
    public int longitud(){
        return n;
    }    
}
