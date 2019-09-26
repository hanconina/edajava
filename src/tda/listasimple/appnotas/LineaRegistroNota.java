package tda.listasimple.appnotas;

public class LineaRegistroNota {
    private String codEs;
    private String codCur;
    private int notaF;

    public LineaRegistroNota() {
        this.codEs = "";
        this.codCur = "";
        this.notaF = 0;
    }
    

    public LineaRegistroNota(String codEs, String codCur, int notaF) {
        this.codEs = codEs;
        this.codCur = codCur;
        this.notaF = notaF;
    }

    public String getCodEs() {
        return codEs;
    }

    public void setCodEs(String codEs) {
        this.codEs = codEs;
    }

    public String getCodCur() {
        return codCur;
    }

    public void setCodCur(String codCur) {
        this.codCur = codCur;
    }

    public int getNotaF() {
        return notaF;
    }

    public void setNotaF(int notaF) {
        this.notaF = notaF;
    }
    public void leer(){
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        System.out.println("Ingresar Informacion de registro de nota");
        System.out.print("Cod Es: ");codEs = entrada.nextLine();
        System.out.print("Cod Cur: ");codCur = entrada.nextLine();
        System.out.print("NotaF: ");notaF = entrada.nextInt();
    }

    @Override
    public String toString() {
        return codEs;
    }
    
    
}
