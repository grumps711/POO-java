
public class TestStartups {

	public static void main(String[] args) {
		Startup[] startups = {new StartupTecnologica("1", "nom1", 1, 1, 1, "descripcio1", 1, 1),
				              new StartupServicios("2", "nom2", 2, 2, 2, "descripcio2", true),
				              new StartupBiotecnologica("3", "nom3", 3, 3, 3, "descripcio3", 3, 3,"blau",3),
				              new StartupTecnologicaTIC("4", "nom4", 3, 3, 3, "descripcio4", 3, 3)
		};
		for(Startup startup: startups) {
			System.out.println(startup);
			System.out.println(startup.calcularInmobilitzat());
			System.out.println(startup.calcularInmobilitzatInmaterial());
			System.out.println(startup.calcularInmobilitzatMaterial());
			System.out.println();
		}

	}
}
