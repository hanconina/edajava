package tda.listasimple.applibro;

import tda.listasimple.ListaSimple;

public class PruebaLista {
    public static void main(String[] args) {
        String a="ad juan";
        

        ListaSimple lista = new ListaSimple();
        lista.insertar("a", 1);
        lista.insertar("b", 2);
        lista.insertar("c", 3);
        lista.insertar("d", 4);
        lista.insertar("e", 5);
        lista.insertar("e", 6);
        
        for (int i=1;i<=lista.longitud();i++){
            System.out.print(lista.iesimo(i)+"\t");
        }
        System.out.println();
        lista.limpiar();
        System.out.println("Longitud: "+lista.longitud());
    }    
}
