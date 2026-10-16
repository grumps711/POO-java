public class App {
    

    private String nom;
    private String descripcio;
    private String nomDesenvolupador;
    private int versio;
   
    //constructor

    public App(String nom, String descripcio, String nomDesenvolupador, int versio) {
        this.nom = nom;
        this.descripcio = descripcio;
        this.nomDesenvolupador = nomDesenvolupador;
        this.versio = versio;
    }

    
    //Getters i setters

    public String getNom() {
        return nom;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }


    public String getDescripcio() {
        return descripcio;
    }


    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }


    public String getNomDesenvolupador() {
        return nomDesenvolupador;
    }


    public void setNomDesenvolupador(String nomDesenvolupador) {
        this.nomDesenvolupador = nomDesenvolupador;
    }


    public int getVersio() {
        return versio;
    }


    public void setVersio(int versio) {
        this.versio = versio;
    }



    public double calcularCost() {
        return 0;
    }

    //ToString + hashCode + Equals

    

    @Override
    public String toString() {
        return "App [nom=" + nom + ", descripcio=" + descripcio + ", nomDesenvolupador=" + nomDesenvolupador
                + ", versio=" + versio + ", cost=" + calcularCost() + "]";
    }



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nom == null) ? 0 : nom.hashCode());
        result = prime * result + ((nomDesenvolupador == null) ? 0 : nomDesenvolupador.hashCode());
        result = prime * result + versio;
        return result;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        App other = (App) obj;
        if (nom == null) {
            if (other.nom != null)
                return false;
        } else if (!nom.equals(other.nom))
            return false;
        if (nomDesenvolupador == null) {
            if (other.nomDesenvolupador != null)
                return false;
        } else if (!nomDesenvolupador.equals(other.nomDesenvolupador))
            return false;
        if (versio != other.versio)
            return false;
        return true;
    }


    

    

    

}
