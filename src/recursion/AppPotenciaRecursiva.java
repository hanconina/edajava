package recursion;

public class AppPotenciaRecursiva {

    public static void main(String[] args) {
        System.out.println(Math.pow(5, 6));
        System.out.println(potencia(5, 6));
        System.out.println(potenciaRecursiva(5, 6));
    }

    public static double potencia(double base, double exponente) {
        if (exponente == 0) {
            if (base == 0) {
                return Double.NaN;
            } else {
                return 1;
            }
        } else {
            double r = 1;
            for (int i = 1; i <= exponente; i++) {
                r = r * base;
            }
            return r;
        }
    }

    public static double potenciaRecursiva(double base, double exponente) {
        if (exponente == 0) {
            if (base == 0) {
                return Double.NaN;
            } else {
                return 1;
            }
        } else {
            return base*potenciaRecursiva(base, exponente-1);
        }
    }
}
