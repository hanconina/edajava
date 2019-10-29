package recursion.ejerciciosbasicos;

public class CoeficienteBinomial_e3 {

    public static void main(String[] args) {
        System.out.println("Coefiente Binomial: "+cB(5,2));
    }

    // TRIANGULO DE PASCAL - Coeficiente Binomial
    // Precondición: n >= m
    public static int cB(int n, int m) {
        // CASO BASE
        if (m == 0) {
            return 1;
        } else {
            if (n == m) { // CASO BASE
                return 1;
            } else { // CASO RECURRENTE
                return cB(n - 1, m - 1) + cB(n - 1, m);
            }
        }
    }
}
