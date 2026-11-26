package refugis;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

//Modelo: Mantener los refugios y realizar búsquedas.

public class LlistaRefugis implements Serializable{


    // URL de les dades obertes de la Generalitat
    private static final String URL_REFUGIS = "https://analisi.transparenciacatalunya.cat/resource/9gu7-iwci.json?$limit=5000";
    private List<RefugiClimatic> llista;

    private static final long serialVersionUID = 1L;
    private static final String FITXER_SER = "refugis.ser";



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



    
    public static LlistaRefugis carregar() throws IOException, ClassNotFoundException {

        Path fitxer = Path.of(FITXER_SER);

        // Si el fitxer existeix, recuperem els objectes guardats
        if (Files.exists(fitxer)) {

            try (ObjectInputStream entrada = new ObjectInputStream(
                    Files.newInputStream(fitxer))) {

                System.out.println("Llegint refugis.ser...");
                return (LlistaRefugis) entrada.readObject();
            }
        }

        // Primera execucio: llegim el JSON des de la URL
        LlistaRefugis refugis = new LlistaRefugis();
        refugis.llegir();

        // Guardem l'objecte serialitzat per a futures execucions
        try (ObjectOutputStream sortida = new ObjectOutputStream(
                Files.newOutputStream(fitxer))) {

            sortida.writeObject(refugis);
        }

        System.out.println("JSON llegit i objecte serialitzat.");

        return refugis;
    }


    public void altaRefugiClimatic(RefugiClimatic refugi) {
        llista.add(refugi);
    }



    @Override
    public String toString() {
        return llista.toString();
    }
}
