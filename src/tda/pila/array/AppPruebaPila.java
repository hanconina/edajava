package tda.pila.array;

public class AppPruebaPila {
    public static void main(String[] args) {
        Pila p = new Pila(6);
        p.apilar(10);
        p.apilar(32);
        p.apilar(20);
        p.apilar(17);
        p.apilar(32);
        p.apilar(10);
        limpiarPila(p);
        intercambiarDatos(p,32, 100);
        limpiarPila(p);

    }
    public static void limpiarPila(Pila p){
        while (!p.esVacia()){
            System.out.println("Desapilar: "+p.desapilar());
        }
    }
    public static void intercambiarDatos(Pila p, int valorAntiguo, int valorNuevo){
        Pila pAux = new Pila(p.tamPila);
        while (!p.esVacia()){
            int x = p.desapilar();
            pAux.apilar(x);
        }
        while (!pAux.esVacia()){
            int y = pAux.desapilar();
            if (y==valorAntiguo){
                p.apilar(valorNuevo);
            }else{
                p.apilar(y);
            }
        }
    }
    
}
