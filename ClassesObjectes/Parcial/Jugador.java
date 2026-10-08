package Parcial;

public class Jugador {
    
    private int dorsal;
    private String nom;
    private int partitsJugats;
    private int golsMarcats;



    //constructor 

    public Jugador(int dorsal, String nom){
        this.dorsal = dorsal;
        this.nom = nom;
        this.partitsJugats = 0;
        this.golsMarcats = 0;
    }




    //getters i setters

    public int getDorsal() {
        return dorsal;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPartitsJugats() {
        return partitsJugats;
    }


    public int getGolsMarcats() {
        return golsMarcats;
    }

    public void unPartitJugatMes(){
        this.partitsJugats++;
    }

    public void unGolMarcatMes(){
        this.golsMarcats++;
    }

    public double mitjanaAritmeticaGolsPerPartit(){
        return getGolsMarcats()/getPartitsJugats();
    }




}
