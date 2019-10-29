package tda.listarecursiva;

public class AppLista {
    public static void main(String[] args) {
        Lista l = new Lista();
        l.insertar(14, 1);
        l.insertar(16, 1);
        l.insertar(24, 2);
        l.insertar(89, 3);
        l.insertar(23, 1);
        l.eliminar(2);
        for (int i=1;i<=l.longitud();i++){
            System.out.print(l.iesimo(i)+"\t");
        }
        System.out.println();
        System.out.println("Buscar el 15: "+l.ubicacion(15));
        System.out.println("Buscar el 89: "+l.ubicacion(89));
    }
    
}
