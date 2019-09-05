package array.bidimensional;

public class AppMatrices {

    static java.util.Scanner entrada = new java.util.Scanner(System.in);
    //static int[][] matriz = new int[3][2];

    public static void leerMatriz(int[][] matriz) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.print("Item[" + fila + "][" + col + "]:");
                matriz[fila][col] = entrada.nextInt();
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.print(matriz[fila][col] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] matrizAleatoria(int fila, int col) {
        int[][] matriz = new int[fila][col];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                matriz[f][c] = (int) (Math.random() * 100);
            }
        }
        return matriz;
    }

    public static int sumaElementos(int[][] matriz) {
        int total = 0;
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                total += matriz[f][c];
            }
        }
        return total;
    }

    public static void sumarFilas(int[][] matriz) {
        for (int f = 0; f < matriz.length; f++) {
            int total = 0;
            for (int c = 0; c < matriz[f].length; c++) {
                total += matriz[f][c];
            }
            System.out.println("Fila[" + f + "]:" + total);
        }
    }

    public static int sumarPorFila(int[][] matriz, int fila) {
        int total = 0;
        for (int c = 0; c < matriz[fila].length; c++) {
            total += matriz[fila][c];
        }
        return total;
    }

    public static void main(String[] args) {
        int[][] matriz = new int[3][2];
        //leerMatriz(matriz);
        // mostrarMatriz(matriz);
        int[][] matriz2 = matrizAleatoria(2, 2);
        mostrarMatriz(matriz2);
        System.out.println("Total: " + sumaElementos(matriz2));
        sumarFilas(matriz2);
        // Matriz irregular
        int[][] matriz3 = {
            {1, 2, 3},
            {2, 3},
            {4},};
        mostrarMatriz(matriz3);
        System.out.println("Total: " + sumaElementos(matriz3));
        sumarFilas(matriz3);
        System.out.println("Total de Fila: " + sumarPorFila(matriz3,2));
    }

}
