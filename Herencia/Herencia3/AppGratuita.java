
class AppFree extends App {

    private String patrocinador;
    private String missatgePublicitari;

    //constructor

    public AppFree(String nom, String descripcio, String nomDesenvolupador, int versio, String patrocinador, String publicitat) {
        super(nom, descripcio, nomDesenvolupador, versio);
        this.patrocinador = patrocinador;
        this.missatgePublicitari = publicitat;
    }



    //Getters i setters

    public String getPatrocinador() {
        return patrocinador;
    }


    public void setPatrocinador(String patrocinador) {
        this.patrocinador = patrocinador;
    }


    public String getPublicitat() {
        return missatgePublicitari;
    }


    public void setPublicitat(String publicitat) {
        this.missatgePublicitari = publicitat;
    }



    //ToString
    @Override
    public String toString() {
        return "AppFree [patrocinador=" + patrocinador + ", publicitat=" + missatgePublicitari + ", toString()="
                + super.toString() + "]";
    }
}
