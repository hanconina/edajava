package evaluaciones.parcial_2019_2;

import evaluaciones.parcial_2019_2.Articulo;
import tda.listasimple.ListaSimple;

public class Pregunta2 {

    public static void main(String[] args) {
        ListaSimple l = new ListaSimple();
        Articulo a1 = new Articulo("a1",200,30);
        l.insertar(a1, 1);
        Articulo a2 = new Articulo("a2",10,3000);
        l.insertar(a2, 2);
        Articulo a3 = new Articulo("a3",300,30);
        l.insertar(a3, 3);
        Articulo a4 = new Articulo("a4",100,30);
        l.insertar(a4, 4);
        Articulo a5 = new Articulo("a5",13,30);
        l.insertar(a5, 5);
        Articulo a6 = new Articulo("a6",250,30);
        l.insertar(a6, 6);
        
        System.out.println("Mas Vendido: "+mayorVenta(l));

    }

    public static String mayorVenta(ListaSimple lista) {
        double mayor = 0;
        String codArticulo = "";
        for (int i = 1; i <= lista.longitud(); i++) {
            Articulo a = (Articulo) lista.iesimo(i);
            if (mayor < a.recuperarVenta()) {
                mayor = a.recuperarVenta();
                codArticulo = a.getCodigo();
            }
        }
        return codArticulo;
    }

}
