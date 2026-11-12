

import java.util.List;

public class Receta {
	private String nombre;
	private int minutos;
	private String descripcion;
	private List<String> ingredientes;
	private int meGusta;
	private String urlImagen;
	 
	public Receta(String nombre, int minutos, String descripcion, List<String> ingredientes, int meGusta,
			String urlImagen) {
		super();
		this.nombre = nombre;
		this.minutos = minutos;
		this.descripcion = descripcion;
		this.ingredientes = ingredientes;
		this.meGusta = meGusta;
		this.urlImagen = urlImagen;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<String> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<String> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public int getMeGusta() {
		return meGusta;
	}

	public void setMeGusta(int meGusta) {
		this.meGusta = meGusta;
	}

	public String getUrlImagen() {
		return urlImagen;
	}

	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}

	@Override
	public String toString() {
		return "\n{\n\tnombre=" + nombre + "\n\tminutos=" + minutos + "\n\tdescripcion=" + descripcion + "\n\tingredientes="
				+ ingredientes + "\n\tmeGusta=" + meGusta + "\n\turlImagen=" + urlImagen + "\n}";
	}
	
	

}
