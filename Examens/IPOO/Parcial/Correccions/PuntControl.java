package ParcialMillorat.Correccions;

//Representarà  a  cadascun  dels  punts  de  control  de  mesura  que  es  vagin  a  considerar  dins  de  el  sistema  que  volem  desenvolupar.

public class PuntControl {

    //atributs

    private int id;
    private Localitzacio localitzacioEstacio;
    private Sensor sensorEstacio;
    private Medicio[] mesuresEstacio;
    private static final int mesuresEstacioMax = 365;//**************************************** set
    private int totalMesuresFetes;//**************************************** inicialitzar


    //constructor

    public PuntControl(int id, Localitzacio localitzacio, Sensor sensor){
        this.id = id;
        this.localitzacioEstacio = localitzacio;
        this.sensorEstacio = sensor;
        this.mesuresEstacio = new Medicio[mesuresEstacioMax];
    }


    //getters i setters

    public int getId() {
        return id;
    }

    public Localitzacio getLocalitzacioEstacio() {
        return localitzacioEstacio;
    }

    public Medicio[] getMesuresEstacio() {//**************************************** potser no
        return mesuresEstacio;
    }

    public static int getMesuresestaciomax() {
        return mesuresEstacioMax;
    }

    public Sensor getSensorEstacio() {
        return sensorEstacio;
    }

    public int getTotalMesuresFetes() {
        return totalMesuresFetes;
    }

    public void setLocalitzacioEstacio(Localitzacio localitzacioEstacio) {
        this.localitzacioEstacio = localitzacioEstacio;
    }

    public void setSensorEstacio(Sensor sensorEstacio) {
        this.sensorEstacio = sensorEstacio;
    }



    //metodes

    public double mitjanaMesuresEstacio(){//**************************************** falta un metode de mitjanes

        double totalValorMesures = 0;

        for (int i = 0; i < mesuresEstacio.length; i++) {//**************************************** no length
            totalValorMesures =  totalValorMesures + this.mesuresEstacio[i].getValor(); 
        }
        return totalValorMesures / totalMesuresFetes;//**************************************** div 0
    }


    public Medicio valorMaxMedicio(){//**************************************** retorna double

        double valorMax = 0;//**************************************** no 0
        Medicio medicioMesAlta = null;

        for (int i = 0; i < mesuresEstacio.length; i++) {//**************************************** no length
            if(mesuresEstacio[i].getValor() > valorMax){
                valorMax = mesuresEstacio[i].getValor();
                medicioMesAlta = mesuresEstacio[i];
            }
        }
        return medicioMesAlta;
    }


    public int ferMedicioiGuardar(){//**************************************** revisar sencer


        //fer una medició amb el sensor
        Medicio novaMedicio = sensorEstacio.novaMesura();//******************** pot ser null
        

        int valorError = 0;

        //si la medicio es pot fer, guardarla a la llista
        if((novaMedicio.getValor() != 0) && valorError <= 0){//*********************************** no, ordre reves
            return 0;
        }

        //  la  medició  supera  la  mitjana  de  les  últimes  7  lectures  registrades  (només  si  hi  ha com a mínim 7 valors a l'històric), 
        else if((novaMedicio.getValor() > this.mitjanaMesuresEstacio()) && valorError <= 1){
            return 1;
        }

        //la medició supera mitjana absoluta de l'històric (només si hi ha valors a l'històric)
        else if((novaMedicio.getValor() > this.mitjanaMesuresEstacio()) && valorError <= 2){
            return 2;
        }

        // la   medició   està   per   sobre   del   valor   màxim   històric   (només   si   hi   ha   valors   a  l'històric), 
        else if((novaMedicio.getValor() > this.valorMaxMedicio().getValor()) && valorError <= 3){
            return 3;
        }

        //la medició supera el 90% del valor màxim absolut del sensor. 
        else if((novaMedicio.getValor() > (this.valorMaxMedicio().getValor() * 90 / 100)) && valorError <= 4){
            return 4;
        }

        //no s’ha pogut realitzar la lectura del sensor
        else if((novaMedicio.getValor() == 0) && valorError <= 5){
            return 5;
        }

        else{
            return (Integer) null;//*************** ???
        } 
    }
    
}
