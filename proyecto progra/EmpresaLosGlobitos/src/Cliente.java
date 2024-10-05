import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String direccion;
    private List<OrdenDeCompra> ordenesDeCompra;

    public Cliente(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ordenesDeCompra = new ArrayList<>();
    }

    public void realizaPedido(List<Producto> productos) {
       
        OrdenDeCompra nuevaOrden = new OrdenDeCompra();
        nuevaOrden.setEstado("pendiente");
        nuevaOrden.setFecha(new java.util.Date()); 

       
        for (Producto producto : productos) {
            nuevaOrden.agregarProducto(producto);
        }

        
        Factura factura = nuevaOrden.generarFactura();
        nuevaOrden.setFactura(factura);

        ordenesDeCompra.add(nuevaOrden);

        System.out.println("Pedido realizado con éxito para el cliente: " + nombre);
    }

    public void cancelaPedido(OrdenDeCompra orden) {
        if (orden != null && ordenesDeCompra.contains(orden)) {
            orden.setEstado("cancelado");
            System.out.println("Pedido cancelado para el cliente: " + nombre);
        } else {
            System.out.println("Orden no encontrada o ya cancelada.");
        }
    }

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<OrdenDeCompra> getOrdenesDeCompra() {
        return ordenesDeCompra;
    }

    public void setOrdenesDeCompra(List<OrdenDeCompra> ordenesDeCompra) {
        this.ordenesDeCompra = ordenesDeCompra;
    }
}