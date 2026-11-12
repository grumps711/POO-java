import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


//Programa principal. Descarga el JSON, lo interpreta y crea la lista de jardines. Contiene main().

public class AppJardins {

	public static void main(String[] args) throws IOException {
		
		
		LlistaJardins jardi = new LlistaJardins();
		jardi.llegir();
		System.out.println(jardi);

	
		//JsonElement arrel = JsonParser.parseReader(in);

		//if (arrel.isJsonArray()) {
		//	System.out.println("El JSON es una lista");
		//	System.out.println(arrel.getAsJsonArray().get(0));
		//} else if (arrel.isJsonObject()) {
		//	System.out.println("El JSON es un objeto");
		//	System.out.println(arrel.getAsJsonObject().keySet());
		//}
	}

}