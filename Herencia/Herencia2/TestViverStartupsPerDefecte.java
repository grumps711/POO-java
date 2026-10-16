
public class TestViverStartupsPerDefecte {

	public static void main(String[] args) {
		StartupPorDefecto[] startups = {new StartupPorDefecto("1", "nom1", 1, 1, 1, "descripcio1"),
	              new StartupPorDefecto("2", "nom2", 2, 2, 2, "descripcio2"),
	              new StartupPorDefecto("3", "nom3", 3, 3, 3, "descripcio3"),
	              new StartupPorDefecto("4", "nom4", 3, 3, 3, "descripcio4")
		};
		
		ViverStartups viver = new ViverStartups(3);
		for(StartupPorDefecto startup: startups) {
			System.out.println("viver.numLocalsLliures(): " + viver.numLocalsLliures());
			System.out.println("viver.assignarLocal(startup): " + viver.assignarLocal(startup));
		}
		System.out.println();
		System.out.println();

		for(int i=0; i<8; i++) {
			System.out.println("viver.getStartup(" + i + "): " + viver.getStartup(i));
		}
		System.out.println();
		System.out.println();
		
		for(StartupPorDefecto startup: startups) {
			System.out.println("viver.getStartup(" + startup.getCif() + "): " + viver.getLocal(startup.getCif()));			
		}
		System.out.println();
		System.out.println();
		
		System.out.println(viver);
		
	}

}
