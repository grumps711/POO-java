package exJson2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class LlibreReceptes {
	private List<Receta> llista;
		
	public LlibreReceptes() {
		this.llista = new ArrayList<Receta>();
	}

	public void llegir () throws IOException {
		URL font = new URL("https://www.cs.upc.edu/~jmarco/recetas.json");
	    BufferedReader in = new BufferedReader(new InputStreamReader(font.openStream()));		     
		Type listType = new TypeToken<List<Receta>>() {}.getType();
		Gson gson = new Gson();
		llista = gson.fromJson(in,listType);
	}

	@Override
	public String toString() {
		return  llista.toString();
	}	
}
