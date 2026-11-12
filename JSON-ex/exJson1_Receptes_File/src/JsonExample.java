

import java.io.*;
import java.lang.reflect.Type;
import java.net.*;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class JsonExample { 	//Dades des de Fitxer

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new FileReader("receptes.json"));
		Type listType = new TypeToken<List<Receta>>() {}.getType();
		List<Receta> l = new Gson().fromJson(br,listType);
		  	
		System.out.println(l);
	}
}
