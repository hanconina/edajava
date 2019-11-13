package tda.arbolbb;

public class ArbolBB {

    // Atributos
    private Object raiz;
    private ArbolBB subArbolIzq;
    private ArbolBB subArbolDer;

    public ArbolBB(Object raiz, ArbolBB subArbolIzq, ArbolBB subArbolDer) {
        this.raiz = raiz;
        this.subArbolIzq = subArbolIzq;
        this.subArbolDer = subArbolDer;
    }

    public ArbolBB() {
        this.raiz = null;
        this.subArbolIzq = null;
        this.subArbolDer = null;
    }

    public Object getRaiz() {
        return raiz;
    }

    public void setRaiz(Object raiz) {
        this.raiz = raiz;
    }

    public ArbolBB getSubArbolIzq() {
        return subArbolIzq;
    }

    public void setSubArbolIzq(ArbolBB subArbolIzq) {
        this.subArbolIzq = subArbolIzq;
    }

    public ArbolBB getSubArbolDer() {
        return subArbolDer;
    }

    public void setSubArbolDer(ArbolBB subArbolDer) {
        this.subArbolDer = subArbolDer;
    }

    public boolean estaVacio() {
        return raiz == null;
    }

    public void agregar(Object elemento) {
        if (estaVacio()) {
            raiz = elemento;
        } else { // El arbol tiene elementos
            // Verificar si el valor esta a la izaquierdo
            if (elemento.toString().compareTo(raiz.toString()) < 0) {
                // El elemento debe agregarse en el arbol izquierdo
                if (subArbolIzq == null) {
                    subArbolIzq = new ArbolBB(elemento, null, null);
                } else {
                    subArbolIzq.agregar(elemento);
                }
            } else { // El elemento debe agregarse en el subarbol derecho
                // Verificar si no hay arbol derecho
                if (subArbolDer == null) {
                    subArbolDer = new ArbolBB(elemento, null, null);
                } else {
                    subArbolDer.agregar(elemento);
                }
            }
        }
    }

    public void eliminar(Object elemento) {
        if (estaVacio()) {
            System.out.println("No existe el elemento en el arbol");
        } else {
            // Verificar si el elemento a eliminfar es la raiz
            if (elemento.toString().equals(raiz.toString())) {
                // Si la raiz es una hoja o no tiene subarbol izq. y der
                if (subArbolIzq == null && subArbolDer == null) {
                    raiz = null;
                } else { // Tiene subarbol izq, der o ambos
                    // Verificar si solo tiene subarbol izq
                    if (subArbolDer == null) {
                        raiz = subArbolIzq.getRaiz();
                        subArbolDer = subArbolIzq.getSubArbolDer();
                        subArbolIzq = subArbolIzq.getSubArbolIzq();
                    } else { //Verificar si solo tiene subarbol derecho
                        if (subArbolIzq == null) {
                            raiz = subArbolDer.getRaiz();
                            subArbolIzq = subArbolDer.getSubArbolIzq();
                            subArbolDer = subArbolDer.getSubArbolDer();
                        } else { // Tiene ambos hijos
                            raiz = subArbolDer.minimo();
                            subArbolDer.eliminar(subArbolDer.minimo());
                        }
                    }
                }
            } else { // Se desea eliminar dentro de los subarboles
                // Verificar si queremos eliminar en el subarbolizq
                if (elemento.toString().compareTo(raiz.toString()) < 0) {
                    if (subArbolIzq != null) {
                        subArbolIzq.eliminar(elemento);
                    }

                } else { // Eliminar en el subarbol derecho
                    if (subArbolDer != null) {
                        subArbolDer.eliminar(elemento);
                    }
                }
            }
            // Verificar si los hijos son hojas vacias 
            if ((subArbolIzq != null) && subArbolIzq.estaVacio()) {
                subArbolIzq = null;
            }
            if ((subArbolDer != null) && subArbolDer.estaVacio()) {
                subArbolDer = null;
            }
        }
    }

    public Object minimo() {
        if (estaVacio()) {
            return null;
        } else {
            if (subArbolIzq == null) {
                return raiz;
            } else {
                return this.subArbolIzq.minimo();
            }
        }
    }

    public void preOrden() {
        if (!estaVacio()) {
            // Procesar la raiz
            System.out.print(raiz.toString() + "\t");
            // Procesa el subarbol izquierdo
            if (subArbolIzq != null) {
                subArbolIzq.preOrden();
            }
            // Procesa el subarbol derecho
            if (subArbolDer != null) {
                subArbolDer.preOrden();
            }
        }
    }

}
