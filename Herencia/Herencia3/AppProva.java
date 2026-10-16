
public class AppProva extends App{

    private static int periodeProva = 2;
    private Boolean requereixMobil;

    //constructor

    public AppProva(String nom, String descripcio, String nomDesenvolupador, int versio, Boolean requereixMobil) {
        super(nom, descripcio, nomDesenvolupador, versio);
        this.requereixMobil = requereixMobil;
    }

    //Getters i setters

    public Boolean getRequereixMobil() {
        return requereixMobil;
    }

    public void setRequereixMobil(Boolean requereixMobil) {
        this.requereixMobil = requereixMobil;
    }

    public static int getPeriodeProva() {
        return periodeProva;
    }

    public static void setPeriodeProva(int periode) {
        if (periode > 0) {
            periodeProva = periode;
        }
    }
    

    //ToString

   @Override
    public String toString() {
        return super.toString()
            + "\nRequereix mobil: " + requereixMobil
            + "\nPeriode de prova: " + periodeProva + " mesos";
    }
  

}