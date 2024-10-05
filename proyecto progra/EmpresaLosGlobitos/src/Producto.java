


public class Producto {
    private String nombre;
    private String descripcion;
    private String tipo;
    private int cantidad;
    private double precio;
    private EstadoProducto estado;

    
    public Producto(String nombre, String descripcion, String tipo, int cantidad, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    public Producto(EstadoProducto estadoInicial) {
        this.estado = estadoInicial;
    }

    public void setEstado(EstadoProducto nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public void manejarEstado() {
        estado.manejar(this);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", tipo='" + tipo + '\'' +
                ", cantidad=" + cantidad +
                ", precio=" + precio +
                '}';
    }
}