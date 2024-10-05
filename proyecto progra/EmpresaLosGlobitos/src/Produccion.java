import java.util.Date;

public class Produccion {
    private String estado;      
    private Date fechaInicio;   
    private Date fechaFin;      

   
    public Produccion() {
        this.estado = "No Iniciado";  
        this.fechaInicio = null;
        this.fechaFin = null;
    }

    
    public void iniciarProduccion() {
        if (!"En Proceso".equals(estado)) {
            this.estado = "En Proceso";   
            this.fechaInicio = new Date(); 
            System.out.println("Producción iniciada el " + fechaInicio);
        } else {
            System.out.println("La producción ya está en proceso.");
        }
    }

    
    public void finalizarProduccion() {
        if ("En Proceso".equals(estado)) {
            this.estado = "Finalizado";  
            this.fechaFin = new Date();  
            System.out.println("Producción finalizada el " + fechaFin);
        } else {
            System.out.println("La producción no está en proceso o ya ha finalizado.");
        }
    }

    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
}