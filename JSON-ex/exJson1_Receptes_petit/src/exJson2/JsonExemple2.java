package exJson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class JsonExemple2 {

	public static void main(String[] args) throws IOException {
		URL font = new URL("https://www.cs.upc.edu/~jmarco/recetas.json");
		BufferedReader in = new BufferedReader(new InputStreamReader(font.openStream()));

		Type listType = new TypeToken<List<Receta>>() {
		}.getType();
		Gson gson = new Gson();
		List<Receta> l = gson.fromJson(in, listType);
		System.out.println(l);

	}

}
