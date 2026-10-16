import ParcialMillorat.Correccions.Localitzacio;
import ParcialMillorat.Correccions.PuntControl;
import ParcialMillorat.Correccions.Sensor;

public class PlantaIndustrial {
	
	private PuntControl[] pcs;
	
	public PlantaIndustrial(String nom, PuntControl[] pcs) {
	}

	public boolean canviLocalitzacioPC(int id, Localitzacio localitzacio) {
		
		return false;
	}
	
	public boolean canviSensorPC(int id, Sensor s) {
		
		return false;
	}
	
	public int[] medir() {
		return null;
	}
	
	public boolean[] manteniment() {
		return null;
	}
	
	public String informeDiari() {
		String s;
		int[] llistaErrors=medir();
		s="Errors lectura: \n";
		for (int i=4;i>=0;i--) {
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
