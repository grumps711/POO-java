public class EstacioAC extends EstacioRecarrega{//******************************** abstract

   
    //************************************* statics


   // public double calcularTempsBase(double energiaSolicitada){
    //    super.
    //    return energiaSolicitada / this.getMaxPotencia() * 60;
    //}



    //constructor

   public EstacioAC(String id, String nom, String descripcio, int numRecarreguesMensuals,
            double totalIngressosMensuals, PuntRecarrega[] llistaPuntsRecarrega, double preuBase) {
        super(id, nom, descripcio, numRecarreguesMensuals, totalIngressosMensuals, llistaPuntsRecarrega, preuBase);
    }

   @Override
   public String toString() {
    return "EstacioAC []";
   }

}
