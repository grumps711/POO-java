package ParcialMillorat.Correccions;
import java.util.Random;


//instrumentque  permet  realitzar  les  medicions  per  a  cada  punt  de  control  de  la planta  industrial

public class Sensor {
    

    //atributs

    private int id;
    private Boolean funciona;//**************************************** set
    private Medicio[] mesuresRegistrades;
    private int mesuresFetes;
    private static final int mesuresMax = 3;//**************************************** final?
    private double limMax;
    private double limMin;



    //constructor

    public Sensor(int id, double limMin, double limMax){
        this.id = id;
        this.limMax = limMax;
        this.limMin = limMin;
        this.funciona = false;//**************************************** no
        this.mesuresFetes = 0;
        mesuresRegistrades = new Medicio[mesuresMax];

        //for (int i = 0; i < mesuresRegistrades.length; i++) {
       //     this.mesuresRegistrades[i].setValor(0);
        //}

    }


    //getters i setters

    public int getId() {
        return id;
    }

    public Boolean getFunciona() {
        return funciona;
    }

    public double getLimMax() {
        return limMax;
    }

    public double getLimMin() {
        return limMin;
    }

    public int getMesuresFetes() {
        return mesuresFetes;
    }

    public Medicio[] getMesuresRegistrades() {//**************************************** potser no
        return mesuresRegistrades;
    }

    public static int getMesuresmax() {
        return mesuresMax;
    }

    


    //metodes
    
    public Medicio novaMesura(){//**************************************** cal mirar si funciona i guardar historic

        Random r= new Random();  
        double valor= r.nextDouble()*(getLimMax()-getLimMin())+getLimMin();
        Medicio m = new Medicio(valor);
        
        if(mesuresFetes >= mesuresMax){//**************************************** revisar abans de generar mesura
            this.funciona = false;
            return  null;
        }

        mesuresFetes++;
         
        return m;
    }

}
