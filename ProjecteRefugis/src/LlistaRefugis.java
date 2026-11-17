import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class LlistaRefugis {


    // URL de les dades obertes de la Generalitat
    private static final String URL_REFUGIS = "https://analisi.transparenciacatalunya.cat/resource/9gu7-iwci.json?$limit=5000";
    private List<RefugiClimatic> llista;

    public LlistaRefugis() {
        this.llista = new ArrayList<RefugiClimatic>();
    }

    // Llegeix el JSON de la URL i el converteix en una llista d'objectes
    public void llegir() throws IOException {

        URL font = URI.create(URL_REFUGIS).toURL();

        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(font.openStream(), StandardCharsets.UTF_8))) {

            Type listType =
                new TypeToken<List<RefugiClimatic>>() {}.getType();

            Gson gson = new Gson();

            llista = gson.fromJson(in, listType);
        }
    }

    // Mostra els primers refugis de la llista
    public void mostrarPrimers(int quantitat) {

        System.out.println("Total refugis: " + llista.size());

        for (int i = 0; i < Math.min(quantitat, llista.size()); i++) {
            System.out.println(llista.get(i));
        }
    }

    
    @Override
    public String toString() {
        return llista.toString();
    }
}
