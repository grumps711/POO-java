package Parcial;


public class TestEquipTemporada {

	public static void main(String[] args) {
		String[] nomJugadors = {"jug1","jug2","jug3","jug4","jug5","jug6","jug7","jug8","jug9","jug10","jug11",
				                "jug12","jug13","jug14","jug15","jug16","jug17"};
		
		System.out.println("Màxim de jugadors per equip: " + EquipTemporada.getMaximJugadorsPerEquip());
		System.out.println();
		
		EquipTemporada equip = new EquipTemporada(nomJugadors,2017);
		
		mostrarEquip(equip);
		
		int[] equipTitular = {1,2,3,4,5,6,7,8,9,10,11};
		int[] equipSuplent = {17,14,3,15,5,6,7,8,12,10,13};

		for(int i=1; i<=10; i++) {
			equip.actualitzarPartitsJugats(equipTitular);
		}
		
		for(int i=1; i<=2; i++) {
			equip.actualitzarPartitsJugats(equipSuplent);
		}

		mostrarEquip(equip);
		
		int[] golejadors = {3,5,2,4,11,3,5,7,2,17,8,11};
		
		equip.actualitzarGolsMarcats(golejadors);

		mostrarEquip(equip);
	}

	private static void mostrarEquip(EquipTemporada equip) {
		System.out.println("Equip temporada "+equip.getTemporada()+":");
		for(int dorsal=1; dorsal<=equip.getNumJugadors(); dorsal++) {
			Jugador jugador = equip.getJugador(dorsal);			
			System.out.println("\t" + dadesJugador(jugador));
		}
		System.out.println("Maxim golejador: " + dadesJugador(equip.maximGolejador()));
		System.out.println();
	}

	private static String dadesJugador(Jugador jugador) {
		return 	"Dorsal: " + jugador.getDorsal() + ", nom: " + jugador.getNom() + ", partits jugats: " + 
                jugador.getPartitsJugats() + ", gols marcats: " + jugador.getGolsMarcats() + 
                ", gols per partit: " + jugador.golsPerPartit();
	}

}
