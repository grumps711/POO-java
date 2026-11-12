
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

public class LlistaJardins {
	private List<Jardi> llista;
		
	public LlistaJardins() {
		this.llista = new ArrayList<Jardi>();
	}

	public void llegir () throws IOException {
		URL font = new URL("https://www.bcn.cat/tercerlloc/files/NP-NASIA/opendatabcn_NP-NASIA_Jardins-interiors-illa-js.json");
	    BufferedReader in = new BufferedReader(new InputStreamReader(font.openStream()));		     
		Type listType = new TypeToken<List<Jardi>>() {}.getType();
		Gson gson = new Gson();
		llista = gson.fromJson(in,listType);
	}

	@Override
	public String toString() {
		return  llista.toString();
	}	
}
