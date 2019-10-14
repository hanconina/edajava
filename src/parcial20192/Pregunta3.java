package parcial20192;

import tda.listasimple.ListaSimple;

public class Pregunta3 {
    public static void main(String[] args) {
        ListaSimple l = new ListaSimple();
        l.insertar("ronald", 1);
        l.insertar("ana lucia", 2);
        l.insertar("juan carlos", 3);
        l.insertar("paul", 4);
        l.insertar("susana", 5);
        l.mostrarIntervalo(2, 4);
    }
    /*
        PARA SE IMPLEMENTADO EN TDA LISTA
      public void mostrarIntervalo(int ini, int fin){
       if (ini <=fin && ini>=1 && ini<=longitud() && fin>= 1 && fin <=longitud()){
           for (int i=ini;i<=fin;i++){
               System.out.println(iesimo(i));
           }
       }
      }
      */
    
}
