package tda.pilarecursiva;

import java.util.StringTokenizer;

public class AppPila {

    public static void main(String[] args) {
        Pila p = new Pila();
        p.apilar(12);
        p.apilar(13);
        p.apilar(17);
        p.apilar(18);
        p.apilar(22);
        System.out.println("Cima: " + p.getCima());
        System.out.println(p.desapilar());
        System.out.println(p.desapilar());
        System.out.println(p.desapilar());
        System.out.println(p.desapilar());
        System.out.println(p.desapilar());
        System.out.println("Cima: " + p.getCima());
        System.out.println("Es Vacia: " + p.esVacia());
        String expresion = "()()((((())))))";
//        System.out.println(expresion.substring(0,1));
        evaluarParentesis(expresion);

    }

    public static void evaluarParentesis(String expresion) {
        boolean flag = true;
        Pila p = new Pila();
        for (int i = 1; i <= expresion.length(); i++) {
            String elemento = expresion.substring(i-1, i);
            System.out.println(elemento);
            if (elemento.equals("(")) {
                p.apilar("(");
            } else {
                if (elemento.equals(")")) {
                    String w = (String) p.desapilar();
                    if (w==null){
                        flag=false;
                    }
                    
                }
            }
        }
        if (p.esVacia() && flag) {
            System.out.println("La expresión es valida");
        } else {
            System.out.println("La expresión no es valida");
        }
    }

}
