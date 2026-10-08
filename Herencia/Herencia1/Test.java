package Herencia.Herencia1;

public class Test {

	public static void test(Vehiculo[] llista,int ocupacio) {
		for(int i=0;i<24;i++){
			for (int j=0;j<llista.length;j++){
			    System.out.println(llista[j]);
			    System.out.println("A las: "+i+"h"+ " con: "+ ocupacio + " pasajeros. Pot circular?: "+llista[j].potCircular(i, ocupacio));
			    System.out.println();
			}
		}		
	}
	
	public static void main(String[] args) {
		Vehiculo[] llista=new Vehiculo[4];
		llista[0]=new Turismo("1111AAA",5);
		llista[1]=new TransportPublic("2222AAA",60);
		llista[2]=new Carga("3333AAA",2,true);
		llista[3]=new Carga("4444AAA",2,false);
		test(llista,1);
		test(llista,5);
	}
}
