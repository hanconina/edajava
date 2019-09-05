/*
* Sean A y B dos arreglos de N números. Se dice que:
• A = B si ∀𝑖 = 1̅̅̅,̅𝑛̅ el i-ésimo elemento de A es igual al i-ésimo elemento de B.
• A < B si ∀𝑖 = 1̅̅̅,̅𝑛̅ el i-ésimo elemento de A es menor al i-ésimo elemento de B.
• A > B si ∀𝑖 = 1̅̅̅,̅𝑛̅ el i-ésimo elemento de A es mayor al i-ésimo elemento de B.
Escriba un algoritmo que retorne:
• el valor 1 si A = B
• el valor 2 si A < B
• el valor 3 si A > B
• el valor 0 si no se cumple ninguna de las condiciones anteriores.
*
*
*/

package array.unidimensional;

public class Ejercicio5 {

    public static void main(String[] args) {
        int A[] = {2, 4, 6, 8, 10};
        int B[] = {1, 2, 3, 4, 5};
        System.out.println("Resultao de compara A y B: "+comparar(B,A));
    }

    public static int comparar(int[] a, int[] b) {
        if (a.length == b.length) {
            if (sonIguales(a,b)){
                return 1;
            }else{
                if (esMenor(a,b)){
                    return 2;
                }else{
                    if (esMayor(a,b)){
                        return 3;
                    }else{
                        return 0;
                    }
                }
            }
        }else{
            return 0;
        }
    }
    private static boolean sonIguales(int[] a, int[] b){
        if (a.length==b.length){
            for (int i=0;i<a.length;i++){
                if (a[i]!=b[i]){
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
    }
    private static boolean esMenor(int[] a, int[] b){
        if (a.length==b.length){
            for (int i=0;i<a.length;i++){
                if (!(a[i]<b[i])){
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
    }
    private static boolean esMayor(int[] a, int[] b){
        if (a.length==b.length){
            for (int i=0;i<a.length;i++){
                if (!(a[i]>b[i])){
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
    }
}
