package exJson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;



public class JsonExemple3 {

	public static void main(String[] args) throws IOException {

		
		URL font = new URL("https://randomuser.me/api/?results=200");
	    BufferedReader in = new BufferedReader(new InputStreamReader(font.openStream()));
	      
		Gson gson = new Gson();
		Sistema s = gson.fromJson(in,Sistema.class);
		
		/*
		Type mapType = new TypeToken<Map<String,List<User>>>() {}.getType();
		Map<String,List<User>> m = gson.fromJson(json,mapType);*/
		
		System.out.println(s);

	}

}
