package tda.pilarecursiva;

public class AppPila {
    public static void main(String[] args) {
        Pila p = new Pila();
        p.apilar(12);
        p.apilar(13);
        p.apilar(17);
        p.apilar(18);
        p.apilar(22);
        System.out.println("Cima: "+p.getCima());
        System.out.println(p.desapilar());
        System.out.println(p.desapilar());
        System.out.println(p.desapilar());
        System.out.println(p.desapilar());
        System.out.println(p.desapilar());
        System.out.println("Cima: "+p.getCima());
        System.out.println("Es Vacia: "+p.esVacia());
    }
    
}
