package Herencia.Herencia1ClassesTaules;


public class PruebaSocios {

	public static void main(String[] args) {
		Socio[] socios = {new SocioMax5Actividades("45778967A","Iker Garrido",2),
				          new SocioMax5Actividades("34567896E","Juan Lopez",5),
				          new SocioMax10Actividades("56738965F","Pepe Martin",5),
				          new SocioMax10Actividades("40896552C","Maria Pompas",6),
				          new SocioMax10Actividades("41654329H","Isabel Perez",10),
				          new SocioAbierto("43456796D","Ariadna Marin")};
		for (int i=0; i<socios.length;++i) {
			System.out.println(socios[i]);
			System.out.println("Cuota mensual: "+socios[i].cuotaMensual());
			System.out.println();
		}
	}
}
