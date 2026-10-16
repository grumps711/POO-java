package ParcialMillorat.Correccions;
public class Localitzacio {//**************************************** toString
    
    //atributs

    private String nomMesurament;
    private double latitud;
    private double longitud;
    private double altura;

    //constructor

    public Localitzacio(String nom, double latitud,double longitud, int alt){

        this.nomMesurament = nom;
        this.latitud = latitud;
        this.longitud = longitud;
        this.altura = alt;
    }

    //getters i setters

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


}
