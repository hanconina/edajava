package tda.listasimple.appnotas;

import tda.listasimple.ListaSimple;

public class GestionarNotas {
    private ListaSimple registroNotas;

    public GestionarNotas() {
        this.registroNotas = new ListaSimple();
    }
    

    public GestionarNotas(ListaSimple registroNotas) {
        this.registroNotas = registroNotas;
    }

    public ListaSimple getRegistroNotas() {
        return registroNotas;
    }

    public void setRegistroNotas(ListaSimple registroNotas) {
        this.registroNotas = registroNotas;
    }
    public boolean esDuplicado(String codEs, String codCur){
        for (int i=1;i<=registroNotas.longitud();i++){
            LineaRegistroNota linea = (LineaRegistroNota)registroNotas.iesimo(i);
            if (linea.getCodEs().equals(codEs) 
                    && linea.getCodCur().equals(codCur)){
                return true;
            }
        }
        return false;
    }
    
    public void insertarLineaRegistroNota(){
        LineaRegistroNota nodo = new LineaRegistroNota();
        nodo.leer();
        if (!esDuplicado(nodo.getCodEs(), nodo.getCodCur())){
            this.registroNotas.insertar(nodo, registroNotas.longitud()+1);
        }else{
            System.out.println("El registro ya existe");
        }
    }
    public void hallarNotaPromedio(){
        int suma = 0;
        for (int i=1;i<=registroNotas.longitud();i++){
            LineaRegistroNota linea = (LineaRegistroNota)registroNotas.iesimo(i);
            suma = suma + linea.getNotaF();
        }        
        System.out.println("Promedio: "+(suma/registroNotas.longitud()));
    }
    public static void main(String[] args) {
        GestionarNotas gestor = new GestionarNotas();
        gestor.insertarLineaRegistroNota();
        gestor.insertarLineaRegistroNota();
        gestor.insertarLineaRegistroNota();
        gestor.insertarLineaRegistroNota();
        gestor.hallarNotaPromedio();
        
        
    }
}
