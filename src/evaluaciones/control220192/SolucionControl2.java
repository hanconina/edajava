
package evaluaciones.control220192;

import tda.pila.nodos.Pila;

public class SolucionControl2 {
    public static void main(String[] args) {
        // Pregunta 1
        int[] a = {1,4,2,3,5,7,8,1};
        System.out.println("Suma de Pares: "+sumaPares(a,a.length));
        // Pregunta 2
        Pila p = new Pila();
        p.apilar(2);
        p.apilar(3);
        p.apilar(15);
        p.apilar(8);
        p.apilar(25);
        System.out.println("Numero elementos de una Pila: "+longitud(p));
        // Pregunta 3
        p.apilar(2);
        p.apilar(3);
        p.apilar(15);
        p.apilar(8);
        p.apilar(25);
        System.out.println("Suma de multiplos de 5: "+sumaDivisiblesPorCinco(p));
    }
    /*
    PREGUNTA1.- Suma de elementos de una pila que son divisibles por 5
    
    */
    public static int sumaDivisiblesPorCinco(Pila p){
        int suma=0;
        while (!p.esVacia()){
            int x = (int)p.desapilar();
            System.out.println(x);
            if (x%5==0){
                suma = suma+x;
            }
        }
        return suma;
    }
    /*
    * Pregunta 2
    * Sea A un arreglo unidimensional de n números enteros. 
    * Escriba una función recursiva para determinar 
    * la suma de los elementos pares del arreglo A.
    */
    public static int sumaPares(int[] a,int n){
        if (n > 0){
            if (a[n-1]%2==0)
                return a[n-1]+sumaPares(a,n-1);
            else{
                return sumaPares(a,n-1);
            }
        }else{
            return 0;
        }
    }
    /*
    * Pregunta 3
    * Escriba una función recursiva a nivel de usuario para determinar 
    * la cantidad de elemento de una pila. 
    * Considere que la pila tiene los métodos apilar, desapilar y esVacia.
    */
    public static int longitud(Pila p){
        if (p.esVacia()){
            return 0;
        }else{
            p.desapilar();
            return 1+longitud(p);
        }
    }
}
