public class Test_A {

	public static void main(String[] args) {
		App[] tendapps=new App[3];
		tendapps[0]=new AppFree("Cha-Chan", "Reconeix la cara d'un amic dintre d'una foto", "FotoSoftware", 3,"Epson", "Posa una Epson a la teva vida");
		tendapps[1]=new AppProva("Ra-Ton", "Emet un so que espanta els ratolins", "RatonesSoftware", 1, true);
		tendapps[2]=new AppPagament("Subi-don", "Emet un so que millora d'estat d'ànim", "AnimatSotware", 5, 10.5);
		
		for (App app:tendapps){
			System.out.println(app);
		}
		System.out.println();
		
		App miapp=tendapps[0];
		App tuapp=tendapps[1];
		
		System.out.println();
		if (tuapp.equals(miapp))
			System.out.println(miapp+ " i \n"+ tuapp+ " Son iguals");
		else
			System.out.println(miapp+ " i \n"+ tuapp+" NO son iguals");
		
		tuapp=tendapps[0];
		
		System.out.println();
		if (tuapp.equals(miapp))
			System.out.println(miapp+ " i \n"+ tuapp+ " Son iguals");
		else
			System.out.println(miapp+ " i \n"+ tuapp+" NO son iguals");
	}

}
