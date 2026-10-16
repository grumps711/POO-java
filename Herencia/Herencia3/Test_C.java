public class Test_C {
	
	public static void print(Puntuable app) {
		System.out.println(app);
		System.out.println(app.puntuacioToString());
		System.out.println("puntuacio mitjana: " + app.puntuacioMitjana());
		System.out.println("puntuacio mitjana normalitzada: " + app.puntuacioMitjanaNormalitzada());
		System.out.println();
	}

	public static void main(String[] args) {
		Puntuable[] tendapps=new Puntuable[5];
		tendapps[0]=new AppFree("Cha-Chan", "Reconeix la cara d'un amic dintre d'una foto", "FotoSoftware", 3,"Epson", "Posa una Epson a la teva vida");
		tendapps[1]=new AppProva("Ra-Ton", "Emet un so que espanta els ratolins", "RatonesSoftware", 1, true);
		tendapps[2]=new AppPagament("Subi-don", "Emet un so que millora d'estat d'ànim", "AnimatSotware", 5, 10.5);
		tendapps[3]=new Canco("La vida es una tombola", "Marisol", 0.40);
		tendapps[4]=new Canco("Vivir así", "Camilo Sesto", 0.5);
		
		for (Puntuable app:tendapps){
			print(app);
		}
		
		Puntuable aux = tendapps[0];
		aux.puntuar(9);
		print(aux);
		aux.puntuar(5);
		print(aux);
		aux.puntuar(4);
		print(aux);
		
		aux = tendapps[3];
		aux.puntuar(1);
		print(aux);
		aux.puntuar(4);
		print(aux);
		aux.puntuar(4);
		print(aux);
	}
}
