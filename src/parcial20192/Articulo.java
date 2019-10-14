package parcial20192;

public class Articulo {
    private String codigo;
    private int cantidadVendida;
    private double precioUnitario;

    public Articulo(String codigo, int cantidadVendida, double precioUnitario) {
        this.codigo = codigo;
        this.cantidadVendida = cantidadVendida;
        this.precioUnitario = precioUnitario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    public double recuperarVenta(){
        return this.cantidadVendida*this.precioUnitario;
    }


    @Override
    public String toString() {
        return codigo;
    }
    
}
