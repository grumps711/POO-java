public class Canco {
    
    private String titol;
    private String cantant;
    private int durada;
    private double preu;
    
    
    public Canco(String titol, String cantant, double preu) {
        this.titol = titol;
        this.cantant = cantant;
        this.preu = preu;
    }

    public Canco(String titol, String cantant, int durada, double preu) {
        this.titol = titol;
        this.cantant = cantant;
        this.durada = durada;
        this.preu = preu;
    }

    public String getTitol() {
        return titol;
    }


    public void setTitol(String titol) {
        this.titol = titol;
    }


    public String getCantant() {
        return cantant;
    }


    public void setCantant(String cantant) {
        this.cantant = cantant;
    }


    public int getDurada() {
        return durada;
    }


    public void setDurada(int durada) {
        this.durada = durada;
    }


    public double getPreu() {
        return preu;
    }


    public void setPreu(double preu) {
        this.preu = preu;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((titol == null) ? 0 : titol.hashCode());
        result = prime * result + ((cantant == null) ? 0 : cantant.hashCode());
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
        Canco other = (Canco) obj;
        if (titol == null) {
            if (other.titol != null)
                return false;
        } else if (!titol.equals(other.titol))
            return false;
        if (cantant == null) {
            if (other.cantant != null)
                return false;
        } else if (!cantant.equals(other.cantant))
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "Canco [titol=" + titol + ", cantant=" + cantant + ", durada=" + durada + ", preu=" + preu + "]";
    }

}
