package evaluaciones.practicacalificada1_2019_2;

public class SolucionPC1 {

    public static void main(String[] args) {
        // Prueba de la solución de la pregunta 1
        System.out.println("Pregunta 1: ");
        int[] a = {12, 3, 1, 2, 3, 5, 7, 8, 9, 1};
        System.out.println("Suma de Impares: " + sumaItemsImpares(a));
        // Prueba de la solución de la pregunta 2
        System.out.println("Pregunta 2: ");
        System.out.println("Arreglo Aleatorio");
        int[] a1 = arregloAleatorio(10);
        mostrarArreglo(a1);
        System.out.println("Arreglo Resultante");
        int[] a2 = calculoDigitos(a1);
        mostrarArreglo(a2);
        // Prueba de la solución de la pregunta 3
        System.out.println("Pregunta 3: ");
        int[][] matriz = {{1, 2, 3,5},{4, 2, 1,7}};
        System.out.println("Matriz Inicial");
        mostrarMatriz(matriz);
        System.out.println("Matriz Resultante");
        int[][] transpuesta = transponer(matriz);
        mostrarMatriz(transpuesta);

    }

    /*
    * Solución de la pregunta 1
     */
    public static int sumaItemsImpares(int[] a) {
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                suma = suma + a[i];
            }
        }
        return suma;
    }

    /*
    * Solución a la pregunta 2
     */
    public static int[] calculoDigitos(int[] a) {
        int[] d = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            d[i] = numDigitos(a[i]);
        }
        return d;
    }

    public static int numDigitos(int n) {
        int i = 0;
        while (n > 0) {
            i++;
            n = n / 10;
        }
        return i;
    }
    /*
    * Generar Matriz aleatoria
    */
    public static int[] arregloAleatorio(int n){
        int[] temp = new int[n];
        for (int i=0;i<temp.length;i++){
            temp[i] = (int) (Math.random()*1000);
        }
        return temp;
    }

    /*
    * Solución Pregunta 3
     */
    public static int[][] transponer(int[][] a) {
        int columnas = a[0].length;
        int filas = a.length;
        int[][] t = new int[columnas][filas];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                t[j][i] = a[i][j];
            }
        }
        return t;
    }

    /*
    * Mostrar un arreglo
     */
    public static void mostrarArreglo(int[] a) {
        for (int x : a) {
            System.out.print(x + "\t");
        }
        System.out.println();
    }

    /*
    * Mostrar una Matriz
     */
    public static void mostrarMatriz(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
