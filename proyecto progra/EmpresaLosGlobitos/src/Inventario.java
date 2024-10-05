import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private int cantidadDisponible;  
    private int cantidadEnProduccion; 

    // Instancia estática única del Inventario (Singleton)
    private static Inventario instancia;
    private List<Producto> productos = new ArrayList<>();

    // Constructor privado para evitar la creación de nuevas instancias
    private Inventario() {
        this.cantidadDisponible = 0;
        this.cantidadEnProduccion = 0;
    }

    // Método estático que devuelve la única instancia de Inventario
    public static Inventario getInstancia() {
        if (instancia == null) {
            instancia = new Inventario(); // Crear la instancia si no existe
        }
        return instancia;
    }

    // Método para actualizar inventarios (producción y ventas)
    public void actualizarInventarios(int productosProducidos, int productosVendidos) {
        if (productosProducidos > 0) {
            this.cantidadDisponible += productosProducidos;
            this.cantidadEnProduccion -= productosProducidos;
        }

        if (productosVendidos > 0) {
            if (productosVendidos <= this.cantidadDisponible) {
                this.cantidadDisponible -= productosVendidos;
            } else {
                System.out.println("No hay suficiente stock para cubrir la venta.");
            }
        }

        System.out.println("Inventario actualizado:");
        System.out.println("Cantidad disponible: " + this.cantidadDisponible);
        System.out.println("Cantidad en producción: " + this.cantidadEnProduccion);
    }

    // Getters y setters
    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public int getCantidadEnProduccion() {
        return cantidadEnProduccion;
    }

    public void setCantidadEnProduccion(int cantidadEnProduccion) {
        this.cantidadEnProduccion = cantidadEnProduccion;
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "cantidadDisponible=" + cantidadDisponible +
                ", cantidadEnProduccion=" + cantidadEnProduccion +
                '}';
    }
}
    
    
    
    
    
    
