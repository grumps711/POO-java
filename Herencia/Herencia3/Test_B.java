public class Test_B {

	public static void main(String[] args) {
		
			Canco[] tendapps=new Canco[3];
			tendapps[0]=new Canco("La-La-La", "Masiel", 0.32);
			tendapps[1]=new Canco("La vida es una tombola", "Marisol", 0.40);
			tendapps[2]=new Canco("Vivir as�", "Camilo Sesto", 0.5);
			
			for (Canco app:tendapps){
				System.out.println(app);
			}
			System.out.println();
			
			
			Canco micanco=tendapps[0];
			Canco tucanco=tendapps[1];
			
			System.out.println();
			if (tucanco.equals(micanco))
				System.out.println(micanco+ " i \n"+ tucanco+ " Son iguals");
			else
				System.out.println(micanco+ " i \n"+ tucanco+" NO son iguals");
			
			tucanco=tendapps[0];
			
			System.out.println();
			if (tucanco.equals(micanco))
				System.out.println(micanco+ " i \n"+ tucanco+ " Son iguals");
			else
				System.out.println(micanco+ " i \n"+ tucanco+" NO son iguals");
			
	}
}