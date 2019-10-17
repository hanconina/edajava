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
    
}
