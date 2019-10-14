package parcial20192;


public class Pregunta1 {
    public static int[] subArreglo(int[] a, int ini, int n){
        if (ini >=0 && ini < a.length && n < a.length && n>0){
            int[] s = new int[n];
            int k=0;
            for (int i=ini;i<ini+s.length;i++){
                s[k]=a[i];
                k++;
            }
            return s;
        }
        return null;
    }
    public static void main(String[] args) {
        int[] a = {12, 15, 17, 23, 2, 7, 45, 32};
        int[] s = subArreglo(a, 0, 1);
        for (int i=0; i<s.length;i++){
            System.out.print(s[i] + "\t");
        }
    }
    
    
}
