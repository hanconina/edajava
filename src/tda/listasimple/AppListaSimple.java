
package tda.listasimple;

/**
 *
 * @author user
 */
public class AppListaSimple {

    public static void main(String[] args) {
        ListaSimple OLista = new ListaSimple();

        OLista.insertar(23, 1);
        OLista.insertar(87, 1);

        OLista.insertar(98, 3);
        OLista.insertar(13, 4);

        System.out.println(OLista.longitud());

        for (int k = 1; k <= OLista.longitud(); k++) {
            System.out.println(OLista.iesimo(k));
        }

        OLista.eliminar(4);

        for (int k = 1; k <= OLista.longitud(); k++) {
            System.out.println(OLista.iesimo(k));
        }

        System.out.println(OLista.ubicacion(23));
        
        ListaSimple l = new ListaSimple();
        l.insertar("a", 1);
        l.insertar("b", 2);
        l.insertar("c", 3);
        l.insertar("d", 4);
        l.insertar("e", 5);
        l.insertar("f", 6);
        l.insertar("g", 7);
        l.insertar("h", 8);
        mostrarLista(l);
        dividirLista(l,"f");

    }
    
    public static void dividirLista(ListaSimple l, Object elemento){
        int ubicacion = l.ubicacion(elemento);
        ListaSimple l1 = new ListaSimple();
        ListaSimple l2 = new ListaSimple();
        for (int i=1;i<ubicacion;i++){
            l1.insertar(l.iesimo(i), i);
        }
        int j=1;
        for (int i=ubicacion;i<=l.longitud();i++){
            l2.insertar(l.iesimo(i), j);
            j++;
        }
        System.out.println("Lista 1: ");
        mostrarLista(l1);
        System.out.println("Lista 2: ");
        mostrarLista(l2);
    }
    public static void mostrarLista(ListaSimple l){
        for (int i=1;i<=l.longitud();i++){
            System.out.println("Item("+i+"):"+l.iesimo(i));
        }
    }

}
