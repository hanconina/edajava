package tda.grafo.sinpesos;

public class Pila {
    private Object cima;
    private Pila subPila;

    public Object getCima() {
        return cima;
    }

    public void setCima(Object cima) {
        this.cima = cima;
    }

    public Pila getSubPila() {
        return subPila;
    }

    public void setSubPila(Pila subPila) {
        this.subPila = subPila;
    }
    
    
    public Pila(){
        this.cima = null;
        this.subPila = null;
    }
    public Pila(Object nuevoDato, Pila pila){
        this.cima = nuevoDato;
        this.subPila = pila;
    }
    public boolean esVacia(){
        return this.cima == null && this.subPila == null;
    }
    public void apilar(Object nuevoDato){
        this.subPila = new Pila(this.cima, this.subPila);
        this.cima = nuevoDato;
    }
    public Object desapilar(){
        if (esVacia()){
            return null;
        }else{
            Object temp = cima;
            this.cima = this.subPila.getCima();
            this.subPila = this.subPila.getSubPila();
            return temp;
        }
    } 
}
