public class MainP1 {
	public static void main(String[] args) {
		Empleado empleats[] = {
		new Empleado(32456789,"Josep","Segarra","Sans",1000),
		new Empleado(32456788,"Carles","Farre","Almerich",1200),
		new EmpleadoConComplementoCategoria(32456787,"Joan" ,"Hernandez", "Ferrer", 1200,800),
		new Empleado(32456786,"Josep","Llop","Giro",1000),
		new EmpleadoConComplementoCategoria(32456785,"Joan","Diaz","Cunit",1500,1200),
		new Directivo(32456784,"Pere","Vazquez","Sanchez",1500,1200,3000),
		new EmpleadoConComplementoCategoria(32456783,"Marta","Adria","Companys", 1200,800),
		new Directivo(32456782,"Anna","Gomez","Cortes",1500,1200, 2800)};
		for(Empleado e: empleats) {
			System.out.println(e);
			System.out.println("Nomina mensual: " + e.nominaMensual());
			System.out.println();
		}
	}
}