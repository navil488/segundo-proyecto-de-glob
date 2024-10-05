
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Almacenamiento {
    public static void guardarFactura(Factura factura, String archivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            writer.write(factura.toString());  // Aquí se  personalizar el formato de la factura
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}