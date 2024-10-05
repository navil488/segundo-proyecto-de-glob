import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.util.List;

public class CatalogoProductos {
    public static List<Producto> cargarProductosDesdeJSON(String archivo) throws FileNotFoundException {
        Gson gson = new Gson();
        try (Reader reader = new FileReader(archivo)) {
            return gson.fromJson(reader, new TypeToken<List<Producto>>() {}.getType());
        } catch (IOException e) {
            e.printStackTrace(); // Manejo de excepciones
            return null;
        }
    }
}

