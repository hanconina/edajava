package tda.grafo;

public class Lista {

    // Atributos
    private Object item;
    private Lista subLista;

    // Operaciones
    public Lista() {
        item = null;
        subLista = null;
    }

    public Lista(Object dato, Lista lista) {
        this.item = dato;
        this.subLista = lista;
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

    public boolean esVacia() {
        return this.item == null && this.subLista == null;
    }
    public int longitud(){
        if (esVacia()){
            return 0;
        }else{
            return 1+this.subLista.longitud();
        }
    }

    // Pre-condición: la posicion debe ser válida
    public void insertar(Object item, int posicion) {
        // CASO BASE
        if (posicion == 1) {
            // Hacer que la lista actual se convierta en sublista
            subLista = new Lista(this.item, subLista);
            this.item = item;
        } else {
            subLista.insertar(item, posicion - 1);
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

    public void eliminar(int posicion) {
        if (posicion == 1) {
            this.item = this.subLista.getItem();
            this.subLista = this.subLista.getSubLista();
        }else{
            this.subLista.eliminar(posicion-1);
        }
    }
    public void agregar(Object dato){
        
    }

}
