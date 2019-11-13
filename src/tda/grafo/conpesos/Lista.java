package tda.grafo.conpesos;

public class Lista {

    // Atributos
    private Object item;
    private Lista subLista;
    private int peso;

    // Operaciones
    public Lista() {
        item = null;
        subLista = null;
        peso = 0;
    }

    public Lista(Object dato, Lista lista, int peso) {
        this.item = dato;
        this.subLista = lista;
        this.peso = peso;
    }

    public Object getItem() {
        return item;
    }

    public void setItem(Object dato) {
        this.item = dato;
    }

    public Lista getSubLista() {
        return subLista;
    }

    public void setSubLista(Lista subLista) {
        this.subLista = subLista;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean esVacia() {
        return this.item == null && this.subLista == null;
    }

    public int longitud() {
        if (esVacia()) {
            return 0;
        } else {
            return 1 + this.subLista.longitud();
        }
    }

    // Pre-condición: la posicion debe ser válida
    public void insertar(Object item, int posicion, int peso) {
        // CASO BASE
        if (posicion == 1) {
            // Hacer que la lista actual se convierta en sublista
            subLista = new Lista(this.item, subLista, this.peso);
            this.item = item;
            this.peso = peso;
            
        } else {
            subLista.insertar(item, posicion - 1, peso);
        }
    }

    public int ubicacion(Object dato) {
        // CASO BASE
        if (esVacia()) {
            return 0;
        } else {
            if (this.item.equals(dato)) {
                return 1;
            } else {
                if (subLista.ubicacion(dato) == 0) {
                    return 0;
                } else {
                    return 1 + this.subLista.ubicacion(dato);
                }
            }
        }
    }

    public Object iesimo(int posicion) {
        if (posicion == 1) {
            return this.item;
        } else {
            return this.subLista.iesimo(posicion - 1);
        }
    }

    public Object iesimoPeso(int posicion) {
        if (posicion == 1) {
            return this.peso;
        } else {
            return this.subLista.iesimoPeso(posicion - 1);
        }
    }

    public void eliminar(int posicion) {
        if (posicion == 1) {
            this.item = this.subLista.getItem();
            this.subLista = this.subLista.getSubLista();
        } else {
            this.subLista.eliminar(posicion - 1);
        }
    }

    public void agregar(Object dato, int peso) {
        this.insertar(item, longitud() + 1, peso);
    }

}
