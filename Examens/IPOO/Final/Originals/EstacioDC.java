public class EstacioDC extends EstacioRecarrega{//******************************** abstract

	//******************************** static

   // public double calcularTempsBase(){
    //    return super.energiaSolicitada / this.getMaxPotencia() * 60;
   // }

   //constructor 

    public EstacioDC(String id, String nom, String descripcio, int numRecarreguesMensuals,
            double totalIngressosMensuals, PuntRecarrega[] llistaPuntsRecarrega, double preuBase) {
        super(id, nom, descripcio, numRecarreguesMensuals, totalIngressosMensuals, llistaPuntsRecarrega, preuBase);
    }

    @Override
    public String toString() {
        return "EstacioDC []";
    }

    


}
