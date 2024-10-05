import java.util.Date;

public class Importacion {

    private String paisDeOrigen;   
    private Date fechaDeLlegada;   
    private int cantidad;          

    
    public Importacion(String paisDeOrigen, Date fechaDeLlegada, int cantidad) {
        this.paisDeOrigen = paisDeOrigen;
        this.fechaDeLlegada = fechaDeLlegada;
        this.cantidad = cantidad;
    }

   
    public void recibirProductos() {
        if (fechaDeLlegada != null && fechaDeLlegada.before(new Date())) {
            
            System.out.println("Productos recibidos desde " + paisDeOrigen + " el " + fechaDeLlegada);
            System.out.println("Cantidad de productos recibidos: " + cantidad);
            
        } else {
            System.out.println("Los productos aún no han llegado o la fecha de llegada es inválida.");
        }
    }

   
    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public void setPaisDeOrigen(String paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }

    public Date getFechaDeLlegada() {
        return fechaDeLlegada;
    }

    public void setFechaDeLlegada(Date fechaDeLlegada) {
        this.fechaDeLlegada = fechaDeLlegada;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Importacion{" +
                "paisDeOrigen='" + paisDeOrigen + '\'' +
                ", fechaDeLlegada=" + fechaDeLlegada +
                ", cantidad=" + cantidad +
                '}';
    }
}