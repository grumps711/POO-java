


public class Localitzacio {

    private String nomMesurament;
    private double latitud;
    private double longitud;
    private double altura;

    public Localitzacio(String nom, double latitud, double longitud, double altura) {
        this.nomMesurament = nom;
        this.latitud = latitud;
        this.longitud = longitud;
        this.altura = altura;
    }

    public String getNomMesurament() {
        return nomMesurament;
    }

    public void setNomMesurament(String nomMesurament) {
        this.nomMesurament = nomMesurament;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Localitzacio{nom='" + nomMesurament + "', latitud=" + latitud
                + ", longitud=" + longitud + ", altura=" + altura + "}";
    }
}
