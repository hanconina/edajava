package tda.cola;

public class AppTestCola {
    public static void main(String[] args) {
        Cola cola = new Cola();
        cola.encolar(12);
        cola.encolar(11);
        cola.encolar(15);
        cola.encolar(21);
        System.out.println(cola.longitud());
        System.out.println(cola.decolar());
        System.out.println(cola.decolar());
        System.out.println(cola.decolar());
        System.out.println(cola.decolar());
        System.out.println(cola.longitud());
    }
    
}
