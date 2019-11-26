package tda.grafo.sinpesos;

public class Vertice {

    private String nombre;
    private boolean visitado;

    public Vertice() {
    }

    public Vertice(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else {
            return nombre.equals(obj.toString());
        }
    }

    @Override
    public String toString() {
        return nombre;
    }

}
