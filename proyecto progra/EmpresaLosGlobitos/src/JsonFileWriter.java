import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

public class JsonFileWriter {
    public static void guardarDatosEnJson(String archivo, Object objeto) throws IOException {
        Gson gson = new Gson();
        FileWriter writer = new FileWriter(archivo);
        gson.toJson(objeto, writer);
        writer.close();
    }
}





