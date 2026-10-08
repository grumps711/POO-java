package Herencia.Herencia1;

public class PruebaOrdenadores {

		   public static void main(String[] args) {
		      Ordenador o = new Portatil("Pentium IV",2.1,512,2.7,2);
		      System.out.println(o.toString());
		      o = new Sobremesa("Pentium IV",2.4,1024,"TFT 17 pulgadas");
		      System.out.println(o.toString()); // System.out.println(o);
		   }

}
