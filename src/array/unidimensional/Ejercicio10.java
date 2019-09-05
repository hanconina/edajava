/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.unidimensional;

/**
 *
 * @author user
 */
public class Ejercicio10 {

    static int[] a = {2, 3, 4, 7, 8, 9,12};
    static int[] b = new int[a.length];

    public static void main(String[] args) {
        //invertirA();
        invertirB();
    }

    public static void invertirA() {
        int j = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            b[j] = a[i];
            j++;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(b[i] + "\t");
        }
        System.out.println();
    }

    public static void invertirB() {
        for (int i = 0; i < a.length/2; i++) {
            int temp = a[i];
            a[i] = a[(a.length - 1) - i];
            a[(a.length - 1) - i] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
    }
}
