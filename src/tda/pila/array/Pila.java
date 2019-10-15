package tda.pila.array;

public class Pila {

    public int tamPila = 10;
    private int[] arreglo;
    private int cima;

    public Pila() {
        arreglo = new int[tamPila];
        cima = -1;
    }

    public Pila(int n) {
        arreglo = new int[n];
        cima = -1;
        tamPila = n;
    }

    public boolean esVacia() {
        boolean estado = false;
        if (cima == -1) {
            estado = true;
        }
        return estado;
    }

    public boolean estaLlena() {
        boolean estado = false;
        if (cima + 1 == tamPila) {
            estado = true;
        }
        return estado;
    }

    public void apilar(int item) {
        if (!estaLlena()) {
            cima++;
            arreglo[cima] = item;
        }
    }

    public int desapilar() {
        int itemSacado = arreglo[cima];
        cima--;
        return itemSacado;
    }
    public int cima(){
        return arreglo[cima];
    }
}
