import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Factura {
    private int id;
    private Date fecha;
    private double montoTotal;
    private List<Producto> productos;

    // Constructor privado para forzar el uso del Builder
    private Factura(Builder builder) {
        this.id = builder.id;
        this.fecha = new Date(); // Se genera la fecha automáticamente
        this.productos = builder.productos;
        this.montoTotal = calcularMontoTotal(); // Calcular el monto total
    }

    // Método para calcular el monto total de la factura
    private double calcularMontoTotal() {
        double total = 0.0;
        for (Producto producto : productos) {
            total += producto.getCantidad() * producto.getPrecio();
        }
        return total;
    }

    // Getters
    public int getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", montoTotal=" + montoTotal +
                ", productos=" + productos +
                '}';
    }

    // Clase estática interna Builder
    public static class Builder {
        private int id;
        private List<Producto> productos = new ArrayList<>();
        
        // Constructor del Builder
        public Builder(int id) {
            this.id = id;
        }

        // Método para agregar productos
        public Builder agregarProducto(Producto producto) {
            productos.add(producto);
            return this;
        }

        // Método para construir la factura
        public Factura build() {
            return new Factura(this);
        }
    }

	public void setFecha(Date date) {
		// TODO Auto-generated method stub
		
	}

	public void setMontoTotal(double montoTotal2) {
		// TODO Auto-generated method stub
		
	}
}