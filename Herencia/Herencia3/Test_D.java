public class Test_D {
	
	public static void print(Puntuable app) {
		System.out.println(app);
		System.out.println(app.puntuacioToString());
		System.out.println("puntuacio mitjana: " + app.puntuacioMitjana());
		System.out.println("puntuacio mitjana normalitzada: " + app.puntuacioMitjanaNormalitzada());
		System.out.println();
	}

	public static void main(String[] args) {
		Puntuable[] tendapps=new Puntuable[10];
		tendapps[0]=new Canco("La vida es una tombola", "Marisol", 0.40);
		tendapps[1]=new Canco("Vivir así", "Camilo Sesto", 0.5);
		tendapps[2]=new Canco("La vida es una tombola", "Melisa", 0.40);
		tendapps[3]=new Canco("Vivir así", "Camilo Septimo", 0.5);
		tendapps[4]=new AppFree("Cha-Chan", "Reconeix la cara d'un amic dintre d'una foto", "FotoSoftware", 3,"Epson", "Posa una Epson a la teva vida");
		tendapps[5]=new AppProva("Ra-Ton", "Emet un so que espanta els ratolins", "RatonesSoftware", 1, true);
		tendapps[6]=new AppPagament("Subi-don", "Emet un so que millora d'estat d'ànim", "AnimatSotware", 5, 10.5);
		tendapps[7]=new AppFree("Cha-Chan", "Reconeix la cara d'un amic dintre d'una foto", "FotoSoftware", 4, "Epson", "Posa una Epson a la teva vida");
		tendapps[8]=new AppProva("Ra-Ton", "Emet un so que espanta els ratolins", "RatonesSoftware", 2, true);
		tendapps[9]=new AppPagament("Subi-don", "Emet un so que millora d'estat d'ànim", "AnimatSotware", 6, 10.5);
		
		for (Puntuable app:tendapps){
			app.puntuar(3);
		}
		
		TopTen topTen = new TopTen(tendapps);
		
		System.out.println(topTen);
		System.out.println(topTen.top());

		AppPagament app = new AppPagament("Subi-don", "Emet un so que millora d'estat d'ànim", "AnimatSotware", 7, 10.5);
		app.puntuar(8);
		
		topTen.actualitzarTopTen(app);
		System.out.println(topTen);
		System.out.println(topTen.top());
	}
}
