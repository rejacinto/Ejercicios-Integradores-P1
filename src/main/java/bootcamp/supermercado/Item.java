package bootcamp.supermercado;

public class Item {

    private String codigo;
    private String nombre;
    private Double cantidadComprada;
    private Double precioUnitario;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getCantidadComprada() {
        return cantidadComprada;
    }

    public void setCantidadComprada(Double cantidadComprada) {
        this.cantidadComprada = cantidadComprada;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Item(String codigo, String nombre, Double cantidadComprada, Double precioUnitario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidadComprada = cantidadComprada;
        this.precioUnitario = precioUnitario;
    }
}
