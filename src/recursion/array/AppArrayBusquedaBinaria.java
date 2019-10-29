
package recursion.array;

public class AppArrayBusquedaBinaria {
    
    public static void main(String[] args) {
        int[] array = {22,14,2,4,56,7,2,34,12,4};
        ordenarInsercion(array, array.length);
        mostrarArreglo(array,array.length);
        System.out.println("Item buscado 16: "+buscarItem(16,array));
        mostrarArreglo(array,array.length);
        
    }
    public static void mostrarArreglo(int[] array, int n){
        for (int i=0;i<n;i++){
            System.out.print(array[i]+ "\t");
        }
        System.out.println();
    }
    public static int buscarItem(int item, int[] array){
        return busquedaBinaria(item,array,0,array.length-1);
    }
    
    // Arreglo Ordenado
    public static int busquedaBinaria(int item, int[] array, int posIni, int posFin){
        if (posIni <= posFin){ // Existen elementos que examinar
            int mitad = (posIni+posFin)/2; // Ubicación del elemento central
            if (array[mitad]==item){ // CASO BASE
                return mitad; // El elemento buscado esta en la mitad
            }else{ // CASO RECURRENTE
                if (array[mitad]>item){ // el elemento podría estar en la izquierda
                    return busquedaBinaria(item, array, posIni, mitad-1);                    
                }else{ // El elemento podría estar en la derecha
                    return busquedaBinaria(item, array, mitad+1, posFin);
                }
            }            
        }else{
            return -1;
        }
    }
    // Ordenar un arreglo
    // {22,14,2,4,56,7,2,34,12,4};
    public static void ordenarInsercion(int[] array, int n){
        int clave = 0;
        for (int j=1;j<n;j++){
            clave = array[j];
            // Insertar a[j] en la secuencia ya ordenada a[0..j-1]
            int i=j-1;
            while (i>=0 && array[i]>clave){
                array[i+1] = array[i];
                i=i-1;
            }
            array[i+1]=clave;
        }        
    }
    
}

