package Herencia.Herencia1;


public class Persona {
	private int DNI;
	private String nom, cognom1,cognom2;
	
	public Persona(int dNI, String nom, String cognom1, String cognom2) {
		DNI = dNI;
		this.nom = nom;
		this.cognom1 = cognom1;
		this.cognom2 = cognom2;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognom1() {
		return cognom1;
	}

	public void setCognom1(String cognom1) {
		this.cognom1 = cognom1;
	}

	public String getCognom2() {
		return cognom2;
	}

	public void setCognom2(String cognom2) {
		this.cognom2 = cognom2;
	}

	public int getDNI() {
		return DNI;
	}

	public String toString() {
		return "DNI: " + getDNI() + "\nNom i cognoms: " + getNom() + " " + getCognom1() + " " + getCognom2();
	}
	
	
}
