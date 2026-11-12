package exJson2;

import java.util.List;

public class Receta {
	private String nombre;
	private int minutos;
	/*private String descripcion;
	private List<String> ingredientes;
	private int meGusta;
	private String urlImagen;*/
	 
	public Receta(String nombre, int minutos) {
		super();
		this.nombre = nombre;
		this.minutos = minutos;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	

	@Override
	public String toString() {
		return "\n{\n\tnombre=" + nombre + "\n\tminutos=" + minutos + "\n}";
	}
	
	

}
