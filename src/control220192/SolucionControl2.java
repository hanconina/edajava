
package control220192;

import tda.pila.nodos.Pila;

public class SolucionControl2 {
    public static void main(String[] args) {
        int[] a = {1,4,2,3,5,7,8,1};
        System.out.println("Suma de Pares: "+sumaPares(a,a.length));
        Pila p = new Pila();
        p.apilar(2);
        p.apilar(3);
        p.apilar(15);
        p.apilar(8);
        p.apilar(25);
        System.out.println("Numero elementos de una Pila: "+longitud(p));
        p.apilar(2);
        p.apilar(3);
        p.apilar(15);
        p.apilar(8);
        p.apilar(25);
        System.out.println("Suma de multiplos de 5: "+sumaDivisiblesPorCinco(p));
    }
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
    public static int longitud(Pila p){
        if (p.esVacia()){
            return 0;
        }else{
            p.desapilar();
            return 1+longitud(p);
        }
    }
}
