package tda.grafo.conpesos;

public class Vertice {

    private String nombre;

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
