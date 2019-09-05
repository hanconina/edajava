/*
 * Suponga que A y B son dos arreglos que contienen M y N números enteros
respectivamente ordenados en forma ascendente. Escriba un algoritmo que
permita mezclar A y B en un arreglo C con sus elementos ordenados en forma
ascendente
 */
package array.unidimensional;

public class Ejercicio6 {
    public static void main(String[] args) {
        int[] A = {2,5,6,8,9};
        int[] B = {4,5,7,22,67,89,100,167,328};
        mezcla(A,B);
    }
    public static void mezcla(int[] a, int[] b){
        int m = a.length;
        int n = b.length;
        int[] c = new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while (i<a.length && j<b.length){
            if (a[i]<b[j]){
                c[k]=a[i];
                i++;
            }else{
                c[k]=b[j];
                j++;
            }
            k++;
        }
        while (i<a.length){
            c[k] = a[i];
            k++;
            i++;
        }
        while (j<b.length){
            c[k]=b[j];
            k++;
            j++;
        }
        for (int s=0;s<c.length;s++){
            System.out.print(c[s]+"\t");
        }
    }
    
}
