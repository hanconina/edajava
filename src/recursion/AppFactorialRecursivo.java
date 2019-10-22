package recursion;
public class AppFactorialRecursivo {
    public static void main(String[] args) {
        System.out.println(factorial(100));
        System.out.println(factorialRecursivo(100));
    }
    public static double factorial(double n){
        if (n == 0){
            return 1;
        }else{
            double r = 1;
            for (double i=n;i>=1;i--){
                r = r*i;
            }
            return r;
        }
    }
    public static double factorialRecursivo(double n){
        if (n==0){
            return 1;
        }else{
            return n*factorialRecursivo(n-1);
        }
    }
    
}
