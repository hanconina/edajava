package tda.pila.nodos;

import tda.cola.*;

public class AppTestPila {
    public static void main(String[] args) {
        Pila pila = new Pila();
        pila.apilar(12);
        pila.apilar(11);
        pila.apilar(15);
        pila.apilar(21);
        System.out.println(pila.desapilar());
        System.out.println(pila.desapilar());
        System.out.println(pila.desapilar());
        System.out.println(pila.desapilar());
        System.out.println(pila.longitud());
    }
    // 5.	Escriba un algoritmo que permita 
    // insertar un elemento X al fondo de la pila P.
    public static void ponerAlFondo(Object x, Pila p){
        Pila pAux = new Pila();
        // Vaciar la pila
        while (!p.esVacia()){
           Object itemAux = p.desapilar();
           pAux.apilar(itemAux);
        }
        // Apilar el valor de X - elemento que deberia colocar al fondo de 
        // pila
        p.apilar(x);
        while (!pAux.esVacia()){
           Object itemAux = pAux.desapilar();
           p.apilar(itemAux);
        }        
    }
    
}
