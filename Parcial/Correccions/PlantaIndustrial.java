package ParcialMillorat.Correccions;

// Representa  a  tot  el  sistema  de  control  d’una  planta  industrial.

public class PlantaIndustrial {
	

	//atributs

	private String nom;
	private PuntControl[] pcs;


	//constructor
	
	public PlantaIndustrial(String nom, PuntControl[] pcs) {
		this.nom = nom;
		this.pcs = pcs;
	}



	//getters i setters

	public PuntControl[] getPcs() {//**************************************** potser no
		return pcs;
	}

	public void setPcs(PuntControl[] pcs) {//**************************************** no
		this.pcs = pcs;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {//**************************************** no
		this.nom = nom;
	}



	//metodes

	public boolean canviLocalitzacioPC(int id, Localitzacio localitzacio) {
		
		for (int i = 0; i < pcs.length; i++) {
			if(pcs[i].getId()==id){
				pcs[i].setLocalitzacioEstacio(localitzacio);
				return true;
			}
		}
		return false;
	}
	
	public boolean canviSensorPC(int id, Sensor s) {
		
		for (int i = 0; i < pcs.length; i++) {
			if(pcs[i].getId()==id){
				pcs[i].setSensorEstacio(s);;
				return true;
			}
		}
		return false;
	}
	
	public int[] medir() {//**************************************** no

		int llista[] = null;

		for (int i = 0; i < pcs.length; i++) {
			llista[i] = pcs[i].ferMedicioiGuardar();
		}
		return llista;
	}
	
	public boolean[] manteniment() {

		boolean[] llista = null;//**************************************** no

		for (int i = 0; i < pcs.length; i++) {
			llista[i] = pcs[i].getSensorEstacio().getFunciona();
		}
		return llista;
	}
	
	public String informeDiari() {
		String s;
		int[] llistaErrors=medir();
		s="Errors lectura: \n";
		for (int i=5;i>=0;i--) {
			s=s+"Errors tipus "+i+": "+ llistaErrors[i]+"\n";			
		}
		boolean[] canvis=manteniment();
		s=s+"\nCanvi de sensors: \n";
		for (int i=0;i<pcs.length;i++) {
			if (!canvis[i]) s=s+"Canviar sensor del punt de control "+i+"\n";			
		}
		return s;
	}

		
}
