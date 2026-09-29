package Parcial;

import ClassesObjectes5.Rectangle2D;

public class EquipTemporada {
    

    private Jugador[] llistaJugadors;

    private String llistaNomsEquip[];

    private int anyInicial;

    private static int maxJugadors = 20;

    //constructor

    public void EquipTemporada(String[] nomsJugadors, int anyIni ){

        this.anyInicial = anyIni;
        
        int numJugadors;

        if(nomsJugadors.length > maxJugadors){
            numJugadors = maxJugadors;
        }
        else{
            numJugadors = nomsJugadors.length;
        }

        this.llistaJugadors = new Jugador[numJugadors];

        for(int i=0; i<nomsJugadors.length; i++){
        this.llistaJugadors[i] = new Jugador(i+1,nomsJugadors[i]);
        }

    }


    public Jugador obtenirJugador(int dorsal){

        for(int i=0; i<this.llistaJugadors.length; i++){

            if(Jugador.getDorsal(i)==dorsal){
                return Jugador;
            }
         }
    }



    public void actualitzarPartitsJugats(int[] llistaDorsals){


        Jugador.setPartitsJugats()
    }



}
