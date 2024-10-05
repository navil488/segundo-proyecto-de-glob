import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdenDeCompra {
	private static int idCounter = 1;
    private int id;
    private Date fecha;
    private String estado;
    private List<Producto> productos;
    private Factura factura; 

    public OrdenDeCompra() {
    	this.id = ++idCounter;  
        this.fecha = new Date(); 
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        if (producto != null) {
            productos.add(producto);
            System.out.println("Producto agregado: " + producto.getNombre());
        } else {
            System.out.println("El producto no puede ser nulo.");
        }
    }

    public void quitarProducto(Producto producto) {
        if (productos.contains(producto)) {
            productos.remove(producto);
            System.out.println("Producto quitado: " + producto.getNombre());
        } else {
            System.out.println("El producto no se encuentra en la orden.");
        }
    }

    public Factura generarFactura() {
        Factura nuevaFactura = nuevaFactura();
        nuevaFactura.setFecha(new Date()); 
        double montoTotal = 0;

     
        for (Producto producto : productos) {
            montoTotal += producto.getCantidad() * producto.getPrecio();
        }

        nuevaFactura.setMontoTotal(montoTotal);
        System.out.println("Factura generada con un monto total de: " + montoTotal);
        return nuevaFactura;
    }

   
    private Factura nuevaFactura() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }
}