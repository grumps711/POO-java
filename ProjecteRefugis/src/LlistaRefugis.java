import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class LlistaRefugis {

    private List<RefugiClimatic> llista;

    public LlistaRefugis() {
        this.llista = new ArrayList<RefugiClimatic>();
    }

    
    public void llegir() throws IOException {

        URL font = URI.create("https://analisi.transparenciacatalunya.cat/resource/9gu7-iwci.json?$limit=5000").toURL();

        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(font.openStream()))) {

            Type listType =
                new TypeToken<List<RefugiClimatic>>() {}.getType();

            Gson gson = new Gson();

            llista = gson.fromJson(in, listType);
        }
    }


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
