package recursion.array;

public class AppQuickSort {

    public static void main(String[] args) {
        int[] array = {22, 14, 2, 4, 56, 7, 2, 34, 12, 4};
        quickSort(array,0,array.length-1);
        mostrarArreglo(array,array.length);

    }

    public static void mostrarArreglo(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    public static void quickSort(int[] a, int primero, int ultimo) {
        if (ultimo > primero) {
            int q = particionar(a, primero, ultimo);
            quickSort(a, primero, q - 1);
            quickSort(a, q + 1, ultimo);
        }
    }

    public static void intercambiar(int[] a, int posIni, int posFin) {
        int temp = a[posIni];
        a[posIni] = a[posFin];
        a[posFin] = temp;
    }
    public static int particiona(int[] a, int primero, int ultimo) {
        int pivot = a[primero]; // hallamos el pivot
        int pos = primero; // Pos, es la posicion del ultimo menor
        for (int i = primero+1;i<=ultimo;i++){
            if (a[i]<pivot){
                // Intercambiar entre este menor y el primer mayor
                intercambiar(a,i, pos+1);
                pos++;
            }
        }
        intercambiar(a, primero, pos);
        return pos;
    }

    // {22, 14, 2, 4, 4, 7, 2, 34, 12, 56}
    public static int particionar(int[] a, int primero, int ultimo) {
        int q = encontrarPivot(a, primero, ultimo, 1);
        int pivot = a[q];
        int i = primero;
        int j = ultimo;
        while (i < j) {
            while (a[i] <= pivot) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }
            // i=7
            if (i < j) {
                intercambiar(a, i, j);
                i++;
                j--;
            }
        }
        intercambiar(a, q, j);
        return j;
    }

    public static int encontrarPivot(int[] array, int primero, int ultimo, int opcion) {
        if (opcion == 1) {
            return primero;
        } else {
            if (opcion == 2) {
                return (primero + ultimo) / 2;
            } else {
                if (opcion == 3) {
                    return primero + (int) Math.random() * (primero + ultimo);
                } else {
                    if (opcion == 4) {
                        //return mediana();
                    }
                }
            }
        }
        return 0;
    }

}
