import java.util.Arrays;

public abstract class EstacioRecarrega{

    //atributs

    private String id;
    private String nom;
    private String descripcio;
    private int numRecarreguesMensuals;
    private double totalIngressosMensuals;
    private PuntRecarrega[] punts; // no set, minim hi ha d'haver 1
    private double preuBase;
    
    
    //constructor
    
    public EstacioRecarrega(String id, String nom, String descripcio, int numRecarreguesMensuals,
        double totalIngressosMensuals, PuntRecarrega[] punts, double preuBase) {
        this.id = id;
        this.nom = nom;
        this.descripcio = descripcio;
        this.numRecarreguesMensuals = numRecarreguesMensuals;
        this.totalIngressosMensuals = totalIngressosMensuals;
        this.punts = punts;
        this.preuBase = preuBase;
    }



    //getters i setters

    

    //metodes

    public int calcularTotalPuntsRecarrega(){//************************************* només length
        int totalPuntsRecarrega = 0;
        for (int i = 0; i < punts.length; i++) {
            if(punts[i]!=null){
                totalPuntsRecarrega++;
            }
        }
        return totalPuntsRecarrega;
    }


    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }


    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public int getNumRecarreguesMensuals() {
        return numRecarreguesMensuals;
    }

    public void setNumRecarreguesMensuals(int numRecarreguesMensuals) {
        this.numRecarreguesMensuals = numRecarreguesMensuals;
    }

    public double getTotalIngressosMensuals() {
        return totalIngressosMensuals;
    }

    public void setTotalIngressosMensuals(double totalIngressosMensuals) {
        this.totalIngressosMensuals = totalIngressosMensuals;
    }

    public PuntRecarrega[] getPunts() {
        return punts;
    }

    public void setPunts(PuntRecarrega[] punts) {//******************************** no
        this.punts = punts;
    }

    public double getPreuBase() {
        return preuBase;
    }

    public void setPreuBase(double preuBase) {
        this.preuBase = preuBase;
    }



    public int calcularTotalPuntsOperatius(){
        int totalPuntsOperatius = 0;
        for (int i = 0; i < punts.length; i++) {
            if(punts[i].isOperatiu()==true){
                totalPuntsOperatius++;
            }
        }
        return totalPuntsOperatius;
    }

    public PuntRecarrega buscarPuntRecarregaPerId(String id){
        PuntRecarrega puntRecarrega = null;
        for (int i = 0; i < punts.length; i++) {
            if(punts[i].getId()==id){//************************************* equals
                puntRecarrega= punts[i];
            }
        }
        return puntRecarrega;
    }



    public boolean modificarEstatPuntRecarrega(String id, boolean nouEstat){
        for (int i = 0; i < punts.length; i++) {
            if(punts[i].getId()==id){//************************************* cridar al metode buscarPunt
                punts[i].setOperatiu(nouEstat);
                return true;   
            }
        }
        return false;
    }


    public int calcularTempsEstimatUnaRecarrega(String id, double energiaSolicitada){
        PuntRecarrega puntATrobar = null;
        for (int i = 0; i < punts.length; i++) {
            if(punts[i].getId()==id){
                puntATrobar = punts[i];
            }
        }
        if(puntATrobar == null || puntATrobar.isOperatiu()==false || energiaSolicitada<=0){
            return -1;
        }
        return 0;
    }


    @Override
    public String toString() {
        return "EstacioRecarrega [id=" + id + ", nom=" + nom + ", descripcio=" + descripcio
                + ", numRecarreguesMensuals=" + numRecarreguesMensuals + ", totalIngressosMensuals="
                + totalIngressosMensuals + ", llistaPuntsRecarrega=" + Arrays.toString(punts)
                + ", preuBase=" + preuBase + "]";
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EstacioRecarrega other = (EstacioRecarrega) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }


    //public calcularCostUnaSessioRecarrega(String id, energiaSolicitada){
      //  return 
    //}


    




}